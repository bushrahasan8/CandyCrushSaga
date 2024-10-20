package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: HeartBeatInfoStorage.class */
public class HeartBeatInfoStorage {
    private final SharedPreferences firebaseSharedPreferences;

    public HeartBeatInfoStorage(Context context, String str) {
        this.firebaseSharedPreferences = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    private void cleanUpStoredHeartBeats() {
        synchronized (this) {
            long j = this.firebaseSharedPreferences.getLong("fire-count", 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : this.firebaseSharedPreferences.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Iterator it = ((Set) entry.getValue()).iterator();
                    String str3 = str2;
                    String str4 = str;
                    while (true) {
                        str = str4;
                        str2 = str3;
                        if (it.hasNext()) {
                            String str5 = (String) it.next();
                            if (str3 != null && str3.compareTo(str5) <= 0) {
                            }
                            str4 = entry.getKey();
                            str3 = str5;
                        }
                    }
                }
            }
            HashSet hashSet = new HashSet(this.firebaseSharedPreferences.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.firebaseSharedPreferences.edit().putStringSet(str, hashSet).putLong("fire-count", j - 1).commit();
        }
    }

    private String getFormattedDate(long j) {
        Instant instant;
        ZoneOffset zoneOffset;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        DateTimeFormatter dateTimeFormatter;
        String format;
        synchronized (this) {
            if (Build.VERSION.SDK_INT < 26) {
                return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
            }
            instant = new Date(j).toInstant();
            zoneOffset = ZoneOffset.UTC;
            atOffset = instant.atOffset(zoneOffset);
            localDateTime = atOffset.toLocalDateTime();
            dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
            format = localDateTime.format(dateTimeFormatter);
            return format;
        }
    }

    private String getStoredUserAgentString(String str) {
        synchronized (this) {
            for (Map.Entry<String, ?> entry : this.firebaseSharedPreferences.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Iterator it = ((Set) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        if (str.equals((String) it.next())) {
                            return entry.getKey();
                        }
                    }
                }
            }
            return null;
        }
    }

    private void removeStoredDate(String str) {
        synchronized (this) {
            String storedUserAgentString = getStoredUserAgentString(str);
            if (storedUserAgentString == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.firebaseSharedPreferences.getStringSet(storedUserAgentString, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.firebaseSharedPreferences.edit().remove(storedUserAgentString).commit();
            } else {
                this.firebaseSharedPreferences.edit().putStringSet(storedUserAgentString, hashSet).commit();
            }
        }
    }

    private void updateStoredUserAgent(String str, String str2) {
        synchronized (this) {
            removeStoredDate(str2);
            HashSet hashSet = new HashSet(this.firebaseSharedPreferences.getStringSet(str, new HashSet()));
            hashSet.add(str2);
            this.firebaseSharedPreferences.edit().putStringSet(str, hashSet).commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void deleteAllHeartBeats() {
        synchronized (this) {
            SharedPreferences.Editor edit = this.firebaseSharedPreferences.edit();
            int i = 0;
            for (Map.Entry<String, ?> entry : this.firebaseSharedPreferences.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String formattedDate = getFormattedDate(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(formattedDate)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(formattedDate);
                        i++;
                        edit.putStringSet(key, hashSet);
                    } else {
                        edit.remove(key);
                    }
                }
            }
            if (i == 0) {
                edit.remove("fire-count");
            } else {
                edit.putLong("fire-count", i);
            }
            edit.commit();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List getAllHeartBeats() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.firebaseSharedPreferences.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(getFormattedDate(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(HeartBeatResult.create(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            updateGlobalHeartBeat(System.currentTimeMillis());
        }
        return arrayList;
    }

    boolean isSameDateUtc(long j, long j2) {
        boolean equals;
        synchronized (this) {
            equals = getFormattedDate(j).equals(getFormattedDate(j2));
        }
        return equals;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void postHeartBeatCleanUp() {
        synchronized (this) {
            String formattedDate = getFormattedDate(System.currentTimeMillis());
            this.firebaseSharedPreferences.edit().putString("last-used-date", formattedDate).commit();
            removeStoredDate(formattedDate);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean shouldSendGlobalHeartBeat(long j) {
        boolean shouldSendSdkHeartBeat;
        synchronized (this) {
            shouldSendSdkHeartBeat = shouldSendSdkHeartBeat("fire-global", j);
        }
        return shouldSendSdkHeartBeat;
    }

    boolean shouldSendSdkHeartBeat(String str, long j) {
        synchronized (this) {
            if (!this.firebaseSharedPreferences.contains(str)) {
                this.firebaseSharedPreferences.edit().putLong(str, j).commit();
                return true;
            }
            if (isSameDateUtc(this.firebaseSharedPreferences.getLong(str, -1L), j)) {
                return false;
            }
            this.firebaseSharedPreferences.edit().putLong(str, j).commit();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void storeHeartBeat(long j, String str) {
        synchronized (this) {
            String formattedDate = getFormattedDate(j);
            if (this.firebaseSharedPreferences.getString("last-used-date", "").equals(formattedDate)) {
                String storedUserAgentString = getStoredUserAgentString(formattedDate);
                if (storedUserAgentString == null) {
                    return;
                }
                if (storedUserAgentString.equals(str)) {
                    return;
                }
                updateStoredUserAgent(str, formattedDate);
                return;
            }
            long j2 = this.firebaseSharedPreferences.getLong("fire-count", 0L);
            long j3 = j2;
            if (j2 + 1 == 30) {
                cleanUpStoredHeartBeats();
                j3 = this.firebaseSharedPreferences.getLong("fire-count", 0L);
            }
            HashSet hashSet = new HashSet(this.firebaseSharedPreferences.getStringSet(str, new HashSet()));
            hashSet.add(formattedDate);
            this.firebaseSharedPreferences.edit().putStringSet(str, hashSet).putLong("fire-count", j3 + 1).putString("last-used-date", formattedDate).commit();
        }
    }

    void updateGlobalHeartBeat(long j) {
        synchronized (this) {
            this.firebaseSharedPreferences.edit().putLong("fire-global", j).commit();
        }
    }
}
