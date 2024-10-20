package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/* loaded from: a.class */
public class a extends Fragment {
    private InterfaceC0036a a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.lifecycle.a$a, reason: collision with other inner class name */
    /* loaded from: a$a.class */
    public interface InterfaceC0036a {
        void a(Activity activity);

        void b(Activity activity);

        void onResume(Activity activity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a(Activity activity) {
        return (a) activity.getFragmentManager().findFragmentByTag("com.ironsource.lifecycle.IronsourceLifecycleFragment");
    }

    private void a(InterfaceC0036a interfaceC0036a) {
        if (interfaceC0036a != null) {
            interfaceC0036a.b(getActivity());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager == null || fragmentManager.findFragmentByTag("com.ironsource.lifecycle.IronsourceLifecycleFragment") != null) {
            return;
        }
        fragmentManager.beginTransaction().add(new a(), "com.ironsource.lifecycle.IronsourceLifecycleFragment").commit();
        fragmentManager.executePendingTransactions();
    }

    private void b(InterfaceC0036a interfaceC0036a) {
        if (interfaceC0036a != null) {
            interfaceC0036a.onResume(getActivity());
        }
    }

    private void c(InterfaceC0036a interfaceC0036a) {
        if (interfaceC0036a != null) {
            interfaceC0036a.a(getActivity());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(InterfaceC0036a interfaceC0036a) {
        this.a = interfaceC0036a;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(this.a);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.a = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        b(this.a);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        c(this.a);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
    }
}
