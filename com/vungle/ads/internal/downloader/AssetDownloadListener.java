package com.vungle.ads.internal.downloader;

import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: AssetDownloadListener.class */
public interface AssetDownloadListener {

    /* loaded from: AssetDownloadListener$DownloadError.class */
    public static final class DownloadError {
        public static final Companion Companion = new Companion(null);
        public static final int DEFAULT_SERVER_CODE = -1;
        private final Throwable cause;

        @ErrorReason
        private final int reason;
        private final int serverCode;

        /* loaded from: AssetDownloadListener$DownloadError$Companion.class */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @Retention(RetentionPolicy.RUNTIME)
        /* loaded from: AssetDownloadListener$DownloadError$ErrorReason.class */
        public @interface ErrorReason {
            public static final Companion Companion = Companion.$$INSTANCE;

            /* loaded from: AssetDownloadListener$DownloadError$ErrorReason$Companion.class */
            public static final class Companion {
                private static int CONNECTION_ERROR;
                static final Companion $$INSTANCE = new Companion();
                private static int REQUEST_ERROR = 1;
                private static int DISK_ERROR = 2;
                private static int FILE_NOT_FOUND_ERROR = 3;
                private static int INTERNAL_ERROR = 4;

                private Companion() {
                }

                public final int getCONNECTION_ERROR() {
                    return CONNECTION_ERROR;
                }

                public final int getDISK_ERROR() {
                    return DISK_ERROR;
                }

                public final int getFILE_NOT_FOUND_ERROR() {
                    return FILE_NOT_FOUND_ERROR;
                }

                public final int getINTERNAL_ERROR() {
                    return INTERNAL_ERROR;
                }

                public final int getREQUEST_ERROR() {
                    return REQUEST_ERROR;
                }

                public final void setCONNECTION_ERROR(int i) {
                    CONNECTION_ERROR = i;
                }

                public final void setDISK_ERROR(int i) {
                    DISK_ERROR = i;
                }

                public final void setFILE_NOT_FOUND_ERROR(int i) {
                    FILE_NOT_FOUND_ERROR = i;
                }

                public final void setINTERNAL_ERROR(int i) {
                    INTERNAL_ERROR = i;
                }

                public final void setREQUEST_ERROR(int i) {
                    REQUEST_ERROR = i;
                }
            }
        }

        public DownloadError(int i, Throwable cause, int i2) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.serverCode = i;
            this.cause = cause;
            this.reason = i2;
        }

        public final Throwable getCause() {
            return this.cause;
        }

        public final int getReason() {
            return this.reason;
        }

        public final int getServerCode() {
            return this.serverCode;
        }
    }

    /* loaded from: AssetDownloadListener$Progress.class */
    public static final class Progress {
        public static final Companion Companion = new Companion(null);
        private int progressPercent;
        private long sizeBytes;
        private long startBytes;
        private int status;
        private long timestampDownloadStart;

        /* loaded from: AssetDownloadListener$Progress$Companion.class */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Progress copy(Progress progress) {
                Intrinsics.checkNotNullParameter(progress, "progress");
                Progress progress2 = new Progress();
                progress2.setStatus(progress.getStatus());
                progress2.setProgressPercent(progress.getProgressPercent());
                progress2.setTimestampDownloadStart(progress.getTimestampDownloadStart());
                progress2.setSizeBytes(progress.getSizeBytes());
                progress2.setStartBytes(progress.getStartBytes());
                return progress2;
            }
        }

        @Retention(RetentionPolicy.RUNTIME)
        /* loaded from: AssetDownloadListener$Progress$ProgressStatus.class */
        public @interface ProgressStatus {
            public static final Companion Companion = Companion.$$INSTANCE;

            /* loaded from: AssetDownloadListener$Progress$ProgressStatus$Companion.class */
            public static final class Companion {
                private static int STARTED;
                static final Companion $$INSTANCE = new Companion();
                private static int IN_PROGRESS = 1;
                private static int PAUSED = 2;
                private static int CANCELLED = 3;
                private static int DONE = 4;
                private static int LOST_CONNECTION = 5;
                private static int STATE_CHANGED = 6;
                private static int ERROR = 7;

                private Companion() {
                }

                public final int getCANCELLED() {
                    return CANCELLED;
                }

                public final int getDONE() {
                    return DONE;
                }

                public final int getERROR() {
                    return ERROR;
                }

                public final int getIN_PROGRESS() {
                    return IN_PROGRESS;
                }

                public final int getLOST_CONNECTION() {
                    return LOST_CONNECTION;
                }

                public final int getPAUSED() {
                    return PAUSED;
                }

                public final int getSTARTED() {
                    return STARTED;
                }

                public final int getSTATE_CHANGED() {
                    return STATE_CHANGED;
                }

                public final void setCANCELLED(int i) {
                    CANCELLED = i;
                }

                public final void setDONE(int i) {
                    DONE = i;
                }

                public final void setERROR(int i) {
                    ERROR = i;
                }

                public final void setIN_PROGRESS(int i) {
                    IN_PROGRESS = i;
                }

                public final void setLOST_CONNECTION(int i) {
                    LOST_CONNECTION = i;
                }

                public final void setPAUSED(int i) {
                    PAUSED = i;
                }

                public final void setSTARTED(int i) {
                    STARTED = i;
                }

                public final void setSTATE_CHANGED(int i) {
                    STATE_CHANGED = i;
                }
            }
        }

        @ProgressStatus
        public static /* synthetic */ void getStatus$annotations() {
        }

        public final int getProgressPercent() {
            return this.progressPercent;
        }

        public final long getSizeBytes() {
            return this.sizeBytes;
        }

        public final long getStartBytes() {
            return this.startBytes;
        }

        public final int getStatus() {
            return this.status;
        }

        public final long getTimestampDownloadStart() {
            return this.timestampDownloadStart;
        }

        public final void setProgressPercent(int i) {
            this.progressPercent = i;
        }

        public final void setSizeBytes(long j) {
            this.sizeBytes = j;
        }

        public final void setStartBytes(long j) {
            this.startBytes = j;
        }

        public final void setStatus(int i) {
            this.status = i;
        }

        public final void setTimestampDownloadStart(long j) {
            this.timestampDownloadStart = j;
        }
    }

    void onError(DownloadError downloadError, DownloadRequest downloadRequest);

    void onProgress(Progress progress, DownloadRequest downloadRequest);

    void onSuccess(File file, DownloadRequest downloadRequest);
}
