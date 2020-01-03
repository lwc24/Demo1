package com.example.demo1

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

/**

 * @Author luweicheng
 * @Date 2020-01-02-21:09
 */
class MyReceiver : BroadcastReceiver(){
    override fun onReceive(context: Context?, intent: Intent?) {
        intent?.let {
            val str = it.getStringExtra("test")
            Toast.makeText(context,str,Toast.LENGTH_LONG).show()
        }
    }
}