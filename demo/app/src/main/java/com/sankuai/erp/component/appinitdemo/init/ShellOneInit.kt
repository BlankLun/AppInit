package com.sankuai.erp.component.appinitdemo.init

import com.lkl.flowcontrol.api.appinit.SimpleAppInit
import com.lkl.flowcontrol.common.appinit.AppInit
import com.lkl.flowcontrol.common.FlowLogger

/**
 * 作者:王浩
 * 创建时间:2018/11/28
 * 描述:
 */
@AppInit(priority = 0, description = "壳工程最先初始化服务")
class ShellOneInit : SimpleAppInit() {

    override fun onCreate() {
        FlowLogger.demo("onCreate $TAG")
    }
}