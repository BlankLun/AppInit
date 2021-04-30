package com.lkl.flowcontrol.common;

/**
 * 作者:王浩
 * 创建时间:2018/1/18
 * 描述:
 */
public interface ModuleConsts {
    // 该库对应的 apt 模块坐标参数 key
    String APT_MODULE_COORDINATE_KEY = "AppInitAptModuleCoordinate";
    // 该库对应的 apt 模块依赖参数 key
    String APT_DEPENDENCIES_KEY = "APP_INIT_DEPENDENCIES";

    String PACKAGE_NAME_PRE = "com.lkl.flowcontrol";
    String DOT = ".";

    String PACKAGE_NAME_GENERATED_APP_INIT = PACKAGE_NAME_PRE + DOT + "appinit.generated";
    String PACKAGE_NAME_GENERATED_APP_INIT_SLASH = PACKAGE_NAME_GENERATED_APP_INIT.replace('.', '/');

    String PACKAGE_NAME_COMMON = PACKAGE_NAME_PRE + DOT + "common";
    String PACKAGE_NAME_COMMON_SLASH = PACKAGE_NAME_COMMON.replace('.', '/');

    String PACKAGE_NAME_API = PACKAGE_NAME_PRE + DOT + "api";
    String PACKAGE_NAME_API_SLASH = PACKAGE_NAME_API.replace('.', '/');

    String PACKAGE_NAME_API_APP_INIT = PACKAGE_NAME_API + DOT + "appinit";
    String APP_INIT_MANAGER = "AppInitManager";
    String APP_INIT_MANAGER_CANONICAL_NAME = PACKAGE_NAME_API_APP_INIT + DOT + APP_INIT_MANAGER;
    String APP_INIT_MANAGER_SLASH = APP_INIT_MANAGER_CANONICAL_NAME.replace('.', '/');

    String PACKAGE_NAME_COMMON_APP_INIT = PACKAGE_NAME_COMMON + DOT + "appinit";
    String APP_INIT_ITEM = "AppInitItem";
    String APP_INIT_ITEM_CANONICAL_NAME = PACKAGE_NAME_COMMON_APP_INIT + DOT + APP_INIT_ITEM;
    String APP_INIT_ITEM_SLASH = APP_INIT_ITEM_CANONICAL_NAME.replace('.', '/');

    String APP_INIT_INTERFACE = PACKAGE_NAME_COMMON_APP_INIT + DOT + "IAppInit";
    String APP_INIT_INTERFACE_SLASH = APP_INIT_INTERFACE.replace('.', '/');

    String CHILD_INIT_TABLE_SUFFIX = "ChildInitTable";
    String CHILD_INIT_TABLE_CANONICAL_NAME = PACKAGE_NAME_COMMON_APP_INIT + DOT + CHILD_INIT_TABLE_SUFFIX;

    String FIELD_INJECT_ABORT_ON_NOT_EXIST = "mAbortOnNotExist";
    String METHOD_INJECT_CHILD_INIT_TABLE_LIST = "injectChildInitTableList";
    String METHOD_INJECT_APP_INIT_ITEM_LIST = "injectAppInitItemList";
}
