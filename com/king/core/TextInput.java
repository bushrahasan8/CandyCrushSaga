package com.king.core;

import androidx.annotation.Keep;

@Keep
/* loaded from: TextInput.class */
public class TextInput {

    /* renamed from: com.king.core.TextInput$1, reason: invalid class name */
    /* loaded from: TextInput$1.class */
    static abstract /* synthetic */ class AnonymousClass1 {
        static final int[] $SwitchMap$com$king$core$TextInput$KeyboardType;
        static final int[] $SwitchMap$com$king$core$TextInput$ReturnKey;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:51:0x008f
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
            	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
            */
        static {
            /*
                com.king.core.TextInput$ReturnKey[] r0 = com.king.core.TextInput.ReturnKey.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.king.core.TextInput.AnonymousClass1.$SwitchMap$com$king$core$TextInput$ReturnKey = r0
                r0 = r4
                com.king.core.TextInput$ReturnKey r1 = com.king.core.TextInput.ReturnKey.RETURN_KEY_DONE     // Catch: java.lang.NoSuchFieldError -> L77
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L77
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L77
            L14:
                int[] r0 = com.king.core.TextInput.AnonymousClass1.$SwitchMap$com$king$core$TextInput$ReturnKey     // Catch: java.lang.NoSuchFieldError -> L77 java.lang.NoSuchFieldError -> L7b
                com.king.core.TextInput$ReturnKey r1 = com.king.core.TextInput.ReturnKey.RETURN_KEY_GO     // Catch: java.lang.NoSuchFieldError -> L7b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7b
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7b
            L1f:
                int[] r0 = com.king.core.TextInput.AnonymousClass1.$SwitchMap$com$king$core$TextInput$ReturnKey     // Catch: java.lang.NoSuchFieldError -> L7b java.lang.NoSuchFieldError -> L7f
                com.king.core.TextInput$ReturnKey r1 = com.king.core.TextInput.ReturnKey.RETURN_KEY_NEXT     // Catch: java.lang.NoSuchFieldError -> L7f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L7f
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L7f
            L2a:
                int[] r0 = com.king.core.TextInput.AnonymousClass1.$SwitchMap$com$king$core$TextInput$ReturnKey     // Catch: java.lang.NoSuchFieldError -> L7f java.lang.NoSuchFieldError -> L83
                com.king.core.TextInput$ReturnKey r1 = com.king.core.TextInput.ReturnKey.RETURN_KEY_SEARCH     // Catch: java.lang.NoSuchFieldError -> L83
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L83
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L83
            L35:
                int[] r0 = com.king.core.TextInput.AnonymousClass1.$SwitchMap$com$king$core$TextInput$ReturnKey     // Catch: java.lang.NoSuchFieldError -> L83 java.lang.NoSuchFieldError -> L87
                com.king.core.TextInput$ReturnKey r1 = com.king.core.TextInput.ReturnKey.RETURN_KEY_SEND     // Catch: java.lang.NoSuchFieldError -> L87
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L87
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L87
            L40:
                int[] r0 = com.king.core.TextInput.AnonymousClass1.$SwitchMap$com$king$core$TextInput$ReturnKey     // Catch: java.lang.NoSuchFieldError -> L87 java.lang.NoSuchFieldError -> L8b
                com.king.core.TextInput$ReturnKey r1 = com.king.core.TextInput.ReturnKey.RETURN_KEY_DEFAULT     // Catch: java.lang.NoSuchFieldError -> L8b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8b
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L8b
            L4c:
                com.king.core.TextInput$KeyboardType[] r0 = com.king.core.TextInput.KeyboardType.values()     // Catch: java.lang.NoSuchFieldError -> L8b
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.king.core.TextInput.AnonymousClass1.$SwitchMap$com$king$core$TextInput$KeyboardType = r0
                r0 = r4
                com.king.core.TextInput$KeyboardType r1 = com.king.core.TextInput.KeyboardType.KEYBOARD_TYPE_EMAIL_ADDRESS     // Catch: java.lang.NoSuchFieldError -> L8f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8f
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L8f
            L60:
                int[] r0 = com.king.core.TextInput.AnonymousClass1.$SwitchMap$com$king$core$TextInput$KeyboardType     // Catch: java.lang.NoSuchFieldError -> L8f java.lang.NoSuchFieldError -> L93
                com.king.core.TextInput$KeyboardType r1 = com.king.core.TextInput.KeyboardType.KEYBOARD_TYPE_NUMERIC     // Catch: java.lang.NoSuchFieldError -> L93
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L93
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L93
            L6b:
                int[] r0 = com.king.core.TextInput.AnonymousClass1.$SwitchMap$com$king$core$TextInput$KeyboardType     // Catch: java.lang.NoSuchFieldError -> L93 java.lang.NoSuchFieldError -> L97
                com.king.core.TextInput$KeyboardType r1 = com.king.core.TextInput.KeyboardType.KEYBOARD_TYPE_NORMAL     // Catch: java.lang.NoSuchFieldError -> L97
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L97
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L97
            L76:
                return
            L77:
                r4 = move-exception
                goto L14
            L7b:
                r4 = move-exception
                goto L1f
            L7f:
                r4 = move-exception
                goto L2a
            L83:
                r4 = move-exception
                goto L35
            L87:
                r4 = move-exception
                goto L40
            L8b:
                r4 = move-exception
                goto L4c
            L8f:
                r4 = move-exception
                goto L60
            L93:
                r4 = move-exception
                goto L6b
            L97:
                r4 = move-exception
                goto L76
            */
            throw new UnsupportedOperationException("Method not decompiled: com.king.core.TextInput.AnonymousClass1.m6175clinit():void");
        }
    }

    @Keep
    /* loaded from: TextInput$KeyboardType.class */
    public enum KeyboardType {
        KEYBOARD_TYPE_NORMAL(0),
        KEYBOARD_TYPE_EMAIL_ADDRESS(1),
        KEYBOARD_TYPE_NUMERIC(2);

        private final int mId;

        KeyboardType(int i) {
            this.mId = i;
        }

        public static KeyboardType fromId(int i) {
            for (KeyboardType keyboardType : values()) {
                if (keyboardType.getId() == i) {
                    return keyboardType;
                }
            }
            return KEYBOARD_TYPE_NORMAL;
        }

        public static int toMaskField(KeyboardType keyboardType, boolean z) {
            int i;
            int i2 = AnonymousClass1.$SwitchMap$com$king$core$TextInput$KeyboardType[keyboardType.ordinal()];
            if (i2 != 1) {
                i = 2;
                if (i2 != 2) {
                    i = z ? 129 : 145;
                }
            } else {
                i = 33;
            }
            return 524288 | i;
        }

        public int getId() {
            return this.mId;
        }
    }

    @Keep
    /* loaded from: TextInput$ReturnKey.class */
    public enum ReturnKey {
        RETURN_KEY_DEFAULT(0),
        RETURN_KEY_DONE(1),
        RETURN_KEY_GO(2),
        RETURN_KEY_NEXT(3),
        RETURN_KEY_SEARCH(4),
        RETURN_KEY_SEND(5);

        private final int mId;

        ReturnKey(int i) {
            this.mId = i;
        }

        public static ReturnKey fromId(int i) {
            for (ReturnKey returnKey : values()) {
                if (returnKey.getId() == i) {
                    return returnKey;
                }
            }
            return RETURN_KEY_DEFAULT;
        }

        public static int toImeAction(ReturnKey returnKey) {
            int i = AnonymousClass1.$SwitchMap$com$king$core$TextInput$ReturnKey[returnKey.ordinal()];
            if (i == 1) {
                return 6;
            }
            int i2 = 2;
            if (i != 2) {
                i2 = 5;
                if (i != 3) {
                    if (i != 4) {
                        return i != 5 ? 0 : 4;
                    }
                    return 3;
                }
            }
            return i2;
        }

        public int getId() {
            return this.mId;
        }
    }
}
