package com.example.sesssion4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickToObsugden(view: View) {
        val intent = Intent(this, ChatListActivity::class.java)
        startActivity(intent)
    }
    fun clickToPodbor(view: View) {
        val intent2 = Intent(this, PodborkaActivity::class.java)
        startActivity(intent2)
    }
    fun clickToIzbran(view: View) {
        val intent3 = Intent(this, HeartActivity::class.java)
        startActivity(intent3)
    }
}