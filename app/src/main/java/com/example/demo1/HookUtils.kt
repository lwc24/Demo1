package com.example.demo1

import android.app.Activity
import android.app.Application
import android.content.*
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import me.ele.lancet.base.Scope
import me.ele.lancet.base.This
import me.ele.lancet.base.annotations.Proxy
import me.ele.lancet.base.annotations.TargetClass

/**

 * @Author luweicheng
 * @Date 2020-01-02-21:45
 */
class HookUtils {

    @Proxy("registerReceiver")
    @TargetClass(value = "android.content.Context", scope = Scope.ALL)
    public fun replaceContextRegisterReceiver(
        receiver: BroadcastReceiver,
        filter: IntentFilter
    ): Intent {
        val context = This.get() as Context
        Log.i("lwc", "registerReceiver")
        return context.registerReceiver(receiver, filter, null, null)!!
    }

    @Proxy("registerReceiver")
    @TargetClass(value = "android.app.Activity", scope = Scope.ALL)
    public fun replaceActivityRegisterReceiver(
        receiver: BroadcastReceiver,
        filter: IntentFilter
    ): Intent {
        val context = This.get() as Activity
        Log.i("lwc", "registerReceiver")
        return context.registerReceiver(receiver, filter, null, null)!!
    }

    @Proxy("registerReceiver")
    @TargetClass(value = "android.app.Application", scope = Scope.ALL)
    public fun replaceApplicationRegisterReceiver(
        receiver: BroadcastReceiver,
        filter: IntentFilter
    ): Intent {
        val context = This.get() as Application
        Log.i("lwc", "registerReceiver")
        return context.registerReceiver(receiver, filter, null, null)!!
    }

    @Proxy("test1")
    @TargetClass(value = "com.example.demo1.ITest", scope = Scope.ALL)
    public fun testProxy(a: Int) {
        val test = This.get() as ITest
        test.test2(a, 100)
    }

}