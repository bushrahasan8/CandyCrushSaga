package com.king.facebook.eventdata;

import androidx.annotation.Keep;

@Keep
/* loaded from: PermissionEventData.class */
public class PermissionEventData {
    public String accessToken;
    public boolean canceled;
    public String errorMessage;
    public String[] publishPermissions;
    public String[] readPermissions;
    public boolean success;
}
