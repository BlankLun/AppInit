package com.lkl.flowcontrol.appinitmodule1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sankuai.waimai.router.Router;
import com.sankuai.waimai.router.annotation.RouterService;

@RouterService(interfaces = Fragment.class, key = "fragment1")
public class Module1Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_module1, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        getView().findViewById(R.id.btn_go).setOnClickListener(v -> {
            Router.startUri(getContext(), "/module1");
            getActivity().finish();
        });
    }
}
