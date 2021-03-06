package com.example.kotlinlearning

import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.kotlinlearning.base.BaseActivity
import com.example.kotlinlearning.fragment.HomeFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    private val fragments = ArrayList<Fragment>()

    override fun setLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initParamsAndValues() {
        fragments.add(HomeFragment.newInstance())
    }

    override fun initViews() {

        vp_home.adapter = HomePageAdapter(fragments, supportFragmentManager)
        vp_home.addOnPageChangeListener(object : ViewPager.SimpleOnPageChangeListener() {
            override fun onPageSelected(position: Int) {
                if (fragments.size > position) {
                    bottom_nav.menu.getItem(position).isChecked = true
                }
            }
        })

        bottom_nav.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.vp_home -> {

                }

                R.id.list -> {

                }
                R.id.form -> {
                }
            }
            true
        }
    }


}