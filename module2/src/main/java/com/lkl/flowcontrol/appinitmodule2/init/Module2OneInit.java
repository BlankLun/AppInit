package com.lkl.flowcontrol.appinitmodule2.init;

import com.lkl.flowcontrol.api.appinit.SimpleAppInit;
import com.lkl.flowcontrol.common.FlowLogger;
import com.lkl.flowcontrol.common.appinit.AppInit;
import com.lkl.flowcontrol.common.appinit.Process;

@AppInit(process = Process.ALL, priority = 80, description = "模块21的描述")
public class Module2OneInit extends SimpleAppInit {
    @Override
    public boolean needAsyncInit() {
        return true;
    }

    @Override
    public void onCreate() {
        FlowLogger.demo("onCreate " + TAG);
    }

    @Override
    public void asyncOnCreate() {
        FlowLogger.demo("asyncOnCreate " + TAG);
    }
}
