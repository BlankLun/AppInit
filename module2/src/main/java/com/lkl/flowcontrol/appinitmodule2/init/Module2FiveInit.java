package com.lkl.flowcontrol.appinitmodule2.init;

import com.lkl.flowcontrol.api.appinit.SimpleAppInit;
import com.lkl.flowcontrol.common.FlowLogger;
import com.lkl.flowcontrol.common.appinit.AppInit;

@AppInit(priority = 10, description = "模块25的描述")
public class Module2FiveInit extends SimpleAppInit {

    @Override
    public void onCreate() {
        FlowLogger.demo("onCreate " + TAG);
    }
}
