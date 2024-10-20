package com.king.nativesharing;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.core.content.FileProvider;
import com.king.sdk.core.KsdkCoreActivityHelper;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

@Keep
/* loaded from: NativeSharing.class */
public class NativeSharing {
    private static final String TAG = "native-sharing";
    protected static String sExternalIdKey = "externalId";
    protected static String sFunnelIdKey = "funnelId";
    private static final String shareFolder = "native-sharing-data";

    public static native void SharedToNetwork(String str, String str2, String str3);

    private static File copyFile(String str, String str2, String str3) throws IOException {
        File file = new File(str3);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(str, str2);
        File file3 = new File(str3, str2);
        if (!file2.getCanonicalPath().equals(file3.getCanonicalPath())) {
            FileInputStream fileInputStream = new FileInputStream(file2);
            FileOutputStream fileOutputStream = new FileOutputStream(file3);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            fileInputStream.close();
            fileOutputStream.flush();
            fileOutputStream.close();
        }
        return file3;
    }

    private static Uri getFileUri(String str, Context context) throws IOException {
        File file = new File(context.getCacheDir(), shareFolder);
        File file2 = new File(str);
        File copyFile = copyFile(file2.getParent(), file2.getName(), file.toString());
        Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", copyFile);
        Log.d(TAG, "Shared file: " + copyFile.toString() + " => " + uriForFile.toString());
        return uriForFile;
    }

    public static boolean shareContent(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if ((str == "image/*" || str == "video/*") && str2 == null) {
            Log.e(TAG, "Content file is null");
            return false;
        }
        Activity activity = KsdkCoreActivityHelper.getInstance().getActivity();
        Intent intent = new Intent("android.intent.action.SEND");
        if (str5 != null && !str5.isEmpty()) {
            intent.putExtra("android.intent.extra.SUBJECT", str5);
        }
        if (str3 != null && !str3.isEmpty()) {
            intent.putExtra("android.intent.extra.TEXT", str3);
        }
        if (str2 != null && !str2.isEmpty()) {
            if (!new File(str2).canRead()) {
                Log.e(TAG, "input file not readable: " + str2);
                return false;
            }
            try {
                intent.putExtra("android.intent.extra.STREAM", getFileUri(str2, activity));
                intent.addFlags(1);
            } catch (Exception e) {
                e.printStackTrace();
                Log.e(TAG, "exception: " + e.getMessage());
                return false;
            }
        }
        intent.setType(str);
        String str8 = str4;
        if (str4 == null) {
            str8 = "";
        }
        Intent intent2 = new Intent(activity, (Class<?>) NativeSharingReceiver.class);
        intent2.putExtra(sFunnelIdKey, str6);
        intent2.putExtra(sExternalIdKey, str7);
        activity.startActivity(Intent.createChooser(intent, str8, PendingIntent.getBroadcast(activity, 0, intent2, 201326592).getIntentSender()));
        return true;
    }
}
