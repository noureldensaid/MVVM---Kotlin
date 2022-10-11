package ui
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.mvvmarchitecture.R
import viewmodel.MovieViewModel

class MainActivity : AppCompatActivity() {
    private val movieViewModel: MovieViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val movieName: TextView = findViewById(R.id.movieTv)
        val findMovie =
            findViewById<Button?>(R.id.findBtn).setOnClickListener {
                movieViewModel.getMovie().observe(this) {
                    movieName.text = "${it.name} \n rate: ${it.rate}"
                }
            }
    }
}