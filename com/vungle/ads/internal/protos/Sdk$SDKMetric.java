package com.vungle.ads.internal.protos;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: Sdk$SDKMetric.class */
public final class Sdk$SDKMetric extends GeneratedMessageLite<Sdk$SDKMetric, Builder> implements Sdk$SDKMetricOrBuilder {
    public static final int CONNECTIONTYPEDETAIL_FIELD_NUMBER = 9;
    public static final int CONNECTIONTYPE_FIELD_NUMBER = 8;
    public static final int CREATIVEID_FIELD_NUMBER = 11;
    private static final Sdk$SDKMetric DEFAULT_INSTANCE;
    public static final int EVENTID_FIELD_NUMBER = 12;
    public static final int MAKE_FIELD_NUMBER = 4;
    public static final int META_FIELD_NUMBER = 3;
    public static final int MODEL_FIELD_NUMBER = 5;
    public static final int OSVERSION_FIELD_NUMBER = 7;
    public static final int OS_FIELD_NUMBER = 6;
    private static volatile Parser<Sdk$SDKMetric> PARSER;
    public static final int PLACEMENTREFERENCEID_FIELD_NUMBER = 10;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int type_;
    private long value_;
    private String meta_ = "";
    private String make_ = "";
    private String model_ = "";
    private String os_ = "";
    private String osVersion_ = "";
    private String connectionType_ = "";
    private String connectionTypeDetail_ = "";
    private String placementReferenceId_ = "";
    private String creativeId_ = "";
    private String eventId_ = "";

    /* loaded from: Sdk$SDKMetric$Builder.class */
    public static final class Builder extends GeneratedMessageLite.Builder implements Sdk$SDKMetricOrBuilder {
        private Builder() {
            super(Sdk$SDKMetric.DEFAULT_INSTANCE);
        }

        /* synthetic */ Builder(Sdk$1 sdk$1) {
            this();
        }

        public Builder clearConnectionType() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearConnectionType();
            return this;
        }

        public Builder clearConnectionTypeDetail() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearConnectionTypeDetail();
            return this;
        }

        public Builder clearCreativeId() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearCreativeId();
            return this;
        }

        public Builder clearEventId() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearEventId();
            return this;
        }

        public Builder clearMake() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearMake();
            return this;
        }

        public Builder clearMeta() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearMeta();
            return this;
        }

        public Builder clearModel() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearModel();
            return this;
        }

        public Builder clearOs() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearOs();
            return this;
        }

        public Builder clearOsVersion() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearOsVersion();
            return this;
        }

        public Builder clearPlacementReferenceId() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearPlacementReferenceId();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearType();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).clearValue();
            return this;
        }

        @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
        public String getConnectionType() {
            return ((Sdk$SDKMetric) this.instance).getConnectionType();
        }

        @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
        public ByteString getConnectionTypeBytes() {
            return ((Sdk$SDKMetric) this.instance).getConnectionTypeBytes();
        }

        @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
        public String getConnectionTypeDetail() {
            return ((Sdk$SDKMetric) this.instance).getConnectionTypeDetail();
        }

        @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
        public ByteString getConnectionTypeDetailBytes() {
            return ((Sdk$SDKMetric) this.instance).getConnectionTypeDetailBytes();
        }

        @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
        public String getCreativeId() {
            return ((Sdk$SDKMetric) this.instance).getCreativeId();
        }

        @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
        public ByteString getCreativeIdBytes() {
            return ((Sdk$SDKMetric) this.instance).getCreativeIdBytes();
        }

        @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
        public String getEventId() {
            return ((Sdk$SDKMetric) this.instance).getEventId();
        }

        @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
        public ByteString getEventIdBytes() {
            return ((Sdk$SDKMetric) this.instance).getEventIdBytes();
        }

        @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
        public String getMake() {
            return ((Sdk$SDKMetric) this.instance).getMake();
        }

        @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
        public ByteString getMakeBytes() {
            return ((Sdk$SDKMetric) this.instance).getMakeBytes();
        }

        @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
        public String getMeta() {
            return ((Sdk$SDKMetric) this.instance).getMeta();
        }

        @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
        public ByteString getMetaBytes() {
            return ((Sdk$SDKMetric) this.instance).getMetaBytes();
        }

        @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
        public String getModel() {
            return ((Sdk$SDKMetric) this.instance).getModel();
        }

        @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
        public ByteString getModelBytes() {
            return ((Sdk$SDKMetric) this.instance).getModelBytes();
        }

        @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
        public String getOs() {
            return ((Sdk$SDKMetric) this.instance).getOs();
        }

        @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
        public ByteString getOsBytes() {
            return ((Sdk$SDKMetric) this.instance).getOsBytes();
        }

        @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
        public String getOsVersion() {
            return ((Sdk$SDKMetric) this.instance).getOsVersion();
        }

        @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
        public ByteString getOsVersionBytes() {
            return ((Sdk$SDKMetric) this.instance).getOsVersionBytes();
        }

        @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
        public String getPlacementReferenceId() {
            return ((Sdk$SDKMetric) this.instance).getPlacementReferenceId();
        }

        @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
        public ByteString getPlacementReferenceIdBytes() {
            return ((Sdk$SDKMetric) this.instance).getPlacementReferenceIdBytes();
        }

        @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
        public SDKMetricType getType() {
            return ((Sdk$SDKMetric) this.instance).getType();
        }

        @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
        public int getTypeValue() {
            return ((Sdk$SDKMetric) this.instance).getTypeValue();
        }

        @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
        public long getValue() {
            return ((Sdk$SDKMetric) this.instance).getValue();
        }

        public Builder setConnectionType(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setConnectionType(str);
            return this;
        }

        public Builder setConnectionTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setConnectionTypeBytes(byteString);
            return this;
        }

        public Builder setConnectionTypeDetail(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setConnectionTypeDetail(str);
            return this;
        }

        public Builder setConnectionTypeDetailBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setConnectionTypeDetailBytes(byteString);
            return this;
        }

        public Builder setCreativeId(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setCreativeId(str);
            return this;
        }

        public Builder setCreativeIdBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setCreativeIdBytes(byteString);
            return this;
        }

        public Builder setEventId(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setEventId(str);
            return this;
        }

        public Builder setEventIdBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setEventIdBytes(byteString);
            return this;
        }

        public Builder setMake(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setMake(str);
            return this;
        }

        public Builder setMakeBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setMakeBytes(byteString);
            return this;
        }

        public Builder setMeta(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setMeta(str);
            return this;
        }

        public Builder setMetaBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setMetaBytes(byteString);
            return this;
        }

        public Builder setModel(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setModel(str);
            return this;
        }

        public Builder setModelBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setModelBytes(byteString);
            return this;
        }

        public Builder setOs(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setOs(str);
            return this;
        }

        public Builder setOsBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setOsBytes(byteString);
            return this;
        }

        public Builder setOsVersion(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setOsVersion(str);
            return this;
        }

        public Builder setOsVersionBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setOsVersionBytes(byteString);
            return this;
        }

        public Builder setPlacementReferenceId(String str) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setPlacementReferenceId(str);
            return this;
        }

        public Builder setPlacementReferenceIdBytes(ByteString byteString) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setPlacementReferenceIdBytes(byteString);
            return this;
        }

        public Builder setType(SDKMetricType sDKMetricType) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setType(sDKMetricType);
            return this;
        }

        public Builder setTypeValue(int i) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setTypeValue(i);
            return this;
        }

        public Builder setValue(long j) {
            copyOnWrite();
            ((Sdk$SDKMetric) this.instance).setValue(j);
            return this;
        }
    }

    /* loaded from: Sdk$SDKMetric$SDKMetricType.class */
    public enum SDKMetricType implements Internal.EnumLite {
        UNKNOWN_METRIC_TYPE(0),
        AD_REQUEST_TO_RESPONSE_DURATION_MS(1),
        AD_RESPONSE_TO_SHOW_DURATION_MS(2),
        AD_SHOW_TO_DISPLAY_DURATION_MS(3),
        AD_DISPLAY_TO_CLICK_DURATION_MS(4),
        IOS_STORE_KIT_LOAD_TIME_MS(5),
        INIT_REQUEST_TO_RESPONSE_DURATION_MS(6),
        ASSET_DOWNLOAD_DURATION_MS(7),
        LOCAL_ASSETS_USED(8),
        REMOTE_ASSETS_USED(9),
        TEMPLATE_DOWNLOAD_DURATION_MS(10),
        AD_REQUEST_TO_CALLBACK_DURATION_MS(11),
        AD_REQUEST_TO_CALLBACK_ADO_DURATION_MS(12),
        ASSET_FILE_SIZE(13),
        USER_AGENT_LOAD_DURATION_MS(14),
        TEMPLATE_ZIP_SIZE(15),
        CACHED_ASSETS_USED(16),
        LOAD_AD_API(17),
        TPAT_FIRED(18),
        TPAT_SUCCESS(19),
        WIN_NOTIF_FIRED(20),
        WIN_NOTIF_SUCCESS(21),
        AD_EXPIRED_BEFORE_PLAY(22),
        PLAY_AD_API(23),
        AD_LOAD_FAIL(24),
        VIEW_NOT_VISIBLE_ON_PLAY(25),
        MRAID_DOWNLOAD_JS_RETRY_SUCCESS(26),
        OMSDK_DOWNLOAD_JS_RETRY_SUCCESS(27),
        PRIVACY_URL_OPENED(28),
        NOTIFICATION_REDIRECT(29),
        AD_PLAY_RESET_ON_DEINIT(30),
        SKOVERLAY_PRESENTED_FOR_AD(2000),
        SAFARI_PRESENTED_FOR_AD(2001),
        STORE_KIT_PRESENTED_FOR_AD(2002),
        STORE_KIT_NOT_READY(2003),
        LAUNCH_STORE_KIT_REQUEST(2004),
        LAUNCH_SKOVERLAY_REQUEST(2005),
        LAUNCH_SAFARI_REQUEST(2006),
        IDFV_RESTRICTED(2007),
        NOTIFICATION_WAIT_FOR_CONNECTIVITY(2008),
        IDFV_VALUE_CHANGED(2009),
        UNRECOGNIZED(-1);

        public static final int AD_DISPLAY_TO_CLICK_DURATION_MS_VALUE = 4;

        @Deprecated
        public static final int AD_EXPIRED_BEFORE_PLAY_VALUE = 22;
        public static final int AD_LOAD_FAIL_VALUE = 24;
        public static final int AD_PLAY_RESET_ON_DEINIT_VALUE = 30;
        public static final int AD_REQUEST_TO_CALLBACK_ADO_DURATION_MS_VALUE = 12;
        public static final int AD_REQUEST_TO_CALLBACK_DURATION_MS_VALUE = 11;
        public static final int AD_REQUEST_TO_RESPONSE_DURATION_MS_VALUE = 1;
        public static final int AD_RESPONSE_TO_SHOW_DURATION_MS_VALUE = 2;
        public static final int AD_SHOW_TO_DISPLAY_DURATION_MS_VALUE = 3;
        public static final int ASSET_DOWNLOAD_DURATION_MS_VALUE = 7;
        public static final int ASSET_FILE_SIZE_VALUE = 13;
        public static final int CACHED_ASSETS_USED_VALUE = 16;
        public static final int IDFV_RESTRICTED_VALUE = 2007;
        public static final int IDFV_VALUE_CHANGED_VALUE = 2009;
        public static final int INIT_REQUEST_TO_RESPONSE_DURATION_MS_VALUE = 6;
        public static final int IOS_STORE_KIT_LOAD_TIME_MS_VALUE = 5;
        public static final int LAUNCH_SAFARI_REQUEST_VALUE = 2006;
        public static final int LAUNCH_SKOVERLAY_REQUEST_VALUE = 2005;
        public static final int LAUNCH_STORE_KIT_REQUEST_VALUE = 2004;
        public static final int LOAD_AD_API_VALUE = 17;
        public static final int LOCAL_ASSETS_USED_VALUE = 8;
        public static final int MRAID_DOWNLOAD_JS_RETRY_SUCCESS_VALUE = 26;
        public static final int NOTIFICATION_REDIRECT_VALUE = 29;
        public static final int NOTIFICATION_WAIT_FOR_CONNECTIVITY_VALUE = 2008;
        public static final int OMSDK_DOWNLOAD_JS_RETRY_SUCCESS_VALUE = 27;
        public static final int PLAY_AD_API_VALUE = 23;
        public static final int PRIVACY_URL_OPENED_VALUE = 28;
        public static final int REMOTE_ASSETS_USED_VALUE = 9;
        public static final int SAFARI_PRESENTED_FOR_AD_VALUE = 2001;
        public static final int SKOVERLAY_PRESENTED_FOR_AD_VALUE = 2000;
        public static final int STORE_KIT_NOT_READY_VALUE = 2003;
        public static final int STORE_KIT_PRESENTED_FOR_AD_VALUE = 2002;
        public static final int TEMPLATE_DOWNLOAD_DURATION_MS_VALUE = 10;
        public static final int TEMPLATE_ZIP_SIZE_VALUE = 15;
        public static final int TPAT_FIRED_VALUE = 18;
        public static final int TPAT_SUCCESS_VALUE = 19;
        public static final int UNKNOWN_METRIC_TYPE_VALUE = 0;
        public static final int USER_AGENT_LOAD_DURATION_MS_VALUE = 14;
        public static final int VIEW_NOT_VISIBLE_ON_PLAY_VALUE = 25;
        public static final int WIN_NOTIF_FIRED_VALUE = 20;
        public static final int WIN_NOTIF_SUCCESS_VALUE = 21;
        private static final Internal.EnumLiteMap<SDKMetricType> internalValueMap = new Internal.EnumLiteMap() { // from class: com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SDKMetricType findValueByNumber(int i) {
                return SDKMetricType.forNumber(i);
            }
        };
        private final int value;

        /* loaded from: Sdk$SDKMetric$SDKMetricType$SDKMetricTypeVerifier.class */
        private static final class SDKMetricTypeVerifier implements Internal.EnumVerifier {
            static final Internal.EnumVerifier INSTANCE = new SDKMetricTypeVerifier();

            private SDKMetricTypeVerifier() {
            }

            @Override // com.google.protobuf.Internal.EnumVerifier
            public boolean isInRange(int i) {
                return SDKMetricType.forNumber(i) != null;
            }
        }

        SDKMetricType(int i) {
            this.value = i;
        }

        public static SDKMetricType forNumber(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_METRIC_TYPE;
                case 1:
                    return AD_REQUEST_TO_RESPONSE_DURATION_MS;
                case 2:
                    return AD_RESPONSE_TO_SHOW_DURATION_MS;
                case 3:
                    return AD_SHOW_TO_DISPLAY_DURATION_MS;
                case 4:
                    return AD_DISPLAY_TO_CLICK_DURATION_MS;
                case 5:
                    return IOS_STORE_KIT_LOAD_TIME_MS;
                case 6:
                    return INIT_REQUEST_TO_RESPONSE_DURATION_MS;
                case 7:
                    return ASSET_DOWNLOAD_DURATION_MS;
                case 8:
                    return LOCAL_ASSETS_USED;
                case 9:
                    return REMOTE_ASSETS_USED;
                case 10:
                    return TEMPLATE_DOWNLOAD_DURATION_MS;
                case 11:
                    return AD_REQUEST_TO_CALLBACK_DURATION_MS;
                case 12:
                    return AD_REQUEST_TO_CALLBACK_ADO_DURATION_MS;
                case 13:
                    return ASSET_FILE_SIZE;
                case 14:
                    return USER_AGENT_LOAD_DURATION_MS;
                case 15:
                    return TEMPLATE_ZIP_SIZE;
                case 16:
                    return CACHED_ASSETS_USED;
                case 17:
                    return LOAD_AD_API;
                case 18:
                    return TPAT_FIRED;
                case 19:
                    return TPAT_SUCCESS;
                case 20:
                    return WIN_NOTIF_FIRED;
                case 21:
                    return WIN_NOTIF_SUCCESS;
                case 22:
                    return AD_EXPIRED_BEFORE_PLAY;
                case 23:
                    return PLAY_AD_API;
                case 24:
                    return AD_LOAD_FAIL;
                case VIEW_NOT_VISIBLE_ON_PLAY_VALUE:
                    return VIEW_NOT_VISIBLE_ON_PLAY;
                case MRAID_DOWNLOAD_JS_RETRY_SUCCESS_VALUE:
                    return MRAID_DOWNLOAD_JS_RETRY_SUCCESS;
                case OMSDK_DOWNLOAD_JS_RETRY_SUCCESS_VALUE:
                    return OMSDK_DOWNLOAD_JS_RETRY_SUCCESS;
                case PRIVACY_URL_OPENED_VALUE:
                    return PRIVACY_URL_OPENED;
                case NOTIFICATION_REDIRECT_VALUE:
                    return NOTIFICATION_REDIRECT;
                case 30:
                    return AD_PLAY_RESET_ON_DEINIT;
                default:
                    switch (i) {
                        case 2000:
                            return SKOVERLAY_PRESENTED_FOR_AD;
                        case 2001:
                            return SAFARI_PRESENTED_FOR_AD;
                        case 2002:
                            return STORE_KIT_PRESENTED_FOR_AD;
                        case 2003:
                            return STORE_KIT_NOT_READY;
                        case 2004:
                            return LAUNCH_STORE_KIT_REQUEST;
                        case 2005:
                            return LAUNCH_SKOVERLAY_REQUEST;
                        case 2006:
                            return LAUNCH_SAFARI_REQUEST;
                        case 2007:
                            return IDFV_RESTRICTED;
                        case 2008:
                            return NOTIFICATION_WAIT_FOR_CONNECTIVITY;
                        case 2009:
                            return IDFV_VALUE_CHANGED;
                        default:
                            return null;
                    }
            }
        }

        public static Internal.EnumLiteMap<SDKMetricType> internalGetValueMap() {
            return internalValueMap;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return SDKMetricTypeVerifier.INSTANCE;
        }

        @Deprecated
        public static SDKMetricType valueOf(int i) {
            return forNumber(i);
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        Sdk$SDKMetric sdk$SDKMetric = new Sdk$SDKMetric();
        DEFAULT_INSTANCE = sdk$SDKMetric;
        GeneratedMessageLite.registerDefaultInstance(Sdk$SDKMetric.class, sdk$SDKMetric);
    }

    private Sdk$SDKMetric() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectionType() {
        this.connectionType_ = getDefaultInstance().getConnectionType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectionTypeDetail() {
        this.connectionTypeDetail_ = getDefaultInstance().getConnectionTypeDetail();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreativeId() {
        this.creativeId_ = getDefaultInstance().getCreativeId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventId() {
        this.eventId_ = getDefaultInstance().getEventId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMake() {
        this.make_ = getDefaultInstance().getMake();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMeta() {
        this.meta_ = getDefaultInstance().getMeta();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModel() {
        this.model_ = getDefaultInstance().getModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOs() {
        this.os_ = getDefaultInstance().getOs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsVersion() {
        this.osVersion_ = getDefaultInstance().getOsVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlacementReferenceId() {
        this.placementReferenceId_ = getDefaultInstance().getPlacementReferenceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0L;
    }

    public static Sdk$SDKMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Sdk$SDKMetric sdk$SDKMetric) {
        return DEFAULT_INSTANCE.createBuilder(sdk$SDKMetric);
    }

    public static Sdk$SDKMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$SDKMetric parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Sdk$SDKMetric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Sdk$SDKMetric parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Sdk$SDKMetric parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Sdk$SDKMetric parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Sdk$SDKMetric parseFrom(InputStream inputStream) throws IOException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$SDKMetric parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Sdk$SDKMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Sdk$SDKMetric parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Sdk$SDKMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Sdk$SDKMetric parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<Sdk$SDKMetric> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionType(String str) {
        str.getClass();
        this.connectionType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.connectionType_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionTypeDetail(String str) {
        str.getClass();
        this.connectionTypeDetail_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionTypeDetailBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.connectionTypeDetail_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreativeId(String str) {
        str.getClass();
        this.creativeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreativeIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.creativeId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventId(String str) {
        str.getClass();
        this.eventId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.eventId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMake(String str) {
        str.getClass();
        this.make_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMakeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.make_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMeta(String str) {
        str.getClass();
        this.meta_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetaBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.meta_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModel(String str) {
        str.getClass();
        this.model_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModelBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.model_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOs(String str) {
        str.getClass();
        this.os_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.os_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersion(String str) {
        str.getClass();
        this.osVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.osVersion_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlacementReferenceId(String str) {
        str.getClass();
        this.placementReferenceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlacementReferenceIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.placementReferenceId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(SDKMetricType sDKMetricType) {
        this.type_ = sDKMetricType.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i) {
        this.type_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(long j) {
        this.value_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (Sdk$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new Sdk$SDKMetric();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "��\f����\u0001\f\f������\u0001\f\u0002\u0002\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\fȈ", new Object[]{"type_", "value_", "meta_", "make_", "model_", "os_", "osVersion_", "connectionType_", "connectionTypeDetail_", "placementReferenceId_", "creativeId_", "eventId_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Sdk$SDKMetric> parser = PARSER;
                Parser<Sdk$SDKMetric> parser2 = parser;
                if (parser == null) {
                    synchronized (Sdk$SDKMetric.class) {
                        try {
                            Parser<Sdk$SDKMetric> parser3 = PARSER;
                            parser2 = parser3;
                            if (parser3 == null) {
                                parser2 = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = parser2;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return parser2;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
    public String getConnectionType() {
        return this.connectionType_;
    }

    @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
    public ByteString getConnectionTypeBytes() {
        return ByteString.copyFromUtf8(this.connectionType_);
    }

    @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
    public String getConnectionTypeDetail() {
        return this.connectionTypeDetail_;
    }

    @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
    public ByteString getConnectionTypeDetailBytes() {
        return ByteString.copyFromUtf8(this.connectionTypeDetail_);
    }

    @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
    public String getCreativeId() {
        return this.creativeId_;
    }

    @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
    public ByteString getCreativeIdBytes() {
        return ByteString.copyFromUtf8(this.creativeId_);
    }

    @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
    public String getEventId() {
        return this.eventId_;
    }

    @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
    public ByteString getEventIdBytes() {
        return ByteString.copyFromUtf8(this.eventId_);
    }

    @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
    public String getMake() {
        return this.make_;
    }

    @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
    public ByteString getMakeBytes() {
        return ByteString.copyFromUtf8(this.make_);
    }

    @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
    public String getMeta() {
        return this.meta_;
    }

    @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
    public ByteString getMetaBytes() {
        return ByteString.copyFromUtf8(this.meta_);
    }

    @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
    public String getModel() {
        return this.model_;
    }

    @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
    public ByteString getModelBytes() {
        return ByteString.copyFromUtf8(this.model_);
    }

    @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
    public String getOs() {
        return this.os_;
    }

    @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
    public ByteString getOsBytes() {
        return ByteString.copyFromUtf8(this.os_);
    }

    @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
    public String getOsVersion() {
        return this.osVersion_;
    }

    @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
    public ByteString getOsVersionBytes() {
        return ByteString.copyFromUtf8(this.osVersion_);
    }

    @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
    public String getPlacementReferenceId() {
        return this.placementReferenceId_;
    }

    @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
    public ByteString getPlacementReferenceIdBytes() {
        return ByteString.copyFromUtf8(this.placementReferenceId_);
    }

    @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
    public SDKMetricType getType() {
        SDKMetricType forNumber = SDKMetricType.forNumber(this.type_);
        SDKMetricType sDKMetricType = forNumber;
        if (forNumber == null) {
            sDKMetricType = SDKMetricType.UNRECOGNIZED;
        }
        return sDKMetricType;
    }

    @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
    public int getTypeValue() {
        return this.type_;
    }

    @Override // com.vungle.ads.internal.protos.Sdk$SDKMetricOrBuilder
    public long getValue() {
        return this.value_;
    }
}
