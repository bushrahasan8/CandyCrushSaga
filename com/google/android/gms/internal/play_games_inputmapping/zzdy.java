package com.google.android.gms.internal.play_games_inputmapping;

import com.google.android.gms.internal.play_games_inputmapping.zzdx;
import com.google.android.gms.internal.play_games_inputmapping.zzdy;
import java.io.IOException;

/* loaded from: zzdy.class */
public abstract class zzdy<MessageType extends zzdy<MessageType, BuilderType>, BuilderType extends zzdx<MessageType, BuilderType>> implements zzge {
    protected int zza = 0;

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzge
    public final zzek zzg() {
        try {
            int zzl = zzl();
            zzek zzekVar = zzek.zzb;
            byte[] bArr = new byte[zzl];
            zzep zzt = zzep.zzt(bArr);
            zzk(zzt);
            zzt.zzC();
            return new zzei(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int zzh() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void zzi(int i) {
        throw null;
    }
}
