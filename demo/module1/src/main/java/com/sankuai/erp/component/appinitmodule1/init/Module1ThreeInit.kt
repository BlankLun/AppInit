package com.sankuai.erp.component.appinitmodule1.init

import com.lkl.flowcontrol.api.appinit.SimpleAppInit
import com.lkl.flowcontrol.common.appinit.AppInit
import com.lkl.flowcontrol.common.FlowLogger

/**
 * 作者:王浩
 * 创建时间:2018/11/28
 * 描述:
 */
@AppInit(priority = 300, description = "模块13的描述")
class Module1ThreeInit : SimpleAppInit() {

    override fun onCreate() {
        FlowLogger.demo("onCreate $TAG")
    }
}