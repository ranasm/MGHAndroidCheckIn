package com.example.mghandroidcheckin

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mghcheckinandroid.AppointmentModel
import com.example.mghandroidcheckin.CustomViewHolder as CustomViewHolder

class MainAdapter(private val mApts: List<AppointmentModel>, val context: Context): RecyclerView.Adapter<CustomViewHolder>(){

    override fun getItemCount(): Int {
        return mApts.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.appointment_cell, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        // Get appointment profile
        val aptprofile = mApts[position]

        // Data for current cell
        holder.DoA.text = aptprofile.DoA

        // Get appointment field information, and pass to intent
        var AppointmentDate=aptprofile.DoA
        var AppointmentTime=aptprofile.ToA
        var AppointmentRealTime=aptprofile.RealToA

        holder.itemView.setOnClickListener{
            val intent = Intent(context, AppointmentDetailActivity::class.java)
            intent.putExtra("AptDate", AppointmentDate)
            intent.putExtra("AptTime", AppointmentTime)
            intent.putExtra("RealTimeUpdate", AppointmentRealTime)

            //Start activity
            context.startActivity(intent)

        }

    }

}

class CustomViewHolder(val view: View):RecyclerView.ViewHolder(view){

    companion object {
        val AppointmentDate= "APPOINTMENT_DATE"

    }
    val DoA: TextView = itemView.findViewById(R.id.Apt_Date)
/*
    init {
        view.setOnClickListener{
            val intent = Intent(view.context, AppointmentDetailActivity::class.java)

            view.context.startActivity(intent)

        }
    }

 */
}