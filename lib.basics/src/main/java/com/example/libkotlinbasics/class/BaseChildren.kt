package com.example.libkotlinbasics.`class`

/**
 *Created by ZhangXinmin on zhangxinmin.
 * Copyright (c) 2020 . All rights reserved.
 */
class BaseChildren(input: Int) : BaseImpl(input) {
    override fun printMessage() {
        println("This is BaseChildren,input is $input")
    }

    override fun foo(string: String, number: Int) {
        println("This is BaseChildren,string is$string,number is $number!")
    }
}