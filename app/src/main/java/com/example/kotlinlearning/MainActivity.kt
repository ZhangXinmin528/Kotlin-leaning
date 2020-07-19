package com.example.kotlinlearning

import android.content.Intent
import android.view.View
import android.widget.Button
import com.example.kotlinlearning.base.BaseActivity
import com.example.kotlinlearning.recycler.RecycleviewExampleActivity

class MainActivity : BaseActivity(), View.OnClickListener {

    override fun setLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initParamsAndValues() {
    }

    override fun initViews() {

        findViewById<Button>(R.id.btn_recycler).setOnClickListener(this)

    }

    override fun onClick(v: View?) {

        when (v!!.id) {
            R.id.btn_recycler -> {
                val intent = Intent(mContext, RecycleviewExampleActivity::class.java);
                startActivity(intent)
            }

        }
    }
}