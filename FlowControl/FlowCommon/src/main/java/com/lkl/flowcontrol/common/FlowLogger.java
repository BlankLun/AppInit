package com.lkl.flowcontrol.common;

/**
 * 作者:王浩
 * 创建时间:2018/1/18
 * 描述:
 */
public final class FlowLogger {
    public static ILogger sLogger;

    private FlowLogger() {
    }

    private static boolean isNotDebug() {
        if (sLogger == null) {
            return true;
        }
        return !sLogger.isDebug();
    }

    public static void demo(String msg) {
        if (isNotDebug()) {
            return;
        }
        sLogger.demo(msg);
    }

    public static void d(String msg) {
        if (isNotDebug()) {
            return;
        }
        sLogger.d(msg);
    }

    public static void e(String msg) {
        if (isNotDebug()) {
            return;
        }
        sLogger.e(msg);
    }
}
