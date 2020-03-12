package com.example.book_ed.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.book_ed.R
import kotlinx.android.synthetic.main.recyclerview_item_row.view.*


class RecyclerAdapter (): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){
    private val titles = arrayOf("Book 1",
        "Chapter Two", "Chapter Three", "Chapter Four",
        "Chapter Five", "Chapter Six", "Chapter Seven",
        "Chapter Eight")

    private val details = arrayOf("Item one details", "Item two details",
        "Item three details", "Item four details",
        "Item file details", "Item six details",
        "Item seven details", "Item eight details")

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.recyclerview_item_row, viewGroup, false)
        return ViewHolder(v)
    }

    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        var itemImage:ImageView
        var itemTitle: TextView

        init {
            itemImage = itemView.findViewById(R.id.itemImage)
            itemTitle = itemView.findViewById(R.id.itemTitle)

        }

    }

    override fun getItemCount(): Int {
        return titles.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemTitle.text= "Book ${(position + 1)}"
        holder.itemView.itemAuthor.text="Author ${(position + 1)}"
    }


}