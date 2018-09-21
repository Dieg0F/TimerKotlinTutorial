package com.example.diegof.timertutorial

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.diegof.timertutorial.util.PrefUtil

class TimerExpiredReceived : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        PrefUtil.setTimerState(TimerActivity.TimerState.Stopped, context)
        PrefUtil.setAlarmSetTime(0, context)
    }
}
