package com.onlineapteka.expandablerecyclerview;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

public class ProductViewHolder extends ChildViewHolder {
    private CheckBox mTextView;
    public ProductViewHolder(View itemView) {
        super(itemView);
        mTextView = itemView.findViewById(R.id.product_text);
    }
    public void bind(Product product){
        mTextView.setText(product.name);
    }
}
