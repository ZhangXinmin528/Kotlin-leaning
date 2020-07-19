package com.example.kotlinlearning.recycler

import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinlearning.R
import com.example.kotlinlearning.base.BaseActivity

/**
 * Created by ZhangXinmin on 2020/7/19.
 * Copyright (c) 2020 . All rights reserved.
 * Kotlin 测试页面
 */
class RecycleviewExampleActivity : BaseActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList: Array<String>
    private lateinit var recyclerExampleAdapter: RecyclerExampleAdapter

    companion object {
        private const val DATA_SIZE = 30;
    }

    override fun setLayoutId(): Int {
        return R.layout.activity_recycler;
    }

    override fun initParamsAndValues() {
        initData()

        recyclerExampleAdapter = RecyclerExampleAdapter(dataList)
    }

    override fun initViews() {
        recyclerView = findViewById(R.id.rv_example)

        recyclerView!!.layoutManager = LinearLayoutManager(mContext!!)
        recyclerView!!.addItemDecoration(
            DividerItemDecoration(
                mContext!!,
                DividerItemDecoration.VERTICAL
            )
        )
        recyclerView.adapter = recyclerExampleAdapter

    }

    private fun initData() {
        dataList = Array(DATA_SIZE) { i -> "This is element $i" }
    }
}