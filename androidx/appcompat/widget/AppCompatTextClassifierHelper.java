package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.util.Preconditions;

/* loaded from: AppCompatTextClassifierHelper.class */
final class AppCompatTextClassifierHelper {
    private TextClassifier mTextClassifier;
    private TextView mTextView;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: AppCompatTextClassifierHelper$Api26Impl.class */
    public static final abstract class Api26Impl {
        static TextClassifier getTextClassifier(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    public AppCompatTextClassifierHelper(TextView textView) {
        this.mTextView = (TextView) Preconditions.checkNotNull(textView);
    }

    public TextClassifier getTextClassifier() {
        TextClassifier textClassifier = this.mTextClassifier;
        TextClassifier textClassifier2 = textClassifier;
        if (textClassifier == null) {
            textClassifier2 = Api26Impl.getTextClassifier(this.mTextView);
        }
        return textClassifier2;
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        this.mTextClassifier = textClassifier;
    }
}
