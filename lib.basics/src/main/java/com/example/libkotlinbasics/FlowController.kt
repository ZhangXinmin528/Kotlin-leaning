package com.example.libkotlinbasics

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

            controller.ifSentence(15)
        }
    }

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

    private fun whenSentence(input :Int){
        
    }
}