package com.lkl.flowcontrol.plugin

import com.lkl.flowcontrol.plugin.appinit.AppInitAsmTransform
import com.lkl.flowcontrol.plugin.appinit.AppInitExtension
import com.lkl.flowcontrol.common.FlowLogger
import com.lkl.flowcontrol.common.ModuleConsts

/**
 * 「app 初始化、多模块初始化」插件
 */
class FlowControlPlugin extends BaseAptPlugin {
    private static final String VERSION_NAME = "1.0.6"

    @Override
    protected void handleMasterModule() {
        FlowLogger.sLogger = new Logger(mProject)
        mProject.extensions.create('appInit', AppInitExtension)

        mProject.android.registerTransform(new AppInitAsmTransform(mProject))
    }

    @Override
    protected String getAptDebugKey() {
        // gradle.properties 中添加该属性来配置是否处于调试 apt 模式
        return "DEBUG_FLOW_CONTROL_APT"
    }

    @Override
    protected String getApiPomArtifactId() {
        return "flow-api"
    }

    @Override
    protected String getCompilerPomArtifactId() {
        return "flow-compiler"
    }

    @Override
    protected String getPomVersionName() {
        return VERSION_NAME
    }

    @Override
    protected String getAptModuleCoordinateKey() {
        return ModuleConsts.APT_MODULE_COORDINATE_KEY
    }

    @Override
    protected String getAptDependenciesKey() {
        return ModuleConsts.APT_DEPENDENCIES_KEY
    }
}