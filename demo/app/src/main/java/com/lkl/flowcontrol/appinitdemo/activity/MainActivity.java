package com.lkl.flowcontrol.appinitdemo.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.lkl.flowcontrol.api.appinit.AppInitManager;
import com.lkl.flowcontrol.appinitdemo.App;
import com.lkl.flowcontrol.appinitdemo.R;
import com.sankuai.waimai.router.Router;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView logTv = findViewById(R.id.tv_main_log);
        App app = (App) AppInitManager.get().getApplication();
        logTv.setText(app.getInitLogInfo());

        Fragment topFragment = Router.getService(Fragment.class, "fragment1");
        if (topFragment != null) {
            getSupportFragmentManager().beginTransaction().add(R.id.fl_top, topFragment).commit();
        }
        Fragment centerFragment = Router.getService(Fragment.class, "fragment2");
        if (centerFragment != null) {
            getSupportFragmentManager().beginTransaction().add(R.id.fl_center, centerFragment).commit();
        }
        Fragment bottomFragment = Router.getService(Fragment.class, "fragment3");
        if (bottomFragment != null) {
            getSupportFragmentManager().beginTransaction().add(R.id.fl_bottom, bottomFragment).commit();
        }
    }
}
