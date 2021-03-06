package com.example.mghandroidcheckin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.mghcheckinandroid.AppointmentModel
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class MainActivity : AppCompatActivity() {

    private val AppointmentsList = mutableListOf<AppointmentModel>()
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //Read all appointments from firebase
    var database= FirebaseDatabase.getInstance().getReference("Appointments")

    database.addValueEventListener(object : ValueEventListener {
        override fun onCancelled(error: DatabaseError) {
            TODO("Not yet implemented")
        }

        override fun onDataChange(snapshot: DataSnapshot) {
            appoin
            for(eachApt in snapshot.children){
                val eachAptObject=eachApt.getValue(AppointmentModel::class.java)
                AppointmentsList.add(eachAptObject!!)
            }
        }
    })


}