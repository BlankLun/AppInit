package com.sankuai.erp.component.appinitmodule1.init

import com.lkl.flowcontrol.api.appinit.SimpleAppInit
import com.lkl.flowcontrol.common.appinit.AppInit
import com.lkl.flowcontrol.common.FlowLogger

/**
 * 作者:王浩
 * 创建时间:2018/11/28
 * 描述:
 */
@AppInit(priority = 100, aheadOf = "com.lkl.flowcontrol:appinit-test-module1:Module1TwoInit", description = "模块11的描述")
class Module1OneInit : SimpleAppInit() {

    override fun onCreate() {
        FlowLogger.demo("onCreate $TAG")
    }
}