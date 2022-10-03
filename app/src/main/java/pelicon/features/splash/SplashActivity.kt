package pelicon.features.splash

import android.animation.Animator
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import pelicon.MainActivity
import pelicon.marvel.R
import pelicon.marvel.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setup()
    }

    private fun setup() {
        setupSplashScreenAnimation()
        setupSplashScreenAnimatorListener()
    }

    private fun setupSplashScreenAnimation() {
        binding.splashScreenLottieAnimationView.setAnimation(R.raw.splash_screen)
    }

    private fun setupSplashScreenAnimatorListener() {
        binding.splashScreenLottieAnimationView.addAnimatorListener(object :
            Animator.AnimatorListener {

            override fun onAnimationStart(animation: Animator) {
                //Do nothing
            }

            override fun onAnimationEnd(animation: Animator) {
                navigateToMain()
            }

            override fun onAnimationCancel(animation: Animator) {
                //Do nothing
            }

            override fun onAnimationRepeat(animation: Animator) {
                //Do nothing
            }
        })
    }

    private fun navigateToMain() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}