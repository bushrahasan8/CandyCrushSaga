package com.google.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: TextFormatEscaper.class */
public final class TextFormatEscaper {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: TextFormatEscaper$ByteSequence.class */
    public interface ByteSequence {
        byte byteAt(int i);

        int size();
    }

    private TextFormatEscaper() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String escapeBytes(ByteString byteString) {
        return escapeBytes(new ByteSequence(byteString) { // from class: com.google.protobuf.TextFormatEscaper.1
            final ByteString val$input;

            {
                this.val$input = byteString;
            }

            @Override // com.google.protobuf.TextFormatEscaper.ByteSequence
            public byte byteAt(int i) {
                return this.val$input.byteAt(i);
            }

            @Override // com.google.protobuf.TextFormatEscaper.ByteSequence
            public int size() {
                return this.val$input.size();
            }
        });
    }

    static String escapeBytes(ByteSequence byteSequence) {
        StringBuilder sb = new StringBuilder(byteSequence.size());
        for (int i = 0; i < byteSequence.size(); i++) {
            byte byteAt = byteSequence.byteAt(i);
            if (byteAt == 34) {
                sb.append("\\\"");
            } else if (byteAt == 39) {
                sb.append("\\'");
            } else if (byteAt != 92) {
                switch (byteAt) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (byteAt < 32 || byteAt > 126) {
                            sb.append('\\');
                            sb.append((char) (((byteAt >>> 6) & 3) + 48));
                            sb.append((char) (((byteAt >>> 3) & 7) + 48));
                            sb.append((char) ((byteAt & 7) + 48));
                            break;
                        } else {
                            sb.append((char) byteAt);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    static String escapeBytes(byte[] bArr) {
        return escapeBytes(new ByteSequence(bArr) { // from class: com.google.protobuf.TextFormatEscaper.2
            final byte[] val$input;

            {
                this.val$input = bArr;
            }

            @Override // com.google.protobuf.TextFormatEscaper.ByteSequence
            public byte byteAt(int i) {
                return this.val$input[i];
            }

            @Override // com.google.protobuf.TextFormatEscaper.ByteSequence
            public int size() {
                return this.val$input.length;
            }
        });
    }

    static String escapeDoubleQuotesAndBackslashes(String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String escapeText(String str) {
        return escapeBytes(ByteString.copyFromUtf8(str));
    }
}
