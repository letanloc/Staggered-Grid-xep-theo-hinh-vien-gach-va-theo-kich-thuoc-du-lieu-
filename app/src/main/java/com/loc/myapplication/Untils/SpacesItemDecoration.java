package com.loc.myapplication.Untils;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by loc on 06/12/2015.
 */
// tạo ra khoản trống
public class SpacesItemDecoration extends RecyclerView.ItemDecoration {
    // khoản trắng
    private int mspare;
    // truyền khoản cách cần
    public SpacesItemDecoration(int s) {
        this.mspare = s;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);

        outRect.left=mspare;
        outRect.right=mspare;
        outRect.bottom=mspare;
        outRect.top=mspare;
//        outRect.left=mspare;

        // giá trị con không có
        if(parent.getChildAdapterPosition(view)==0){
            outRect.top=mspare;

        }


    }
}
