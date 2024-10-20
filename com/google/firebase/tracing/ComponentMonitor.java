package com.google.firebase.tracing;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: ComponentMonitor.class */
public class ComponentMonitor implements ComponentRegistrarProcessor {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$processRegistrar$0(String str, Component component, ComponentContainer componentContainer) {
        try {
            FirebaseTrace.pushTrace(str);
            Object create = component.getFactory().create(componentContainer);
            FirebaseTrace.popTrace();
            return create;
        } catch (Throwable th) {
            FirebaseTrace.popTrace();
            throw th;
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public List processRegistrar(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final Component component : componentRegistrar.getComponents()) {
            final String name = component.getName();
            Component component2 = component;
            if (name != null) {
                component2 = component.withFactory(new ComponentFactory(name, component) { // from class: com.google.firebase.tracing.ComponentMonitor$$ExternalSyntheticLambda0
                    public final String f$0;
                    public final Component f$1;

                    {
                        this.f$0 = name;
                        this.f$1 = component;
                    }

                    @Override // com.google.firebase.components.ComponentFactory
                    public final Object create(ComponentContainer componentContainer) {
                        Object lambda$processRegistrar$0;
                        lambda$processRegistrar$0 = ComponentMonitor.lambda$processRegistrar$0(this.f$0, this.f$1, componentContainer);
                        return lambda$processRegistrar$0;
                    }
                });
            }
            arrayList.add(component2);
        }
        return arrayList;
    }
}
