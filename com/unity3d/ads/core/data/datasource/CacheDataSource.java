package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.core.data.model.CacheResult;
import java.io.File;
import kotlin.coroutines.Continuation;

/* loaded from: CacheDataSource.class */
public interface CacheDataSource {

    /* loaded from: CacheDataSource$DefaultImpls.class */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getFile$default(CacheDataSource cacheDataSource, File file, String str, String str2, Integer num, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFile");
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                num = Integer.MAX_VALUE;
            }
            return cacheDataSource.getFile(file, str, str2, num, continuation);
        }
    }

    Object getFile(File file, String str, String str2, Integer num, Continuation<? super CacheResult> continuation);
}
