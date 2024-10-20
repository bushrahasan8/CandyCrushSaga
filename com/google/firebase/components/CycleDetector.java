package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: CycleDetector.class */
abstract class CycleDetector {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: CycleDetector$ComponentNode.class */
    public static class ComponentNode {
        private final Component component;
        private final Set dependencies = new HashSet();
        private final Set dependents = new HashSet();

        ComponentNode(Component component) {
            this.component = component;
        }

        void addDependency(ComponentNode componentNode) {
            this.dependencies.add(componentNode);
        }

        void addDependent(ComponentNode componentNode) {
            this.dependents.add(componentNode);
        }

        Component getComponent() {
            return this.component;
        }

        Set getDependencies() {
            return this.dependencies;
        }

        boolean isLeaf() {
            return this.dependencies.isEmpty();
        }

        boolean isRoot() {
            return this.dependents.isEmpty();
        }

        void removeDependent(ComponentNode componentNode) {
            this.dependents.remove(componentNode);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: CycleDetector$Dep.class */
    public static class Dep {
        private final Qualified anInterface;
        private final boolean set;

        private Dep(Qualified qualified, boolean z) {
            this.anInterface = qualified;
            this.set = z;
        }

        public boolean equals(Object obj) {
            boolean z = false;
            if (obj instanceof Dep) {
                Dep dep = (Dep) obj;
                z = false;
                if (dep.anInterface.equals(this.anInterface)) {
                    z = false;
                    if (dep.set == this.set) {
                        z = true;
                    }
                }
            }
            return z;
        }

        public int hashCode() {
            return ((this.anInterface.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.set).hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void detect(List list) {
        Set<ComponentNode> graph = toGraph(list);
        Set roots = getRoots(graph);
        int i = 0;
        while (!roots.isEmpty()) {
            ComponentNode componentNode = (ComponentNode) roots.iterator().next();
            roots.remove(componentNode);
            int i2 = i + 1;
            Iterator it = componentNode.getDependencies().iterator();
            while (true) {
                i = i2;
                if (it.hasNext()) {
                    ComponentNode componentNode2 = (ComponentNode) it.next();
                    componentNode2.removeDependent(componentNode);
                    if (componentNode2.isRoot()) {
                        roots.add(componentNode2);
                    }
                }
            }
        }
        if (i == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (ComponentNode componentNode3 : graph) {
            if (!componentNode3.isRoot() && !componentNode3.isLeaf()) {
                arrayList.add(componentNode3.getComponent());
            }
        }
        throw new DependencyCycleException(arrayList);
    }

    private static Set getRoots(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ComponentNode componentNode = (ComponentNode) it.next();
            if (componentNode.isRoot()) {
                hashSet.add(componentNode);
            }
        }
        return hashSet;
    }

    private static Set toGraph(List list) {
        Set<ComponentNode> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Component component = (Component) it.next();
            ComponentNode componentNode = new ComponentNode(component);
            for (Qualified qualified : component.getProvidedInterfaces()) {
                Dep dep = new Dep(qualified, !component.isValue());
                if (!hashMap.containsKey(dep)) {
                    hashMap.put(dep, new HashSet());
                }
                Set set2 = (Set) hashMap.get(dep);
                if (!set2.isEmpty() && !dep.set) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", qualified));
                }
                set2.add(componentNode);
            }
        }
        Iterator it2 = hashMap.values().iterator();
        while (it2.hasNext()) {
            for (ComponentNode componentNode2 : (Set) it2.next()) {
                for (Dependency dependency : componentNode2.getComponent().getDependencies()) {
                    if (dependency.isDirectInjection() && (set = (Set) hashMap.get(new Dep(dependency.getInterface(), dependency.isSet()))) != null) {
                        for (ComponentNode componentNode3 : set) {
                            componentNode2.addDependency(componentNode3);
                            componentNode3.addDependent(componentNode2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it3 = hashMap.values().iterator();
        while (it3.hasNext()) {
            hashSet.addAll((Set) it3.next());
        }
        return hashSet;
    }
}
