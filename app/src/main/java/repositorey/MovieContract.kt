package repositorey

import androidx.lifecycle.MutableLiveData
import model.Movie

interface MovieContract {
    fun getMovies(): MutableLiveData<Movie>
}