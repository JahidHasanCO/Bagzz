package dev.jahidhasanco.bagzz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.FrameLayout
import com.google.android.material.bottomnavigation.BottomNavigationView
import dev.jahidhasanco.bagzz.ui.fragment.HomeFragment

class MainActivity : AppCompatActivity() , BottomNavigationView.OnNavigationItemSelectedListener{

    lateinit var fragmentContainer_activityMain: FrameLayout
    lateinit var bottomNavigationView:BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragmentContainer_activityMain = findViewById(R.id.fragmentContainer_activityMain)
        bottomNavigationView = findViewById(R.id.bottomNav)
        bottomNavigationView.setOnNavigationItemSelectedListener(this)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer_activityMain, HomeFragment())
            .commit()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.homeMenu -> {
                val fragment = HomeFragment()
                supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer_activityMain, fragment, fragment.javaClass.simpleName)
                    .commit()
                return true
            }
        }
        return false


    }


}