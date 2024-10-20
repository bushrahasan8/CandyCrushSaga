package com.king.core;

import android.content.ClipboardManager;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import androidx.annotation.Keep;
import com.king.core.activityhelper.ActivityHelper;
import com.king.logging.Logging;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
@Keep
/* loaded from: SimpleInputConnection.class */
public class SimpleInputConnection extends BaseInputConnection {
    private static final String TAG = "SimpleInputConnection";
    private AtomicInteger mCachedCursorPosition;
    private EditableReplaceCallback mEditable;
    private ArrayList<EditableWatcher> mListeners;
    private NativeApplication mNativeApplication;
    private int mSdkVersion;
    private GameView mView;

    /* JADX INFO: Access modifiers changed from: private */
    @Keep
    /* loaded from: SimpleInputConnection$EditableReplaceCallback.class */
    public class EditableReplaceCallback extends SpannableStringBuilder {
        private SimpleInputConnection mInputConnection;
        final SimpleInputConnection this$0;

        public EditableReplaceCallback(SimpleInputConnection simpleInputConnection, SimpleInputConnection simpleInputConnection2) {
            this.this$0 = simpleInputConnection;
            this.mInputConnection = simpleInputConnection2;
        }

        @Override // android.text.SpannableStringBuilder, android.text.Editable
        public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
            if (charSequence.toString().equals("\n")) {
                this.this$0.sendKeyEvent(new KeyEvent(0, 66));
                return this;
            }
            super.replace(i, i2, charSequence, i3, i4);
            this.mInputConnection.onReplacedEditable();
            this.mInputConnection.updateCursorPosition(this.this$0.getCursorPosition());
            return this;
        }
    }

    public SimpleInputConnection(View view, boolean z) {
        super(view, z);
        this.mNativeApplication = null;
        this.mView = null;
        this.mSdkVersion = 0;
        this.mCachedCursorPosition = new AtomicInteger(0);
        this.mEditable = new EditableReplaceCallback(this, this);
        this.mView = (GameView) view;
        this.mSdkVersion = Build.VERSION.SDK_INT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCursorPosition() {
        return getTextBeforeCursor(Integer.MAX_VALUE, 0).length();
    }

    private void onActionDownKeyDeleteText() {
        if (getTextBeforeCursor(1, 0).length() > 0) {
            deleteSurroundingText(1, 0);
        }
    }

    private void onActionDownKeyHideKeyboard() {
        GameView gameView;
        Logging.logInfo(TAG, "Keyboard Submit");
        if (this.mNativeApplication == null || (gameView = this.mView) == null) {
            return;
        }
        gameView.queueEvent(new Runnable(this) { // from class: com.king.core.SimpleInputConnection.1
            final SimpleInputConnection this$0;

            {
                this.this$0 = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.this$0.mNativeApplication.onKeyboardSubmit();
                if (GameLib.shouldAutoHideKeyboardOnSubmit()) {
                    Logging.logInfo(SimpleInputConnection.TAG, "autoHideOnSubmit is true, hiding keyboard");
                    GameLib.hideKeyboard();
                }
            }
        });
    }

    private boolean onSendActionDownKeyEvent(KeyEvent keyEvent) {
        int unicodeChar;
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 21) {
            setCursorPosition(getCursorPosition() - 1);
            return true;
        }
        if (keyCode == 22) {
            setCursorPosition(getCursorPosition() + 1);
            return true;
        }
        if (keyCode != 50) {
            if (keyCode != 61) {
                if (keyCode == 62) {
                    commitText(String.valueOf(Character.toChars(keyEvent.getUnicodeChar(keyEvent.getMetaState()))), 1);
                    return true;
                }
                if (keyCode != 66) {
                    if (keyCode == 67) {
                        onActionDownKeyDeleteText();
                        return true;
                    }
                }
            }
            onActionDownKeyHideKeyboard();
            return true;
        }
        if (this.mSdkVersion >= 11 && keyEvent.isCtrlPressed()) {
            Logging.logInfo(TAG, "got ctrl-V, pasting");
            handlePaste();
            return true;
        }
        if (!keyEvent.isPrintingKey() || (unicodeChar = keyEvent.getUnicodeChar(keyEvent.getMetaState())) == 0) {
            return false;
        }
        commitText(String.valueOf(Character.toChars(unicodeChar)), 1);
        return true;
    }

    private void onSendActionUpKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 111 || keyCode == 4) {
            Logging.logInfo(TAG, "going to hide keyboard");
            GameLib.hideKeyboard();
        }
    }

    public void addEditableChangedListener(EditableWatcher editableWatcher) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
        }
        this.mListeners.add(editableWatcher);
    }

    public int getCachedCursorPosition() {
        return this.mCachedCursorPosition.get();
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public Editable getEditable() {
        Logging.logWarning(TAG, "getEditable: " + ((Object) this.mEditable));
        return this.mEditable;
    }

    int getTextLength() {
        return this.mEditable.toString().length();
    }

    public void handlePaste() {
        ClipboardManager clipboardManager = (ClipboardManager) ActivityHelper.getInstance().getActivity().getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip() && clipboardManager.getPrimaryClipDescription().hasMimeType("text/plain")) {
            String charSequence = clipboardManager.getPrimaryClip().getItemAt(0).getText().toString();
            int cursorPosition = getCursorPosition();
            int length = charSequence.length();
            commitText(charSequence, charSequence.length());
            setCursorPosition(cursorPosition + length);
        }
    }

    public void onReplacedEditable() {
        sendOnEditableChanged(this.mEditable.toString());
    }

    public void removeEditableChangedListener(EditableWatcher editableWatcher) {
        int indexOf;
        ArrayList<EditableWatcher> arrayList = this.mListeners;
        if (arrayList == null || (indexOf = arrayList.indexOf(editableWatcher)) < 0) {
            return;
        }
        this.mListeners.remove(indexOf);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        String str = TAG;
        Logging.logInfo(str, "keyEvent: " + keyEvent.getAction() + " " + keyEvent.getKeyCode() + " " + keyEvent.getUnicodeChar(keyEvent.getMetaState()));
        if (!GameLib.isKeyboardShowing()) {
            Logging.logInfo(str, "Keyboard is Hidden, forward event to system");
            return super.sendKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0 && onSendActionDownKeyEvent(keyEvent)) {
            return true;
        }
        if (keyEvent.getAction() != 1) {
            return false;
        }
        onSendActionUpKeyEvent(keyEvent);
        return true;
    }

    void sendOnEditableChanged(CharSequence charSequence) {
        ArrayList<EditableWatcher> arrayList = this.mListeners;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList.get(i).onEditableChanged(charSequence);
            }
        }
    }

    public void setCursorPosition(int i) {
        Logging.logInfo(TAG, "Setting cursor position: " + i);
        if (i < 0 || i > getTextLength()) {
            return;
        }
        setSelection(i, i);
        updateCursorPosition(i);
        sendOnEditableChanged(this.mEditable.toString());
    }

    public void setNativeApplication(NativeApplication nativeApplication) {
        this.mNativeApplication = nativeApplication;
    }

    public void updateCursorPosition(int i) {
        this.mCachedCursorPosition.set(i);
    }
}
