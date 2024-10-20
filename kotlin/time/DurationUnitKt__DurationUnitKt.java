package kotlin.time;

import com.onetrust.otpublishers.headless.Public.OTCCPAGeolocationConstants;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: DurationUnitKt__DurationUnitKt.class */
abstract class DurationUnitKt__DurationUnitKt extends DurationUnitKt__DurationUnitJvmKt {
    public static final DurationUnit durationUnitByIsoChar(char c, boolean z) {
        DurationUnit durationUnit;
        if (z) {
            if (c == 'H') {
                durationUnit = DurationUnit.HOURS;
            } else if (c == 'M') {
                durationUnit = DurationUnit.MINUTES;
            } else {
                if (c != 'S') {
                    throw new IllegalArgumentException("Invalid duration ISO time unit: " + c);
                }
                durationUnit = DurationUnit.SECONDS;
            }
        } else {
            if (c != 'D') {
                throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c);
            }
            durationUnit = DurationUnit.DAYS;
        }
        return durationUnit;
    }

    public static final DurationUnit durationUnitByShortName(String shortName) {
        DurationUnit durationUnit;
        Intrinsics.checkNotNullParameter(shortName, "shortName");
        int hashCode = shortName.hashCode();
        if (hashCode == 100) {
            if (shortName.equals("d")) {
                durationUnit = DurationUnit.DAYS;
                return durationUnit;
            }
            throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
        }
        if (hashCode == 104) {
            if (shortName.equals("h")) {
                durationUnit = DurationUnit.HOURS;
                return durationUnit;
            }
            throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
        }
        if (hashCode == 109) {
            if (shortName.equals("m")) {
                durationUnit = DurationUnit.MINUTES;
                return durationUnit;
            }
            throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
        }
        if (hashCode == 115) {
            if (shortName.equals("s")) {
                durationUnit = DurationUnit.SECONDS;
                return durationUnit;
            }
            throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
        }
        if (hashCode == 3494) {
            if (shortName.equals("ms")) {
                durationUnit = DurationUnit.MILLISECONDS;
                return durationUnit;
            }
            throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
        }
        if (hashCode == 3525) {
            if (shortName.equals("ns")) {
                durationUnit = DurationUnit.NANOSECONDS;
                return durationUnit;
            }
            throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
        }
        if (hashCode == 3742 && shortName.equals(OTCCPAGeolocationConstants.US)) {
            durationUnit = DurationUnit.MICROSECONDS;
            return durationUnit;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
    }
}
