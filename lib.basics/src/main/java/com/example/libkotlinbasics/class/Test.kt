package com.example.libkotlinbasics.`class`

import java.awt.Color

/**
 *Created by ZhangXinmin on zhangxinmin.
 * Copyright (c) 2020 . All rights reserved.
 */
class Test {
    companion object {
        private const val ARRAY_SIZE = 30;

        @JvmStatic
        fun main(args: Array<String>) {
            val car = Bmw(Color.BLACK);
            car.printCarColor()

            val baseChildren = BaseChildren(10)
            baseChildren.foo("测试一下好不好用~")
        }
    }
}