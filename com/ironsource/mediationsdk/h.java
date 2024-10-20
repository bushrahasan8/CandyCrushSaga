package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: h.class */
public class h {
    public static final int c = -1;
    public static final int d = 0;
    private ConcurrentHashMap a = new ConcurrentHashMap();
    private int b;

    /* loaded from: h$a.class */
    public enum a {
        ISAuctionPerformanceDidntAttemptToLoad,
        ISAuctionPerformanceFailedToLoad,
        ISAuctionPerformanceLoadedSuccessfully,
        ISAuctionPerformanceFailedToShow,
        ISAuctionPerformanceShowedSuccessfully,
        ISAuctionPerformanceNotPartOfWaterfall
    }

    public h(List<NetworkSettings> list, int i) {
        this.b = i;
        for (NetworkSettings networkSettings : list) {
            this.a.put(networkSettings.getProviderName(), new ArrayList());
        }
    }

    public String a(String str) {
        ArrayList arrayList = (ArrayList) this.a.get(str);
        String str2 = "";
        String str3 = str2;
        if (arrayList != null) {
            str3 = str2;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                StringBuilder sb = new StringBuilder();
                while (true) {
                    StringBuilder sb2 = sb;
                    sb2.append(str2);
                    sb2.append(((a) it.next()).ordinal());
                    String sb3 = sb2.toString();
                    str3 = sb3;
                    if (!it.hasNext()) {
                        break;
                    }
                    str2 = sb3 + ",";
                    sb = new StringBuilder();
                }
            }
        }
        return str3;
    }

    public void a(ConcurrentHashMap<String, a> concurrentHashMap) {
        if (this.b == 0) {
            return;
        }
        for (String str : this.a.keySet()) {
            a aVar = a.ISAuctionPerformanceNotPartOfWaterfall;
            if (concurrentHashMap.containsKey(str)) {
                aVar = concurrentHashMap.get(str);
            }
            ArrayList arrayList = (ArrayList) this.a.get(str);
            if (this.b != -1 && arrayList.size() == this.b) {
                arrayList.remove(0);
            }
            arrayList.add(aVar);
        }
    }
}
