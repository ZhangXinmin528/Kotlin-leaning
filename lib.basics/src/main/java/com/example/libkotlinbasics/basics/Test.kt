package com.example.libkotlinbasics.basics

/**
 *Created by ZhangXinmin on zhangxinmin.
 * Copyright (c) 2020 . All rights reserved.
 */
class Test {
    companion object {
        private const val ARRAY_SIZE = 30;

        @JvmStatic
        fun main(args: Array<String>) {
            var value = 1
            value++
            println("value is $value")

            val number = 2;
            println("number == value : ${number == value}")
            println("number === value : ${number === value}")
        }
    }
}