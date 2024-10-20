package okhttp3.internal.tls;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: BasicTrustRootIndex.class */
public final class BasicTrustRootIndex implements TrustRootIndex {
    private final Map subjectToCaCerts;

    public BasicTrustRootIndex(X509Certificate... caCerts) {
        Intrinsics.checkNotNullParameter(caCerts, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = caCerts.length;
        int i = 0;
        while (i < length) {
            X509Certificate x509Certificate = caCerts[i];
            i++;
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Intrinsics.checkNotNullExpressionValue(subjectX500Principal, "caCert.subjectX500Principal");
            Object obj = linkedHashMap.get(subjectX500Principal);
            Object obj2 = obj;
            if (obj == null) {
                obj2 = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj2);
            }
            ((Set) obj2).add(x509Certificate);
        }
        this.subjectToCaCerts = linkedHashMap;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof BasicTrustRootIndex) && Intrinsics.areEqual(((BasicTrustRootIndex) obj).subjectToCaCerts, this.subjectToCaCerts));
    }

    @Override // okhttp3.internal.tls.TrustRootIndex
    public X509Certificate findByIssuerAndSignature(X509Certificate cert) {
        Object obj;
        Intrinsics.checkNotNullParameter(cert, "cert");
        Set set = (Set) this.subjectToCaCerts.get(cert.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        Iterator it = set.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            obj = it.next();
            try {
                cert.verify(((X509Certificate) obj).getPublicKey());
                break;
            } catch (Exception e) {
            }
        }
        return (X509Certificate) obj;
    }

    public int hashCode() {
        return this.subjectToCaCerts.hashCode();
    }
}
