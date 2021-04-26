package com.sankuai.erp.component.appinitmodule2.init

import com.lkl.flowcontrol.api.appinit.SimpleAppInit
import com.lkl.flowcontrol.common.appinit.AppInit
import com.lkl.flowcontrol.common.FlowLogger

/**
 * 作者:王浩
 * 创建时间:2018/11/28
 * 描述:
 */
@AppInit(priority = 70, description = "模块22的描述")
class Module2TwoInit : SimpleAppInit() {

    override fun onCreate() {
        FlowLogger.demo("onCreate $TAG")
    }
}