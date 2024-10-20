package support.ada.embed.widget;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: Event.class */
public final class Event {
    public static final Companion Companion = new Companion(null);
    private final String chatterTranscript;
    private final String eventName;
    private final JSONObject userData;

    /* loaded from: Event$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Event from(String event) {
            Intrinsics.checkParameterIsNotNull(event, "event");
            JSONObject jSONObject = new JSONObject(event);
            return new Event(jSONObject.optJSONObject("user_data"), jSONObject.optString("chatter_transcript"), jSONObject.optString("event_name"));
        }
    }

    public Event(JSONObject jSONObject, String str, String str2) {
        this.userData = jSONObject;
        this.chatterTranscript = str;
        this.eventName = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        return Intrinsics.areEqual(this.userData, event.userData) && Intrinsics.areEqual(this.chatterTranscript, event.chatterTranscript) && Intrinsics.areEqual(this.eventName, event.eventName);
    }

    public final String getEventName() {
        return this.eventName;
    }

    public int hashCode() {
        JSONObject jSONObject = this.userData;
        int i = 0;
        int hashCode = jSONObject != null ? jSONObject.hashCode() : 0;
        String str = this.chatterTranscript;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.eventName;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public String toString() {
        return "Event(userData=" + this.userData + ", chatterTranscript=" + this.chatterTranscript + ", eventName=" + this.eventName + ")";
    }
}
