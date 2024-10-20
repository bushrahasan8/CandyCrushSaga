package com.king.amp.sa;

import android.util.Log;
import com.ironsource.t2;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: DownloadChunkExecutor.class */
public class DownloadChunkExecutor implements IDownloadChunkListener {
    private ExecutorService mExecutorService;
    private IHttpDownloadHandler mHandler;
    private Map mTasks = new HashMap();
    AtomicBoolean mRun = new AtomicBoolean(true);

    /* renamed from: com.king.amp.sa.DownloadChunkExecutor$1, reason: invalid class name */
    /* loaded from: DownloadChunkExecutor$1.class */
    static abstract /* synthetic */ class AnonymousClass1 {
        static final int[] $SwitchMap$com$king$amp$sa$DownloadChunkTask$State;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:15:0x002f
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
            */
        static {
            /*
                com.king.amp.sa.DownloadChunkTask$State[] r0 = com.king.amp.sa.DownloadChunkTask.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.king.amp.sa.DownloadChunkExecutor.AnonymousClass1.$SwitchMap$com$king$amp$sa$DownloadChunkTask$State = r0
                r0 = r4
                com.king.amp.sa.DownloadChunkTask$State r1 = com.king.amp.sa.DownloadChunkTask.State.IDLE     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L14:
                int[] r0 = com.king.amp.sa.DownloadChunkExecutor.AnonymousClass1.$SwitchMap$com$king$amp$sa$DownloadChunkTask$State     // Catch: java.lang.NoSuchFieldError -> L2b java.lang.NoSuchFieldError -> L2f
                com.king.amp.sa.DownloadChunkTask$State r1 = com.king.amp.sa.DownloadChunkTask.State.LOADING     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
            L1f:
                int[] r0 = com.king.amp.sa.DownloadChunkExecutor.AnonymousClass1.$SwitchMap$com$king$amp$sa$DownloadChunkTask$State     // Catch: java.lang.NoSuchFieldError -> L2f java.lang.NoSuchFieldError -> L33
                com.king.amp.sa.DownloadChunkTask$State r1 = com.king.amp.sa.DownloadChunkTask.State.FAILED     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L2a:
                return
            L2b:
                r4 = move-exception
                goto L14
            L2f:
                r4 = move-exception
                goto L1f
            L33:
                r4 = move-exception
                goto L2a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.king.amp.sa.DownloadChunkExecutor.AnonymousClass1.m6108clinit():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: DownloadChunkExecutor$Error.class */
    public class Error {
        final int errorCode;
        final String errorDesc;
        final DownloadChunkExecutor this$0;

        Error(DownloadChunkExecutor downloadChunkExecutor, int i, String str) {
            this.this$0 = downloadChunkExecutor;
            this.errorCode = i;
            this.errorDesc = str;
        }

        public String toString() {
            return "{ error=" + this.errorCode + ", " + this.errorDesc + "}";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DownloadChunkExecutor(ExecutorService executorService, IHttpDownloadHandler iHttpDownloadHandler) {
        this.mExecutorService = null;
        this.mExecutorService = executorService;
        this.mHandler = iHttpDownloadHandler;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:35)
        */
    private com.king.amp.sa.DownloadChunkExecutor.Error assembleTargetFile(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r7v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    private void remove(String str) {
        synchronized (this) {
            if (!this.mTasks.containsKey(str)) {
                Log.w("DownloadChunkExecutor", "Problem with removal, task [" + str + "] is not in list.");
                return;
            }
            Log.i("DownloadChunkExecutor", "Remove [" + str + t2.i.e);
            Vector vector = (Vector) this.mTasks.get(str);
            Iterator it = vector.iterator();
            while (it.hasNext()) {
                DownloadChunkTask downloadChunkTask = (DownloadChunkTask) it.next();
                File file = new File(downloadChunkTask.getConfig().tempFile);
                if (file.exists()) {
                    file.delete();
                }
                downloadChunkTask.stop();
            }
            vector.removeAllElements();
            this.mTasks.remove(str);
        }
    }

    public void execute(DownloadChunkConfig downloadChunkConfig) {
        synchronized (this) {
            Log.i("DownloadChunkExecutor", "Execute " + downloadChunkConfig);
            if (!this.mTasks.containsKey(downloadChunkConfig.requestId)) {
                this.mTasks.put(downloadChunkConfig.requestId, new Vector());
            }
            DownloadChunkTask downloadChunkTask = new DownloadChunkTask(downloadChunkConfig, this);
            ((Vector) this.mTasks.get(downloadChunkConfig.requestId)).add(downloadChunkTask);
            this.mExecutorService.execute(downloadChunkTask);
        }
    }

    @Override // com.king.amp.sa.IDownloadChunkListener
    public void onChunkDownloadFinished(DownloadChunkConfig downloadChunkConfig, int i, String str) {
        if (!this.mRun.get()) {
            Log.w("DownloadChunkExecutor", "Unable to handle completion for " + downloadChunkConfig.requestId + ", stopped");
            return;
        }
        if (this.mTasks.isEmpty()) {
            Log.w("DownloadChunkExecutor", "Unable to handle completion " + downloadChunkConfig.requestId + ", tasks list is empty");
            return;
        }
        if (!this.mTasks.containsKey(downloadChunkConfig.requestId)) {
            Log.w("DownloadChunkExecutor", "Unable to handle completion, no tasks for " + downloadChunkConfig.requestId);
            return;
        }
        if (i != 0) {
            Log.w("DownloadChunkExecutor", "The task failed for " + downloadChunkConfig.requestId + " with error [" + i + ", " + str + "]. Stop, report and remove.");
            remove(downloadChunkConfig.requestId);
            this.mHandler.onHttpDownloadFailed(downloadChunkConfig.requestId, i, str);
            return;
        }
        Log.i("DownloadChunkExecutor", "Completion for " + downloadChunkConfig);
        Iterator it = ((Vector) this.mTasks.get(downloadChunkConfig.requestId)).iterator();
        long j = 0L;
        while (it.hasNext()) {
            DownloadChunkTask downloadChunkTask = (DownloadChunkTask) it.next();
            int i2 = AnonymousClass1.$SwitchMap$com$king$amp$sa$DownloadChunkTask$State[downloadChunkTask.getState().ordinal()];
            if (i2 == 1 || i2 == 2) {
                return;
            }
            if (i2 == 3) {
                Log.e("DownloadChunkExecutor", "This should not happen!");
            }
            if (downloadChunkTask.getConfig().downloadTimeSec > j) {
                j = downloadChunkTask.getConfig().downloadTimeSec;
            }
        }
        Error assembleTargetFile = assembleTargetFile(downloadChunkConfig.requestId);
        Log.i("DownloadChunkExecutor", "Longest chunk took " + j + "s to download.");
        remove(downloadChunkConfig.requestId);
        if (assembleTargetFile == null) {
            this.mHandler.onHttpDownloadCompleted(downloadChunkConfig.requestId);
            return;
        }
        this.mHandler.onHttpDownloadFailed(downloadChunkConfig.requestId, assembleTargetFile.errorCode, "Target file assembly failed. " + assembleTargetFile.errorDesc);
    }

    public void uninit() {
        Log.i("DownloadChunkExecutor", "Uninit");
        this.mRun.set(false);
        Iterator it = this.mTasks.keySet().iterator();
        while (it.hasNext()) {
            remove((String) it.next());
        }
        this.mTasks.clear();
        this.mHandler = null;
        this.mExecutorService = null;
    }
}
