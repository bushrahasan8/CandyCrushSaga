package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.ironsource.h4;
import com.ironsource.m4;
import com.ironsource.mediationsdk.l;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.t2;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: zzfgm.class */
public final class zzfgm {
    public final String zzA;
    public final zzcbp zzB;
    public final String zzC;
    public final JSONObject zzD;
    public final JSONObject zzE;
    public final String zzF;
    public final String zzG;
    public final String zzH;
    public final String zzI;
    public final String zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final int zzR;
    public final int zzS;
    public final boolean zzT;
    public final boolean zzU;
    public final String zzV;
    public final zzfhk zzW;
    public final boolean zzX;
    public final boolean zzY;
    public final int zzZ;
    public final List zza;
    public final String zzaa;
    public final int zzab;
    public final String zzac;
    public final boolean zzad;
    public final zzbwz zzae;
    public final com.google.android.gms.ads.internal.client.zzs zzaf;
    public final String zzag;
    public final boolean zzah;
    public final JSONObject zzai;
    public final boolean zzaj;
    public final JSONObject zzak;
    public final boolean zzal;
    public final String zzam;
    public final boolean zzan;
    public final String zzao;
    public final String zzap;
    public final String zzaq;
    public final boolean zzar;
    public final int zzas;
    public final String zzat;
    public final List zzau;
    public final int zzb;
    public final List zzc;
    public final List zzd;
    public final List zze;
    public final int zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final List zzj;
    public final String zzk;
    public final String zzl;
    public final zzcag zzm;
    public final List zzn;
    public final List zzo;
    public final List zzp;
    public final List zzq;
    public final int zzr;
    public final List zzs;
    public final zzfgr zzt;
    public final List zzu;
    public final List zzv;
    public final JSONObject zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v538, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v552, types: [java.util.List] */
    public zzfgm(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        boolean z;
        List emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        List emptyList3 = Collections.emptyList();
        List emptyList4 = Collections.emptyList();
        List emptyList5 = Collections.emptyList();
        List emptyList6 = Collections.emptyList();
        List emptyList7 = Collections.emptyList();
        List emptyList8 = Collections.emptyList();
        List emptyList9 = Collections.emptyList();
        List emptyList10 = Collections.emptyList();
        List emptyList11 = Collections.emptyList();
        List emptyList12 = Collections.emptyList();
        List emptyList13 = Collections.emptyList();
        List emptyList14 = Collections.emptyList();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        zzgaa zzl = zzgaa.zzl();
        zzgaa zzl2 = zzgaa.zzl();
        jsonReader.beginObject();
        String str = "";
        String str2 = "";
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        String str10 = str9;
        String str11 = str10;
        String str12 = str11;
        String str13 = str12;
        String str14 = str13;
        String str15 = str14;
        String str16 = str15;
        String str17 = str16;
        String str18 = str17;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        int i2 = 0;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        int i3 = 0;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        int i4 = 0;
        zzfgr zzfgrVar = null;
        zzcbp zzcbpVar = null;
        zzbwz zzbwzVar = null;
        com.google.android.gms.ads.internal.client.zzs zzsVar = null;
        String str19 = null;
        int i5 = -1;
        int i6 = -1;
        String str20 = str18;
        String str21 = str20;
        int i7 = 0;
        int i8 = 0;
        zzcag zzcagVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName = nextName == null ? "" : nextName;
            switch (nextName.hashCode()) {
                case -2138196627:
                    if (nextName.equals("ad_source_instance_name")) {
                        z = 59;
                        break;
                    }
                    break;
                case -1980587809:
                    if (nextName.equals("debug_signals")) {
                        z = 28;
                        break;
                    }
                    break;
                case -1965512151:
                    if (nextName.equals("omid_settings")) {
                        z = 41;
                        break;
                    }
                    break;
                case -1871425831:
                    if (nextName.equals("recursive_server_response_data")) {
                        z = 69;
                        break;
                    }
                    break;
                case -1843156475:
                    if (nextName.equals("is_consent")) {
                        z = 70;
                        break;
                    }
                    break;
                case -1812055556:
                    if (nextName.equals("play_prewarm_options")) {
                        z = 49;
                        break;
                    }
                    break;
                case -1785028569:
                    if (nextName.equals("parallel_key")) {
                        z = 72;
                        break;
                    }
                    break;
                case -1776946669:
                    if (nextName.equals("ad_source_name")) {
                        z = 57;
                        break;
                    }
                    break;
                case -1662989631:
                    if (nextName.equals("is_interscroller")) {
                        z = 53;
                        break;
                    }
                    break;
                case -1620470467:
                    if (nextName.equals("backend_query_id")) {
                        z = 47;
                        break;
                    }
                    break;
                case -1550155393:
                    if (nextName.equals("nofill_urls")) {
                        z = 13;
                        break;
                    }
                    break;
                case -1440104884:
                    if (nextName.equals("is_custom_close_blocked")) {
                        z = 35;
                        break;
                    }
                    break;
                case -1439500848:
                    if (nextName.equals("orientation")) {
                        z = 37;
                        break;
                    }
                    break;
                case -1428969291:
                    if (nextName.equals("enable_omid")) {
                        z = 39;
                        break;
                    }
                    break;
                case -1406227629:
                    if (nextName.equals("buffer_click_url_as_ready_to_ping")) {
                        z = 67;
                        break;
                    }
                    break;
                case -1403779768:
                    if (nextName.equals("showable_impression_type")) {
                        z = 44;
                        break;
                    }
                    break;
                case -1375413093:
                    if (nextName.equals("ad_cover")) {
                        z = 54;
                        break;
                    }
                    break;
                case -1360811658:
                    if (nextName.equals("ad_sizes")) {
                        z = 19;
                        break;
                    }
                    break;
                case -1306015996:
                    if (nextName.equals("adapters")) {
                        z = 20;
                        break;
                    }
                    break;
                case -1303332046:
                    if (nextName.equals("test_mode_enabled")) {
                        z = 34;
                        break;
                    }
                    break;
                case -1289032093:
                    if (nextName.equals("extras")) {
                        z = 29;
                        break;
                    }
                    break;
                case -1240082064:
                    if (nextName.equals("ad_event_value")) {
                        z = 51;
                        break;
                    }
                    break;
                case -1234181075:
                    if (nextName.equals("allow_pub_rendered_attribution")) {
                        z = 30;
                        break;
                    }
                    break;
                case -1168140544:
                    if (nextName.equals("presentation_error_urls")) {
                        z = 14;
                        break;
                    }
                    break;
                case -1152230954:
                    if (nextName.equals("ad_type")) {
                        z = true;
                        break;
                    }
                    break;
                case -1146534047:
                    if (nextName.equals("is_scroll_aware")) {
                        z = 43;
                        break;
                    }
                    break;
                case -1115838944:
                    if (nextName.equals("fill_urls")) {
                        z = 12;
                        break;
                    }
                    break;
                case -1081936678:
                    if (nextName.equals("allocation_id")) {
                        z = 21;
                        break;
                    }
                    break;
                case -1078050970:
                    if (nextName.equals("video_complete_urls")) {
                        z = 8;
                        break;
                    }
                    break;
                case -1051269058:
                    if (nextName.equals("active_view")) {
                        z = 25;
                        break;
                    }
                    break;
                case -982608540:
                    if (nextName.equals("valid_from_timestamp")) {
                        z = 10;
                        break;
                    }
                    break;
                case -972056451:
                    if (nextName.equals("ad_source_instance_id")) {
                        z = 60;
                        break;
                    }
                    break;
                case -776859333:
                    if (nextName.equals("click_urls")) {
                        z = 2;
                        break;
                    }
                    break;
                case -570101180:
                    if (nextName.equals("late_load_urls")) {
                        z = 73;
                        break;
                    }
                    break;
                case -544216775:
                    if (nextName.equals("safe_browsing")) {
                        z = 26;
                        break;
                    }
                    break;
                case -437057161:
                    if (nextName.equals("imp_urls")) {
                        z = 3;
                        break;
                    }
                    break;
                case -404433734:
                    if (nextName.equals("rtb_native_required_assets")) {
                        z = 62;
                        break;
                    }
                    break;
                case -404326515:
                    if (nextName.equals("render_timeout_ms")) {
                        z = 38;
                        break;
                    }
                    break;
                case -397704715:
                    if (nextName.equals("ad_close_time_ms")) {
                        z = 45;
                        break;
                    }
                    break;
                case -388807511:
                    if (nextName.equals("content_url")) {
                        z = 64;
                        break;
                    }
                    break;
                case -369773488:
                    if (nextName.equals("is_close_button_enabled")) {
                        z = 50;
                        break;
                    }
                    break;
                case -213449460:
                    if (nextName.equals("force_disable_hardware_acceleration")) {
                        z = 65;
                        break;
                    }
                    break;
                case -213424028:
                    if (nextName.equals("watermark")) {
                        z = 46;
                        break;
                    }
                    break;
                case -180214626:
                    if (nextName.equals("native_required_asset_viewability")) {
                        z = 63;
                        break;
                    }
                    break;
                case -154616268:
                    if (nextName.equals("is_offline_ad")) {
                        z = 61;
                        break;
                    }
                    break;
                case -29338502:
                    if (nextName.equals("allow_custom_click_gesture")) {
                        z = 32;
                        break;
                    }
                    break;
                case 3107:
                    if (nextName.equals("ad")) {
                        z = 18;
                        break;
                    }
                    break;
                case 3355:
                    if (nextName.equals("id")) {
                        z = 23;
                        break;
                    }
                    break;
                case 3076010:
                    if (nextName.equals("data")) {
                        z = 22;
                        break;
                    }
                    break;
                case 37109963:
                    if (nextName.equals("request_id")) {
                        z = 68;
                        break;
                    }
                    break;
                case 63195984:
                    if (nextName.equals("render_test_label")) {
                        z = 33;
                        break;
                    }
                    break;
                case 107433883:
                    if (nextName.equals("qdata")) {
                        z = 24;
                        break;
                    }
                    break;
                case 230323073:
                    if (nextName.equals("ad_load_urls")) {
                        z = 4;
                        break;
                    }
                    break;
                case 418392395:
                    if (nextName.equals("is_closable_area_disabled")) {
                        z = 36;
                        break;
                    }
                    break;
                case 542250332:
                    if (nextName.equals("consent_form_action_identifier")) {
                        z = 71;
                        break;
                    }
                    break;
                case 549176928:
                    if (nextName.equals("presentation_error_timeout_ms")) {
                        z = 16;
                        break;
                    }
                    break;
                case 597473788:
                    if (nextName.equals("debug_dialog_string")) {
                        z = 27;
                        break;
                    }
                    break;
                case 754887508:
                    if (nextName.equals("container_sizes")) {
                        z = 17;
                        break;
                    }
                    break;
                case 791122864:
                    if (nextName.equals("impression_type")) {
                        z = 5;
                        break;
                    }
                    break;
                case 1010584092:
                    if (nextName.equals("transaction_id")) {
                        z = 9;
                        break;
                    }
                    break;
                case 1100650276:
                    if (nextName.equals("rewards")) {
                        z = 11;
                        break;
                    }
                    break;
                case 1141602460:
                    if (nextName.equals("adapter_response_info_key")) {
                        z = 56;
                        break;
                    }
                    break;
                case 1186014765:
                    if (nextName.equals("cache_hit_urls")) {
                        z = 66;
                        break;
                    }
                    break;
                case 1321720943:
                    if (nextName.equals("allow_pub_owned_ad_view")) {
                        z = 31;
                        break;
                    }
                    break;
                case 1437255331:
                    if (nextName.equals("ad_source_id")) {
                        z = 58;
                        break;
                    }
                    break;
                case 1637553475:
                    if (nextName.equals("bid_response")) {
                        z = 40;
                        break;
                    }
                    break;
                case 1638957285:
                    if (nextName.equals("video_start_urls")) {
                        z = 6;
                        break;
                    }
                    break;
                case 1686319423:
                    if (nextName.equals("ad_network_class_name")) {
                        z = 55;
                        break;
                    }
                    break;
                case 1688341040:
                    if (nextName.equals("video_reward_urls")) {
                        z = 7;
                        break;
                    }
                    break;
                case 1799285870:
                    if (nextName.equals("use_third_party_container_height")) {
                        z = 48;
                        break;
                    }
                    break;
                case 1839650832:
                    if (nextName.equals("renderers")) {
                        z = false;
                        break;
                    }
                    break;
                case 1875425491:
                    if (nextName.equals("is_analytics_logging_enabled")) {
                        z = 42;
                        break;
                    }
                    break;
                case 2068142375:
                    if (nextName.equals("rule_line_external_id")) {
                        z = 52;
                        break;
                    }
                    break;
                case 2072888499:
                    if (nextName.equals("manual_tracking_urls")) {
                        z = 15;
                        break;
                    }
                    break;
            }
            z = -1;
            switch (z) {
                case false:
                    emptyList = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    break;
                case true:
                    i7 = zzb(jsonReader.nextString());
                    break;
                case true:
                    emptyList2 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    break;
                case true:
                    emptyList3 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    break;
                case true:
                    emptyList4 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    break;
                case true:
                    i8 = zzc(jsonReader.nextInt());
                    break;
                case true:
                    emptyList5 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    break;
                case true:
                    emptyList6 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    break;
                case true:
                    emptyList7 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    break;
                case true:
                    str21 = jsonReader.nextString();
                    break;
                case true:
                    str20 = jsonReader.nextString();
                    break;
                case true:
                    zzcagVar = zzcag.zza(com.google.android.gms.ads.internal.util.zzbw.zze(jsonReader));
                    break;
                case true:
                    emptyList8 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    break;
                case true:
                    emptyList9 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    break;
                case true:
                    emptyList10 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    break;
                case true:
                    emptyList11 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    break;
                case true:
                    i = jsonReader.nextInt();
                    break;
                case true:
                    emptyList12 = zzfgn.zza(jsonReader);
                    break;
                case true:
                    zzfgrVar = new zzfgr(jsonReader);
                    break;
                case true:
                    emptyList14 = zzfgn.zza(jsonReader);
                    break;
                case true:
                    emptyList13 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    break;
                case true:
                    str = jsonReader.nextString();
                    break;
                case true:
                    jSONObject = com.google.android.gms.ads.internal.util.zzbw.zzh(jsonReader);
                    break;
                case true:
                    str2 = jsonReader.nextString();
                    break;
                case true:
                    str3 = jsonReader.nextString();
                    break;
                case VIEW_NOT_VISIBLE_ON_PLAY_VALUE:
                    str4 = com.google.android.gms.ads.internal.util.zzbw.zzh(jsonReader).toString();
                    break;
                case MRAID_DOWNLOAD_JS_RETRY_SUCCESS_VALUE:
                    zzcbpVar = zzcbp.zza(com.google.android.gms.ads.internal.util.zzbw.zzh(jsonReader));
                    break;
                case OMSDK_DOWNLOAD_JS_RETRY_SUCCESS_VALUE:
                    str5 = jsonReader.nextString();
                    break;
                case PRIVACY_URL_OPENED_VALUE:
                    jSONObject2 = com.google.android.gms.ads.internal.util.zzbw.zzh(jsonReader);
                    break;
                case NOTIFICATION_REDIRECT_VALUE:
                    jSONObject3 = com.google.android.gms.ads.internal.util.zzbw.zzh(jsonReader);
                    break;
                case true:
                    z2 = jsonReader.nextBoolean();
                    break;
                case true:
                    z3 = jsonReader.nextBoolean();
                    break;
                case h4.i /* 32 */:
                    z4 = jsonReader.nextBoolean();
                    break;
                case true:
                    z5 = jsonReader.nextBoolean();
                    break;
                case true:
                    z6 = jsonReader.nextBoolean();
                    break;
                case true:
                    z7 = jsonReader.nextBoolean();
                    break;
                case true:
                    z8 = jsonReader.nextBoolean();
                    break;
                case true:
                    i5 = zzd(jsonReader.nextString());
                    break;
                case true:
                    i2 = jsonReader.nextInt();
                    break;
                case true:
                    z9 = jsonReader.nextBoolean();
                    break;
                case IronSourceConstants.CONSENT_TRUE_CODE /* 40 */:
                    str6 = jsonReader.nextString();
                    break;
                case IronSourceConstants.CONSENT_FALSE_CODE /* 41 */:
                    jSONObject4 = com.google.android.gms.ads.internal.util.zzbw.zzh(jsonReader);
                    break;
                case IronSourceConstants.CONSENT_TCF_CODE /* 42 */:
                    z10 = jsonReader.nextBoolean();
                    break;
                case true:
                    z11 = jsonReader.nextBoolean();
                    break;
                case IronSourceConstants.APP_ENTER_BACKGROUND /* 44 */:
                    i3 = jsonReader.nextInt();
                    break;
                case IronSourceConstants.APP_ENTER_FOREGROUND /* 45 */:
                    i6 = jsonReader.nextInt();
                    break;
                case true:
                    str7 = jsonReader.nextString();
                    break;
                case true:
                    str8 = jsonReader.nextString();
                    break;
                case true:
                    z12 = jsonReader.nextBoolean();
                    break;
                case true:
                    zzbwzVar = zzbwz.zza(com.google.android.gms.ads.internal.util.zzbw.zzh(jsonReader));
                    break;
                case true:
                    jsonReader.nextBoolean();
                    break;
                case IronSourceConstants.SET_META_DATA_AFTER_INIT /* 51 */:
                    zzsVar = com.google.android.gms.ads.internal.client.zzs.zza(com.google.android.gms.ads.internal.util.zzbw.zzh(jsonReader));
                    break;
                case IronSourceConstants.SET_USER_ID /* 52 */:
                    str9 = jsonReader.nextString();
                    break;
                case IronSourceConstants.SET_WATERFALL_CONFIGURATION /* 53 */:
                    z13 = jsonReader.nextBoolean();
                    break;
                case true:
                    jSONObject5 = com.google.android.gms.ads.internal.util.zzbw.zzh(jsonReader);
                    break;
                case true:
                    str10 = jsonReader.nextString();
                    break;
                case true:
                    str17 = jsonReader.nextString();
                    break;
                case true:
                    if (!((Boolean) zzbgc.zzgO.zzl()).booleanValue()) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        str11 = jsonReader.nextString();
                        break;
                    }
                case true:
                    if (!((Boolean) zzbgc.zzgO.zzl()).booleanValue()) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        str12 = jsonReader.nextString();
                        break;
                    }
                case true:
                    if (!((Boolean) zzbgc.zzgO.zzl()).booleanValue()) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        str13 = jsonReader.nextString();
                        break;
                    }
                case true:
                    if (!((Boolean) zzbgc.zzgO.zzl()).booleanValue()) {
                        jsonReader.skipValue();
                        break;
                    } else {
                        str14 = jsonReader.nextString();
                        break;
                    }
                case m4.S /* 61 */:
                    z14 = jsonReader.nextBoolean();
                    break;
                case IronSourceConstants.RETRY_LIMIT /* 62 */:
                    jSONObject6 = com.google.android.gms.ads.internal.util.zzbw.zzh(jsonReader);
                    break;
                case true:
                    z15 = jsonReader.nextBoolean();
                    break;
                case true:
                    str19 = jsonReader.nextString();
                    break;
                case true:
                    z16 = jsonReader.nextBoolean();
                    break;
                case true:
                    zzl = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    break;
                case true:
                    z17 = jsonReader.nextBoolean();
                    break;
                case true:
                    str15 = jsonReader.nextString();
                    break;
                case true:
                    str16 = jsonReader.nextString();
                    break;
                case IronSourceConstants.TEST_SUITE_LAUNCH_TS /* 70 */:
                    z18 = jsonReader.nextBoolean();
                    break;
                case IronSourceConstants.TEST_SUITE_OPENED_SUCCESSFULLY /* 71 */:
                    i4 = jsonReader.nextInt();
                    break;
                case IronSourceConstants.TEST_SUITE_FAILED_TO_OPEN /* 72 */:
                    str18 = jsonReader.nextString();
                    break;
                case IronSourceConstants.TEST_SUITE_WEB_CONTROLLER_OPEN_SUCCESSFULLY /* 73 */:
                    zzl2 = com.google.android.gms.ads.internal.util.zzbw.zzd(jsonReader);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        this.zza = emptyList;
        this.zzb = i7;
        this.zzc = emptyList2;
        this.zzd = emptyList3;
        this.zzg = emptyList4;
        this.zzf = i8;
        this.zzh = emptyList5;
        this.zzi = emptyList6;
        this.zzj = emptyList7;
        this.zzk = str21;
        this.zzl = str20;
        this.zzm = zzcagVar;
        this.zzn = emptyList8;
        this.zzo = emptyList9;
        this.zzp = emptyList10;
        this.zzq = emptyList11;
        this.zzr = i;
        this.zzs = emptyList12;
        this.zzt = zzfgrVar;
        this.zzu = emptyList13;
        this.zzv = emptyList14;
        this.zzx = str;
        this.zzw = jSONObject;
        this.zzy = str2;
        this.zzz = str3;
        this.zzA = str4;
        this.zzB = zzcbpVar;
        this.zzC = str5;
        this.zzD = jSONObject2;
        this.zzE = jSONObject3;
        this.zzK = z2;
        this.zzL = z3;
        this.zzM = z4;
        this.zzN = z5;
        this.zzO = z6;
        this.zzP = z7;
        this.zzQ = z8;
        this.zzR = i5;
        this.zzS = i2;
        this.zzU = z9;
        this.zzV = str6;
        this.zzW = new zzfhk(jSONObject4);
        this.zzX = z10;
        this.zzY = z11;
        this.zzZ = i3;
        this.zzaa = str7;
        this.zzab = i6;
        this.zzac = str8;
        this.zzad = z12;
        this.zzae = zzbwzVar;
        this.zzaf = zzsVar;
        this.zzag = str9;
        this.zzah = z13;
        this.zzai = jSONObject5;
        this.zzF = str10;
        this.zzG = str11;
        this.zzH = str12;
        this.zzI = str13;
        this.zzJ = str14;
        this.zzaj = z14;
        this.zzak = jSONObject6;
        this.zzal = z15;
        this.zzam = str19;
        this.zzan = z16;
        this.zze = zzl;
        this.zzT = z17;
        this.zzao = str15;
        this.zzap = str16;
        this.zzaq = str17;
        this.zzar = z18;
        this.zzas = i4;
        this.zzau = zzl2;
        this.zzat = str18;
    }

    public static String zza(int i) {
        switch (i) {
            case 1:
                return l.a;
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    private static int zzb(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if (IronSourceConstants.AD_UNIT_IS_MEDIATION_STATE.equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    private static int zzc(int i) {
        int i2 = i;
        if (i != 0) {
            i2 = i;
            if (i != 1) {
                i2 = i == 3 ? i : 0;
            }
        }
        return i2;
    }

    private static final int zzd(String str) {
        if (t2.h.C.equalsIgnoreCase(str)) {
            return 6;
        }
        return t2.h.D.equalsIgnoreCase(str) ? 7 : -1;
    }
}
