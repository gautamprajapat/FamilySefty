package com.example.myapplicationfamilysefty

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        //LifeCycle Fuction
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val listMembers= listOf<MemberModel>(
        MemberModel("Gautam",
            address = "9th floor H.no.126 kadipur village delhi-110036",
            battery = "80%",
            distance = "30"

        ),
        MemberModel("Ramesh",
            address = "9th floor H.no.126 kadipur village delhi-110036",
            battery = "80%",
            distance = "30"),
        MemberModel("Khusi",
            address = "9th floor H.no.126 kadipur village delhi-110036",
            battery = "80%",
            distance = "30"),
        MemberModel("Deepak",
            address = "9th floor H.no.126 kadipur village delhi-110036",
            battery = "80%",
            distance = "30"),
        MemberModel("Poonam",
            address = "9th floor H.no.126 kadipur village delhi-110036",
            battery = "80%",
            distance = "30"),
        MemberModel("Ankur",
            address = "9th floor H.no.126 kadipur village delhi-110036",
            battery = "80%",
            distance = "30")
        )

        val adapter=MemberAdapter(listMembers)
        val recycler=requireView().findViewById<RecyclerView>(R.id.recycler_member)
        recycler.layoutManager=LinearLayoutManager(requireContext())
        recycler.adapter=adapter
    }


    companion object {

        @JvmStatic
        fun newInstance() =
            HomeFragment()
    }
}