package repositorey

import androidx.lifecycle.MutableLiveData
import model.Movie

class MovieImp : MovieContract {
    override fun getMovies(): MutableLiveData<Movie> {
        val movie: MutableLiveData<Movie> = MutableLiveData<Movie>()
        val list: MutableList<Movie> = mutableListOf(
            Movie("Batman", 4.9),
            Movie("Thor", 3.7),
            Movie("Dr.Strange", 4.5),
            Movie("Loki", 4.8)
        )
        list.shuffle()
        val randomMovie: Movie = list.removeAt(0)
        movie.postValue(randomMovie)
        return movie
    }
}
