package com.facebook.appevents.internal;

import android.os.AsyncTask;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: FileDownloadTask.class */
public final class FileDownloadTask extends AsyncTask {
    private final File destFile;
    private final Callback onSuccess;
    private final String uriStr;

    /* loaded from: FileDownloadTask$Callback.class */
    public interface Callback {
        void onComplete(File file);
    }

    public FileDownloadTask(String uriStr, File destFile, Callback onSuccess) {
        Intrinsics.checkNotNullParameter(uriStr, "uriStr");
        Intrinsics.checkNotNullParameter(destFile, "destFile");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        this.uriStr = uriStr;
        this.destFile = destFile;
        this.onSuccess = onSuccess;
    }

    @Override // android.os.AsyncTask
    public Boolean doInBackground(String... args) {
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            URL url = new URL(this.uriStr);
            int contentLength = url.openConnection().getContentLength();
            DataInputStream dataInputStream = new DataInputStream(url.openStream());
            byte[] bArr = new byte[contentLength];
            dataInputStream.readFully(bArr);
            dataInputStream.close();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.destFile));
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
            dataOutputStream.close();
            return Boolean.TRUE;
        } catch (Exception e) {
            return Boolean.FALSE;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute(((Boolean) obj).booleanValue());
    }

    protected void onPostExecute(boolean z) {
        if (z) {
            this.onSuccess.onComplete(this.destFile);
        }
    }
}
