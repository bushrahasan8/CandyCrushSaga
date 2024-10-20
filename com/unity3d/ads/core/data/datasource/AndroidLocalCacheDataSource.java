package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.core.data.model.CacheError;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CacheSource;
import com.unity3d.ads.core.data.model.CachedFile;
import java.io.File;
import kotlin.coroutines.Continuation;

/* loaded from: AndroidLocalCacheDataSource.class */
public final class AndroidLocalCacheDataSource implements CacheDataSource {
    @Override // com.unity3d.ads.core.data.datasource.CacheDataSource
    public Object getFile(File file, String str, String str2, Integer num, Continuation<? super CacheResult> continuation) {
        Object failure;
        File file2 = new File(file, str);
        if (file2.exists()) {
            if (str2 == null) {
                str2 = "";
            }
            failure = new CacheResult.Success(new CachedFile("", str2, str, file2, null, 0L, null, 0, 240, null), CacheSource.LOCAL);
        } else {
            failure = new CacheResult.Failure(CacheError.FILE_NOT_FOUND, CacheSource.LOCAL);
        }
        return failure;
    }
}
