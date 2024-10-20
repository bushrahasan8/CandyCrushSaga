package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* loaded from: zzazu.class */
public final class zzazu {
    private final int zza;
    private final zzazr zzb = new zzazw();

    public zzazu(int i) {
        this.zza = i;
    }

    public final String zza(ArrayList arrayList) {
        String zzaztVar;
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            zzaztVar = "";
        } else {
            zzazt zzaztVar2 = new zzazt();
            PriorityQueue priorityQueue = new PriorityQueue(this.zza, new zzazs(this));
            for (String str : split) {
                String[] zzb = zzazv.zzb(str, false);
                if (zzb.length != 0) {
                    zzazz.zzc(zzb, this.zza, 6, priorityQueue);
                }
            }
            Iterator it = priorityQueue.iterator();
            while (it.hasNext()) {
                try {
                    zzaztVar2.zzb.write(this.zzb.zzb(((zzazy) it.next()).zzb));
                } catch (IOException e) {
                    zzcec.zzh("Error while writing hash to byteStream", e);
                }
            }
            zzaztVar = zzaztVar2.toString();
        }
        return zzaztVar;
    }
}
