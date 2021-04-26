package com.sankuai.erp.component.appinitmodule3;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

import com.lkl.flowcontrol.common.FlowLogger;

/**
 * 作者:王浩
 * 创建时间:2018/10/25
 * 描述:
 */
public class Module3Service extends Service {

    @Override
    public void onCreate() {
        super.onCreate();
        FlowLogger.demo("Module3Service onCreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        FlowLogger.demo("Module3Service onStartCommand");
        return START_STICKY;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
