package com.example.androiddiceapppractice;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class CategoryRecyclerViewHolder extends RecyclerView.ViewHolder {

    private TextView txtCatNo;
    private TextView txtCatName;
    private LinearLayout linearlayout;
    public CategoryRecyclerViewHolder(View view){
        super(view);
        txtCatNo=view.findViewById(R.id.txtview_cat_no);
        txtCatName=view.findViewById(R.id.txtview_cat_name);
        linearlayout=view.findViewById(R.id.linearlayout);
    }

    public TextView getTxtCatNo() {
        return txtCatNo;
    }

    public TextView getTxtCatName() {
        return txtCatName;
    }


    public LinearLayout getLinearlayout() {
        return linearlayout;
    }
}
