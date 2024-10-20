package com.king.amp.sa;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import com.google.android.gms.drive.ExecutionOptions;
import com.king.abm.R$layout;

/* loaded from: BrowserComponentActivity.class */
public class BrowserComponentActivity extends AppCompatActivity {
    private static String TAG = "BrowserComponentActivity";
    private boolean browserAppeared;
    private BrowserComponent browserComponent;
    private CustomTabsServiceConnection mCustomTabsServiceConnection;
    private CustomTabsSession mCustomTabsSession;
    private String mUrl;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.king.amp.sa.BrowserComponentActivity$1, reason: invalid class name */
    /* loaded from: BrowserComponentActivity$1.class */
    public class AnonymousClass1 extends CustomTabsServiceConnection {
        final BrowserComponentActivity this$0;

        AnonymousClass1(BrowserComponentActivity browserComponentActivity) {
            this.this$0 = browserComponentActivity;
        }

        public void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
            this.this$0.mCustomTabsSession = customTabsClient.newSession(new CustomTabsCallback(this) { // from class: com.king.amp.sa.BrowserComponentActivity.1.1
                final AnonymousClass1 this$1;

                {
                    this.this$1 = this;
                }

                public void onNavigationEvent(int i, Bundle bundle) {
                    if (i == 3) {
                        Log.i(BrowserComponentActivity.TAG, "Navigation failed");
                        if (this.this$1.this$0.browserComponent != null) {
                            this.this$1.this$0.browserComponent.browserError("Navigation failed");
                            return;
                        }
                        return;
                    }
                    if (i != 4) {
                        return;
                    }
                    Log.i(BrowserComponentActivity.TAG, "Navigation aborted");
                    if (this.this$1.this$0.browserComponent != null) {
                        this.this$1.this$0.browserComponent.browserError("Navigation aborted");
                    }
                }
            });
            this.this$0.openUrl();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            this.this$0.mCustomTabsSession = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void initializeCustomTabs() {
        Log.i(TAG, "Initialize tabs");
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this);
        this.mCustomTabsServiceConnection = anonymousClass1;
        CustomTabsClient.bindCustomTabsService(this, "com.android.chrome", anonymousClass1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void openUrl() {
        Log.i(TAG, "open URL: " + this.mUrl);
        String str = getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), ExecutionOptions.MAX_TRACKING_TAG_STRING_LENGTH).activityInfo.packageName;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.mUrl));
        ComponentName resolveActivity = intent.resolveActivity(getPackageManager());
        if (resolveActivity != null) {
            String packageName = resolveActivity.getPackageName();
            if (!TextUtils.equals(str, packageName)) {
                Log.d(TAG, "Let's launch app for url, " + packageName);
                startActivity(intent);
                return;
            }
        }
        Log.d(TAG, "Let's open url in browser component");
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder(this.mCustomTabsSession);
        builder.setShowTitle(true);
        builder.build().launchUrl(this, Uri.parse(this.mUrl));
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onCreate(Bundle bundle) {
        super/*androidx.fragment.app.FragmentActivity*/.onCreate(bundle);
        setContentView(R$layout.browser_component_activity);
        Log.i(TAG, "Create");
        this.browserAppeared = false;
        this.mUrl = getIntent().getExtras().getString("url");
        this.browserComponent = BrowserComponent.getInstance();
        initializeCustomTabs();
    }

    protected void onDestroy() {
        Log.i(TAG, "Destroy");
        super.onDestroy();
        this.browserComponent = null;
        this.mCustomTabsServiceConnection = null;
        this.mCustomTabsSession = null;
    }

    protected void onPause() {
        Log.i(TAG, "Pause");
        super/*androidx.fragment.app.FragmentActivity*/.onPause();
        if (this.browserAppeared) {
            return;
        }
        BrowserComponent browserComponent = this.browserComponent;
        if (browserComponent != null) {
            browserComponent.browserAppeared();
        }
        this.browserAppeared = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected void onResume() {
        super/*androidx.fragment.app.FragmentActivity*/.onResume();
        if (this.browserAppeared) {
            Log.i(TAG, "Dismiss in resume");
            BrowserComponent browserComponent = this.browserComponent;
            if (browserComponent != null) {
                browserComponent.browserDismissed();
            }
            finish();
        }
    }
}
