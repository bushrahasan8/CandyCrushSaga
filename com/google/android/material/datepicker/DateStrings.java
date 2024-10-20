package com.google.android.material.datepicker;

import android.os.Build;
import android.text.format.DateUtils;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: DateStrings.class */
public abstract class DateStrings {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getMonthDayOfWeekDay(long j) {
        return getMonthDayOfWeekDay(j, Locale.getDefault());
    }

    static String getMonthDayOfWeekDay(long j, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT < 24) {
            return UtcDates.getFullFormat(locale).format(new Date(j));
        }
        format = UtcDates.getAbbrMonthWeekdayDayFormat(locale).format(new Date(j));
        return format;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getYearMonth(long j) {
        return DateUtils.formatDateTime(null, j, 8228);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getYearMonthDayOfWeekDay(long j) {
        return getYearMonthDayOfWeekDay(j, Locale.getDefault());
    }

    static String getYearMonthDayOfWeekDay(long j, Locale locale) {
        String format;
        if (Build.VERSION.SDK_INT < 24) {
            return UtcDates.getFullFormat(locale).format(new Date(j));
        }
        format = UtcDates.getYearAbbrMonthWeekdayDayFormat(locale).format(new Date(j));
        return format;
    }
}
