package com.example.kotlinlearning.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinlearning.R

/**
 * Created by ZhangXinmin on 2020/7/19.
 * Copyright (c) 2020 . All rights reserved.
 */
class RecyclerExampleAdapter(private val dataList: Array<String>) : RecyclerView.Adapter<RecyclerVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerVH {
        val rootView = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_recycler_item, parent, false);
        return RecyclerVH(rootView)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: RecyclerVH, position: Int) {
        holder.textView.text = dataList[position]
    }
}