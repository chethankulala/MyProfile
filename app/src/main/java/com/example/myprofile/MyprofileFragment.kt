package com.example.myprofile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_myprofile.*

class MyprofileFragment : Fragment() {

    private val actiities = listOf(
        ProfileActivities("Belal Khan", "Ranchi Jharkhand"),
        ProfileActivities("Ramiz Khan", "Ranchi Jharkhand"),
        ProfileActivities("Faiz Khan", "Ranchi Jharkhand"),
        ProfileActivities("Yashar Khan", "Ranchi Jharkhand")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        retainInstance = true
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_myprofile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //getting recyclerview from xml
        val recyclerView = profileRecyclerView as RecyclerView

        //adding a layoutmanager
        recyclerView.layoutManager = LinearLayoutManager(activity)

        //creating our adapter
        //val adapter = ProfileAdapter(actiities)

        //now adding the adapter to recyclerview
        recyclerView.adapter = ProfileAdapter(actiities)

    }

    companion object {
        fun newInstance(): MyprofileFragment = MyprofileFragment()
    }

}
