package com.example.book_ed.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.book_ed.ui.Friend.FriendFragment
import com.example.book_ed.ui.home.HomeFragment
import com.example.book_ed.ui.slideshow.SlideshowFragment

var tabList = ArrayList<String>()

class TabAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        // Return a NEW fragment instance in createFragment(int)
        return when(position) {
            0 -> {
                HomeFragment.newInstance()
            }
            1 -> {
                FriendFragment.newInstance()
            }
            2 -> {
                SlideshowFragment()
            }
            else -> {
                FriendFragment.newInstance()
            }
        }
       // val fragment = DemoObjectFragment()
        //fragment.arguments = Bundle().apply {
            // Our object is just an integer :-P
          //  putInt(ARG_OBJECT, position + 1)
        //}
        //return fragment
    }
    fun getPageTitle(position: Int): String {
        tabList.add("Profile")
        tabList.add("Friends")
        tabList.add("Books")
        return tabList.get(position)


    }
}

private const val ARG_OBJECT = "object"
