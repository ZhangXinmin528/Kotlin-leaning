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
            basics.crateArray()
        }
    }

    //1.数组的创建
    //注意：与 Java 不同，Kotlin 的数组是不可变的（invariant）
    private fun crateArray() {
        val arrays = Array(ARRAY_SIZE) { i -> "This is element $i" }
        for (i in arrays) {
            println(i)
        }
    }

}