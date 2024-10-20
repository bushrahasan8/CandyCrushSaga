package com.unity3d.ads.core.data.datasource;

import com.unity3d.ads.core.domain.privacy.FlattenerRulesUseCase;
import com.unity3d.services.core.misc.JsonFlattener;
import com.unity3d.services.core.misc.JsonStorage;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: AndroidLegacyUserConsentDataSource.class */
public final class AndroidLegacyUserConsentDataSource implements LegacyUserConsentDataSource {
    private final FlattenerRulesUseCase flattenerRulesUseCase;
    private final JsonStorage privateStorage;

    public AndroidLegacyUserConsentDataSource(FlattenerRulesUseCase flattenerRulesUseCase, JsonStorage privateStorage) {
        Intrinsics.checkNotNullParameter(flattenerRulesUseCase, "flattenerRulesUseCase");
        Intrinsics.checkNotNullParameter(privateStorage, "privateStorage");
        this.flattenerRulesUseCase = flattenerRulesUseCase;
        this.privateStorage = privateStorage;
    }

    @Override // com.unity3d.ads.core.data.datasource.LegacyUserConsentDataSource
    public String getPrivacyData() {
        JSONObject data = this.privateStorage.getData();
        String str = null;
        if (data != null) {
            JSONObject flattenJson = new JsonFlattener(data).flattenJson(".", this.flattenerRulesUseCase.invoke());
            str = null;
            if (flattenJson != null) {
                str = flattenJson.toString();
            }
        }
        return str;
    }
}
