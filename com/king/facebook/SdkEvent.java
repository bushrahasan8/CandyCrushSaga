package com.king.facebook;

import androidx.annotation.Keep;
import com.king.facebook.eventdata.AppLinkEventData;
import com.king.facebook.eventdata.CurrentUserEventData;
import com.king.facebook.eventdata.DataAccessExpiredData;
import com.king.facebook.eventdata.DataAccessRefreshedData;
import com.king.facebook.eventdata.DialogEventData;
import com.king.facebook.eventdata.FriendsEventData;
import com.king.facebook.eventdata.LoginEventData;
import com.king.facebook.eventdata.MessagePollingEventData;
import com.king.facebook.eventdata.OpenSessionEventData;
import com.king.facebook.eventdata.PermissionEventData;
import com.king.facebook.eventdata.TokenChangeEventData;

@Keep
/* loaded from: SdkEvent.class */
public class SdkEvent {
    public AppLinkEventData appLinkEventData;
    public CurrentUserEventData currentUserEventData;
    public DataAccessExpiredData dataAccessExpiredData;
    public DataAccessRefreshedData dataAccessRefreshedData;
    public DialogEventData dialogEventData;
    public FriendsEventData friendsEventData;
    public LoginEventData loginEventData;
    public MessagePollingEventData messagePollingEventData;
    public OpenSessionEventData openSessionEventData;
    public PermissionEventData permissionEventData;
    public TokenChangeEventData tokenChangeEventData;
    public int type;

    /* loaded from: SdkEvent$EventType.class */
    public enum EventType {
        LOGIN_EVENT_TYPE(1),
        DIALOG_EVENT_TYPE(2),
        INVITABLE_FRIENDS_EVENT_TYPE(3),
        PERMISSON_EVENT_TYPE(4),
        FRIENDS_EVENT_TYPE(5),
        CURRENT_USER_EVENT_TYPE(6),
        MESSAGE_POLLING_EVENT_TYPE(7),
        INVITE_EVENT_TYPE(8),
        APP_LINK_EVENT_TYPE(9),
        OPENSESSION_EVENT_TYPE(10),
        TOKENCHANGE_EVENT_TYPE(11),
        DATA_ACCESS_EXPIRED_EVENT_TYPE(12),
        DATA_ACCESS_REFRESHED_EVENT_TYPE(13);

        private final int id;

        EventType(int i) {
            this.id = i;
        }
    }

    private SdkEvent(EventType eventType) {
        this.type = eventType.id;
    }

    public static SdkEvent create(AppLinkEventData appLinkEventData) {
        SdkEvent sdkEvent = new SdkEvent(EventType.APP_LINK_EVENT_TYPE);
        sdkEvent.appLinkEventData = appLinkEventData;
        return sdkEvent;
    }

    public static SdkEvent create(CurrentUserEventData currentUserEventData) {
        SdkEvent sdkEvent = new SdkEvent(EventType.CURRENT_USER_EVENT_TYPE);
        sdkEvent.currentUserEventData = currentUserEventData;
        return sdkEvent;
    }

    public static SdkEvent create(DataAccessExpiredData dataAccessExpiredData) {
        SdkEvent sdkEvent = new SdkEvent(EventType.DATA_ACCESS_EXPIRED_EVENT_TYPE);
        sdkEvent.dataAccessExpiredData = dataAccessExpiredData;
        return sdkEvent;
    }

    public static SdkEvent create(DataAccessRefreshedData dataAccessRefreshedData) {
        SdkEvent sdkEvent = new SdkEvent(EventType.DATA_ACCESS_REFRESHED_EVENT_TYPE);
        sdkEvent.dataAccessRefreshedData = dataAccessRefreshedData;
        return sdkEvent;
    }

    public static SdkEvent create(DialogEventData dialogEventData) {
        SdkEvent sdkEvent = new SdkEvent(EventType.DIALOG_EVENT_TYPE);
        sdkEvent.dialogEventData = dialogEventData;
        return sdkEvent;
    }

    public static SdkEvent create(FriendsEventData friendsEventData) {
        SdkEvent sdkEvent = new SdkEvent(EventType.FRIENDS_EVENT_TYPE);
        sdkEvent.friendsEventData = friendsEventData;
        return sdkEvent;
    }

    public static SdkEvent create(LoginEventData loginEventData) {
        SdkEvent sdkEvent = new SdkEvent(EventType.LOGIN_EVENT_TYPE);
        sdkEvent.loginEventData = loginEventData;
        return sdkEvent;
    }

    public static SdkEvent create(MessagePollingEventData messagePollingEventData) {
        SdkEvent sdkEvent = new SdkEvent(EventType.MESSAGE_POLLING_EVENT_TYPE);
        sdkEvent.messagePollingEventData = messagePollingEventData;
        return sdkEvent;
    }

    public static SdkEvent create(OpenSessionEventData openSessionEventData) {
        SdkEvent sdkEvent = new SdkEvent(EventType.OPENSESSION_EVENT_TYPE);
        sdkEvent.openSessionEventData = openSessionEventData;
        return sdkEvent;
    }

    public static SdkEvent create(PermissionEventData permissionEventData) {
        SdkEvent sdkEvent = new SdkEvent(EventType.PERMISSON_EVENT_TYPE);
        sdkEvent.permissionEventData = permissionEventData;
        return sdkEvent;
    }

    public static SdkEvent create(TokenChangeEventData tokenChangeEventData) {
        SdkEvent sdkEvent = new SdkEvent(EventType.TOKENCHANGE_EVENT_TYPE);
        sdkEvent.tokenChangeEventData = tokenChangeEventData;
        return sdkEvent;
    }
}
