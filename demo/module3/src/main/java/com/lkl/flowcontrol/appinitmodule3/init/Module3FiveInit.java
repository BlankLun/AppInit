package com.lkl.flowcontrol.appinitmodule3.init;

import com.lkl.flowcontrol.api.appinit.SimpleAppInit;
import com.lkl.flowcontrol.common.FlowLogger;
import com.lkl.flowcontrol.common.appinit.AppInit;

@AppInit(priority = 5, description = "模块35的描述", onlyForDebug = true)
public class Module3FiveInit extends SimpleAppInit {

    @Override
    public void onCreate() {
        FlowLogger.demo("onCreate " + TAG);
    }
}
