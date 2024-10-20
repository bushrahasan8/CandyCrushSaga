package com.ironsource;

import org.json.JSONObject;

/* loaded from: w2.class */
public class w2 {
    public static final String a = "SSA_CORE.SDKController.runFunction";

    public static String a(x2 x2Var) {
        return String.format("%1$s('%2$s%3$s'%4$s)", a, x2Var.b(), a(x2Var.c()), b(x2Var));
    }

    private static String a(JSONObject jSONObject) {
        return (jSONObject == null || jSONObject.length() == 0) ? "" : jSONObject.toString();
    }

    private static String b(x2 x2Var) {
        return (x2Var.d() == null || x2Var.a() == null) ? "" : String.format(", '%1$s', '%2$s'", x2Var.d(), x2Var.a());
    }
}
