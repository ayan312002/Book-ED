package com.example.book_ed.ui.profile

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2


import com.example.book_ed.R
import com.example.book_ed.adapters.TabAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_profile.*



class ProfileFragment : Fragment() {

    companion object {
        fun newInstance() = ProfileFragment()
    }

    private lateinit var viewModel: ProfileViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProviders.of(this).get(ProfileViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_profile, container, false)

        (activity as? AppCompatActivity)?.supportActionBar?.title = getString(R.string.nav_header_title)
        return root
    }
 override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ProfileViewModel::class.java)
        // TODO: Use the ViewModel
        var tabAdapter = activity?.let { TabAdapter(it) }

        var viewPager: ViewPager2 = pager
        viewPager.adapter = tabAdapter

        val tabLayout: TabLayout = tabs
        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            if (tabAdapter != null) {
                tab.text = tabAdapter.getPageTitle(position)
            }
        }.attach()
    }

}
