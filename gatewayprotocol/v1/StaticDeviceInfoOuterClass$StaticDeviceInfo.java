package gatewayprotocol.v1;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.drive.ExecutionOptions;
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
import java.util.Collections;
import java.util.List;

/* loaded from: StaticDeviceInfoOuterClass$StaticDeviceInfo.class */
public final class StaticDeviceInfoOuterClass$StaticDeviceInfo extends GeneratedMessageLite<StaticDeviceInfoOuterClass$StaticDeviceInfo, Builder> implements MessageLiteOrBuilder {
    public static final int ANDROID_FIELD_NUMBER = 19;
    public static final int APP_DEBUGGABLE_FIELD_NUMBER = 3;
    public static final int BUNDLE_ID_FIELD_NUMBER = 1;
    public static final int BUNDLE_VERSION_FIELD_NUMBER = 2;
    public static final int CPU_COUNT_FIELD_NUMBER = 17;
    public static final int CPU_MODEL_FIELD_NUMBER = 16;
    private static final StaticDeviceInfoOuterClass$StaticDeviceInfo DEFAULT_INSTANCE;
    public static final int DEVICE_MAKE_FIELD_NUMBER = 6;
    public static final int DEVICE_MODEL_FIELD_NUMBER = 7;
    public static final int GPU_MODEL_FIELD_NUMBER = 18;
    public static final int IOS_FIELD_NUMBER = 20;
    public static final int OS_VERSION_FIELD_NUMBER = 5;
    private static volatile Parser<StaticDeviceInfoOuterClass$StaticDeviceInfo> PARSER;
    public static final int ROOTED_FIELD_NUMBER = 4;
    public static final int SCREEN_DENSITY_FIELD_NUMBER = 9;
    public static final int SCREEN_HEIGHT_FIELD_NUMBER = 11;
    public static final int SCREEN_SIZE_FIELD_NUMBER = 12;
    public static final int SCREEN_WIDTH_FIELD_NUMBER = 10;
    public static final int STORES_FIELD_NUMBER = 13;
    public static final int TOTAL_DISK_SPACE_FIELD_NUMBER = 14;
    public static final int TOTAL_RAM_MEMORY_FIELD_NUMBER = 15;
    public static final int WEBVIEW_UA_FIELD_NUMBER = 8;
    private boolean appDebuggable_;
    private int bitField0_;
    private long cpuCount_;
    private Object platformSpecific_;
    private boolean rooted_;
    private int screenDensity_;
    private int screenHeight_;
    private int screenSize_;
    private int screenWidth_;
    private long totalDiskSpace_;
    private long totalRamMemory_;
    private int platformSpecificCase_ = 0;
    private String bundleId_ = "";
    private String bundleVersion_ = "";
    private String osVersion_ = "";
    private String deviceMake_ = "";
    private String deviceModel_ = "";
    private String webviewUa_ = "";
    private Internal.ProtobufList<String> stores_ = GeneratedMessageLite.emptyProtobufList();
    private String cpuModel_ = "";
    private String gpuModel_ = "";

    /* loaded from: StaticDeviceInfoOuterClass$StaticDeviceInfo$Android.class */
    public static final class Android extends GeneratedMessageLite<Android, Builder> implements MessageLiteOrBuilder {
        public static final int ANDROID_FINGERPRINT_FIELD_NUMBER = 3;
        public static final int API_LEVEL_FIELD_NUMBER = 1;
        public static final int APK_DEVELOPER_SIGNING_CERTIFICATE_HASH_FIELD_NUMBER = 5;
        public static final int APP_INSTALLER_FIELD_NUMBER = 4;
        public static final int BUILD_BOARD_FIELD_NUMBER = 6;
        public static final int BUILD_BOOTLOADER_FIELD_NUMBER = 13;
        public static final int BUILD_BRAND_FIELD_NUMBER = 7;
        public static final int BUILD_DEVICE_FIELD_NUMBER = 8;
        public static final int BUILD_DISPLAY_FIELD_NUMBER = 9;
        public static final int BUILD_FINGERPRINT_FIELD_NUMBER = 10;
        public static final int BUILD_HARDWARE_FIELD_NUMBER = 11;
        public static final int BUILD_HOST_FIELD_NUMBER = 12;
        public static final int BUILD_ID_FIELD_NUMBER = 15;
        public static final int BUILD_PRODUCT_FIELD_NUMBER = 14;
        private static final Android DEFAULT_INSTANCE;
        public static final int EXTENSION_VERSION_FIELD_NUMBER = 16;
        private static volatile Parser<Android> PARSER;
        public static final int VERSION_CODE_FIELD_NUMBER = 2;
        private int apiLevel_;
        private int bitField0_;
        private int extensionVersion_;
        private int versionCode_;
        private String androidFingerprint_ = "";
        private String appInstaller_ = "";
        private String apkDeveloperSigningCertificateHash_ = "";
        private String buildBoard_ = "";
        private String buildBrand_ = "";
        private String buildDevice_ = "";
        private String buildDisplay_ = "";
        private String buildFingerprint_ = "";
        private String buildHardware_ = "";
        private String buildHost_ = "";
        private String buildBootloader_ = "";
        private String buildProduct_ = "";
        private String buildId_ = "";

        /* loaded from: StaticDeviceInfoOuterClass$StaticDeviceInfo$Android$Builder.class */
        public static final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
            private Builder() {
                super(Android.DEFAULT_INSTANCE);
            }

            /* synthetic */ Builder(StaticDeviceInfoOuterClass$1 staticDeviceInfoOuterClass$1) {
                this();
            }

            public Builder setAndroidFingerprint(String str) {
                copyOnWrite();
                ((Android) this.instance).setAndroidFingerprint(str);
                return this;
            }

            public Builder setApiLevel(int i) {
                copyOnWrite();
                ((Android) this.instance).setApiLevel(i);
                return this;
            }

            public Builder setApkDeveloperSigningCertificateHash(String str) {
                copyOnWrite();
                ((Android) this.instance).setApkDeveloperSigningCertificateHash(str);
                return this;
            }

            public Builder setAppInstaller(String str) {
                copyOnWrite();
                ((Android) this.instance).setAppInstaller(str);
                return this;
            }

            public Builder setBuildBoard(String str) {
                copyOnWrite();
                ((Android) this.instance).setBuildBoard(str);
                return this;
            }

            public Builder setBuildBootloader(String str) {
                copyOnWrite();
                ((Android) this.instance).setBuildBootloader(str);
                return this;
            }

            public Builder setBuildBrand(String str) {
                copyOnWrite();
                ((Android) this.instance).setBuildBrand(str);
                return this;
            }

            public Builder setBuildDevice(String str) {
                copyOnWrite();
                ((Android) this.instance).setBuildDevice(str);
                return this;
            }

            public Builder setBuildDisplay(String str) {
                copyOnWrite();
                ((Android) this.instance).setBuildDisplay(str);
                return this;
            }

            public Builder setBuildFingerprint(String str) {
                copyOnWrite();
                ((Android) this.instance).setBuildFingerprint(str);
                return this;
            }

            public Builder setBuildHardware(String str) {
                copyOnWrite();
                ((Android) this.instance).setBuildHardware(str);
                return this;
            }

            public Builder setBuildHost(String str) {
                copyOnWrite();
                ((Android) this.instance).setBuildHost(str);
                return this;
            }

            public Builder setBuildId(String str) {
                copyOnWrite();
                ((Android) this.instance).setBuildId(str);
                return this;
            }

            public Builder setBuildProduct(String str) {
                copyOnWrite();
                ((Android) this.instance).setBuildProduct(str);
                return this;
            }

            public Builder setExtensionVersion(int i) {
                copyOnWrite();
                ((Android) this.instance).setExtensionVersion(i);
                return this;
            }

            public Builder setVersionCode(int i) {
                copyOnWrite();
                ((Android) this.instance).setVersionCode(i);
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
        public void clearAndroidFingerprint() {
            this.bitField0_ &= -5;
            this.androidFingerprint_ = getDefaultInstance().getAndroidFingerprint();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearApiLevel() {
            this.bitField0_ &= -2;
            this.apiLevel_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearApkDeveloperSigningCertificateHash() {
            this.bitField0_ &= -17;
            this.apkDeveloperSigningCertificateHash_ = getDefaultInstance().getApkDeveloperSigningCertificateHash();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppInstaller() {
            this.bitField0_ &= -9;
            this.appInstaller_ = getDefaultInstance().getAppInstaller();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBuildBoard() {
            this.bitField0_ &= -33;
            this.buildBoard_ = getDefaultInstance().getBuildBoard();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBuildBootloader() {
            this.bitField0_ &= -4097;
            this.buildBootloader_ = getDefaultInstance().getBuildBootloader();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBuildBrand() {
            this.bitField0_ &= -65;
            this.buildBrand_ = getDefaultInstance().getBuildBrand();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBuildDevice() {
            this.bitField0_ &= -129;
            this.buildDevice_ = getDefaultInstance().getBuildDevice();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBuildDisplay() {
            this.bitField0_ &= -257;
            this.buildDisplay_ = getDefaultInstance().getBuildDisplay();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBuildFingerprint() {
            this.bitField0_ &= -513;
            this.buildFingerprint_ = getDefaultInstance().getBuildFingerprint();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBuildHardware() {
            this.bitField0_ &= -1025;
            this.buildHardware_ = getDefaultInstance().getBuildHardware();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBuildHost() {
            this.bitField0_ &= -2049;
            this.buildHost_ = getDefaultInstance().getBuildHost();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBuildId() {
            this.bitField0_ &= -16385;
            this.buildId_ = getDefaultInstance().getBuildId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBuildProduct() {
            this.bitField0_ &= -8193;
            this.buildProduct_ = getDefaultInstance().getBuildProduct();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExtensionVersion() {
            this.bitField0_ &= -32769;
            this.extensionVersion_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersionCode() {
            this.bitField0_ &= -3;
            this.versionCode_ = 0;
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
        public void setAndroidFingerprint(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.androidFingerprint_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAndroidFingerprintBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.androidFingerprint_ = byteString.toStringUtf8();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setApiLevel(int i) {
            this.bitField0_ |= 1;
            this.apiLevel_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setApkDeveloperSigningCertificateHash(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.apkDeveloperSigningCertificateHash_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setApkDeveloperSigningCertificateHashBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.apkDeveloperSigningCertificateHash_ = byteString.toStringUtf8();
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppInstaller(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.appInstaller_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppInstallerBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.appInstaller_ = byteString.toStringUtf8();
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuildBoard(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.buildBoard_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuildBoardBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.buildBoard_ = byteString.toStringUtf8();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuildBootloader(String str) {
            str.getClass();
            this.bitField0_ |= 4096;
            this.buildBootloader_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuildBootloaderBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.buildBootloader_ = byteString.toStringUtf8();
            this.bitField0_ |= 4096;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuildBrand(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.buildBrand_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuildBrandBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.buildBrand_ = byteString.toStringUtf8();
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuildDevice(String str) {
            str.getClass();
            this.bitField0_ |= 128;
            this.buildDevice_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuildDeviceBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.buildDevice_ = byteString.toStringUtf8();
            this.bitField0_ |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuildDisplay(String str) {
            str.getClass();
            this.bitField0_ |= 256;
            this.buildDisplay_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuildDisplayBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.buildDisplay_ = byteString.toStringUtf8();
            this.bitField0_ |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuildFingerprint(String str) {
            str.getClass();
            this.bitField0_ |= AdRequest.MAX_CONTENT_URL_LENGTH;
            this.buildFingerprint_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuildFingerprintBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.buildFingerprint_ = byteString.toStringUtf8();
            this.bitField0_ |= AdRequest.MAX_CONTENT_URL_LENGTH;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuildHardware(String str) {
            str.getClass();
            this.bitField0_ |= 1024;
            this.buildHardware_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuildHardwareBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.buildHardware_ = byteString.toStringUtf8();
            this.bitField0_ |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuildHost(String str) {
            str.getClass();
            this.bitField0_ |= a.m;
            this.buildHost_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuildHostBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.buildHost_ = byteString.toStringUtf8();
            this.bitField0_ |= a.m;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuildId(String str) {
            str.getClass();
            this.bitField0_ |= 16384;
            this.buildId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuildIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.buildId_ = byteString.toStringUtf8();
            this.bitField0_ |= 16384;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuildProduct(String str) {
            str.getClass();
            this.bitField0_ |= 8192;
            this.buildProduct_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuildProductBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.buildProduct_ = byteString.toStringUtf8();
            this.bitField0_ |= 8192;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtensionVersion(int i) {
            this.bitField0_ |= 32768;
            this.extensionVersion_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersionCode(int i) {
            this.bitField0_ |= 2;
            this.versionCode_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (StaticDeviceInfoOuterClass$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Android();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "��\u0010��\u0001\u0001\u0010\u0010������\u0001ဋ��\u0002ဋ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bለ\u0007\tለ\b\nለ\t\u000bለ\n\fለ\u000b\rለ\f\u000eለ\r\u000fለ\u000e\u0010ဋ\u000f", new Object[]{"bitField0_", "apiLevel_", "versionCode_", "androidFingerprint_", "appInstaller_", "apkDeveloperSigningCertificateHash_", "buildBoard_", "buildBrand_", "buildDevice_", "buildDisplay_", "buildFingerprint_", "buildHardware_", "buildHost_", "buildBootloader_", "buildProduct_", "buildId_", "extensionVersion_"});
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

        public String getAndroidFingerprint() {
            return this.androidFingerprint_;
        }

        public ByteString getAndroidFingerprintBytes() {
            return ByteString.copyFromUtf8(this.androidFingerprint_);
        }

        public int getApiLevel() {
            return this.apiLevel_;
        }

        public String getApkDeveloperSigningCertificateHash() {
            return this.apkDeveloperSigningCertificateHash_;
        }

        public ByteString getApkDeveloperSigningCertificateHashBytes() {
            return ByteString.copyFromUtf8(this.apkDeveloperSigningCertificateHash_);
        }

        public String getAppInstaller() {
            return this.appInstaller_;
        }

        public ByteString getAppInstallerBytes() {
            return ByteString.copyFromUtf8(this.appInstaller_);
        }

        public String getBuildBoard() {
            return this.buildBoard_;
        }

        public ByteString getBuildBoardBytes() {
            return ByteString.copyFromUtf8(this.buildBoard_);
        }

        public String getBuildBootloader() {
            return this.buildBootloader_;
        }

        public ByteString getBuildBootloaderBytes() {
            return ByteString.copyFromUtf8(this.buildBootloader_);
        }

        public String getBuildBrand() {
            return this.buildBrand_;
        }

        public ByteString getBuildBrandBytes() {
            return ByteString.copyFromUtf8(this.buildBrand_);
        }

        public String getBuildDevice() {
            return this.buildDevice_;
        }

        public ByteString getBuildDeviceBytes() {
            return ByteString.copyFromUtf8(this.buildDevice_);
        }

        public String getBuildDisplay() {
            return this.buildDisplay_;
        }

        public ByteString getBuildDisplayBytes() {
            return ByteString.copyFromUtf8(this.buildDisplay_);
        }

        public String getBuildFingerprint() {
            return this.buildFingerprint_;
        }

        public ByteString getBuildFingerprintBytes() {
            return ByteString.copyFromUtf8(this.buildFingerprint_);
        }

        public String getBuildHardware() {
            return this.buildHardware_;
        }

        public ByteString getBuildHardwareBytes() {
            return ByteString.copyFromUtf8(this.buildHardware_);
        }

        public String getBuildHost() {
            return this.buildHost_;
        }

        public ByteString getBuildHostBytes() {
            return ByteString.copyFromUtf8(this.buildHost_);
        }

        public String getBuildId() {
            return this.buildId_;
        }

        public ByteString getBuildIdBytes() {
            return ByteString.copyFromUtf8(this.buildId_);
        }

        public String getBuildProduct() {
            return this.buildProduct_;
        }

        public ByteString getBuildProductBytes() {
            return ByteString.copyFromUtf8(this.buildProduct_);
        }

        public int getExtensionVersion() {
            return this.extensionVersion_;
        }

        public int getVersionCode() {
            return this.versionCode_;
        }

        public boolean hasAndroidFingerprint() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasApiLevel() {
            boolean z = true;
            if ((this.bitField0_ & 1) == 0) {
                z = false;
            }
            return z;
        }

        public boolean hasApkDeveloperSigningCertificateHash() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasAppInstaller() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasBuildBoard() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasBuildBootloader() {
            return (this.bitField0_ & 4096) != 0;
        }

        public boolean hasBuildBrand() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasBuildDevice() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasBuildDisplay() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasBuildFingerprint() {
            return (this.bitField0_ & AdRequest.MAX_CONTENT_URL_LENGTH) != 0;
        }

        public boolean hasBuildHardware() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasBuildHost() {
            return (this.bitField0_ & a.m) != 0;
        }

        public boolean hasBuildId() {
            return (this.bitField0_ & 16384) != 0;
        }

        public boolean hasBuildProduct() {
            return (this.bitField0_ & 8192) != 0;
        }

        public boolean hasExtensionVersion() {
            return (this.bitField0_ & 32768) != 0;
        }

        public boolean hasVersionCode() {
            return (this.bitField0_ & 2) != 0;
        }
    }

    /* loaded from: StaticDeviceInfoOuterClass$StaticDeviceInfo$Builder.class */
    public static final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
        private Builder() {
            super(StaticDeviceInfoOuterClass$StaticDeviceInfo.DEFAULT_INSTANCE);
        }

        /* synthetic */ Builder(StaticDeviceInfoOuterClass$1 staticDeviceInfoOuterClass$1) {
            this();
        }

        public Builder addAllStores(Iterable iterable) {
            copyOnWrite();
            ((StaticDeviceInfoOuterClass$StaticDeviceInfo) this.instance).addAllStores(iterable);
            return this;
        }

        public Builder clearStores() {
            copyOnWrite();
            ((StaticDeviceInfoOuterClass$StaticDeviceInfo) this.instance).clearStores();
            return this;
        }

        public List getStoresList() {
            return Collections.unmodifiableList(((StaticDeviceInfoOuterClass$StaticDeviceInfo) this.instance).getStoresList());
        }

        public Builder setAndroid(Android android) {
            copyOnWrite();
            ((StaticDeviceInfoOuterClass$StaticDeviceInfo) this.instance).setAndroid(android);
            return this;
        }

        public Builder setAppDebuggable(boolean z) {
            copyOnWrite();
            ((StaticDeviceInfoOuterClass$StaticDeviceInfo) this.instance).setAppDebuggable(z);
            return this;
        }

        public Builder setBundleId(String str) {
            copyOnWrite();
            ((StaticDeviceInfoOuterClass$StaticDeviceInfo) this.instance).setBundleId(str);
            return this;
        }

        public Builder setBundleVersion(String str) {
            copyOnWrite();
            ((StaticDeviceInfoOuterClass$StaticDeviceInfo) this.instance).setBundleVersion(str);
            return this;
        }

        public Builder setCpuCount(long j) {
            copyOnWrite();
            ((StaticDeviceInfoOuterClass$StaticDeviceInfo) this.instance).setCpuCount(j);
            return this;
        }

        public Builder setCpuModel(String str) {
            copyOnWrite();
            ((StaticDeviceInfoOuterClass$StaticDeviceInfo) this.instance).setCpuModel(str);
            return this;
        }

        public Builder setDeviceMake(String str) {
            copyOnWrite();
            ((StaticDeviceInfoOuterClass$StaticDeviceInfo) this.instance).setDeviceMake(str);
            return this;
        }

        public Builder setDeviceModel(String str) {
            copyOnWrite();
            ((StaticDeviceInfoOuterClass$StaticDeviceInfo) this.instance).setDeviceModel(str);
            return this;
        }

        public Builder setGpuModel(String str) {
            copyOnWrite();
            ((StaticDeviceInfoOuterClass$StaticDeviceInfo) this.instance).setGpuModel(str);
            return this;
        }

        public Builder setOsVersion(String str) {
            copyOnWrite();
            ((StaticDeviceInfoOuterClass$StaticDeviceInfo) this.instance).setOsVersion(str);
            return this;
        }

        public Builder setRooted(boolean z) {
            copyOnWrite();
            ((StaticDeviceInfoOuterClass$StaticDeviceInfo) this.instance).setRooted(z);
            return this;
        }

        public Builder setScreenDensity(int i) {
            copyOnWrite();
            ((StaticDeviceInfoOuterClass$StaticDeviceInfo) this.instance).setScreenDensity(i);
            return this;
        }

        public Builder setScreenHeight(int i) {
            copyOnWrite();
            ((StaticDeviceInfoOuterClass$StaticDeviceInfo) this.instance).setScreenHeight(i);
            return this;
        }

        public Builder setScreenSize(int i) {
            copyOnWrite();
            ((StaticDeviceInfoOuterClass$StaticDeviceInfo) this.instance).setScreenSize(i);
            return this;
        }

        public Builder setScreenWidth(int i) {
            copyOnWrite();
            ((StaticDeviceInfoOuterClass$StaticDeviceInfo) this.instance).setScreenWidth(i);
            return this;
        }

        public Builder setTotalDiskSpace(long j) {
            copyOnWrite();
            ((StaticDeviceInfoOuterClass$StaticDeviceInfo) this.instance).setTotalDiskSpace(j);
            return this;
        }

        public Builder setTotalRamMemory(long j) {
            copyOnWrite();
            ((StaticDeviceInfoOuterClass$StaticDeviceInfo) this.instance).setTotalRamMemory(j);
            return this;
        }

        public Builder setWebviewUa(String str) {
            copyOnWrite();
            ((StaticDeviceInfoOuterClass$StaticDeviceInfo) this.instance).setWebviewUa(str);
            return this;
        }
    }

    /* loaded from: StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios.class */
    public static final class Ios extends GeneratedMessageLite<Ios, Builder> implements MessageLiteOrBuilder {
        public static final int BUILT_SDK_VERSION_FIELD_NUMBER = 3;
        public static final int CAN_MAKE_PAYMENTS_FIELD_NUMBER = 6;
        private static final Ios DEFAULT_INSTANCE;
        private static volatile Parser<Ios> PARSER;
        public static final int SCREEN_SCALE_FIELD_NUMBER = 5;
        public static final int SIMULATOR_FIELD_NUMBER = 2;
        public static final int SKADNETWORK_ID_FIELD_NUMBER = 4;
        public static final int SYSTEM_BOOT_TIME_FIELD_NUMBER = 1;
        private int bitField0_;
        private boolean canMakePayments_;
        private int screenScale_;
        private boolean simulator_;
        private long systemBootTime_;
        private String builtSdkVersion_ = "";
        private Internal.ProtobufList<String> skadnetworkId_ = GeneratedMessageLite.emptyProtobufList();

        /* loaded from: StaticDeviceInfoOuterClass$StaticDeviceInfo$Ios$Builder.class */
        public static final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
            private Builder() {
                super(Ios.DEFAULT_INSTANCE);
            }

            /* synthetic */ Builder(StaticDeviceInfoOuterClass$1 staticDeviceInfoOuterClass$1) {
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
        public void addAllSkadnetworkId(Iterable<String> iterable) {
            ensureSkadnetworkIdIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.skadnetworkId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSkadnetworkId(String str) {
            str.getClass();
            ensureSkadnetworkIdIsMutable();
            this.skadnetworkId_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSkadnetworkIdBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureSkadnetworkIdIsMutable();
            this.skadnetworkId_.add(byteString.toStringUtf8());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBuiltSdkVersion() {
            this.bitField0_ &= -5;
            this.builtSdkVersion_ = getDefaultInstance().getBuiltSdkVersion();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCanMakePayments() {
            this.bitField0_ &= -17;
            this.canMakePayments_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScreenScale() {
            this.bitField0_ &= -9;
            this.screenScale_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSimulator() {
            this.bitField0_ &= -3;
            this.simulator_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkadnetworkId() {
            this.skadnetworkId_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSystemBootTime() {
            this.bitField0_ &= -2;
            this.systemBootTime_ = 0L;
        }

        private void ensureSkadnetworkIdIsMutable() {
            Internal.ProtobufList<String> protobufList = this.skadnetworkId_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.skadnetworkId_ = GeneratedMessageLite.mutableCopy(protobufList);
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
        public void setBuiltSdkVersion(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.builtSdkVersion_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuiltSdkVersionBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.builtSdkVersion_ = byteString.toStringUtf8();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCanMakePayments(boolean z) {
            this.bitField0_ |= 16;
            this.canMakePayments_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScreenScale(int i) {
            this.bitField0_ |= 8;
            this.screenScale_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSimulator(boolean z) {
            this.bitField0_ |= 2;
            this.simulator_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkadnetworkId(int i, String str) {
            str.getClass();
            ensureSkadnetworkIdIsMutable();
            this.skadnetworkId_.set(i, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSystemBootTime(long j) {
            this.bitField0_ |= 1;
            this.systemBootTime_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (StaticDeviceInfoOuterClass$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new Ios();
                case 2:
                    return new Builder(null);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "��\u0006��\u0001\u0001\u0006\u0006��\u0001��\u0001ဂ��\u0002ဇ\u0001\u0003ለ\u0002\u0004Ț\u0005ဋ\u0003\u0006ဇ\u0004", new Object[]{"bitField0_", "systemBootTime_", "simulator_", "builtSdkVersion_", "skadnetworkId_", "screenScale_", "canMakePayments_"});
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

        public String getBuiltSdkVersion() {
            return this.builtSdkVersion_;
        }

        public ByteString getBuiltSdkVersionBytes() {
            return ByteString.copyFromUtf8(this.builtSdkVersion_);
        }

        public boolean getCanMakePayments() {
            return this.canMakePayments_;
        }

        public int getScreenScale() {
            return this.screenScale_;
        }

        public boolean getSimulator() {
            return this.simulator_;
        }

        public String getSkadnetworkId(int i) {
            return this.skadnetworkId_.get(i);
        }

        public ByteString getSkadnetworkIdBytes(int i) {
            return ByteString.copyFromUtf8(this.skadnetworkId_.get(i));
        }

        public int getSkadnetworkIdCount() {
            return this.skadnetworkId_.size();
        }

        public List<String> getSkadnetworkIdList() {
            return this.skadnetworkId_;
        }

        public long getSystemBootTime() {
            return this.systemBootTime_;
        }

        public boolean hasBuiltSdkVersion() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasCanMakePayments() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasScreenScale() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasSimulator() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasSystemBootTime() {
            boolean z = true;
            if ((this.bitField0_ & 1) == 0) {
                z = false;
            }
            return z;
        }
    }

    /* loaded from: StaticDeviceInfoOuterClass$StaticDeviceInfo$PlatformSpecificCase.class */
    public enum PlatformSpecificCase {
        ANDROID(19),
        IOS(20),
        PLATFORMSPECIFIC_NOT_SET(0);

        private final int value;

        PlatformSpecificCase(int i) {
            this.value = i;
        }

        public static PlatformSpecificCase forNumber(int i) {
            if (i == 0) {
                return PLATFORMSPECIFIC_NOT_SET;
            }
            if (i == 19) {
                return ANDROID;
            }
            if (i != 20) {
                return null;
            }
            return IOS;
        }
    }

    static {
        StaticDeviceInfoOuterClass$StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo = new StaticDeviceInfoOuterClass$StaticDeviceInfo();
        DEFAULT_INSTANCE = staticDeviceInfoOuterClass$StaticDeviceInfo;
        GeneratedMessageLite.registerDefaultInstance(StaticDeviceInfoOuterClass$StaticDeviceInfo.class, staticDeviceInfoOuterClass$StaticDeviceInfo);
    }

    private StaticDeviceInfoOuterClass$StaticDeviceInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllStores(Iterable<String> iterable) {
        ensureStoresIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.stores_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStores(String str) {
        str.getClass();
        ensureStoresIsMutable();
        this.stores_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addStoresBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureStoresIsMutable();
        this.stores_.add(byteString.toStringUtf8());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAndroid() {
        if (this.platformSpecificCase_ == 19) {
            this.platformSpecificCase_ = 0;
            this.platformSpecific_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppDebuggable() {
        this.bitField0_ &= -5;
        this.appDebuggable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBundleId() {
        this.bitField0_ &= -2;
        this.bundleId_ = getDefaultInstance().getBundleId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBundleVersion() {
        this.bitField0_ &= -3;
        this.bundleVersion_ = getDefaultInstance().getBundleVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCpuCount() {
        this.bitField0_ &= -32769;
        this.cpuCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCpuModel() {
        this.bitField0_ &= -16385;
        this.cpuModel_ = getDefaultInstance().getCpuModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceMake() {
        this.bitField0_ &= -33;
        this.deviceMake_ = getDefaultInstance().getDeviceMake();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceModel() {
        this.bitField0_ &= -65;
        this.deviceModel_ = getDefaultInstance().getDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGpuModel() {
        this.bitField0_ &= -65537;
        this.gpuModel_ = getDefaultInstance().getGpuModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIos() {
        if (this.platformSpecificCase_ == 20) {
            this.platformSpecificCase_ = 0;
            this.platformSpecific_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsVersion() {
        this.bitField0_ &= -17;
        this.osVersion_ = getDefaultInstance().getOsVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlatformSpecific() {
        this.platformSpecificCase_ = 0;
        this.platformSpecific_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRooted() {
        this.bitField0_ &= -9;
        this.rooted_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScreenDensity() {
        this.bitField0_ &= -257;
        this.screenDensity_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScreenHeight() {
        this.bitField0_ &= -1025;
        this.screenHeight_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScreenSize() {
        this.bitField0_ &= -2049;
        this.screenSize_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScreenWidth() {
        this.bitField0_ &= -513;
        this.screenWidth_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStores() {
        this.stores_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalDiskSpace() {
        this.bitField0_ &= -4097;
        this.totalDiskSpace_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalRamMemory() {
        this.bitField0_ &= -8193;
        this.totalRamMemory_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWebviewUa() {
        this.bitField0_ &= -129;
        this.webviewUa_ = getDefaultInstance().getWebviewUa();
    }

    private void ensureStoresIsMutable() {
        Internal.ProtobufList<String> protobufList = this.stores_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.stores_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static StaticDeviceInfoOuterClass$StaticDeviceInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAndroid(Android android) {
        android.getClass();
        if (this.platformSpecificCase_ != 19 || this.platformSpecific_ == Android.getDefaultInstance()) {
            this.platformSpecific_ = android;
        } else {
            this.platformSpecific_ = ((Android.Builder) Android.newBuilder((Android) this.platformSpecific_).mergeFrom((Android.Builder) android)).buildPartial();
        }
        this.platformSpecificCase_ = 19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeIos(Ios ios) {
        ios.getClass();
        if (this.platformSpecificCase_ != 20 || this.platformSpecific_ == Ios.getDefaultInstance()) {
            this.platformSpecific_ = ios;
        } else {
            this.platformSpecific_ = ((Ios.Builder) Ios.newBuilder((Ios) this.platformSpecific_).mergeFrom((Ios.Builder) ios)).buildPartial();
        }
        this.platformSpecificCase_ = 20;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(StaticDeviceInfoOuterClass$StaticDeviceInfo staticDeviceInfoOuterClass$StaticDeviceInfo) {
        return DEFAULT_INSTANCE.createBuilder(staticDeviceInfoOuterClass$StaticDeviceInfo);
    }

    public static StaticDeviceInfoOuterClass$StaticDeviceInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (StaticDeviceInfoOuterClass$StaticDeviceInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StaticDeviceInfoOuterClass$StaticDeviceInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StaticDeviceInfoOuterClass$StaticDeviceInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static StaticDeviceInfoOuterClass$StaticDeviceInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (StaticDeviceInfoOuterClass$StaticDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static StaticDeviceInfoOuterClass$StaticDeviceInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StaticDeviceInfoOuterClass$StaticDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static StaticDeviceInfoOuterClass$StaticDeviceInfo parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (StaticDeviceInfoOuterClass$StaticDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static StaticDeviceInfoOuterClass$StaticDeviceInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StaticDeviceInfoOuterClass$StaticDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static StaticDeviceInfoOuterClass$StaticDeviceInfo parseFrom(InputStream inputStream) throws IOException {
        return (StaticDeviceInfoOuterClass$StaticDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StaticDeviceInfoOuterClass$StaticDeviceInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (StaticDeviceInfoOuterClass$StaticDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static StaticDeviceInfoOuterClass$StaticDeviceInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (StaticDeviceInfoOuterClass$StaticDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static StaticDeviceInfoOuterClass$StaticDeviceInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StaticDeviceInfoOuterClass$StaticDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static StaticDeviceInfoOuterClass$StaticDeviceInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (StaticDeviceInfoOuterClass$StaticDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static StaticDeviceInfoOuterClass$StaticDeviceInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (StaticDeviceInfoOuterClass$StaticDeviceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Parser<StaticDeviceInfoOuterClass$StaticDeviceInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndroid(Android android) {
        android.getClass();
        this.platformSpecific_ = android;
        this.platformSpecificCase_ = 19;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppDebuggable(boolean z) {
        this.bitField0_ |= 4;
        this.appDebuggable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBundleId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.bundleId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBundleIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bundleId_ = byteString.toStringUtf8();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBundleVersion(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.bundleVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBundleVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.bundleVersion_ = byteString.toStringUtf8();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCpuCount(long j) {
        this.bitField0_ |= 32768;
        this.cpuCount_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCpuModel(String str) {
        str.getClass();
        this.bitField0_ |= 16384;
        this.cpuModel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCpuModelBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.cpuModel_ = byteString.toStringUtf8();
        this.bitField0_ |= 16384;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceMake(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.deviceMake_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceMakeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deviceMake_ = byteString.toStringUtf8();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceModel(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.deviceModel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceModelBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.deviceModel_ = byteString.toStringUtf8();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGpuModel(String str) {
        str.getClass();
        this.bitField0_ |= ExecutionOptions.MAX_TRACKING_TAG_STRING_LENGTH;
        this.gpuModel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGpuModelBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.gpuModel_ = byteString.toStringUtf8();
        this.bitField0_ |= ExecutionOptions.MAX_TRACKING_TAG_STRING_LENGTH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIos(Ios ios) {
        ios.getClass();
        this.platformSpecific_ = ios;
        this.platformSpecificCase_ = 20;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersion(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.osVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.osVersion_ = byteString.toStringUtf8();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRooted(boolean z) {
        this.bitField0_ |= 8;
        this.rooted_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenDensity(int i) {
        this.bitField0_ |= 256;
        this.screenDensity_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenHeight(int i) {
        this.bitField0_ |= 1024;
        this.screenHeight_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenSize(int i) {
        this.bitField0_ |= a.m;
        this.screenSize_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenWidth(int i) {
        this.bitField0_ |= AdRequest.MAX_CONTENT_URL_LENGTH;
        this.screenWidth_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStores(int i, String str) {
        str.getClass();
        ensureStoresIsMutable();
        this.stores_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalDiskSpace(long j) {
        this.bitField0_ |= 4096;
        this.totalDiskSpace_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalRamMemory(long j) {
        this.bitField0_ |= 8192;
        this.totalRamMemory_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebviewUa(String str) {
        str.getClass();
        this.bitField0_ |= 128;
        this.webviewUa_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebviewUaBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.webviewUa_ = byteString.toStringUtf8();
        this.bitField0_ |= 128;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (StaticDeviceInfoOuterClass$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new StaticDeviceInfoOuterClass$StaticDeviceInfo();
            case 2:
                return new Builder(null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "��\u0014\u0001\u0001\u0001\u0014\u0014��\u0001��\u0001ለ��\u0002ለ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bለ\u0007\tဋ\b\nဋ\t\u000bဋ\n\fဋ\u000b\rȚ\u000eဂ\f\u000fဂ\r\u0010ለ\u000e\u0011ဂ\u000f\u0012ለ\u0010\u0013<��\u0014<��", new Object[]{"platformSpecific_", "platformSpecificCase_", "bitField0_", "bundleId_", "bundleVersion_", "appDebuggable_", "rooted_", "osVersion_", "deviceMake_", "deviceModel_", "webviewUa_", "screenDensity_", "screenWidth_", "screenHeight_", "screenSize_", "stores_", "totalDiskSpace_", "totalRamMemory_", "cpuModel_", "cpuCount_", "gpuModel_", Android.class, Ios.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<StaticDeviceInfoOuterClass$StaticDeviceInfo> parser = PARSER;
                Parser<StaticDeviceInfoOuterClass$StaticDeviceInfo> parser2 = parser;
                if (parser == null) {
                    synchronized (StaticDeviceInfoOuterClass$StaticDeviceInfo.class) {
                        try {
                            Parser<StaticDeviceInfoOuterClass$StaticDeviceInfo> parser3 = PARSER;
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
        return this.platformSpecificCase_ == 19 ? (Android) this.platformSpecific_ : Android.getDefaultInstance();
    }

    public boolean getAppDebuggable() {
        return this.appDebuggable_;
    }

    public String getBundleId() {
        return this.bundleId_;
    }

    public ByteString getBundleIdBytes() {
        return ByteString.copyFromUtf8(this.bundleId_);
    }

    public String getBundleVersion() {
        return this.bundleVersion_;
    }

    public ByteString getBundleVersionBytes() {
        return ByteString.copyFromUtf8(this.bundleVersion_);
    }

    public long getCpuCount() {
        return this.cpuCount_;
    }

    public String getCpuModel() {
        return this.cpuModel_;
    }

    public ByteString getCpuModelBytes() {
        return ByteString.copyFromUtf8(this.cpuModel_);
    }

    public String getDeviceMake() {
        return this.deviceMake_;
    }

    public ByteString getDeviceMakeBytes() {
        return ByteString.copyFromUtf8(this.deviceMake_);
    }

    public String getDeviceModel() {
        return this.deviceModel_;
    }

    public ByteString getDeviceModelBytes() {
        return ByteString.copyFromUtf8(this.deviceModel_);
    }

    public String getGpuModel() {
        return this.gpuModel_;
    }

    public ByteString getGpuModelBytes() {
        return ByteString.copyFromUtf8(this.gpuModel_);
    }

    public Ios getIos() {
        return this.platformSpecificCase_ == 20 ? (Ios) this.platformSpecific_ : Ios.getDefaultInstance();
    }

    public String getOsVersion() {
        return this.osVersion_;
    }

    public ByteString getOsVersionBytes() {
        return ByteString.copyFromUtf8(this.osVersion_);
    }

    public PlatformSpecificCase getPlatformSpecificCase() {
        return PlatformSpecificCase.forNumber(this.platformSpecificCase_);
    }

    public boolean getRooted() {
        return this.rooted_;
    }

    public int getScreenDensity() {
        return this.screenDensity_;
    }

    public int getScreenHeight() {
        return this.screenHeight_;
    }

    public int getScreenSize() {
        return this.screenSize_;
    }

    public int getScreenWidth() {
        return this.screenWidth_;
    }

    public String getStores(int i) {
        return this.stores_.get(i);
    }

    public ByteString getStoresBytes(int i) {
        return ByteString.copyFromUtf8(this.stores_.get(i));
    }

    public int getStoresCount() {
        return this.stores_.size();
    }

    public List<String> getStoresList() {
        return this.stores_;
    }

    public long getTotalDiskSpace() {
        return this.totalDiskSpace_;
    }

    public long getTotalRamMemory() {
        return this.totalRamMemory_;
    }

    public String getWebviewUa() {
        return this.webviewUa_;
    }

    public ByteString getWebviewUaBytes() {
        return ByteString.copyFromUtf8(this.webviewUa_);
    }

    public boolean hasAndroid() {
        return this.platformSpecificCase_ == 19;
    }

    public boolean hasAppDebuggable() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasBundleId() {
        boolean z = true;
        if ((this.bitField0_ & 1) == 0) {
            z = false;
        }
        return z;
    }

    public boolean hasBundleVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasCpuCount() {
        return (this.bitField0_ & 32768) != 0;
    }

    public boolean hasCpuModel() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasDeviceMake() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasDeviceModel() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasGpuModel() {
        return (this.bitField0_ & ExecutionOptions.MAX_TRACKING_TAG_STRING_LENGTH) != 0;
    }

    public boolean hasIos() {
        return this.platformSpecificCase_ == 20;
    }

    public boolean hasOsVersion() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasRooted() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasScreenDensity() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasScreenHeight() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasScreenSize() {
        return (this.bitField0_ & a.m) != 0;
    }

    public boolean hasScreenWidth() {
        return (this.bitField0_ & AdRequest.MAX_CONTENT_URL_LENGTH) != 0;
    }

    public boolean hasTotalDiskSpace() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasTotalRamMemory() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasWebviewUa() {
        return (this.bitField0_ & 128) != 0;
    }
}
