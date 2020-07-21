package com.example.libkotlinbasics.collections

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.MultiHashtable

/**
 *Created by ZhangXinmin on zhangxinmin.
 * Copyright (c) 2020 . All rights reserved.
 */
class TestList {
    companion object {
        private const val ARRAY_SIZE = 30;

        @JvmStatic
        fun main(args: Array<String>) {
            val testList = TestList()
//            testList.testListOf()
            testList.testMap()
        }
    }


    private fun testListOf() {
        val list = listOf<Int>(1, 5, 3, 4)
        println("testListOf..the first element is ${list.first()} ")
        println("testListOf..the last element is ${list.last()} ")

        //TODO:filter
        //过滤
        list.filter { it % 2 == 0 }.forEach { println("filter函数..集合中的偶数为：$it") }

        //TODO:map
        //进行一定的变换，放入集合
        list.map { it * 2 }.forEach { println("map函数..$it") }

        //TODO:all
        //遍历整个集合，如果有一个不满足则返回false;
        println("all函数..${list.all { it > 0 }}")

        //TODO:any
        //检查集合是否存在元素
        println("any函数..${list.any()}")

        //TODO:count()
        //元素个数
        println("count函数..${list.count()}")

        //TODO:find
        //寻找第一个符合条件的元素，如果没有符合条件的元素，则返回null
        println("find函数..${list.find { it > 3 }}")
    }

    private fun testMap() {
        val map = hashMapOf(1 to "hello", 2 to "Kotlin", 3 to "android")

        map.forEach { (key, value) -> println("遍历map..key is $key,and value is $value") }

        map.filterKeys { it >= 2 }
            .forEach { (key, value) -> println("filterKeys..key is $key,and value is $value") }

        //TODO:count()
        //元素个数
        println("map函数..${map.count()}")

        map.put(3,"good")

        map.forEach { (key, value) -> println("遍历map..key is $key,and value is $value") }

    }
}
