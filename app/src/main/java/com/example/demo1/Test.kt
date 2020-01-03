package com.example.demo1

import android.util.Log

/**

 * @Author luweicheng
 * @Date 2020-01-02-21:44
 */

class Test : ITest() {
    override fun test2(a: Int, b: Int) {
        println("test a =" + a + "b = " + b)
        Log.i("lwc", "test2$a $b")
    }

    override fun test1(a: Int) {
        println("test a =" + a)
        Log.i("lwc", "test1"+a)
    }
}