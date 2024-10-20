package androidx.work.impl.model;

/* loaded from: PreferenceDao.class */
public interface PreferenceDao {
    Long getLongValue(String str);

    void insertPreference(Preference preference);
}
