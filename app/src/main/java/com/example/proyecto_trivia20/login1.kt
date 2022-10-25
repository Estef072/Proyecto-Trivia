package com.example.proyecto_trivia20

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class login1: Fragment(R.layout.fragment_login_oficial1)  {
    private lateinit var buttonLogin: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonLogin= view.findViewById(R.id.button4)

        setListeners()

    }

    private fun setListeners() {
        buttonLogin.setOnClickListener {

            requireView().findNavController().navigate(R.id.action_login14_to_menu3)



        }
    }
}