package com.example.kotlinlearning.recycler

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinlearning.R

/**
 * Created by ZhangXinmin on 2020/7/19.
 * Copyright (c) 2020 . All rights reserved.
 */
class RecyclerVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val textView: TextView

    init {
        textView = itemView.findViewById(R.id.tv_recycler_item)
    }
}