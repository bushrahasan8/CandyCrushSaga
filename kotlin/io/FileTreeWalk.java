package kotlin.io;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: FileTreeWalk.class */
public final class FileTreeWalk implements Sequence {
    private final FileWalkDirection direction;
    private final int maxDepth;
    private final Function1 onEnter;
    private final Function2 onFail;
    private final Function1 onLeave;
    private final File start;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: FileTreeWalk$DirectoryState.class */
    public static abstract class DirectoryState extends WalkState {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DirectoryState(File rootDir) {
            super(rootDir);
            Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        }
    }

    /* loaded from: FileTreeWalk$FileTreeWalkIterator.class */
    private final class FileTreeWalkIterator extends AbstractIterator {
        private final ArrayDeque state;
        final FileTreeWalk this$0;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: FileTreeWalk$FileTreeWalkIterator$BottomUpDirectoryState.class */
        public final class BottomUpDirectoryState extends DirectoryState {
            private boolean failed;
            private int fileIndex;
            private File[] fileList;
            private boolean rootVisited;
            final FileTreeWalkIterator this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BottomUpDirectoryState(FileTreeWalkIterator fileTreeWalkIterator, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.this$0 = fileTreeWalkIterator;
            }

            @Override // kotlin.io.FileTreeWalk.WalkState
            public File step() {
                if (!this.failed && this.fileList == null) {
                    Function1 function1 = this.this$0.this$0.onEnter;
                    if (function1 != null && !((Boolean) function1.invoke(getRoot())).booleanValue()) {
                        return null;
                    }
                    File[] listFiles = getRoot().listFiles();
                    this.fileList = listFiles;
                    if (listFiles == null) {
                        Function2 function2 = this.this$0.this$0.onFail;
                        if (function2 != null) {
                            function2.invoke(getRoot(), new AccessDeniedException(getRoot(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.failed = true;
                    }
                }
                File[] fileArr = this.fileList;
                if (fileArr != null) {
                    int i = this.fileIndex;
                    Intrinsics.checkNotNull(fileArr);
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.fileList;
                        Intrinsics.checkNotNull(fileArr2);
                        int i2 = this.fileIndex;
                        this.fileIndex = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (!this.rootVisited) {
                    this.rootVisited = true;
                    return getRoot();
                }
                Function1 function12 = this.this$0.this$0.onLeave;
                if (function12 == null) {
                    return null;
                }
                function12.invoke(getRoot());
                return null;
            }
        }

        /* loaded from: FileTreeWalk$FileTreeWalkIterator$SingleFileState.class */
        private final class SingleFileState extends WalkState {
            final FileTreeWalkIterator this$0;
            private boolean visited;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SingleFileState(FileTreeWalkIterator fileTreeWalkIterator, File rootFile) {
                super(rootFile);
                Intrinsics.checkNotNullParameter(rootFile, "rootFile");
                this.this$0 = fileTreeWalkIterator;
            }

            @Override // kotlin.io.FileTreeWalk.WalkState
            public File step() {
                if (this.visited) {
                    return null;
                }
                this.visited = true;
                return getRoot();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: FileTreeWalk$FileTreeWalkIterator$TopDownDirectoryState.class */
        public final class TopDownDirectoryState extends DirectoryState {
            private int fileIndex;
            private File[] fileList;
            private boolean rootVisited;
            final FileTreeWalkIterator this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TopDownDirectoryState(FileTreeWalkIterator fileTreeWalkIterator, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.this$0 = fileTreeWalkIterator;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
            
                if (r0.length == 0) goto L33;
             */
            @Override // kotlin.io.FileTreeWalk.WalkState
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.io.File step() {
                /*
                    Method dump skipped, instructions count: 245
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.io.FileTreeWalk.FileTreeWalkIterator.TopDownDirectoryState.step():java.io.File");
            }
        }

        /* loaded from: FileTreeWalk$FileTreeWalkIterator$WhenMappings.class */
        public abstract /* synthetic */ class WhenMappings {
            public static final int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[FileWalkDirection.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError e) {
                }
                try {
                    iArr[FileWalkDirection.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError e2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public FileTreeWalkIterator(FileTreeWalk fileTreeWalk) {
            this.this$0 = fileTreeWalk;
            ArrayDeque arrayDeque = new ArrayDeque();
            this.state = arrayDeque;
            if (fileTreeWalk.start.isDirectory()) {
                arrayDeque.push(directoryState(fileTreeWalk.start));
            } else if (fileTreeWalk.start.isFile()) {
                arrayDeque.push(new SingleFileState(this, fileTreeWalk.start));
            } else {
                done();
            }
        }

        private final DirectoryState directoryState(File file) {
            DirectoryState topDownDirectoryState;
            int i = WhenMappings.$EnumSwitchMapping$0[this.this$0.direction.ordinal()];
            if (i == 1) {
                topDownDirectoryState = new TopDownDirectoryState(this, file);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                topDownDirectoryState = new BottomUpDirectoryState(this, file);
            }
            return topDownDirectoryState;
        }

        private final File gotoNext() {
            File step;
            while (true) {
                WalkState walkState = (WalkState) this.state.peek();
                if (walkState == null) {
                    return null;
                }
                step = walkState.step();
                if (step == null) {
                    this.state.pop();
                } else {
                    if (Intrinsics.areEqual(step, walkState.getRoot()) || !step.isDirectory() || this.state.size() >= this.this$0.maxDepth) {
                        break;
                    }
                    this.state.push(directoryState(step));
                }
            }
            return step;
        }

        @Override // kotlin.collections.AbstractIterator
        protected void computeNext() {
            File gotoNext = gotoNext();
            if (gotoNext != null) {
                setNext(gotoNext);
            } else {
                done();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: FileTreeWalk$WalkState.class */
    public static abstract class WalkState {
        private final File root;

        public WalkState(File root) {
            Intrinsics.checkNotNullParameter(root, "root");
            this.root = root;
        }

        public final File getRoot() {
            return this.root;
        }

        public abstract File step();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FileTreeWalk(File start, FileWalkDirection direction) {
        this(start, direction, null, null, null, 0, 32, null);
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(direction, "direction");
    }

    private FileTreeWalk(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function12, Function2 function2, int i) {
        this.start = file;
        this.direction = fileWalkDirection;
        this.onEnter = function1;
        this.onLeave = function12;
        this.onFail = function2;
        this.maxDepth = i;
    }

    /* synthetic */ FileTreeWalk(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function12, Function2 function2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i2 & 2) != 0 ? FileWalkDirection.TOP_DOWN : fileWalkDirection, function1, function12, function2, (i2 & 32) != 0 ? Integer.MAX_VALUE : i);
    }

    @Override // kotlin.sequences.Sequence
    public Iterator iterator() {
        return new FileTreeWalkIterator(this);
    }
}
