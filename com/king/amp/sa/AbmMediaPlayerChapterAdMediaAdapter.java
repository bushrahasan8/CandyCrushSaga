package com.king.amp.sa;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.king.abm.R$id;
import com.king.abm.R$layout;
import java.util.List;

/* loaded from: AbmMediaPlayerChapterAdMediaAdapter.class */
public class AbmMediaPlayerChapterAdMediaAdapter extends RecyclerView.Adapter {
    private final List images;
    private final AbmMediaPlayerActivity mActivity;

    /* loaded from: AbmMediaPlayerChapterAdMediaAdapter$ImageViewHolder.class */
    public static class ImageViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public ImageViewHolder(View view) {
            super(view);
            this.imageView = (ImageView) view.findViewById(R$id.chapter_image);
        }
    }

    public AbmMediaPlayerChapterAdMediaAdapter(List list, AbmMediaPlayerActivity abmMediaPlayerActivity) {
        this.images = list;
        this.mActivity = abmMediaPlayerActivity;
    }

    public int getItemCount() {
        return this.images.size();
    }

    public void onBindViewHolder(ImageViewHolder imageViewHolder, int i) {
        imageViewHolder.imageView.setImageDrawable((Drawable) this.images.get(i));
        imageViewHolder.imageView.setOnTouchListener(new View.OnTouchListener(this) { // from class: com.king.amp.sa.AbmMediaPlayerChapterAdMediaAdapter.1
            final AbmMediaPlayerChapterAdMediaAdapter this$0;

            {
                this.this$0 = this;
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                this.this$0.mActivity.pauseChapterScroll();
                return false;
            }
        });
    }

    public ImageViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new ImageViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.chapter_ad_item, viewGroup, false));
    }
}
