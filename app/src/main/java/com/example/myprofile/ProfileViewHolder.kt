package com.example.myprofile

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProfileViewHolder(inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.profile_activities, parent, false)){

    private var tvProfileName: TextView? = null
    private var tvProfileDate: TextView? = null


    init {
        tvProfileName = itemView.findViewById(R.id.tvProfileName)
        tvProfileDate = itemView.findViewById(R.id.tvProfileDate)
    }

    fun bind(activity: ProfileActivities) {
        tvProfileName?.text = activity.name
        tvProfileDate?.text = activity.date
    }

}