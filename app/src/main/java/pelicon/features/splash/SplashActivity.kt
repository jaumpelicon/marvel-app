package pelicon.features.splash

import android.animation.Animator
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import pelicon.MainActivity
import pelicon.marvel.R
import pelicon.marvel.databinding.ActivitySplashBinding
import pelicon.support.ui.viewBinding

class SplashActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivitySplashBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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