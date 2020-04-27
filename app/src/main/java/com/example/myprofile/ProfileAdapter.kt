package com.example.myprofile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProfileAdapter(val activityList: List<ProfileActivities>): RecyclerView.Adapter<ProfileViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        return ProfileViewHolder(inflater, parent)

    }

    override fun getItemCount(): Int {

        return activityList.size

    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {

        holder.bind(activityList[position])

    }
}