package com.example.book_ed.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.book_ed.R
import com.example.book_ed.adapters.RecyclerAdapter

class HomeFragment : Fragment() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        //val textView: TextView = root.findViewById(R.id.text_home)
        //homeViewModel.text.observe(viewLifecycleOwner, Observer {
        //    textView.text = it
        //})




        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var linearLayoutManager: RecyclerView.LayoutManager? = null
        var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null

        linearLayoutManager= LinearLayoutManager(activity)
        var recyclerview = view?.findViewById(R.id.recycler_view) as RecyclerView

        recyclerview.layoutManager=linearLayoutManager
        adapter = RecyclerAdapter()
        recyclerview.adapter=adapter
    }
}
