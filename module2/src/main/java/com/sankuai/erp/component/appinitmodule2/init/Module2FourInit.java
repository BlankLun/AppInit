package com.sankuai.erp.component.appinitmodule2.init;

import com.lkl.flowcontrol.api.appinit.SimpleAppInit;
import com.lkl.flowcontrol.common.FlowLogger;
import com.sankuai.erp.component.appinit.common.AppInit;

@AppInit(priority = 40, aheadOf = "com.sankuai.erp.component:appinit-test-module3:Module3FourInit", description = "模块24的描述")
public class Module2FourInit extends SimpleAppInit {

    @Override
    public void onCreate() {
        FlowLogger.demo("onCreate " + TAG);
    }
}
