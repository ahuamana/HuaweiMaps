package com.paparazziteam.mapshuaweidemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.huawei.agconnect.AGCRoutePolicy
import com.huawei.hms.maps.HuaweiMap
import com.huawei.hms.maps.MapView
import com.huawei.hms.maps.MapsInitializer
import com.huawei.hms.maps.OnMapReadyCallback
import com.huawei.hms.maps.SupportMapFragment

class MainActivity : AppCompatActivity() {

    private var huaweiMap: HuaweiMap? = null

    private val callbackMapHuawei = com.huawei.hms.maps.OnMapReadyCallback { huaweiMap ->
        // Do something with the Map here
        this.huaweiMap = huaweiMap

        val limaLatLng = com.huawei.hms.maps.model.LatLng(-12.007831, -77.060545)
        //go to lima
        huaweiMap?.moveCamera(
            com.huawei.hms.maps.CameraUpdateFactory.newLatLngZoom(
                limaLatLng,
                15f
            )
        )

    }

    private val callback = OnMapReadyCallback { googleMap ->
        // Do something with the Map here
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mSupportMapFragment: SupportMapFragment? = null
        mSupportMapFragment = supportFragmentManager.findFragmentById(R.id.mapview_mapviewdemo) as SupportMapFragment?
        mSupportMapFragment?.getMapAsync(callbackMapHuawei)

    }
}