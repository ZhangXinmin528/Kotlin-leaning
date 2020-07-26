package com.example.kotlinlearning.fragment

import android.view.View
import androidx.appcompat.app.ActionBar
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlinlearning.MainActivity
import com.example.kotlinlearning.R
import com.example.kotlinlearning.adapter.RvExampleAdapter
import com.example.kotlinlearning.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_recyclerview.*

/**
 * Created by ZhangXinmin on 2020/7/26.
 * Copyright (c) 2020 . All rights reserved.
 */
class HomeFragment() : BaseFragment() {

    private lateinit var adapter: RvExampleAdapter
    private lateinit var dataList: MutableList<String>

    companion object {

        fun newInstance(): HomeFragment {
            return HomeFragment()
        }

    }

    override fun setLayoutId(): Int {

        return R.layout.fragment_recyclerview
    }

    override fun initParamsAndValues() {

        dataList = Array(30) { i -> "This is element $i" }.toMutableList()

        adapter = RvExampleAdapter(dataList)
    }

    override fun initViews(rootView: View) {

        //TODO:为什么有问题？
//        toolbar_frg_rv!!.title = "Home"
        (activity!! as MainActivity).setSupportActionBar(toolbar_frg_rv)
        val actionBar: ActionBar? = (activity!! as MainActivity).supportActionBar
        if (actionBar!=null){
            actionBar.title = "Home"
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeButtonEnabled(true)
        }


        rv_fragment_home.adapter = adapter
        rv_fragment_home.addItemDecoration(
            DividerItemDecoration(
                mContext,
                DividerItemDecoration.VERTICAL
            )
        )
        rv_fragment_home.layoutManager = LinearLayoutManager(mContext)

    }
}