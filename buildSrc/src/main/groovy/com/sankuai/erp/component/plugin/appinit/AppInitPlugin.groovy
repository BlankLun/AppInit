package com.sankuai.erp.component.plugin.appinit

import com.sankuai.erp.component.appinit.common.AppInitLogger
import com.sankuai.erp.component.appinit.common.ModuleConsts

/**
 * 「app 初始化、多模块初始化」插件
 */
class AppInitPlugin extends BaseAptPlugin {
    private static final String VERSION_NAME = "1.0.5"

    @Override
    protected void handleMasterModule() {
        AppInitLogger.sLogger = new Logger(mProject)
        mProject.extensions.create('appInit', AppInitExtension)

//        mProject.android.registerTransform(new AppInitJavassistTransform(mProject))
        mProject.android.registerTransform(new AppInitAsmTransform(mProject))
    }

    @Override
    protected String getAptDebugKey() {
        // gradle.properties 中添加该属性来配置是否处于调试 apt 模式
        return "DEBUG_APP_INIT_APT"
    }

    @Override
    protected String getApiPomArtifactId() {
        return "appinit-api"
    }

    @Override
    protected String getCompilerPomArtifactId() {
        return "appinit-compiler"
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