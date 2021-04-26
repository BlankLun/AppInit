package com.sankuai.erp.component.appinitmodule2.init;

import com.lkl.flowcontrol.api.appinit.SimpleAppInit;
import com.lkl.flowcontrol.common.FlowLogger;
import com.sankuai.erp.component.appinit.common.AppInit;

@AppInit(priority = 80, description = "模块23的描述")
public class Module2ThreeInit extends SimpleAppInit {

    @Override
    public void onCreate() {
        FlowLogger.demo("onCreate " + TAG);
    }
}
