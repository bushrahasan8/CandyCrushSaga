package gatewayprotocol.v1;

import com.google.android.gms.ads.AdRequest;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.ironsource.mediationsdk.metadata.a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: DynamicDeviceInfoOuterClass$DynamicDeviceInfo.class */
public final class DynamicDeviceInfoOuterClass$DynamicDeviceInfo extends GeneratedMessageLite<DynamicDeviceInfoOuterClass$DynamicDeviceInfo, Builder> implements MessageLiteOrBuilder {
    public static final int ANDROID_FIELD_NUMBER = 12;
    public static final int APP_ACTIVE_FIELD_NUMBER = 17;
    public static final int BATTERY_LEVEL_FIELD_NUMBER = 14;
    public static final int BATTERY_STATUS_FIELD_NUMBER = 15;
    public static final int CONNECTION_TYPE_FIELD_NUMBER = 16;
    private static final DynamicDeviceInfoOuterClass$DynamicDeviceInfo DEFAULT_INSTANCE;
    public static final int FREE_DISK_SPACE_FIELD_NUMBER = 5;
    public static final int FREE_RAM_MEMORY_FIELD_NUMBER = 6;
    public static final int IOS_FIELD_NUMBER = 13;
    public static final int LANGUAGE_FIELD_NUMBER = 1;
    public static final int LIMITED_OPEN_AD_TRACKING_FIELD_NUMBER = 11;
    public static final int LIMITED_TRACKING_FIELD_NUMBER = 10;
    public static final int NETWORK_OPERATOR_FIELD_NUMBER = 2;
    public static final int NETWORK_OPERATOR_NAME_FIELD_NUMBER = 3;
    private static volatile Parser<DynamicDeviceInfoOuterClass$DynamicDeviceInfo> PARSER;
    public static final int TIME_ZONE_FIELD_NUMBER = 8;
    public static final int TIME_ZONE_OFFSET_FIELD_NUMBER = 9;
    public static final int WIRED_HEADSET_FIELD_NUMBER = 7;
    private boolean appActive_;
    private double batteryLevel_;
    private int batteryStatus_;
    private int bitField0_;
    private int connectionType_;
    private long freeDiskSpace_;
    private long freeRamMemory_;
    private boolean limitedOpenAdTracking_;
    private boolean limitedTracking_;
    private Object platformSpecific_;
    private long timeZoneOffset_;
    private boolean wiredHeadset_;
    private int platformSpecificCase_ = 0;
    private String language_ = "";
    private String networkOperator_ = "";
    private String networkOperatorName_ = "";
    private String timeZone_ = "";

    /* loaded from: DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android.class */
    public static final class Android extends GeneratedMessageLite<Android, Builder> implements MessageLiteOrBuilder {
        public static final int ADB_ENABLED_FIELD_NUMBER = 5;
        private static final Android DEFAULT_INSTANCE;
        public static final int DEVICE_ELAPSED_REALTIME_FIELD_NUMBER = 10;
        public static final int DEVICE_UP_TIME_FIELD_NUMBER = 9;
        public static final int MAX_VOLUME_FIELD_NUMBER = 8;
        public static final int NETWORK_CONNECTED_FIELD_NUMBER = 1;
        public static final int NETWORK_METERED_FIELD_NUMBER = 3;
        public static final int NETWORK_TYPE_FIELD_NUMBER = 2;
        private static volatile Parser<Android> PARSER;
        public static final int TELEPHONY_MANAGER_NETWORK_TYPE_FIELD_NUMBER = 4;
        public static final int USB_CONNECTED_FIELD_NUMBER = 6;
        public static final int VOLUME_FIELD_NUMBER = 7;
        private boolean adbEnabled_;
        private int bitField0_;
        private long deviceElapsedRealtime_;
        private long deviceUpTime_;
        private double maxVolume_;
        private boolean networkConnected_;
        private boolean networkMetered_;
        private int networkType_;
        private int telephonyManagerNetworkType_;
        private boolean usbConnected_;
        private double volume_;

        /* loaded from: DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Android$Builder.class */
        public static final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
            private Builder() {
                super(Android.DEFAULT_INSTANCE);
            }

            /* synthetic */ Builder(DynamicDeviceInfoOuterClass$1 dynamicDeviceInfoOuterClass$1) {
                this();
            }

            public Builder setAdbEnabled(boolean z) {
                copyOnWrite();
                ((Android) this.instance).setAdbEnabled(z);
                return this;
            }

            public Builder setDeviceElapsedRealtime(long j) {
                copyOnWrite();
                ((Android) this.instance).setDeviceElapsedRealtime(j);
                return this;
            }

            public Builder setDeviceUpTime(long j) {
                copyOnWrite();
                ((Android) this.instance).setDeviceUpTime(j);
                return this;
            }

            public Builder setMaxVolume(double d) {
                copyOnWrite();
                ((Android) this.instance).setMaxVolume(d);
                return this;
            }

            public Builder setNetworkConnected(boolean z) {
                copyOnWrite();
                ((Android) this.instance).setNetworkConnected(z);
                return this;
            }

            public Builder setNetworkMetered(boolean z) {
                copyOnWrite();
                ((Android) this.instance).setNetworkMetered(z);
                return this;
            }

            public Builder setNetworkType(int i) {
                copyOnWrite();
                ((Android) this.instance).setNetworkType(i);
                return this;
            }

            public Builder setTelephonyManagerNetworkType(int i) {
                copyOnWrite();
                ((Android) this.instance).setTelephonyManagerNetworkType(i);
                return this;
            }

            public Builder setUsbConnected(boolean z) {
                copyOnWrite();
                ((Android) this.instance).setUsbConnected(z);
                return this;
            }

            public Builder setVolume(double d) {
                copyOnWrite();
                ((Android) this.instance).setVolume(d);
                return this;
            }
        }

        static {
            Android android = new Android();
            DEFAULT_INSTANCE = android;
            GeneratedMessageLite.registerDefaultInstance(Android.class, android);
        }

        private Android() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdbEnabled() {
            this.bitField0_ &= -17;
            this.adbEnabled_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceElapsedRealtime() {
            this.bitField0_ &= -513;
            this.deviceElapsedRealtime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceUpTime() {
            this.bitField0_ &= -257;
            this.deviceUpTime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMaxVolume() {
            this.bitField0_ &= -129;
            this.maxVolume_ = 0.0d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNetworkConnected() {
            this.bitField0_ &= -2;
            this.networkConnected_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNetworkMetered() {
            this.bitField0_ &= -5;
            this.networkMetered_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNetworkType() {
            this.bitField0_ &= -3;
            this.networkType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTelephonyManagerNetworkType() {
            this.bitField0_ &= -9;
            this.telephonyManagerNetworkType_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUsbConnected() {
            this.bitField0_ &= -33;
            this.usbConnected_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVolume() {
            this.bitField0_ &= -65;
            this.volume_ = 0.0d;
        }

        public static Android getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Android android) {
            return DEFAULT_INSTANCE.createBuilder(android);
        }

        public static Android parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Android) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Android parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Android) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Android parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Android parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Android parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Android parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Android parseFrom(InputStream inputStream) throws IOException {
            return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Android parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Android parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Android parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Android parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Android parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Android) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Parser<Android> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdbEnabled(boolean z) {
            this.bitField0_ |= 16;
            this.adbEnabled_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceElapsedRealtime(long j) {
            this.bitField0_ |= AdRequest.MAX_CONTENT_URL_LENGTH;
            this.deviceElapsedRealtime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceUpTime(long j) {
            this.bitField0_ |= 256;
            this.deviceUpTime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMaxVolume(double d) {
            this.bitField0_ |= 128;
            this.maxVolume_ = d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetworkConnected(boolean z) {
            this.bitField0_ |= 1;
            this.networkConnected_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetworkMetered(boolean z) {
            this.bitField0_ |= 4;
            this.networkMetered_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetworkType(int i) {
            this.bitField0_ |= 2;
            this.networkType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTelephonyManagerNetworkType(int i) {
            this.bitField0_ |= 8;
            this.telephonyManagerNetworkType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUsbConnected(boolean z) {
            this.bitField0_ |= 32;
            this.usbConnected_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVolume(double d) {
            this.bitField0_ |= 64;
            this.volume_ = d;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (DynamicDeviceInfoOuterClass$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Android();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "��\n��\u0001\u0001\n\n������\u0001ဇ��\u0002င\u0001\u0003ဇ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007က\u0006\bက\u0007\tဂ\b\nဂ\t", new Object[]{"bitField0_", "networkConnected_", "networkType_", "networkMetered_", "telephonyManagerNetworkType_", "adbEnabled_", "usbConnected_", "volume_", "maxVolume_", "deviceUpTime_", "deviceElapsedRealtime_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Android> parser = PARSER;
                    Parser<Android> parser2 = parser;
                    if (parser == null) {
                        synchronized (Android.class) {
                            try {
                                Parser<Android> parser3 = PARSER;
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

        public boolean getAdbEnabled() {
            return this.adbEnabled_;
        }

        public long getDeviceElapsedRealtime() {
            return this.deviceElapsedRealtime_;
        }

        public long getDeviceUpTime() {
            return this.deviceUpTime_;
        }

        public double getMaxVolume() {
            return this.maxVolume_;
        }

        public boolean getNetworkConnected() {
            return this.networkConnected_;
        }

        public boolean getNetworkMetered() {
            return this.networkMetered_;
        }

        public int getNetworkType() {
            return this.networkType_;
        }

        public int getTelephonyManagerNetworkType() {
            return this.telephonyManagerNetworkType_;
        }

        public boolean getUsbConnected() {
            return this.usbConnected_;
        }

        public double getVolume() {
            return this.volume_;
        }

        public boolean hasAdbEnabled() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasDeviceElapsedRealtime() {
            return (this.bitField0_ & AdRequest.MAX_CONTENT_URL_LENGTH) != 0;
        }

        public boolean hasDeviceUpTime() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasMaxVolume() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasNetworkConnected() {
            boolean z = true;
            if ((this.bitField0_ & 1) == 0) {
                z = false;
            }
            return z;
        }

        public boolean hasNetworkMetered() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasNetworkType() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasTelephonyManagerNetworkType() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasUsbConnected() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasVolume() {
            return (this.bitField0_ & 64) != 0;
        }
    }

    /* loaded from: DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Builder.class */
    public static final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        private Builder() {
            super(DynamicDeviceInfoOuterClass$DynamicDeviceInfo.DEFAULT_INSTANCE);
        }

        /* synthetic */ Builder(DynamicDeviceInfoOuterClass$1 dynamicDeviceInfoOuterClass$1) {
            this();
        }

        public Builder setAndroid(Android android) {
            copyOnWrite();
            ((DynamicDeviceInfoOuterClass$DynamicDeviceInfo) this.instance).setAndroid(android);
            return this;
        }

        public Builder setAppActive(boolean z) {
            copyOnWrite();
            ((DynamicDeviceInfoOuterClass$DynamicDeviceInfo) this.instance).setAppActive(z);
            return this;
        }

        public Builder setBatteryLevel(double d) {
            copyOnWrite();
            ((DynamicDeviceInfoOuterClass$DynamicDeviceInfo) this.instance).setBatteryLevel(d);
            return this;
        }

        public Builder setBatteryStatus(int i) {
            copyOnWrite();
            ((DynamicDeviceInfoOuterClass$DynamicDeviceInfo) this.instance).setBatteryStatus(i);
            return this;
        }

        public Builder setConnectionType(DynamicDeviceInfoOuterClass$ConnectionType dynamicDeviceInfoOuterClass$ConnectionType) {
            copyOnWrite();
            ((DynamicDeviceInfoOuterClass$DynamicDeviceInfo) this.instance).setConnectionType(dynamicDeviceInfoOuterClass$ConnectionType);
            return this;
        }

        public Builder setFreeDiskSpace(long j) {
            copyOnWrite();
            ((DynamicDeviceInfoOuterClass$DynamicDeviceInfo) this.instance).setFreeDiskSpace(j);
            return this;
        }

        public Builder setFreeRamMemory(long j) {
            copyOnWrite();
            ((DynamicDeviceInfoOuterClass$DynamicDeviceInfo) this.instance).setFreeRamMemory(j);
            return this;
        }

        public Builder setLanguage(String str) {
            copyOnWrite();
            ((DynamicDeviceInfoOuterClass$DynamicDeviceInfo) this.instance).setLanguage(str);
            return this;
        }

        public Builder setLimitedOpenAdTracking(boolean z) {
            copyOnWrite();
            ((DynamicDeviceInfoOuterClass$DynamicDeviceInfo) this.instance).setLimitedOpenAdTracking(z);
            return this;
        }

        public Builder setLimitedTracking(boolean z) {
            copyOnWrite();
            ((DynamicDeviceInfoOuterClass$DynamicDeviceInfo) this.instance).setLimitedTracking(z);
            return this;
        }

        public Builder setNetworkOperator(String str) {
            copyOnWrite();
            ((DynamicDeviceInfoOuterClass$DynamicDeviceInfo) this.instance).setNetworkOperator(str);
            return this;
        }

        public Builder setNetworkOperatorName(String str) {
            copyOnWrite();
            ((DynamicDeviceInfoOuterClass$DynamicDeviceInfo) this.instance).setNetworkOperatorName(str);
            return this;
        }

        public Builder setTimeZone(String str) {
            copyOnWrite();
            ((DynamicDeviceInfoOuterClass$DynamicDeviceInfo) this.instance).setTimeZone(str);
            return this;
        }

        public Builder setTimeZoneOffset(long j) {
            copyOnWrite();
            ((DynamicDeviceInfoOuterClass$DynamicDeviceInfo) this.instance).setTimeZoneOffset(j);
            return this;
        }

        public Builder setWiredHeadset(boolean z) {
            copyOnWrite();
            ((DynamicDeviceInfoOuterClass$DynamicDeviceInfo) this.instance).setWiredHeadset(z);
            return this;
        }
    }

    /* loaded from: DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios.class */
    public static final class Ios extends GeneratedMessageLite<Ios, Builder> implements MessageLiteOrBuilder {
        public static final int CURRENT_RADIO_ACCESS_TECHNOLOGY_FIELD_NUMBER = 1;
        public static final int CURRENT_UI_THEME_FIELD_NUMBER = 5;
        private static final Ios DEFAULT_INSTANCE;
        public static final int DEVICE_NAME_FIELD_NUMBER = 6;
        public static final int LOCALE_LIST_FIELD_NUMBER = 4;
        public static final int NETWORK_REACHABILITY_FLAGS_FIELD_NUMBER = 2;
        public static final int NW_PATH_INTERFACES_FIELD_NUMBER = 3;
        private static volatile Parser<Ios> PARSER;
        public static final int TRACKING_AUTH_STATUS_FIELD_NUMBER = 8;
        public static final int VOLUME_FIELD_NUMBER = 7;
        private int bitField0_;
        private int currentUiTheme_;
        private int networkReachabilityFlags_;
        private int trackingAuthStatus_;
        private double volume_;
        private String currentRadioAccessTechnology_ = "";
        private Internal.ProtobufList<String> nwPathInterfaces_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<String> localeList_ = GeneratedMessageLite.emptyProtobufList();
        private String deviceName_ = "";

        /* loaded from: DynamicDeviceInfoOuterClass$DynamicDeviceInfo$Ios$Builder.class */
        public static final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
            private Builder() {
                super(Ios.DEFAULT_INSTANCE);
            }

            /* synthetic */ Builder(DynamicDeviceInfoOuterClass$1 dynamicDeviceInfoOuterClass$1) {
                this();
            }
        }

        static {
            Ios ios = new Ios();
            DEFAULT_INSTANCE = ios;
            GeneratedMessageLite.registerDefaultInstance(Ios.class, ios);
        }

        private Ios() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLocaleList(Iterable<String> iterable) {
            ensureLocaleListIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.localeList_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllNwPathInterfaces(Iterable<String> iterable) {
            ensureNwPathInterfacesIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.nwPathInterfaces_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLocaleList(String str) {
            str.getClass();
            ensureLocaleListIsMutable();
            this.localeList_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLocaleListBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureLocaleListIsMutable();
            this.localeList_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addNwPathInterfaces(String str) {
            str.getClass();
            ensureNwPathInterfacesIsMutable();
            this.nwPathInterfaces_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addNwPathInterfacesBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureNwPathInterfacesIsMutable();
            this.nwPathInterfaces_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentRadioAccessTechnology() {
            this.bitField0_ &= -2;
            this.currentRadioAccessTechnology_ = getDefaultInstance().getCurrentRadioAccessTechnology();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentUiTheme() {
            this.bitField0_ &= -5;
            this.currentUiTheme_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDeviceName() {
            this.bitField0_ &= -9;
            this.deviceName_ = getDefaultInstance().getDeviceName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLocaleList() {
            this.localeList_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNetworkReachabilityFlags() {
            this.bitField0_ &= -3;
            this.networkReachabilityFlags_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNwPathInterfaces() {
            this.nwPathInterfaces_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrackingAuthStatus() {
            this.bitField0_ &= -33;
            this.trackingAuthStatus_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVolume() {
            this.bitField0_ &= -17;
            this.volume_ = 0.0d;
        }

        private void ensureLocaleListIsMutable() {
            Internal.ProtobufList<String> protobufList = this.localeList_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.localeList_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureNwPathInterfacesIsMutable() {
            Internal.ProtobufList<String> protobufList = this.nwPathInterfaces_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.nwPathInterfaces_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static Ios getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Ios ios) {
            return DEFAULT_INSTANCE.createBuilder(ios);
        }

        public static Ios parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Ios) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Ios parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Ios) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Ios parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Ios parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Ios parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Ios parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Ios parseFrom(InputStream inputStream) throws IOException {
            return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Ios parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Ios parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Ios parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Ios parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Ios parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Ios) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Parser<Ios> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentRadioAccessTechnology(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.currentRadioAccessTechnology_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentRadioAccessTechnologyBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.currentRadioAccessTechnology_ = byteString.toStringUtf8();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentUiTheme(int i) {
            this.bitField0_ |= 4;
            this.currentUiTheme_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceName(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.deviceName_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceNameBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.deviceName_ = byteString.toStringUtf8();
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocaleList(int i, String str) {
            str.getClass();
            ensureLocaleListIsMutable();
            this.localeList_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNetworkReachabilityFlags(int i) {
            this.bitField0_ |= 2;
            this.networkReachabilityFlags_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNwPathInterfaces(int i, String str) {
            str.getClass();
            ensureNwPathInterfacesIsMutable();
            this.nwPathInterfaces_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrackingAuthStatus(int i) {
            this.bitField0_ |= 32;
            this.trackingAuthStatus_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVolume(double d) {
            this.bitField0_ |= 16;
            this.volume_ = d;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (DynamicDeviceInfoOuterClass$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Ios();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "��\b��\u0001\u0001\b\b��\u0002��\u0001ለ��\u0002ဋ\u0001\u0003Ț\u0004Ț\u0005င\u0002\u0006ለ\u0003\u0007က\u0004\bင\u0005", new Object[]{"bitField0_", "currentRadioAccessTechnology_", "networkReachabilityFlags_", "nwPathInterfaces_", "localeList_", "currentUiTheme_", "deviceName_", "volume_", "trackingAuthStatus_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Ios> parser = PARSER;
                    Parser<Ios> parser2 = parser;
                    if (parser == null) {
                        synchronized (Ios.class) {
                            try {
                                Parser<Ios> parser3 = PARSER;
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

        public String getCurrentRadioAccessTechnology() {
            return this.currentRadioAccessTechnology_;
        }

        public ByteString getCurrentRadioAccessTechnologyBytes() {
            return ByteString.copyFromUtf8(this.currentRadioAccessTechnology_);
        }

        public int getCurrentUiTheme() {
            return this.currentUiTheme_;
        }

        public String getDeviceName() {
            return this.deviceName_;
        }

        public ByteString getDeviceNameBytes() {
            return ByteString.copyFromUtf8(this.deviceName_);
        }

        public String getLocaleList(int i) {
            return this.localeList_.get(i);
        }

        public ByteString getLocaleListBytes(int i) {
            return ByteString.copyFromUtf8(this.localeList_.get(i));
        }

        public int getLocaleListCount() {
            return this.localeList_.size();
        }

        public List<String> getLocaleListList() {
            return this.localeList_;
        }

        public int getNetworkReachabilityFlags() {
            return this.networkReachabilityFlags_;
        }

        public String getNwPathInterfaces(int i) {
            return this.nwPathInterfaces_.get(i);
        }

        public ByteString getNwPathInterfacesBytes(int i) {
            return ByteString.copyFromUtf8(this.nwPathInterfaces_.get(i));
        }

        public int getNwPathInterfacesCount() {
            return this.nwPathInterfaces_.size();
        }

        public List<String> getNwPathInterfacesList() {
            return this.nwPathInterfaces_;
        }

        public int getTrackingAuthStatus() {
            return this.trackingAuthStatus_;
        }

        public double getVolume() {
            return this.volume_;
        }

        public boolean hasCurrentRadioAccessTechnology() {
            boolean z = true;
            if ((this.bitField0_ & 1) == 0) {
                z = false;
            }
            return z;
        }

        public boolean hasCurrentUiTheme() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasDeviceName() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasNetworkReachabilityFlags() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasTrackingAuthStatus() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasVolume() {
            return (this.bitField0_ & 16) != 0;
        }
    }

    /* loaded from: DynamicDeviceInfoOuterClass$DynamicDeviceInfo$PlatformSpecificCase.class */
    public enum PlatformSpecificCase {
        ANDROID(12),
        IOS(13),
        PLATFORMSPECIFIC_NOT_SET(0);

        private final int value;

        PlatformSpecificCase(int i) {
            this.value = i;
        }

        public static PlatformSpecificCase forNumber(int i) {
            if (i == 0) {
                return PLATFORMSPECIFIC_NOT_SET;
            }
            if (i == 12) {
                return ANDROID;
            }
            if (i != 13) {
                return null;
            }
            return IOS;
        }
    }

    static {
        DynamicDeviceInfoOuterClass$DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo = new DynamicDeviceInfoOuterClass$DynamicDeviceInfo();
        DEFAULT_INSTANCE = dynamicDeviceInfoOuterClass$DynamicDeviceInfo;
        GeneratedMessageLite.registerDefaultInstance(DynamicDeviceInfoOuterClass$DynamicDeviceInfo.class, dynamicDeviceInfoOuterClass$DynamicDeviceInfo);
    }

    private DynamicDeviceInfoOuterClass$DynamicDeviceInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAndroid() {
        if (this.platformSpecificCase_ == 12) {
            this.platformSpecificCase_ = 0;
            this.platformSpecific_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppActive() {
        this.bitField0_ &= -8193;
        this.appActive_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBatteryLevel() {
        this.bitField0_ &= -1025;
        this.batteryLevel_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBatteryStatus() {
        this.bitField0_ &= -2049;
        this.batteryStatus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectionType() {
        this.bitField0_ &= -4097;
        this.connectionType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFreeDiskSpace() {
        this.bitField0_ &= -9;
        this.freeDiskSpace_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFreeRamMemory() {
        this.bitField0_ &= -17;
        this.freeRamMemory_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIos() {
        if (this.platformSpecificCase_ == 13) {
            this.platformSpecificCase_ = 0;
            this.platformSpecific_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguage() {
        this.bitField0_ &= -2;
        this.language_ = getDefaultInstance().getLanguage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLimitedOpenAdTracking() {
        this.bitField0_ &= -513;
        this.limitedOpenAdTracking_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLimitedTracking() {
        this.bitField0_ &= -257;
        this.limitedTracking_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkOperator() {
        this.bitField0_ &= -3;
        this.networkOperator_ = getDefaultInstance().getNetworkOperator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkOperatorName() {
        this.bitField0_ &= -5;
        this.networkOperatorName_ = getDefaultInstance().getNetworkOperatorName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlatformSpecific() {
        this.platformSpecificCase_ = 0;
        this.platformSpecific_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeZone() {
        this.bitField0_ &= -65;
        this.timeZone_ = getDefaultInstance().getTimeZone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeZoneOffset() {
        this.bitField0_ &= -129;
        this.timeZoneOffset_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWiredHeadset() {
        this.bitField0_ &= -33;
        this.wiredHeadset_ = false;
    }

    public static DynamicDeviceInfoOuterClass$DynamicDeviceInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAndroid(Android android) {
        android.getClass();
        if (this.platformSpecificCase_ != 12 || this.platformSpecific_ == Android.getDefaultInstance()) {
            this.platformSpecific_ = android;
        } else {
            this.platformSpecific_ = ((Android.Builder) Android.newBuilder((Android) this.platformSpecific_).mergeFrom((Android.Builder) android)).buildPartial();
        }
        this.platformSpecificCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIos(Ios ios) {
        ios.getClass();
        if (this.platformSpecificCase_ != 13 || this.platformSpecific_ == Ios.getDefaultInstance()) {
            this.platformSpecific_ = ios;
        } else {
            this.platformSpecific_ = ((Ios.Builder) Ios.newBuilder((Ios) this.platformSpecific_).mergeFrom((Ios.Builder) ios)).buildPartial();
        }
        this.platformSpecificCase_ = 13;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(DynamicDeviceInfoOuterClass$DynamicDeviceInfo dynamicDeviceInfoOuterClass$DynamicDeviceInfo) {
        return DEFAULT_INSTANCE.createBuilder(dynamicDeviceInfoOuterClass$DynamicDeviceInfo);
    }

    public static DynamicDeviceInfoOuterClass$DynamicDeviceInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DynamicDeviceInfoOuterClass$DynamicDeviceInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DynamicDeviceInfoOuterClass$DynamicDeviceInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DynamicDeviceInfoOuterClass$DynamicDeviceInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DynamicDeviceInfoOuterClass$DynamicDeviceInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (DynamicDeviceInfoOuterClass$DynamicDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static DynamicDeviceInfoOuterClass$DynamicDeviceInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DynamicDeviceInfoOuterClass$DynamicDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static DynamicDeviceInfoOuterClass$DynamicDeviceInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (DynamicDeviceInfoOuterClass$DynamicDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static DynamicDeviceInfoOuterClass$DynamicDeviceInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DynamicDeviceInfoOuterClass$DynamicDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static DynamicDeviceInfoOuterClass$DynamicDeviceInfo parseFrom(InputStream inputStream) throws IOException {
        return (DynamicDeviceInfoOuterClass$DynamicDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DynamicDeviceInfoOuterClass$DynamicDeviceInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (DynamicDeviceInfoOuterClass$DynamicDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static DynamicDeviceInfoOuterClass$DynamicDeviceInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (DynamicDeviceInfoOuterClass$DynamicDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static DynamicDeviceInfoOuterClass$DynamicDeviceInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DynamicDeviceInfoOuterClass$DynamicDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static DynamicDeviceInfoOuterClass$DynamicDeviceInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (DynamicDeviceInfoOuterClass$DynamicDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DynamicDeviceInfoOuterClass$DynamicDeviceInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (DynamicDeviceInfoOuterClass$DynamicDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<DynamicDeviceInfoOuterClass$DynamicDeviceInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndroid(Android android) {
        android.getClass();
        this.platformSpecific_ = android;
        this.platformSpecificCase_ = 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppActive(boolean z) {
        this.bitField0_ |= 8192;
        this.appActive_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBatteryLevel(double d) {
        this.bitField0_ |= 1024;
        this.batteryLevel_ = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBatteryStatus(int i) {
        this.bitField0_ |= a.m;
        this.batteryStatus_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionType(DynamicDeviceInfoOuterClass$ConnectionType dynamicDeviceInfoOuterClass$ConnectionType) {
        this.connectionType_ = dynamicDeviceInfoOuterClass$ConnectionType.getNumber();
        this.bitField0_ |= 4096;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionTypeValue(int i) {
        this.bitField0_ |= 4096;
        this.connectionType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFreeDiskSpace(long j) {
        this.bitField0_ |= 8;
        this.freeDiskSpace_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFreeRamMemory(long j) {
        this.bitField0_ |= 16;
        this.freeRamMemory_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIos(Ios ios) {
        ios.getClass();
        this.platformSpecific_ = ios;
        this.platformSpecificCase_ = 13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguage(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.language_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.language_ = byteString.toStringUtf8();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLimitedOpenAdTracking(boolean z) {
        this.bitField0_ |= AdRequest.MAX_CONTENT_URL_LENGTH;
        this.limitedOpenAdTracking_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLimitedTracking(boolean z) {
        this.bitField0_ |= 256;
        this.limitedTracking_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkOperator(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.networkOperator_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkOperatorBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.networkOperator_ = byteString.toStringUtf8();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkOperatorName(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.networkOperatorName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkOperatorNameBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.networkOperatorName_ = byteString.toStringUtf8();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeZone(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.timeZone_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeZoneBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.timeZone_ = byteString.toStringUtf8();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeZoneOffset(long j) {
        this.bitField0_ |= 128;
        this.timeZoneOffset_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWiredHeadset(boolean z) {
        this.bitField0_ |= 32;
        this.wiredHeadset_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (DynamicDeviceInfoOuterClass$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new DynamicDeviceInfoOuterClass$DynamicDeviceInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "��\u0010\u0001\u0001\u0001\u0011\u0010������\u0001ለ��\u0002ለ\u0001\u0003ለ\u0002\u0005ဂ\u0003\u0006ဂ\u0004\u0007ဇ\u0005\bለ\u0006\tဂ\u0007\nဇ\b\u000bဇ\t\f<��\r<��\u000eက\n\u000fင\u000b\u0010ဌ\f\u0011ဇ\r", new Object[]{"platformSpecific_", "platformSpecificCase_", "bitField0_", "language_", "networkOperator_", "networkOperatorName_", "freeDiskSpace_", "freeRamMemory_", "wiredHeadset_", "timeZone_", "timeZoneOffset_", "limitedTracking_", "limitedOpenAdTracking_", Android.class, Ios.class, "batteryLevel_", "batteryStatus_", "connectionType_", "appActive_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<DynamicDeviceInfoOuterClass$DynamicDeviceInfo> parser = PARSER;
                Parser<DynamicDeviceInfoOuterClass$DynamicDeviceInfo> parser2 = parser;
                if (parser == null) {
                    synchronized (DynamicDeviceInfoOuterClass$DynamicDeviceInfo.class) {
                        try {
                            Parser<DynamicDeviceInfoOuterClass$DynamicDeviceInfo> parser3 = PARSER;
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

    public Android getAndroid() {
        return this.platformSpecificCase_ == 12 ? (Android) this.platformSpecific_ : Android.getDefaultInstance();
    }

    public boolean getAppActive() {
        return this.appActive_;
    }

    public double getBatteryLevel() {
        return this.batteryLevel_;
    }

    public int getBatteryStatus() {
        return this.batteryStatus_;
    }

    public DynamicDeviceInfoOuterClass$ConnectionType getConnectionType() {
        DynamicDeviceInfoOuterClass$ConnectionType forNumber = DynamicDeviceInfoOuterClass$ConnectionType.forNumber(this.connectionType_);
        DynamicDeviceInfoOuterClass$ConnectionType dynamicDeviceInfoOuterClass$ConnectionType = forNumber;
        if (forNumber == null) {
            dynamicDeviceInfoOuterClass$ConnectionType = DynamicDeviceInfoOuterClass$ConnectionType.UNRECOGNIZED;
        }
        return dynamicDeviceInfoOuterClass$ConnectionType;
    }

    public int getConnectionTypeValue() {
        return this.connectionType_;
    }

    public long getFreeDiskSpace() {
        return this.freeDiskSpace_;
    }

    public long getFreeRamMemory() {
        return this.freeRamMemory_;
    }

    public Ios getIos() {
        return this.platformSpecificCase_ == 13 ? (Ios) this.platformSpecific_ : Ios.getDefaultInstance();
    }

    public String getLanguage() {
        return this.language_;
    }

    public ByteString getLanguageBytes() {
        return ByteString.copyFromUtf8(this.language_);
    }

    public boolean getLimitedOpenAdTracking() {
        return this.limitedOpenAdTracking_;
    }

    public boolean getLimitedTracking() {
        return this.limitedTracking_;
    }

    public String getNetworkOperator() {
        return this.networkOperator_;
    }

    public ByteString getNetworkOperatorBytes() {
        return ByteString.copyFromUtf8(this.networkOperator_);
    }

    public String getNetworkOperatorName() {
        return this.networkOperatorName_;
    }

    public ByteString getNetworkOperatorNameBytes() {
        return ByteString.copyFromUtf8(this.networkOperatorName_);
    }

    public PlatformSpecificCase getPlatformSpecificCase() {
        return PlatformSpecificCase.forNumber(this.platformSpecificCase_);
    }

    public String getTimeZone() {
        return this.timeZone_;
    }

    public ByteString getTimeZoneBytes() {
        return ByteString.copyFromUtf8(this.timeZone_);
    }

    public long getTimeZoneOffset() {
        return this.timeZoneOffset_;
    }

    public boolean getWiredHeadset() {
        return this.wiredHeadset_;
    }

    public boolean hasAndroid() {
        return this.platformSpecificCase_ == 12;
    }

    public boolean hasAppActive() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasBatteryLevel() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasBatteryStatus() {
        return (this.bitField0_ & a.m) != 0;
    }

    public boolean hasConnectionType() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasFreeDiskSpace() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasFreeRamMemory() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasIos() {
        return this.platformSpecificCase_ == 13;
    }

    public boolean hasLanguage() {
        boolean z = true;
        if ((this.bitField0_ & 1) == 0) {
            z = false;
        }
        return z;
    }

    public boolean hasLimitedOpenAdTracking() {
        return (this.bitField0_ & AdRequest.MAX_CONTENT_URL_LENGTH) != 0;
    }

    public boolean hasLimitedTracking() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasNetworkOperator() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasNetworkOperatorName() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTimeZone() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasTimeZoneOffset() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasWiredHeadset() {
        return (this.bitField0_ & 32) != 0;
    }
}
