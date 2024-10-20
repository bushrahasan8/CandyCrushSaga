package com.king.core;

import android.content.res.AssetFileDescriptor;
import androidx.annotation.Keep;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;

@Keep
/* loaded from: FileHandle.class */
public class FileHandle {
    private AssetFileDescriptor mDescriptor;
    private File mFile;
    private FileChannel mInputChannel;
    private InputStream mInputStream;
    private OutputStream mOutputStream;

    public FileHandle(AssetFileDescriptor assetFileDescriptor, FileChannel fileChannel) {
        this.mDescriptor = assetFileDescriptor;
        this.mInputChannel = fileChannel;
    }

    public FileHandle(File file, FileChannel fileChannel, OutputStream outputStream) {
        this.mFile = file;
        this.mInputChannel = fileChannel;
        this.mOutputStream = outputStream;
    }

    public FileHandle(InputStream inputStream) {
        this.mInputStream = inputStream;
    }

    public File getFile() {
        return this.mFile;
    }

    public AssetFileDescriptor getFileDescriptor() {
        return this.mDescriptor;
    }

    public FileChannel getInputChannel() {
        return this.mInputChannel;
    }

    public InputStream getInputStream() {
        return this.mInputStream;
    }

    public OutputStream getOutputStream() {
        return this.mOutputStream;
    }

    public boolean isAsset() {
        return this.mDescriptor != null;
    }
}
