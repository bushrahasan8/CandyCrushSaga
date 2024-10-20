package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.drive.DriveFile;
import com.onetrust.otpublishers.headless.Public.Keys.OTUXParamsKeys;
import java.util.Map;

/* loaded from: zzbvn.class */
public final class zzbvn extends zzbvw {
    private final Map zza;
    private final Context zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;
    private final String zzf;
    private final String zzg;

    public zzbvn(zzcjk zzcjkVar, Map map) {
        super(zzcjkVar, "createCalendarEvent");
        this.zza = map;
        this.zzb = zzcjkVar.zzi();
        this.zzc = zze(OTUXParamsKeys.OT_UX_DESCRIPTION);
        this.zzf = zze(OTUXParamsKeys.OT_UX_SUMMARY);
        this.zzd = zzd("start_ticks");
        this.zze = zzd("end_ticks");
        this.zzg = zze("location");
    }

    private final long zzd(String str) {
        long j;
        String str2 = (String) this.zza.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            j = Long.parseLong(str2);
        } catch (NumberFormatException e) {
            j = -1;
        }
        return j;
    }

    private final String zze(String str) {
        return TextUtils.isEmpty((CharSequence) this.zza.get(str)) ? "" : (String) this.zza.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Intent zzb() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.zzc);
        data.putExtra("eventLocation", this.zzg);
        data.putExtra(OTUXParamsKeys.OT_UX_DESCRIPTION, this.zzf);
        long j = this.zzd;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.zze;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(DriveFile.MODE_READ_ONLY);
        return data;
    }

    public final void zzc() {
        if (this.zzb == null) {
            zzh("Activity context is not available.");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        if (!new zzbfm(this.zzb).zzb()) {
            zzh("This feature is not available on the device.");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder zzJ = com.google.android.gms.ads.internal.util.zzt.zzJ(this.zzb);
        Resources zze = com.google.android.gms.ads.internal.zzt.zzo().zze();
        zzJ.setTitle(zze != null ? zze.getString(R.string.s5) : "Create calendar event");
        zzJ.setMessage(zze != null ? zze.getString(R.string.s6) : "Allow Ad to create a calendar event?");
        zzJ.setPositiveButton(zze != null ? zze.getString(R.string.s3) : "Accept", new zzbvl(this));
        zzJ.setNegativeButton(zze != null ? zze.getString(R.string.s4) : "Decline", new zzbvm(this));
        zzJ.create().show();
    }
}
