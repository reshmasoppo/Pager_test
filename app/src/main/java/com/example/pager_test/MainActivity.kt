package com.example.pager_test

import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager

import android.os.Bundle

class MainActivity : AppCompatActivity() {
     lateinit var adapter: PagerAdapter
      lateinit var vp: ViewPager


       var splash_textitems = arrayOf("A", "B", "C", "D")

        var flag = intArrayOf(R.drawable.ic_launcher_background,
                R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        vp = findViewById<ViewPager>(R.id.pager) as ViewPager
        adapter = ViewPagerAdapter(applicationContext, splash_textitems, flag)
        vp.adapter = adapter

    }
}
