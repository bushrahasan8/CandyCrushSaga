package com.applovin.impl;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* loaded from: rg.class */
public class rg {
    private final View a;
    private final FriendlyObstructionPurpose b;
    private final String c;

    public rg(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.a = view;
        this.b = friendlyObstructionPurpose;
        this.c = str;
    }

    public String a() {
        return this.c;
    }

    public FriendlyObstructionPurpose b() {
        return this.b;
    }

    public View c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        rg rgVar = (rg) obj;
        View view = this.a;
        if (view != null) {
            if (!view.equals(rgVar.a)) {
                return false;
            }
        } else if (rgVar.a != null) {
            return false;
        }
        if (this.b != rgVar.b) {
            return false;
        }
        String str = this.c;
        String str2 = rgVar.c;
        if (str != null) {
            z = str.equals(str2);
        } else if (str2 != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        View view = this.a;
        int i = 0;
        int hashCode = view != null ? view.hashCode() : 0;
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.b;
        int hashCode2 = friendlyObstructionPurpose != null ? friendlyObstructionPurpose.hashCode() : 0;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }
}
