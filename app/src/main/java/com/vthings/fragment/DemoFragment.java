package com.vthings.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.vthings.entity.DemoResponse;
import com.vthings.R;
import com.vthings.adapter.DemoAdapter;

import java.util.ArrayList;


public class DemoFragment extends Fragment {
    View mRootView;
    RecyclerView mRecyclerView;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.frag_recycler_list, container, false);
        initView();
        return mRootView;
    }

    private void initView() {
        mRecyclerView = mRootView.findViewById(R.id.recycler_view);
        ArrayList<DemoResponse> activityFeedLists=new ArrayList<>();
        setAdapter(activityFeedLists);

    }


    private void setAdapter(ArrayList<DemoResponse> activityFeedLists) {
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRecyclerView.setAdapter(new DemoAdapter(getActivity(), activityFeedLists));
    }


}
