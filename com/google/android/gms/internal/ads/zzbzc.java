package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.IOUtils;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;

@SafeParcelable.Class(creator = "LargeParcelTeleporterCreator")
@SafeParcelable.Reserved({1})
/* loaded from: zzbzc.class */
public final class zzbzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbzc> CREATOR = new zzbzd();

    @SafeParcelable.Field(id = 2)
    ParcelFileDescriptor zza;
    private Parcelable zzb = null;
    private boolean zzc = true;

    @SafeParcelable.Constructor
    public zzbzc(@SafeParcelable.Param(id = 2) ParcelFileDescriptor parcelFileDescriptor) {
        this.zza = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        final ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        ParcelFileDescriptor parcelFileDescriptor;
        ParcelFileDescriptor[] createPipe;
        if (this.zza == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.zzb.writeToParcel(obtain, 0);
                final byte[] marshall = obtain.marshall();
                obtain.recycle();
                try {
                    createPipe = ParcelFileDescriptor.createPipe();
                    autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
                } catch (IOException e) {
                    e = e;
                    autoCloseOutputStream = null;
                }
                try {
                    zzcep.zza.execute(new Runnable(autoCloseOutputStream, marshall) { // from class: com.google.android.gms.internal.ads.zzbzb
                        public final OutputStream zza;
                        public final byte[] zzb;

                        {
                            this.zza = autoCloseOutputStream;
                            this.zzb = marshall;
                        }

                        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
                            java.lang.NullPointerException
                            */
                        @Override // java.lang.Runnable
                        public final void run() {
                            /*
                                r4 = this;
                                android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbzc> r0 = com.google.android.gms.internal.ads.zzbzc.CREATOR
                                r5 = r0
                                r0 = r4
                                java.io.OutputStream r0 = r0.zza
                                r9 = r0
                                r0 = r4
                                byte[] r0 = r0.zzb
                                r10 = r0
                                r0 = 0
                                r8 = r0
                                r0 = 0
                                r7 = r0
                                r0 = r7
                                r5 = r0
                                java.io.DataOutputStream r0 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b
                                r6 = r0
                                r0 = r7
                                r5 = r0
                                r0 = r6
                                r1 = r9
                                r0.<init>(r1)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b
                                r0 = r6
                                r1 = r10
                                int r1 = r1.length     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L39
                                r0.writeInt(r1)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L39
                                r0 = r6
                                r1 = r10
                                r0.write(r1)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L39
                                r0 = r6
                                com.google.android.gms.common.util.IOUtils.closeQuietly(r0)
                                return
                            L35:
                                r7 = move-exception
                                goto L3d
                            L39:
                                r7 = move-exception
                                goto L44
                            L3d:
                                r0 = r6
                                r5 = r0
                                r0 = r7
                                r6 = r0
                                goto L71
                            L44:
                                goto L4f
                            L47:
                                r6 = move-exception
                                goto L71
                            L4b:
                                r7 = move-exception
                                r0 = r8
                                r6 = r0
                            L4f:
                                r0 = r6
                                r5 = r0
                                java.lang.String r0 = "Error transporting the ad response"
                                r1 = r7
                                com.google.android.gms.internal.ads.zzcec.zzh(r0, r1)     // Catch: java.lang.Throwable -> L47
                                r0 = r6
                                r5 = r0
                                com.google.android.gms.internal.ads.zzcdl r0 = com.google.android.gms.ads.internal.zzt.zzo()     // Catch: java.lang.Throwable -> L47
                                r1 = r7
                                java.lang.String r2 = "LargeParcelTeleporter.pipeData.1"
                                r0.zzw(r1, r2)     // Catch: java.lang.Throwable -> L47
                                r0 = r6
                                if (r0 != 0) goto L6c
                                r0 = r9
                                com.google.android.gms.common.util.IOUtils.closeQuietly(r0)
                                return
                            L6c:
                                r0 = r6
                                com.google.android.gms.common.util.IOUtils.closeQuietly(r0)
                                return
                            L71:
                                r0 = r5
                                if (r0 != 0) goto L7d
                                r0 = r9
                                com.google.android.gms.common.util.IOUtils.closeQuietly(r0)
                                goto L81
                            L7d:
                                r0 = r5
                                com.google.android.gms.common.util.IOUtils.closeQuietly(r0)
                            L81:
                                r0 = r6
                                throw r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbzb.run():void");
                        }
                    });
                    parcelFileDescriptor = createPipe[0];
                } catch (IOException e2) {
                    e = e2;
                    zzcec.zzh("Error transporting the ad response", e);
                    com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "LargeParcelTeleporter.pipeData.2");
                    IOUtils.closeQuietly(autoCloseOutputStream);
                    parcelFileDescriptor = null;
                    this.zza = parcelFileDescriptor;
                    int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
                    SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i, false);
                    SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
                }
                this.zza = parcelFileDescriptor;
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        int beginObjectHeader2 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zza, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader2);
    }

    public final SafeParcelable zza(Parcelable.Creator creator) {
        if (this.zzc) {
            if (this.zza == null) {
                zzcec.zzg("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(this.zza));
            try {
                try {
                    int readInt = dataInputStream.readInt();
                    byte[] bArr = new byte[readInt];
                    dataInputStream.readFully(bArr, 0, readInt);
                    IOUtils.closeQuietly(dataInputStream);
                    Parcel obtain = Parcel.obtain();
                    try {
                        obtain.unmarshall(bArr, 0, readInt);
                        obtain.setDataPosition(0);
                        this.zzb = (Parcelable) creator.createFromParcel(obtain);
                        obtain.recycle();
                        this.zzc = false;
                    } catch (Throwable th) {
                        obtain.recycle();
                        throw th;
                    }
                } catch (IOException e) {
                    zzcec.zzh("Could not read from parcel file descriptor", e);
                    IOUtils.closeQuietly(dataInputStream);
                    return null;
                }
            } catch (Throwable th2) {
                IOUtils.closeQuietly(dataInputStream);
                throw th2;
            }
        }
        return (SafeParcelable) this.zzb;
    }
}
