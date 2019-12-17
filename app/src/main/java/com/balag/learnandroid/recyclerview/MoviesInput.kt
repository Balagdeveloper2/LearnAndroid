package com.balag.learnandroid.recyclerview

object MoviesInput  {
    private var moviesList = listOf(
        Movie("Valimai","Thala"),
        Movie("Darbar","Rajini"),
        Movie("Bigil","Vijay"),
        Movie("Thambi","Karthi")
    )

    fun getMovies() : List<Movie> {
     return moviesList;
    }
}