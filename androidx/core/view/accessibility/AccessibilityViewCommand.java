package androidx.core.view.accessibility;

import android.view.View;

/* loaded from: AccessibilityViewCommand.class */
public interface AccessibilityViewCommand {

    /* loaded from: AccessibilityViewCommand$CommandArguments.class */
    public static abstract class CommandArguments {
    }

    /* loaded from: AccessibilityViewCommand$MoveAtGranularityArguments.class */
    public static final abstract class MoveAtGranularityArguments extends CommandArguments {
    }

    /* loaded from: AccessibilityViewCommand$MoveHtmlArguments.class */
    public static final abstract class MoveHtmlArguments extends CommandArguments {
    }

    /* loaded from: AccessibilityViewCommand$MoveWindowArguments.class */
    public static final abstract class MoveWindowArguments extends CommandArguments {
    }

    /* loaded from: AccessibilityViewCommand$ScrollToPositionArguments.class */
    public static final abstract class ScrollToPositionArguments extends CommandArguments {
    }

    /* loaded from: AccessibilityViewCommand$SetProgressArguments.class */
    public static final abstract class SetProgressArguments extends CommandArguments {
    }

    /* loaded from: AccessibilityViewCommand$SetSelectionArguments.class */
    public static final abstract class SetSelectionArguments extends CommandArguments {
    }

    /* loaded from: AccessibilityViewCommand$SetTextArguments.class */
    public static final abstract class SetTextArguments extends CommandArguments {
    }

    boolean perform(View view, CommandArguments commandArguments);
}
