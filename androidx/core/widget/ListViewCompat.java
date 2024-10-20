package androidx.core.widget;

import android.widget.ListView;

/* loaded from: ListViewCompat.class */
public abstract class ListViewCompat {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: ListViewCompat$Api19Impl.class */
    public static abstract class Api19Impl {
        static boolean canScrollList(ListView listView, int i) {
            return listView.canScrollList(i);
        }

        static void scrollListBy(ListView listView, int i) {
            listView.scrollListBy(i);
        }
    }

    public static boolean canScrollList(ListView listView, int i) {
        return Api19Impl.canScrollList(listView, i);
    }

    public static void scrollListBy(ListView listView, int i) {
        Api19Impl.scrollListBy(listView, i);
    }
}
