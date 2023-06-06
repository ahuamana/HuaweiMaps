package com.paparazziteam.mapshuaweidemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.huawei.hms.maps.HuaweiMap
import com.huawei.hms.maps.MapView
import com.huawei.hms.maps.MapsInitializer
import com.huawei.hms.maps.OnMapReadyCallback

class MainActivity : AppCompatActivity(), OnMapReadyCallback {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MapsInitializer
            .setApiKey("DAEDALN7DDYzJ6sPsdsHcuzwPFzXOW6hfN7yDW1FlUOksJH4ZMzvhs68QT/2WwLY0ejvJBPJsiTKLpEk5x/zkoF0rCxSsIOS9y7WdA==")


        val mMapView: MapView = findViewById(R.id.mapview_mapviewdemo)
        var mapViewBundle: Bundle? = null
        if (savedInstanceState != null) {
            mapViewBundle = savedInstanceState.getBundle("MapViewBundleKey")
        }
        mMapView.onCreate(mapViewBundle)
        mMapView.getMapAsync(this)

        /*MapsInitializer
            .initialize(this)*/
    }

    override fun onMapReady(p0: HuaweiMap?) {

    }
}