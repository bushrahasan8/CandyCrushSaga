package com.unity3d.services.ads.topics;

import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.annotation.SuppressLint;
import android.os.OutcomeReceiver;
import androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@SuppressLint({"NewApi", "MissingPermission"})
/* loaded from: TopicsReceiver.class */
public final class TopicsReceiver implements OutcomeReceiver {
    private final IEventSender eventSender;

    public TopicsReceiver(IEventSender eventSender) {
        Intrinsics.checkNotNullParameter(eventSender, "eventSender");
        this.eventSender = eventSender;
    }

    public final JSONObject formatTopic(Topic topic) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("taxonomyVersion", TopicsManagerImplCommon$.ExternalSyntheticApiModelOutline3.m(topic));
        jSONObject.put("modelVersion", TopicsManagerImplCommon$.ExternalSyntheticApiModelOutline4.m(topic));
        jSONObject.put("topicId", TopicsManagerImplCommon$.ExternalSyntheticApiModelOutline5.m(topic));
        return jSONObject;
    }

    @Override // android.os.OutcomeReceiver
    public void onError(Exception error) {
        Intrinsics.checkNotNullParameter(error, "error");
        DeviceLog.debug("GetTopics exception: " + error);
        this.eventSender.sendEvent(WebViewEventCategory.TOPICS, TopicsEvents.NOT_AVAILABLE, TopicsErrors.ERROR_EXCEPTION, error.toString());
    }

    public void onResult(GetTopicsResponse result) {
        Intrinsics.checkNotNullParameter(result, "result");
        JSONArray jSONArray = new JSONArray();
        List m = TopicsManagerImplCommon$.ExternalSyntheticApiModelOutline1.m(result);
        Intrinsics.checkNotNullExpressionValue(m, "result.topics");
        Iterator it = m.iterator();
        while (it.hasNext()) {
            Topic it2 = TopicsManagerImplCommon$.ExternalSyntheticApiModelOutline2.m(it.next());
            Intrinsics.checkNotNullExpressionValue(it2, "it");
            jSONArray.put(formatTopic(it2));
        }
        IEventSender iEventSender = this.eventSender;
        WebViewEventCategory webViewEventCategory = WebViewEventCategory.TOPICS;
        TopicsEvents topicsEvents = TopicsEvents.TOPICS_AVAILABLE;
        String jSONArray2 = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray2, "resultArray.toString()");
        iEventSender.sendEvent(webViewEventCategory, topicsEvents, jSONArray2);
    }

    @Override // android.os.OutcomeReceiver
    public /* bridge */ /* synthetic */ void onResult(Object obj) {
        onResult(TopicsManagerImplCommon$.ExternalSyntheticApiModelOutline0.m(obj));
    }
}
