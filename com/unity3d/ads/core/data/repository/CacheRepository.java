package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CachedFile;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.json.JSONArray;

/* loaded from: CacheRepository.class */
public interface CacheRepository {

    /* loaded from: CacheRepository$DefaultImpls.class */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getFile$default(CacheRepository cacheRepository, String str, String str2, JSONArray jSONArray, int i, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFile");
            }
            if ((i2 & 4) != 0) {
                jSONArray = null;
            }
            if ((i2 & 8) != 0) {
                i = 0;
            }
            return cacheRepository.getFile(str, str2, jSONArray, i, continuation);
        }
    }

    Object clearCache(Continuation<? super Unit> continuation);

    Object doesFileExist(String str, Continuation<? super Boolean> continuation);

    Object getCacheSize(Continuation<? super Long> continuation);

    Object getFile(String str, String str2, JSONArray jSONArray, int i, Continuation<? super CacheResult> continuation);

    void removeFile(CachedFile cachedFile);

    CacheResult retrieveFile(String str);
}
