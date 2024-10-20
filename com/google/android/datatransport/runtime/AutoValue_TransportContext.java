package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.TransportContext;
import java.util.Arrays;

/* loaded from: AutoValue_TransportContext.class */
final class AutoValue_TransportContext extends TransportContext {
    private final String backendName;
    private final byte[] extras;
    private final Priority priority;

    /* loaded from: AutoValue_TransportContext$Builder.class */
    static final class Builder extends TransportContext.Builder {
        private String backendName;
        private byte[] extras;
        private Priority priority;

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext build() {
            String str = "";
            if (this.backendName == null) {
                str = " backendName";
            }
            String str2 = str;
            if (this.priority == null) {
                str2 = str + " priority";
            }
            if (str2.isEmpty()) {
                return new AutoValue_TransportContext(this.backendName, this.extras, this.priority);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext.Builder setBackendName(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.backendName = str;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext.Builder setExtras(byte[] bArr) {
            this.extras = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.TransportContext.Builder
        public TransportContext.Builder setPriority(Priority priority) {
            if (priority == null) {
                throw new NullPointerException("Null priority");
            }
            this.priority = priority;
            return this;
        }
    }

    private AutoValue_TransportContext(String str, byte[] bArr, Priority priority) {
        this.backendName = str;
        this.extras = bArr;
        this.priority = priority;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        if (r3.priority.equals(r0.getPriority()) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 1
            r5 = r0
            r0 = r4
            r1 = r3
            if (r0 != r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = r4
            boolean r0 = r0 instanceof com.google.android.datatransport.runtime.TransportContext
            if (r0 == 0) goto L62
            r0 = r4
            com.google.android.datatransport.runtime.TransportContext r0 = (com.google.android.datatransport.runtime.TransportContext) r0
            r7 = r0
            r0 = r3
            java.lang.String r0 = r0.backendName
            r1 = r7
            java.lang.String r1 = r1.getBackendName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5e
            r0 = r3
            byte[] r0 = r0.extras
            r6 = r0
            r0 = r7
            boolean r0 = r0 instanceof com.google.android.datatransport.runtime.AutoValue_TransportContext
            if (r0 == 0) goto L3e
            r0 = r7
            com.google.android.datatransport.runtime.AutoValue_TransportContext r0 = (com.google.android.datatransport.runtime.AutoValue_TransportContext) r0
            byte[] r0 = r0.extras
            r4 = r0
            goto L44
        L3e:
            r0 = r7
            byte[] r0 = r0.getExtras()
            r4 = r0
        L44:
            r0 = r6
            r1 = r4
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L5e
            r0 = r3
            com.google.android.datatransport.Priority r0 = r0.priority
            r1 = r7
            com.google.android.datatransport.Priority r1 = r1.getPriority()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L5e
            goto L60
        L5e:
            r0 = 0
            r5 = r0
        L60:
            r0 = r5
            return r0
        L62:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.AutoValue_TransportContext.equals(java.lang.Object):boolean");
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public String getBackendName() {
        return this.backendName;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public byte[] getExtras() {
        return this.extras;
    }

    @Override // com.google.android.datatransport.runtime.TransportContext
    public Priority getPriority() {
        return this.priority;
    }

    public int hashCode() {
        return ((((this.backendName.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.extras)) * 1000003) ^ this.priority.hashCode();
    }
}
