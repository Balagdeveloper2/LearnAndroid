package com.balag.learnandroid.recyclerview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.balag.learnandroid.R
import kotlinx.android.synthetic.main.fragment_main.*

data class Movie(val title: String, val hero: String)

class MainFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        retainInstance = true
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
        inflater.inflate(R.layout.fragment_main, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        movie_list_recycler_view.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = MovieAdapter(MoviesInput.getMovies())
        }
    }

    companion object {
        fun newInstance(): MainFragment =
            MainFragment()
    }
}