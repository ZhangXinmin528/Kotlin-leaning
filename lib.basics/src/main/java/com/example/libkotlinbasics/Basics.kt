package com.example.libkotlinbasics

/**
 *Created by ZhangXinmin on zhangxinmin.
 * Copyright (c) 2020 . All rights reserved.
 * 该类演示kotlin中基本的数据类型~
 * 其中包括：数值，字符，布尔，数组和字符串；
 */
class Basics {

    companion object {
        private const val ARRAY_SIZE = 30;

        @JvmStatic
        fun main(args: Array<String>) {
            val basics = Basics()
            //数组
//            basics.crateArray0()
//            basics.createArray1()
//            basics.createSpecialArray2()

            //字符串
//            basics.getStringElement()
//            basics.testPureString()
            basics.stringMode()
        }
    }

    //TODO:1.数组的创建
    //注意：与 Java 不同，Kotlin 的数组是不可变的（invariant）
    /**
     * 使用构造函数创建数组
     */
    private fun crateArray0() {
        val arrays = Array(ARRAY_SIZE) { i -> "This is element $i" }
        for (i in arrays) {
            println(i)
        }
    }

    /**
     * 使用库函数创建数组
     */
    private fun createArray1() {
        val arrays = arrayOf(1, 2, 3, 4)
        for (i in arrays) {
            println(i)
        }
    }

    /**
     * 使用特定类型创建数组
     * 没有装箱操作
     */
    private fun createSpecialArray2() {
        val arrays = floatArrayOf(1.0f, 2.0f, 4.0f)
        for (i in arrays) {
            println(i)
        }
    }

    //TODO：2.字符串相关


    /**
     * 访问字符串元素
     */
    private fun getStringElement() {
        val value = "ZhangXinmin"
        for (c in value) {
            println(c)
        }
    }

    /**
     * 测试纯字符串
     */
    private fun testPureString() {
        val text = """
    |Tell me and I forget
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()

        println(text)
    }

    /**
     * 字符串模板的使用
     */
    private fun stringMode() {
        val text = "abcd"

        println("$text.length is ${text.length}")
    }
}