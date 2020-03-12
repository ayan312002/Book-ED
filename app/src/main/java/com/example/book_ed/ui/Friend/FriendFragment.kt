package com.example.book_ed.ui.Friend

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.book_ed.R

class FriendFragment : Fragment() {

    companion object {
        fun newInstance() = FriendFragment()
    }

    private lateinit var friendViewModel: FriendViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        friendViewModel =
                ViewModelProviders.of(this).get(FriendViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_friend, container, false)
        val textView: TextView = root.findViewById(R.id.text_friend)
        friendViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}
