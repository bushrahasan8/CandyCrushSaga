package com.google.firebase.platforminfo;

import android.content.Context;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import com.google.firebase.platforminfo.LibraryVersionComponent;

/* loaded from: LibraryVersionComponent.class */
public abstract class LibraryVersionComponent {

    /* loaded from: LibraryVersionComponent$VersionExtractor.class */
    public interface VersionExtractor {
        String extract(Object obj);
    }

    public static Component create(String str, String str2) {
        return Component.intoSet(LibraryVersion.create(str, str2), LibraryVersion.class);
    }

    public static Component fromContext(final String str, final VersionExtractor versionExtractor) {
        return Component.intoSetBuilder(LibraryVersion.class).add(Dependency.required(Context.class)).factory(new ComponentFactory(str, versionExtractor) { // from class: com.google.firebase.platforminfo.LibraryVersionComponent$$ExternalSyntheticLambda0
            public final String f$0;
            public final LibraryVersionComponent.VersionExtractor f$1;

            {
                this.f$0 = str;
                this.f$1 = versionExtractor;
            }

            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                LibraryVersion lambda$fromContext$0;
                lambda$fromContext$0 = LibraryVersionComponent.lambda$fromContext$0(this.f$0, this.f$1, componentContainer);
                return lambda$fromContext$0;
            }
        }).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ LibraryVersion lambda$fromContext$0(String str, VersionExtractor versionExtractor, ComponentContainer componentContainer) {
        return LibraryVersion.create(str, versionExtractor.extract((Context) componentContainer.get(Context.class)));
    }
}
