package com.lkl.flowcontrol.appinitmodule3;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.sankuai.waimai.router.Router;
import com.sankuai.waimai.router.annotation.RouterUri;

@RouterUri(path = "/module3")
public class Module3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module3);

        Fragment topFragment = Router.getService(Fragment.class, "fragment1");
        if (topFragment != null) {
            getSupportFragmentManager().beginTransaction().add(R.id.fl_top, topFragment).commit();
        }
        Fragment bottomFragment = Router.getService(Fragment.class, "fragment2");
        if (bottomFragment != null) {
            getSupportFragmentManager().beginTransaction().add(R.id.fl_bottom, bottomFragment).commit();
        }
    }
}
