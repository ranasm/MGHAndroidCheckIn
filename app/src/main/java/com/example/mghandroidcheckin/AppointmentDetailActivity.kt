package com.example.mghandroidcheckin

import android.content.Intent
import android.content.ServiceConnection
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import java.util.concurrent.Executor

class AppointmentDetailActivity : AppCompatActivity(){

    private lateinit var recyclerViewAptDetails: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.appointment_details)

        // RecyclerView for appointments
        /*
        recyclerViewAptDetails=findViewById(R.id.AptDetail_Main)
        recyclerViewAptDetails.layoutManager= LinearLayoutManager(this)
        recyclerViewAptDetails.adapter=AppointmentDetailAdapter()

         */

        //Get values from intent
        var intent=intent
        val AppointmentDate=intent.getStringExtra("AptDate")
        val AppointmentTime=intent.getStringExtra("AptTime")
        val AppointmentRealTime=intent.getStringExtra("RealTimeUpdate")

        val datefield = findViewById<TextView>(R.id.appointment_date)
        val scheduletimefield = findViewById<TextView>(R.id.appointment_time)
        val realtime = findViewById<TextView>(R.id.realtimeupdate)

        //Set date and time values
        datefield.text=AppointmentDate
        scheduletimefield.text=AppointmentTime
        realtime.text=AppointmentRealTime
    }

/*
    private class AppointmentDetailAdapter: RecyclerView.Adapter<AppointDetailViewHolder>(){

        override fun getItemCount(): Int {
            return 1
        }

        override fun onBindViewHolder(holder: AppointDetailViewHolder, position: Int) {

            // Data for current cell
            // holder.DoA.text = AppointmentDate


        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppointDetailViewHolder {
            val view: View = LayoutInflater.from(parent.context).inflate(R.layout.appointment_details, parent, false)
            return AppointDetailViewHolder(view)
        }


    }

    private class AppointDetailViewHolder (val customView: View): RecyclerView.ViewHolder(customView){
        val DoA: TextView = itemView.findViewById(R.id.appointment_date)
        val ToA: TextView = itemView.findViewById(R.id.appointment_time)

    }

 */

}