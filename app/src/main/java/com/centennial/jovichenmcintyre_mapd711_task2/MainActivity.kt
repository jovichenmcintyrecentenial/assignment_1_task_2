package com.centennial.jovichenmcintyre_mapd711_task2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    //function to get student information from strings and save in intent and start activivty
    fun showInfo(view: View) {
        var intent = Intent(this,DisplayStudentInformation::class.java)
        intent.putExtra("name",getString(R.string.name))
        intent.putExtra("address",getString(R.string.address))
        intent.putExtra("profession",getString(R.string.profession))
        intent.putExtra("dream_job",getString(R.string.dream_job))
        intent.putExtra("favourite_food",getString(R.string.favourite_food))
        startActivity(intent)

    }
}