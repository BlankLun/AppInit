package com.sankuai.erp.component.appinitmodule3.init

import com.lkl.flowcontrol.api.appinit.SimpleAppInit
import com.lkl.flowcontrol.common.appinit.AppInit
import com.lkl.flowcontrol.common.FlowLogger

/**
 * 作者:王浩
 * 创建时间:2018/11/28
 * 描述:
 */
@AppInit(priority = 50, description = "模块33的描述")
class Module3ThreeInit : SimpleAppInit() {

    override fun onCreate() {
        FlowLogger.demo("onCreate $TAG")
    }
}