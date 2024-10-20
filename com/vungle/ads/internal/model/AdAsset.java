package com.vungle.ads.internal.model;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: AdAsset.class */
public final class AdAsset {
    private final String adIdentifier;
    private long fileSize;
    private FileType fileType;
    private final String identifier;
    private final String localPath;
    private String parentId;
    private int retryCount;
    private ErrorType retryTypeError;
    private final String serverPath;
    private Status status;

    /* loaded from: AdAsset$ErrorType.class */
    public enum ErrorType {
        NO_ERROR,
        CAN_RETRY_ERROR,
        CANNOT_RETRY_ERROR
    }

    /* loaded from: AdAsset$FileType.class */
    public enum FileType {
        ZIP,
        ZIP_ASSET,
        ASSET
    }

    /* loaded from: AdAsset$Status.class */
    public enum Status {
        NEW,
        DOWNLOAD_RUNNING,
        DOWNLOAD_FAILED,
        DOWNLOAD_SUCCESS,
        PROCESSED
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdAsset(String adIdentifier, String str, String localPath) {
        this(adIdentifier, str, localPath, UUID.randomUUID().toString());
        Intrinsics.checkNotNullParameter(adIdentifier, "adIdentifier");
        Intrinsics.checkNotNullParameter(localPath, "localPath");
    }

    public AdAsset(String adIdentifier, String str, String localPath, String str2) {
        Intrinsics.checkNotNullParameter(adIdentifier, "adIdentifier");
        Intrinsics.checkNotNullParameter(localPath, "localPath");
        this.identifier = str2;
        this.status = Status.NEW;
        this.adIdentifier = adIdentifier;
        this.serverPath = str;
        this.localPath = localPath;
        this.fileSize = -1L;
        this.retryCount = 0;
        this.retryTypeError = ErrorType.NO_ERROR;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(AdAsset.class, obj.getClass())) {
            return false;
        }
        AdAsset adAsset = (AdAsset) obj;
        if (this.status != adAsset.status || this.fileType != adAsset.fileType || this.fileSize != adAsset.fileSize || this.retryCount != adAsset.retryCount || this.retryTypeError != adAsset.retryTypeError) {
            return false;
        }
        String str = this.identifier;
        if (str != null) {
            if (!Intrinsics.areEqual(str, adAsset.identifier)) {
                return false;
            }
        } else if (adAsset.identifier != null) {
            return false;
        }
        String str2 = this.adIdentifier;
        if (str2 != null) {
            if (!Intrinsics.areEqual(str2, adAsset.adIdentifier)) {
                return false;
            }
        } else if (adAsset.adIdentifier != null) {
            return false;
        }
        String str3 = this.parentId;
        if (str3 != null) {
            if (!Intrinsics.areEqual(str3, adAsset.parentId)) {
                return false;
            }
        } else if (adAsset.parentId != null) {
            return false;
        }
        String str4 = this.serverPath;
        if (str4 != null) {
            if (!Intrinsics.areEqual(str4, adAsset.serverPath)) {
                return false;
            }
        } else if (adAsset.serverPath != null) {
            return false;
        }
        String str5 = this.localPath;
        String str6 = adAsset.localPath;
        if (str5 != null) {
            z = Intrinsics.areEqual(str5, str6);
        } else if (str6 != null) {
            z = false;
        }
        return z;
    }

    public final String getAdIdentifier() {
        return this.adIdentifier;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final FileType getFileType() {
        return this.fileType;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getLocalPath() {
        return this.localPath;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final int getRetryCount() {
        return this.retryCount;
    }

    public final ErrorType getRetryTypeError() {
        return this.retryTypeError;
    }

    public final String getServerPath() {
        return this.serverPath;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.identifier;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.adIdentifier;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.parentId;
        int hashCode3 = (str3 == null || str3 == null) ? 0 : str3.hashCode();
        String str4 = this.serverPath;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.localPath;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        int hashCode6 = this.status.hashCode();
        FileType fileType = this.fileType;
        if (fileType != null) {
            i = fileType.hashCode();
        }
        long j = this.fileSize;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.retryCount) * 31) + this.retryTypeError.hashCode();
    }

    public final void setFileSize(long j) {
        this.fileSize = j;
    }

    public final void setFileType(FileType fileType) {
        this.fileType = fileType;
    }

    public final void setParentId(String str) {
        this.parentId = str;
    }

    public final void setRetryCount(int i) {
        this.retryCount = i;
    }

    public final void setRetryTypeError(ErrorType errorType) {
        Intrinsics.checkNotNullParameter(errorType, "<set-?>");
        this.retryTypeError = errorType;
    }

    public final void setStatus(Status status) {
        Intrinsics.checkNotNullParameter(status, "<set-?>");
        this.status = status;
    }

    public String toString() {
        return "AdAsset{identifier='" + this.identifier + "', adIdentifier='" + this.adIdentifier + "', serverPath='" + this.serverPath + "', localPath='" + this.localPath + "', status=" + this.status + ", fileType=" + this.fileType + ", fileSize=" + this.fileSize + ", retryCount=" + this.retryCount + ", retryTypeError=" + this.retryTypeError + '}';
    }
}
