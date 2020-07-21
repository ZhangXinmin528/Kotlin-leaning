package com.example.libkotlinbasics.`class`

import com.example.libkotlinbasics.`interface`.ICar
import java.awt.Color

/**
 *Created by ZhangXinmin on zhangxinmin.
 * Copyright (c) 2020 . All rights reserved.
 */
//首要构造器；
//首要构造器没有任何标注或者可视化修饰符，constructor 关键字可以省略
//首要构造器不能包含任何代码。初始化代码可位于用 init 关键字作为前缀的**初始化区块（initializer block）**中。
//类的可见性修饰符：private、protected、internal 和 public，默认为public
//internal:同一模块可见
open class Car constructor(var brand: String) : ICar {

    constructor(brand: String, color: Color) : this(brand)

    //初始化代码块可以多次使用，中间可穿插一些属性的定义
    //注意：首要构造器的参数可以直接用于初始化区块。当然也可以用于属性初始化。
    init {
        //初始化一下属性等
        println("The brand of the car is $brand")
    }

    //父类的方法默认为public的，如果设置为 protected则子类的方法也为protected
    override fun printCarColor() {
        println("The car's brand is $brand")
    }


}