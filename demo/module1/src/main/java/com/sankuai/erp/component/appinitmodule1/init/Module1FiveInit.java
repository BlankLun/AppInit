package com.sankuai.erp.component.appinitmodule1.init;

import com.lkl.flowcontrol.api.appinit.SimpleAppInit;
import com.lkl.flowcontrol.common.FlowLogger;
import com.sankuai.erp.component.appinit.common.AppInit;

@AppInit(priority = 20, description = "模块15的描述")
public class Module1FiveInit extends SimpleAppInit {
    @Override
    public void onCreate() {
        FlowLogger.demo("onCreate " + TAG);
    }
}
