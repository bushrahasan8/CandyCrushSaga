package com.google.zxing.datamatrix.encoder;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: EdifactEncoder.class */
public final class EdifactEncoder implements Encoder {
    private static void encodeChar(char c, StringBuilder sb) {
        if (c >= ' ' && c <= '?') {
            sb.append(c);
        } else if (c < '@' || c > '^') {
            HighLevelEncoder.illegalCharacter(c);
        } else {
            sb.append((char) (c - '@'));
        }
    }

    private static String encodeToCodewords(CharSequence charSequence, int i) {
        int length = charSequence.length() - i;
        if (length == 0) {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        char charAt = charSequence.charAt(i);
        char c = 0;
        char charAt2 = length >= 2 ? charSequence.charAt(i + 1) : (char) 0;
        char charAt3 = length >= 3 ? charSequence.charAt(i + 2) : (char) 0;
        if (length >= 4) {
            c = charSequence.charAt(i + 3);
        }
        int i2 = (charAt << 18) + (charAt2 << '\f') + (charAt3 << 6) + c;
        char c2 = (char) ((i2 >> 16) & 255);
        char c3 = (char) ((i2 >> 8) & 255);
        char c4 = (char) (i2 & 255);
        StringBuilder sb = new StringBuilder(3);
        sb.append(c2);
        if (length >= 2) {
            sb.append(c3);
        }
        if (length >= 3) {
            sb.append(c4);
        }
        return sb.toString();
    }

    private static void handleEOD(EncoderContext encoderContext, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                encoderContext.signalEncoderChange(0);
                return;
            }
            boolean z = true;
            if (length == 1) {
                encoderContext.updateSymbolInfo();
                int dataCapacity = encoderContext.getSymbolInfo().getDataCapacity();
                int codewordCount = encoderContext.getCodewordCount();
                if (encoderContext.getRemainingCharacters() == 0 && dataCapacity - codewordCount <= 2) {
                    encoderContext.signalEncoderChange(0);
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i = length - 1;
            String encodeToCodewords = encodeToCodewords(charSequence, 0);
            if (!(!encoderContext.hasMoreCharacters()) || i > 2) {
                z = false;
            }
            boolean z2 = z;
            if (i <= 2) {
                encoderContext.updateSymbolInfo(encoderContext.getCodewordCount() + i);
                z2 = z;
                if (encoderContext.getSymbolInfo().getDataCapacity() - encoderContext.getCodewordCount() >= 3) {
                    encoderContext.updateSymbolInfo(encoderContext.getCodewordCount() + encodeToCodewords.length());
                    z2 = false;
                }
            }
            if (z2) {
                encoderContext.resetSymbolInfo();
                encoderContext.pos -= i;
            } else {
                encoderContext.writeCodewords(encodeToCodewords);
            }
        } finally {
            encoderContext.signalEncoderChange(0);
        }
    }

    @Override // com.google.zxing.datamatrix.encoder.Encoder
    public void encode(EncoderContext encoderContext) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!encoderContext.hasMoreCharacters()) {
                break;
            }
            encodeChar(encoderContext.getCurrentChar(), sb);
            encoderContext.pos++;
            if (sb.length() >= 4) {
                encoderContext.writeCodewords(encodeToCodewords(sb, 0));
                sb.delete(0, 4);
                if (HighLevelEncoder.lookAheadTest(encoderContext.getMessage(), encoderContext.pos, getEncodingMode()) != getEncodingMode()) {
                    encoderContext.signalEncoderChange(0);
                    break;
                }
            }
        }
        sb.append((char) 31);
        handleEOD(encoderContext, sb);
    }

    public int getEncodingMode() {
        return 4;
    }
}
