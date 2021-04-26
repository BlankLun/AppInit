package com.sankuai.erp.component.appinitmodule3.init;

import com.lkl.flowcontrol.api.appinit.SimpleAppInit;
import com.lkl.flowcontrol.common.FlowLogger;
import com.sankuai.erp.component.appinit.common.AppInit;

@AppInit(priority = 10, description = "模块34的描述")
public class Module3FourInit extends SimpleAppInit {

    @Override
    public void onCreate() {
        FlowLogger.demo("onCreate " + TAG);
    }
}
