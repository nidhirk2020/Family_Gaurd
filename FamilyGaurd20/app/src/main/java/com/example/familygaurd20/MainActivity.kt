package com.example.familygaurd20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomBar=findViewById<com.google.android.material.bottomnavigation.BottomNavigationView>(R.id.bottomNavigationView)
         bottomBar.setOnItemSelectedListener {

             if(it.itemId==R.id.nav_gaurd){
                 inflateFregment()
             }



             true
         }

    }

    private fun inflateFregment() {
      val transaction= supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container1 , GaurdFragment.newInstance())
        transaction.commit()

    }


}