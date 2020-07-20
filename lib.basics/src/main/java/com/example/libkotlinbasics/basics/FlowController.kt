package com.example.libkotlinbasics.basics

/**
 *Created by ZhangXinmin on zhangxinmin.
 * Copyright (c) 2020 . All rights reserved.
 */
class FlowController {
    companion object {
        private const val ARRAY_SIZE = 30;

        @JvmStatic
        fun main(args: Array<String>) {
            val controller = FlowController()

//            controller.ifSentence(15)
//            controller.whenSentence(101)

//            controller.forArray1()
            controller.forArray2()
        }
    }

    //TODO:1.IF表达式¬
    /**
     * if表达式
     */
    private fun ifSentence(input: Int) {
        val result = if (input > 10) {
            input
        } else {
            1
        }

        println("result is $result")
    }

    //TODO:2.When表达式
    /**
     * When表达式
     */
    private fun whenSentence(input: Int) {
        when (input) {
            in 1..10 -> println("input在10以内")
            in 11..100 -> println("input大于10&小于100")
            else -> {
                println("input 在以上范围之外")
            }
        }
    }

    //TODO:3.For循环
    /**
     *for循环：利用迭代器遍历
     */
    private fun forArray0() {
        val arrays = Array(ARRAY_SIZE) { i -> "This is element $i" }
        for (i in arrays) {
            println(i)
        }
    }

    /**
     * for循环：利用索引遍历
     */
    private fun forArray1() {
        val arrays = Array(ARRAY_SIZE) { i -> "This is element $i" }
        for (i in arrays.indices) {
            println("The index is $i,and the element is '${arrays[i]}'")
        }
    }

    /**
     * for循环：利用withIndex遍历
     */
    private fun forArray2() {
        val arrays = Array(ARRAY_SIZE) { i -> "This is element $i" }
        for ((i, item) in arrays.withIndex()) {
            println("The index is $i,and the element is '$item'")
        }
    }
}