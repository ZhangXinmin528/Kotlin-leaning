package com.example.kotlinlearning.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.example.kotlinlearning.R

/**
 * Created by ZhangXinmin on 2020/7/26.
 * Copyright (c) 2020 . All rights reserved.
 */
class RvExampleAdapter(private val dataList: MutableList<String>) :
    BaseQuickAdapter<String, BaseViewHolder>(R.layout.layout_recycler_item, dataList) {

    override fun convert(holder: BaseViewHolder, item: String) {
        holder.setText(R.id.tv_recycler_item, item)
    }
}