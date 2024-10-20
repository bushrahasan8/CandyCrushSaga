package com.king.core;

import android.content.res.AssetManager;
import android.os.Environment;
import androidx.annotation.Keep;
import com.king.core.activityhelper.ActivityHelper;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;

@Keep
/* loaded from: FileSystem.class */
public class FileSystem {
    private static final String PRIVATE_STORAGE_DIRECTORY = "storage";
    private static File mHomeDirectoryPath;

    public static boolean folderExistsInApk(String str) {
        AssetManager assets = ActivityHelper.getInstance().getActivity().getAssets();
        boolean z = false;
        try {
            if ((str.endsWith(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH) ? assets.list(str.substring(0, str.length() - 1)) : assets.list(str)).length != 0) {
                z = true;
            }
        } catch (Exception e) {
        }
        return z;
    }

    public static String getCacheDirectory() {
        return ActivityHelper.getInstance().getActivity().getCacheDir().getAbsolutePath() + UnityAdsConstants.DefaultUrls.AD_ASSET_PATH;
    }

    public static String getHomeDirectory() {
        if (mHomeDirectoryPath == null) {
            mHomeDirectoryPath = ActivityHelper.getInstance().getActivity().getDir("storage", 0);
        }
        return mHomeDirectoryPath.getAbsolutePath() + UnityAdsConstants.DefaultUrls.AD_ASSET_PATH;
    }

    public static String getSharedDirectory() {
        File externalCacheDir;
        if (!"mounted".equals(Environment.getExternalStorageState()) || (externalCacheDir = ActivityHelper.getInstance().getActivity().getExternalCacheDir()) == null) {
            return "";
        }
        externalCacheDir.mkdirs();
        return externalCacheDir.getAbsolutePath() + UnityAdsConstants.DefaultUrls.AD_ASSET_PATH;
    }
}
