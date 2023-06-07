package com.paparazziteam.mapshuaweidemo

import android.app.Application
import com.huawei.hms.maps.MapsInitializer

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        MapsInitializer
            .setApiKey("DAEDALN7DDYzJ6sPsdsHcuzwPFzXOW6hfN7yDW1FlUOksJH4ZMzvhs68QT/2WwLY0ejvJBPJsiTKLpEk5x/zkoF0rCxSsIOS9y7WdA==")

    }
}