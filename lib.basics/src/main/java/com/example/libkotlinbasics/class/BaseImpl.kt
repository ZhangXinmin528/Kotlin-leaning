package com.example.libkotlinbasics.`class`

import com.example.libkotlinbasics.`interface`.IBase

/**
 *Created by ZhangXinmin on zhangxinmin.
 * Copyright (c) 2020 . All rights reserved.
 */
open class BaseImpl(var input: Int) : IBase {
    override fun printMessage() {
        println("This is BaseImpl,input is $input")
    }

    /**
     * 1.函数声明使用fun关键字；
     * 2.可以设置默认参数
     */
    open fun foo(string: String, number: Int = 0) {
        println("This is BaseImpl,string is$string,number is $number!")
    }
}