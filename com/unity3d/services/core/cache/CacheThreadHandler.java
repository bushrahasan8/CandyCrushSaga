package com.unity3d.services.core.cache;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.ironsource.na;
import com.unity3d.services.core.api.Request;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.IWebRequestProgressListener;
import com.unity3d.services.core.request.NetworkIOException;
import com.unity3d.services.core.request.WebRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: CacheThreadHandler.class */
class CacheThreadHandler extends Handler {
    private WebRequest _currentRequest = null;
    private boolean _canceled = false;
    private boolean _active = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v190, types: [com.unity3d.services.core.request.WebRequest] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v35 */
    /* JADX WARN: Type inference failed for: r16v42, types: [java.io.OutputStream, java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r16v43 */
    /* JADX WARN: Type inference failed for: r16v44 */
    /* JADX WARN: Type inference failed for: r16v45 */
    /* JADX WARN: Type inference failed for: r16v46 */
    /* JADX WARN: Type inference failed for: r16v47 */
    /* JADX WARN: Type inference failed for: r16v48 */
    /* JADX WARN: Type inference failed for: r16v49 */
    /* JADX WARN: Type inference failed for: r16v50 */
    /* JADX WARN: Type inference failed for: r16v51 */
    /* JADX WARN: Type inference failed for: r16v52 */
    /* JADX WARN: Type inference failed for: r16v53 */
    /* JADX WARN: Type inference failed for: r16v54 */
    /* JADX WARN: Type inference failed for: r16v55 */
    /* JADX WARN: Type inference failed for: r16v56 */
    /* JADX WARN: Type inference failed for: r16v57 */
    /* JADX WARN: Type inference failed for: r16v58 */
    /* JADX WARN: Type inference failed for: r16v59 */
    /* JADX WARN: Type inference failed for: r16v60 */
    /* JADX WARN: Type inference failed for: r16v61 */
    private void downloadFile(String str, String str2, int i, int i2, int i3, HashMap<String, List<String>> hashMap, boolean z, CacheEventSender cacheEventSender) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        FileOutputStream fileOutputStream3;
        FileOutputStream fileOutputStream4;
        FileOutputStream fileOutputStream5;
        FileOutputStream fileOutputStream6;
        long makeStreamRequest;
        if (this._canceled || str == null || str2 == 0) {
            return;
        }
        File file = new File((String) str2);
        if (z) {
            DeviceLog.debug("Unity Ads cache: resuming download " + str + " to " + ((String) str2) + " at " + file.length() + " bytes");
        } else {
            DeviceLog.debug("Unity Ads cache: start downloading " + str + " to " + ((String) str2));
        }
        if (!Device.isActiveNetworkConnected()) {
            DeviceLog.debug("Unity Ads cache: download cancelled, no internet connection available");
            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.NO_INTERNET, str);
            return;
        }
        this._active = true;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            try {
                str2 = new FileOutputStream(file, z);
                try {
                    WebRequest webRequest = getWebRequest(str, i, i2, hashMap);
                    this._currentRequest = webRequest;
                    webRequest.setProgressListener(new IWebRequestProgressListener(this, cacheEventSender, file, i3) { // from class: com.unity3d.services.core.cache.CacheThreadHandler.1
                        private long lastProgressEventTime = System.currentTimeMillis();
                        final CacheThreadHandler this$0;
                        final CacheEventSender val$cacheThreadBinder;
                        final int val$progressInterval;
                        final File val$targetFile;

                        {
                            this.this$0 = this;
                            this.val$cacheThreadBinder = cacheEventSender;
                            this.val$targetFile = file;
                            this.val$progressInterval = i3;
                        }

                        @Override // com.unity3d.services.core.request.IWebRequestProgressListener
                        public void onRequestProgress(String str3, long j, long j2) {
                            if (this.val$progressInterval <= 0 || System.currentTimeMillis() - this.lastProgressEventTime <= this.val$progressInterval) {
                                return;
                            }
                            this.lastProgressEventTime = System.currentTimeMillis();
                            this.val$cacheThreadBinder.sendEvent(CacheEvent.DOWNLOAD_PROGRESS, str3, Long.valueOf(j), Long.valueOf(j2));
                        }

                        @Override // com.unity3d.services.core.request.IWebRequestProgressListener
                        public void onRequestStart(String str3, long j, int i4, Map<String, List<String>> map) {
                            this.val$cacheThreadBinder.sendEvent(CacheEvent.DOWNLOAD_STARTED, str3, Long.valueOf(this.val$targetFile.length()), Long.valueOf(j + this.val$targetFile.length()), Integer.valueOf(i4), Request.getResponseHeadersMap(map));
                        }
                    });
                    makeStreamRequest = this._currentRequest.makeStreamRequest(str2);
                    this._active = false;
                } catch (NetworkIOException e) {
                    e = e;
                } catch (FileNotFoundException e2) {
                    e = e2;
                } catch (MalformedURLException e3) {
                    e = e3;
                } catch (IOException e4) {
                    e = e4;
                } catch (IllegalStateException e5) {
                    e = e5;
                } catch (Exception e6) {
                    e = e6;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (NetworkIOException e7) {
            e = e7;
            fileOutputStream6 = null;
        } catch (FileNotFoundException e8) {
            e = e8;
            fileOutputStream5 = null;
        } catch (IOException e9) {
            e = e9;
            fileOutputStream4 = null;
        } catch (IllegalStateException e10) {
            e = e10;
            fileOutputStream3 = null;
        } catch (MalformedURLException e11) {
            e = e11;
            fileOutputStream2 = null;
        } catch (Exception e12) {
            e = e12;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            str2 = 0;
        }
        try {
            postProcessDownload(elapsedRealtime, str, file, makeStreamRequest, this._currentRequest.getContentLength(), this._currentRequest.isCanceled(), this._currentRequest.getResponseCode(), this._currentRequest.getResponseHeaders(), cacheEventSender);
            this._currentRequest = null;
            try {
                str2.close();
            } catch (Exception e13) {
                DeviceLog.exception("Error closing stream", e13);
                cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.FILE_IO_ERROR, str, e13.getMessage());
            }
        } catch (NetworkIOException e14) {
            e = e14;
            e = e;
            fileOutputStream6 = str2;
            DeviceLog.exception("Network error", e);
            FileOutputStream fileOutputStream7 = fileOutputStream6;
            this._active = false;
            FileOutputStream fileOutputStream8 = fileOutputStream6;
            FileOutputStream fileOutputStream9 = fileOutputStream6;
            FileOutputStream fileOutputStream10 = fileOutputStream6;
            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.NETWORK_ERROR, str, e.getMessage());
            this._currentRequest = null;
            str2 = fileOutputStream10;
            if (fileOutputStream6 != null) {
                try {
                    fileOutputStream6.close();
                    str2 = fileOutputStream10;
                } catch (Exception e15) {
                    DeviceLog.exception("Error closing stream", e15);
                    CacheEvent cacheEvent = CacheEvent.DOWNLOAD_ERROR;
                    cacheEventSender.sendEvent(cacheEvent, CacheError.FILE_IO_ERROR, str, e15.getMessage());
                    str2 = cacheEvent;
                }
            }
        } catch (FileNotFoundException e16) {
            e = e16;
            e = e;
            fileOutputStream5 = str2;
            DeviceLog.exception("Couldn't create target file", e);
            FileOutputStream fileOutputStream11 = fileOutputStream5;
            this._active = false;
            FileOutputStream fileOutputStream12 = fileOutputStream5;
            FileOutputStream fileOutputStream13 = fileOutputStream5;
            FileOutputStream fileOutputStream14 = fileOutputStream5;
            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.FILE_IO_ERROR, str, e.getMessage());
            this._currentRequest = null;
            str2 = fileOutputStream14;
            if (fileOutputStream5 != null) {
                try {
                    fileOutputStream5.close();
                    str2 = fileOutputStream14;
                } catch (Exception e17) {
                    DeviceLog.exception("Error closing stream", e17);
                    CacheEvent cacheEvent2 = CacheEvent.DOWNLOAD_ERROR;
                    cacheEventSender.sendEvent(cacheEvent2, CacheError.FILE_IO_ERROR, str, e17.getMessage());
                    str2 = cacheEvent2;
                }
            }
        } catch (MalformedURLException e18) {
            e = e18;
            e = e;
            fileOutputStream2 = str2;
            DeviceLog.exception("Malformed URL", e);
            FileOutputStream fileOutputStream15 = fileOutputStream2;
            this._active = false;
            FileOutputStream fileOutputStream16 = fileOutputStream2;
            FileOutputStream fileOutputStream17 = fileOutputStream2;
            FileOutputStream fileOutputStream18 = fileOutputStream2;
            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.MALFORMED_URL, str, e.getMessage());
            this._currentRequest = null;
            str2 = fileOutputStream18;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                    str2 = fileOutputStream18;
                } catch (Exception e19) {
                    DeviceLog.exception("Error closing stream", e19);
                    CacheEvent cacheEvent3 = CacheEvent.DOWNLOAD_ERROR;
                    cacheEventSender.sendEvent(cacheEvent3, CacheError.FILE_IO_ERROR, str, e19.getMessage());
                    str2 = cacheEvent3;
                }
            }
        } catch (IOException e20) {
            e = e20;
            e = e;
            fileOutputStream4 = str2;
            DeviceLog.exception("Couldn't request stream", e);
            FileOutputStream fileOutputStream19 = fileOutputStream4;
            this._active = false;
            FileOutputStream fileOutputStream20 = fileOutputStream4;
            FileOutputStream fileOutputStream21 = fileOutputStream4;
            FileOutputStream fileOutputStream22 = fileOutputStream4;
            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.FILE_IO_ERROR, str, e.getMessage());
            this._currentRequest = null;
            str2 = fileOutputStream22;
            if (fileOutputStream4 != null) {
                try {
                    fileOutputStream4.close();
                    str2 = fileOutputStream22;
                } catch (Exception e21) {
                    DeviceLog.exception("Error closing stream", e21);
                    CacheEvent cacheEvent4 = CacheEvent.DOWNLOAD_ERROR;
                    cacheEventSender.sendEvent(cacheEvent4, CacheError.FILE_IO_ERROR, str, e21.getMessage());
                    str2 = cacheEvent4;
                }
            }
        } catch (IllegalStateException e22) {
            e = e22;
            e = e;
            fileOutputStream3 = str2;
            DeviceLog.exception("Illegal state", e);
            FileOutputStream fileOutputStream23 = fileOutputStream3;
            this._active = false;
            FileOutputStream fileOutputStream24 = fileOutputStream3;
            FileOutputStream fileOutputStream25 = fileOutputStream3;
            FileOutputStream fileOutputStream26 = fileOutputStream3;
            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.ILLEGAL_STATE, str, e.getMessage());
            this._currentRequest = null;
            str2 = fileOutputStream26;
            if (fileOutputStream3 != null) {
                try {
                    fileOutputStream3.close();
                    str2 = fileOutputStream26;
                } catch (Exception e23) {
                    DeviceLog.exception("Error closing stream", e23);
                    CacheEvent cacheEvent5 = CacheEvent.DOWNLOAD_ERROR;
                    cacheEventSender.sendEvent(cacheEvent5, CacheError.FILE_IO_ERROR, str, e23.getMessage());
                    str2 = cacheEvent5;
                }
            }
        } catch (Exception e24) {
            e = e24;
            e = e;
            fileOutputStream = str2;
            DeviceLog.exception("Unknown error", e);
            FileOutputStream fileOutputStream27 = fileOutputStream;
            this._active = false;
            FileOutputStream fileOutputStream28 = fileOutputStream;
            FileOutputStream fileOutputStream29 = fileOutputStream;
            FileOutputStream fileOutputStream30 = fileOutputStream;
            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.UNKNOWN_ERROR, str, e.getMessage());
            this._currentRequest = null;
            str2 = fileOutputStream30;
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                    str2 = fileOutputStream30;
                } catch (Exception e25) {
                    DeviceLog.exception("Error closing stream", e25);
                    CacheEvent cacheEvent6 = CacheEvent.DOWNLOAD_ERROR;
                    cacheEventSender.sendEvent(cacheEvent6, CacheError.FILE_IO_ERROR, str, e25.getMessage());
                    str2 = cacheEvent6;
                }
            }
        } catch (Throwable th4) {
            str2 = str2;
            th = th4;
            this._currentRequest = null;
            if (str2) {
                try {
                    str2.close();
                } catch (Exception e26) {
                    DeviceLog.exception("Error closing stream", e26);
                    cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.FILE_IO_ERROR, str, e26.getMessage());
                }
            }
            throw th;
        }
    }

    private WebRequest getWebRequest(String str, int i, int i2, HashMap<String, List<String>> hashMap) throws MalformedURLException {
        HashMap hashMap2 = new HashMap();
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
        return new WebRequest(str, na.a, hashMap2, i, i2);
    }

    private void postProcessDownload(long j, String str, File file, long j2, long j3, boolean z, int i, Map<String, List<String>> map, CacheEventSender cacheEventSender) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (!file.setReadable(true, false)) {
            DeviceLog.debug("Unity Ads cache: could not set file readable!");
        }
        if (z) {
            DeviceLog.debug("Unity Ads cache: downloading of " + str + " stopped");
            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_STOPPED, str, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(elapsedRealtime), Integer.valueOf(i), Request.getResponseHeadersMap(map));
            return;
        }
        DeviceLog.debug("Unity Ads cache: File " + file.getName() + " of " + j2 + " bytes downloaded in " + elapsedRealtime + "ms");
        cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_END, str, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(elapsedRealtime), Integer.valueOf(i), Request.getResponseHeadersMap(map));
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        HashMap<String, List<String>> hashMap;
        Bundle data = message.getData();
        String string = data.getString("source");
        data.remove("source");
        String string2 = data.getString("target");
        data.remove("target");
        int i = data.getInt("connectTimeout");
        data.remove("connectTimeout");
        int i2 = data.getInt("readTimeout");
        data.remove("readTimeout");
        int i3 = data.getInt("progressInterval");
        data.remove("progressInterval");
        boolean z = data.getBoolean("append", false);
        data.remove("append");
        CacheEventSender cacheEventSender = (CacheEventSender) data.getSerializable("cacheEventSender");
        data.remove("cacheEventSender");
        if (data.size() > 0) {
            DeviceLog.debug("There are headers left in data, reading them");
            hashMap = new HashMap<>();
            for (String str : data.keySet()) {
                hashMap.put(str, Arrays.asList(data.getStringArray(str)));
            }
        } else {
            hashMap = null;
        }
        File file = new File(string2);
        if ((z && !file.exists()) || (!z && file.exists())) {
            this._active = false;
            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.FILE_STATE_WRONG, string, string2, Boolean.valueOf(z), Boolean.valueOf(file.exists()));
        } else {
            if (message.what != 1) {
                return;
            }
            downloadFile(string, string2, i, i2, i3, hashMap, z, cacheEventSender);
        }
    }

    public boolean isActive() {
        return this._active;
    }

    public void setCancelStatus(boolean z) {
        WebRequest webRequest;
        this._canceled = z;
        if (!z || (webRequest = this._currentRequest) == null) {
            return;
        }
        this._active = false;
        webRequest.cancel();
    }
}
