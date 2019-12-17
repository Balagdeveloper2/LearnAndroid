package com.balag.learnandroid.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.balag.learnandroid.R

class MovieViewHolder(inflater: LayoutInflater , parent: ViewGroup) : RecyclerView.ViewHolder(inflater.inflate(
    R.layout.movie_list_item, parent, false)){
    private var mTitleView: TextView? = null
    private var mHeroView: TextView? = null

    init {
        mTitleView = itemView.findViewById(R.id.tv_movie_title)
        mHeroView = itemView.findViewById(R.id.tv_movie_hero)
    }

    fun bind(movie: Movie) {
        mTitleView?.text = movie.title
        mHeroView?.text = movie.hero
    }
}

