package com.google.zxing;

import com.google.zxing.common.BitMatrix;
import java.util.Map;

/* loaded from: Writer.class */
public interface Writer {
    BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map map);
}
