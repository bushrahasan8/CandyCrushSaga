package com.king.usdk.ada;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import support.ada.embed.ui.AdaEmbedActivity;

/* loaded from: AdaActivity.class */
public class AdaActivity extends AdaEmbedActivity {
    private void SetupActionBar() {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
            supportActionBar.setDisplayShowTitleEnabled(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // support.ada.embed.ui.AdaEmbedActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRequestedOrientation(1);
        SetupActionBar();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super/*android.app.Activity*/.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
