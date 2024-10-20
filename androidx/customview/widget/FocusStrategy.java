package androidx.customview.widget;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: FocusStrategy.class */
abstract class FocusStrategy {

    /* loaded from: FocusStrategy$BoundsAdapter.class */
    public interface BoundsAdapter {
        void obtainBounds(Object obj, Rect rect);
    }

    /* loaded from: FocusStrategy$CollectionAdapter.class */
    public interface CollectionAdapter {
        Object get(Object obj, int i);

        int size(Object obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: FocusStrategy$SequentialComparator.class */
    public static class SequentialComparator implements Comparator {
        private final BoundsAdapter mAdapter;
        private final boolean mIsLayoutRtl;
        private final Rect mTemp1 = new Rect();
        private final Rect mTemp2 = new Rect();

        SequentialComparator(boolean z, BoundsAdapter boundsAdapter) {
            this.mIsLayoutRtl = z;
            this.mAdapter = boundsAdapter;
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            Rect rect = this.mTemp1;
            Rect rect2 = this.mTemp2;
            this.mAdapter.obtainBounds(obj, rect);
            this.mAdapter.obtainBounds(obj2, rect2);
            int i = rect.top;
            int i2 = rect2.top;
            int i3 = -1;
            if (i < i2) {
                return -1;
            }
            if (i > i2) {
                return 1;
            }
            int i4 = rect.left;
            int i5 = rect2.left;
            if (i4 < i5) {
                if (this.mIsLayoutRtl) {
                    i3 = 1;
                }
                return i3;
            }
            if (i4 > i5) {
                if (!this.mIsLayoutRtl) {
                    i3 = 1;
                }
                return i3;
            }
            int i6 = rect.bottom;
            int i7 = rect2.bottom;
            if (i6 < i7) {
                return -1;
            }
            if (i6 > i7) {
                return 1;
            }
            int i8 = rect.right;
            int i9 = rect2.right;
            if (i8 < i9) {
                if (this.mIsLayoutRtl) {
                    i3 = 1;
                }
                return i3;
            }
            if (i8 <= i9) {
                return 0;
            }
            if (!this.mIsLayoutRtl) {
                i3 = 1;
            }
            return i3;
        }
    }

    private static boolean beamBeats(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean beamsOverlap = beamsOverlap(i, rect, rect2);
        boolean z = false;
        if (beamsOverlap(i, rect, rect3) || !beamsOverlap) {
            return false;
        }
        if (!isToDirectionOf(i, rect, rect3) || i == 17 || i == 66) {
            return true;
        }
        if (majorAxisDistance(i, rect, rect2) < majorAxisDistanceToFarEdge(i, rect, rect3)) {
            z = true;
        }
        return z;
    }

    private static boolean beamsOverlap(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            boolean z = false;
            if (rect2.right >= rect.left) {
                z = false;
                if (rect2.left <= rect.right) {
                    z = true;
                }
            }
            return z;
        }
        boolean z2 = false;
        if (rect2.bottom >= rect.top) {
            z2 = false;
            if (rect2.top <= rect.bottom) {
                z2 = true;
            }
        }
        return z2;
    }

    public static Object findNextFocusInAbsoluteDirection(Object obj, CollectionAdapter collectionAdapter, BoundsAdapter boundsAdapter, Object obj2, Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect2.offset(0, -(rect.height() + 1));
        }
        int size = collectionAdapter.size(obj);
        Rect rect3 = new Rect();
        Object obj3 = null;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj4 = collectionAdapter.get(obj, i2);
            if (obj4 != obj2) {
                boundsAdapter.obtainBounds(obj4, rect3);
                if (isBetterCandidate(i, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    obj3 = obj4;
                }
            }
        }
        return obj3;
    }

    public static Object findNextFocusInRelativeDirection(Object obj, CollectionAdapter collectionAdapter, BoundsAdapter boundsAdapter, Object obj2, int i, boolean z, boolean z2) {
        int size = collectionAdapter.size(obj);
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(collectionAdapter.get(obj, i2));
        }
        Collections.sort(arrayList, new SequentialComparator(z, boundsAdapter));
        if (i == 1) {
            return getPreviousFocusable(obj2, arrayList, z2);
        }
        if (i == 2) {
            return getNextFocusable(obj2, arrayList, z2);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    private static Object getNextFocusable(Object obj, ArrayList arrayList, boolean z) {
        int size = arrayList.size();
        int lastIndexOf = (obj == null ? -1 : arrayList.lastIndexOf(obj)) + 1;
        if (lastIndexOf < size) {
            return arrayList.get(lastIndexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    private static Object getPreviousFocusable(Object obj, ArrayList arrayList, boolean z) {
        int size = arrayList.size();
        int indexOf = (obj == null ? size : arrayList.indexOf(obj)) - 1;
        if (indexOf >= 0) {
            return arrayList.get(indexOf);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    private static int getWeightedDistanceFor(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    private static boolean isBetterCandidate(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean z = false;
        if (!isCandidate(rect, rect2, i)) {
            return false;
        }
        if (!isCandidate(rect, rect3, i) || beamBeats(i, rect, rect2, rect3)) {
            return true;
        }
        if (beamBeats(i, rect, rect3, rect2)) {
            return false;
        }
        if (getWeightedDistanceFor(majorAxisDistance(i, rect, rect2), minorAxisDistance(i, rect, rect2)) < getWeightedDistanceFor(majorAxisDistance(i, rect, rect3), minorAxisDistance(i, rect, rect3))) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r4.bottom <= r0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        if (r4.right <= r0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a7, code lost:
    
        if (r4.top >= r0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d7, code lost:
    
        if (r4.left >= r0) goto L91;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean isCandidate(android.graphics.Rect r4, android.graphics.Rect r5, int r6) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.FocusStrategy.isCandidate(android.graphics.Rect, android.graphics.Rect, int):boolean");
    }

    private static boolean isToDirectionOf(int i, Rect rect, Rect rect2) {
        boolean z = false;
        if (i == 17) {
            boolean z2 = false;
            if (rect.left >= rect2.right) {
                z2 = true;
            }
            return z2;
        }
        if (i == 33) {
            if (rect.top >= rect2.bottom) {
                z = true;
            }
            return z;
        }
        if (i == 66) {
            boolean z3 = false;
            if (rect.right <= rect2.left) {
                z3 = true;
            }
            return z3;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        boolean z4 = false;
        if (rect.bottom <= rect2.top) {
            z4 = true;
        }
        return z4;
    }

    private static int majorAxisDistance(int i, Rect rect, Rect rect2) {
        return Math.max(0, majorAxisDistanceRaw(i, rect, rect2));
    }

    private static int majorAxisDistanceRaw(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return i2 - i3;
    }

    private static int majorAxisDistanceToFarEdge(int i, Rect rect, Rect rect2) {
        return Math.max(1, majorAxisDistanceToFarEdgeRaw(i, rect, rect2));
    }

    private static int majorAxisDistanceToFarEdgeRaw(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.top;
        } else if (i == 66) {
            i2 = rect2.right;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.bottom;
            i3 = rect.bottom;
        }
        return i2 - i3;
    }

    private static int minorAxisDistance(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
