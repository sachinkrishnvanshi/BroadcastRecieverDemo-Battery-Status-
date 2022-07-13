package com.example.broadcastreciever

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.TextView
import android.widget.Toast

class BatteryChanged(tv_battery: TextView) : BroadcastReceiver() {
    private val batteryLevel=tv_battery
    override fun onReceive(p0: Context?, p1: Intent?) {

        val levelBattery= p1?.getIntExtra("level",0)
        if (levelBattery!=0) {
            batteryLevel.text = buildString {
        append(levelBattery.toString())
        append("%")
    }
        }
    }

}