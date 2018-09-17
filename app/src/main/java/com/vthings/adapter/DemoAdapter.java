package com.vthings.adapter;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.vthings.entity.DemoResponse;
import com.vthings.R;

import java.util.ArrayList;

public class DemoAdapter extends RecyclerView.Adapter<DemoAdapter.Holder> {

    private Context mContext;

    private ArrayList<DemoResponse> mWhoDetailList = new ArrayList<>();

    public DemoAdapter(Context context, ArrayList<DemoResponse> whoDetailList) {
        mContext = context;
        mWhoDetailList = whoDetailList;

    }

    @NonNull
    @Override
    public DemoAdapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adap_demo_view, parent, false);
        return new DemoAdapter.Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final DemoAdapter.Holder holder, int position) {
//        final DemoResponse whoDetailEntity = mWhoDetailList.get(position);

    }


    @Override
    public int getItemCount() {
//        return mWhoDetailList.size();
    return  10;
    }

    public class Holder extends RecyclerView.ViewHolder {

        private ImageView mImg;

        public Holder(View itemView) {
            super(itemView);
            mImg=itemView.findViewById(R.id.user_img);
        }
    }
}
