package com.example.libkotlinbasics.`class`

import java.awt.Color

/**
 *Created by ZhangXinmin on zhangxinmin.
 * Copyright (c) 2020 . All rights reserved.
 */
open class Bmw(var carColor: Color) : Car("BMW", carColor) {

    open val madeIn: String = "China"

    override fun printCarColor() {
        println("==The car's brand is $brand,the color is $carColor")
        Smart(carColor).printCarColor()
    }

    inner class Smart(var color: Color) : Bmw(color) {
        override var madeIn: String
            get() = "德国"
            set(value) {}


        override fun printCarColor() {
            super@Bmw.printCarColor()
            println("===The car is Smart,the color is $carColor,and made in ${super.madeIn}")
        }
    }

}