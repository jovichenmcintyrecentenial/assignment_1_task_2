package com.centennial.jovichenmcintyre_mapd711_task2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayStudentInformation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_student_information)

        //get data from intent and store in varible
        val name = intent.getStringExtra("name")
        val address = intent.getStringExtra("address")
        val profession = intent.getStringExtra("profession")
        val dreamJob = intent.getStringExtra("dream_job")
        val favouriteFood = intent.getStringExtra("favourite_food")

        //get textView from xml layout
        val textView = findViewById<TextView>(R.id.textView)

        //create a stirng to append information to dispaly
        var str = ""
        str+= getString(R.string.name_label)+": $name\n"
        str+= getString(R.string.address_label)+": $address\n"
        str+= getString(R.string.profession_label)+": $profession\n"
        str+= getString(R.string.dream_job_label)+": $dreamJob\n"
        str+= getString(R.string.favourite_food_label)+": $favouriteFood\n"

        //display information in textView
        textView.text = str
    }
}