package com.sankuai.erp.component.appinitmodule2.init;

import com.lkl.flowcontrol.api.appinit.SimpleAppInit;
import com.sankuai.erp.component.appinit.common.AppInit;
import com.lkl.flowcontrol.common.FlowLogger;

@AppInit(priority = 10, description = "模块25的描述")
public class Module2FiveInit extends SimpleAppInit {

    @Override
    public void onCreate() {
        FlowLogger.demo("onCreate " + TAG);
    }
}
