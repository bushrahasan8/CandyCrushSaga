package com.google.android.gms.drive;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.internal.drive.zzaa;
import com.google.android.gms.internal.drive.zzhs;

/* loaded from: MetadataBuffer.class */
public final class MetadataBuffer extends AbstractDataBuffer<Metadata> {
    private zza zzau;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: MetadataBuffer$zza.class */
    public static final class zza extends Metadata {
        private final int row;
        private final DataHolder zzav;
        private final int zzaw;

        public zza(DataHolder dataHolder, int i) {
            this.zzav = dataHolder;
            this.row = i;
            this.zzaw = dataHolder.getWindowIndex(i);
        }

        @Override // com.google.android.gms.common.data.Freezable
        public final /* synthetic */ Metadata freeze() {
            MetadataBundle zzbe = MetadataBundle.zzbe();
            for (MetadataField<?> metadataField : com.google.android.gms.drive.metadata.internal.zzf.zzbc()) {
                if (metadataField != zzhs.zzkq) {
                    metadataField.zza(this.zzav, zzbe, this.row, this.zzaw);
                }
            }
            return new zzaa(zzbe);
        }

        @Override // com.google.android.gms.common.data.Freezable
        public final boolean isDataValid() {
            return !this.zzav.isClosed();
        }

        @Override // com.google.android.gms.drive.Metadata
        public final <T> T zza(MetadataField<T> metadataField) {
            return metadataField.zza(this.zzav, this.row, this.zzaw);
        }
    }

    public MetadataBuffer(DataHolder dataHolder) {
        super(dataHolder);
        dataHolder.getMetadata().setClassLoader(MetadataBuffer.class.getClassLoader());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0.row != r6) goto L6;
     */
    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.drive.Metadata get(int r6) {
        /*
            r5 = this;
            r0 = r5
            com.google.android.gms.drive.MetadataBuffer$zza r0 = r0.zzau
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L13
            r0 = r8
            r7 = r0
            r0 = r8
            int r0 = com.google.android.gms.drive.MetadataBuffer.zza.zza(r0)
            r1 = r6
            if (r0 == r1) goto L25
        L13:
            com.google.android.gms.drive.MetadataBuffer$zza r0 = new com.google.android.gms.drive.MetadataBuffer$zza
            r1 = r0
            r2 = r5
            com.google.android.gms.common.data.DataHolder r2 = r2.mDataHolder
            r3 = r6
            r1.<init>(r2, r3)
            r7 = r0
            r0 = r5
            r1 = r7
            r0.zzau = r1
        L25:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.drive.MetadataBuffer.get(int):com.google.android.gms.drive.Metadata");
    }

    @Deprecated
    public final String getNextPageToken() {
        return null;
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer, com.google.android.gms.common.api.Releasable
    public final void release() {
        DataHolder dataHolder = this.mDataHolder;
        if (dataHolder != null) {
            com.google.android.gms.drive.metadata.internal.zzf.zza(dataHolder);
        }
        super.release();
    }
}
