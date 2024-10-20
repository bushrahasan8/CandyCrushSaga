package com.king.candycrushsaga;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;

@Keep
/* loaded from: Notifier.class */
public class Notifier {
    private static final String TAG = "FictionFactory:" + Notifier.class.getSimpleName();

    public static void showNotification(Context context, String str) {
        NotificationCompat.Builder contentText = new NotificationCompat.Builder(context).setAutoCancel(true).setSmallIcon(R$drawable.icon).setDefaults(-1).setContentTitle("Candycrush Saga").setContentText(str);
        Intent intent = new Intent(context, (Class<?>) CandyCrushSagaActivity.class);
        intent.setFlags(603979776);
        intent.putExtra("from", "notification");
        contentText.setContentIntent(PendingIntent.getActivity(context.getApplicationContext(), 0, intent, 0));
        ((NotificationManager) context.getSystemService("notification")).notify(11, contentText.build());
    }
}
