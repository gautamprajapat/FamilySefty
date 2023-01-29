package com.example.myapplicationfamilysefty

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomBar=findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomBar.setOnItemSelectedListener {menuItem->
            if(menuItem.itemId==R.id.nav_gaurd) {

                inflateFragment(GaurdFragment.newInstance())
            }
            else if (menuItem.itemId==R.id.nav_home)
            {
                inflateFragment(HomeFragment.newInstance())
            }
            true
        }

    }

    private fun inflateFragment(newInstance: Fragment) {
        val transaction=supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, newInstance)
        transaction.commit()


    }


}