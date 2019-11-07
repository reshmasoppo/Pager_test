package com.example.pager_test

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.viewpager.widget.PagerAdapter

class ViewPagerAdapter(var context: Context, var splash_textitems: Array<String>, var flag: IntArray) : PagerAdapter() {
      lateinit var layoutInflater: LayoutInflater


    override fun getCount(): Int {
        return flag.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        val txtname: TextView
        val imgflag: ImageView

        layoutInflater = context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val itemView = layoutInflater.inflate(R.layout.viewflipper_item, container,
                false)

        txtname = itemView.findViewById(R.id.textView)
        txtname.text = splash_textitems[position]


        imgflag = itemView.findViewById(R.id.imageView)
        imgflag.setImageResource(flag[position])
        container.addView(itemView)

        return itemView

    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {

        container.removeView(`object` as ConstraintLayout)

    }
}
