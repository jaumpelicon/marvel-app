package pelicon

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import pelicon.marvel.databinding.ActivityMainBinding
import pelicon.support.ui.viewBinding

class MainActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityMainBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}