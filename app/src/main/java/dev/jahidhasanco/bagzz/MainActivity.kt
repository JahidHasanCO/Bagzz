package dev.jahidhasanco.bagzz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import dev.jahidhasanco.bagzz.ui.fragment.HomeFragment

class MainActivity : AppCompatActivity() {

    lateinit var fragmentContainer_activityMain: FrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragmentContainer_activityMain = findViewById(R.id.fragmentContainer_activityMain)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer_activityMain, HomeFragment())
            .commit()
    }
}