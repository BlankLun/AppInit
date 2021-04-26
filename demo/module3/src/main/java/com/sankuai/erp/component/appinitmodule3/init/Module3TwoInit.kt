package com.sankuai.erp.component.appinitmodule3.init

import com.lkl.flowcontrol.api.appinit.SimpleAppInit
import com.sankuai.erp.component.appinit.common.AppInit
import com.lkl.flowcontrol.common.FlowLogger

/**
 * 作者:王浩
 * 创建时间:2018/11/28
 * 描述:
 */
@AppInit(priority = 60, description = "模块32的描述", aheadOf = "com.sankuai.erp.component:appinit-test-module1:Module1OneInit")
class Module3TwoInit : SimpleAppInit() {
    override fun onCreate() {
        FlowLogger.demo("onCreate $TAG")
    }
}