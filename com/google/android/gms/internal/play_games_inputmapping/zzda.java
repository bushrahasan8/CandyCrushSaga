package com.google.android.gms.internal.play_games_inputmapping;

import java.util.Comparator;
import java.util.Map;

/* loaded from: zzda.class */
final class zzda implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
    }
}
