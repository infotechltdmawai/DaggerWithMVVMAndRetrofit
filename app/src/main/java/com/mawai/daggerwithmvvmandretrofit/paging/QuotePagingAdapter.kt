package com.mawai.daggerwithmvvmandretrofit.paging

import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.mawai.daggerwithmvvmandretrofit.R
import com.mawai.daggerwithmvvmandretrofit.models.Result

class QuotePagingAdapter: PagingDataAdapter<Result,QuotePagingAdapter.QuotePageViewholder>(COMPARATOR) {

    class QuotePageViewholder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val quote = itemView.findViewById<TextView>(R.id.quote)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): QuotePagingAdapter.QuotePageViewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_quote_layout,parent,false)
        return QuotePageViewholder(view)
    }

    override fun onBindViewHolder(holder: QuotePagingAdapter.QuotePageViewholder, position: Int) {
        val item = getItem(position)
        if (item !=null){
            holder.quote.text = item.content
        }
    }




    companion object {
        private val COMPARATOR = object : DiffUtil.ItemCallback<Result>(){
            override fun areItemsTheSame(oldItem: Result, newItem: Result): Boolean {
                return oldItem._id == newItem._id
            }

            override fun areContentsTheSame(oldItem: Result, newItem: Result): Boolean {
                return oldItem == newItem
            }

        }
    }
}