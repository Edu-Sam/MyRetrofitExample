package com.example.myretrofitexample.adapter

import android.content.Context;
import android.net.Uri
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.myretrofitexample.R;
import com.example.myretrofitexample.model.Result;
import kotlinx


class MovieAdapter(val context: Context,private val resultList:List<Result>?):
RecyclerView.Adapter<MovieAdapter.MyViewHolder>()
{
    @override fun onBindViewHolder(holder: MyViewHolder,position: Int){
        //holder.absoluteAdapterPosition(resultList?.get(position))
    }

    class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
            fun bindItems(result:Result?){
                itemView.movie_title.text=
            }
    }

}