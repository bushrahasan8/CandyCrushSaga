package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportScheduleCallback;

/* loaded from: TransportImpl.class */
final class TransportImpl implements Transport {
    private final String name;
    private final Encoding payloadEncoding;
    private final Transformer transformer;
    private final TransportContext transportContext;
    private final TransportInternal transportInternal;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TransportImpl(TransportContext transportContext, String str, Encoding encoding, Transformer transformer, TransportInternal transportInternal) {
        this.transportContext = transportContext;
        this.name = str;
        this.payloadEncoding = encoding;
        this.transformer = transformer;
        this.transportInternal = transportInternal;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$send$0(Exception exc) {
    }

    public void schedule(Event event, TransportScheduleCallback transportScheduleCallback) {
        this.transportInternal.send(SendRequest.builder().setTransportContext(this.transportContext).setEvent(event).setTransportName(this.name).setTransformer(this.transformer).setEncoding(this.payloadEncoding).build(), transportScheduleCallback);
    }

    @Override // com.google.android.datatransport.Transport
    public void send(Event event) {
        schedule(event, new TransportScheduleCallback() { // from class: com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0
            @Override // com.google.android.datatransport.TransportScheduleCallback
            public final void onSchedule(Exception exc) {
                TransportImpl.lambda$send$0(exc);
            }
        });
    }
}
