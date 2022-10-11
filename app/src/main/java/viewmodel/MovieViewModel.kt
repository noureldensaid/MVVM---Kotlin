package viewmodel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import model.Movie
import repositorey.MovieContract
import repositorey.MovieImp

class MovieViewModel : ViewModel() {
    private val movieImp: MovieContract = MovieImp()
    fun getMovie(): LiveData<Movie> {
        return movieImp.getMovies()
    }
}