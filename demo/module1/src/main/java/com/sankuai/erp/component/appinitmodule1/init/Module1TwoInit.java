package com.sankuai.erp.component.appinitmodule1.init;

import com.lkl.flowcontrol.api.appinit.SimpleAppInit;
import com.lkl.flowcontrol.common.FlowLogger;
import com.lkl.flowcontrol.common.appinit.AppInit;
import com.lkl.flowcontrol.common.appinit.Process;

@AppInit(process = Process.OTHER, priority = 90, description = "模块12的描述")
public class Module1TwoInit extends SimpleAppInit {

    @Override
    public void onCreate() {
        FlowLogger.demo("onCreate " + TAG);
    }
}
