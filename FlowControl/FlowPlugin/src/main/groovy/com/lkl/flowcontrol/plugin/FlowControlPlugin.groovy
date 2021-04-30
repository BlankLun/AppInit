package com.lkl.flowcontrol.plugin

import com.lkl.flowcontrol.plugin.appinit.AppInitExtension
import com.lkl.flowcontrol.common.FlowLogger
import com.lkl.flowcontrol.common.ModuleConsts

/**
 * 「流程控制」插件
 */
class FlowControlPlugin extends BaseAptPlugin {
    private static final String VERSION_NAME = "1.0.7"

    @Override
    protected void handleMasterModule() {
        FlowLogger.sLogger = new Logger(mProject)
        // 创建plugin扩展配置
        mProject.extensions.create('appInit', AppInitExtension)
        // 注册流程控制执行的Transform
        mProject.android.registerTransform(new FlowControlAsmTransform(mProject))
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