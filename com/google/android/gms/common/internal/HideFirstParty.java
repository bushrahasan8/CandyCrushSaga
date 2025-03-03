package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR})
@Documented
@Retention(RetentionPolicy.CLASS)
@KeepForSdk
/* loaded from: HideFirstParty.class */
public @interface HideFirstParty {
}
