package com.onlineapteka.expandablerecyclerview;

import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

import static android.view.animation.Animation.RELATIVE_TO_SELF;

public class CompanyViewHolder extends GroupViewHolder {
    private TextView mTextView;
    private ImageView mImageView;
    public CompanyViewHolder(View itemView) {
        super(itemView);
        mTextView = itemView.findViewById(R.id.company_text);
        mImageView = itemView.findViewById(R.id.arrow_down_image);
    }
    public void bind(Company company){
        mTextView.setText(company.getTitle());
    }

    @Override
    public void expand() {
        animateExpand();
    }

    @Override
    public void collapse() {
        animateCollapse();
    }

    private void animateExpand() {
        RotateAnimation rotate =
                new RotateAnimation(360, 180, RELATIVE_TO_SELF,
                        0.5f, RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(300);
        rotate.setFillAfter(true);
        mImageView.setAnimation(rotate);
    }

    private void animateCollapse() {
        RotateAnimation rotate =
                new RotateAnimation(180, 360, RELATIVE_TO_SELF,
                        0.5f, RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(300);
        rotate.setFillAfter(true);
        mImageView.setAnimation(rotate);
    }
}
