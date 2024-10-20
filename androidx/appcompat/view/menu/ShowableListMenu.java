package androidx.appcompat.view.menu;

import android.widget.ListView;

/* loaded from: ShowableListMenu.class */
public interface ShowableListMenu {
    void dismiss();

    ListView getListView();

    boolean isShowing();

    void show();
}
