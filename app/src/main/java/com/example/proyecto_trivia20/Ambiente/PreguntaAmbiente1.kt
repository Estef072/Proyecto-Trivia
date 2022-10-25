package com.example.proyecto_trivia20.Ambiente
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.proyecto_trivia20.R
class PreguntaAmbiente1: Fragment(R.layout.fragment_pregunta_ambiente1) {
    private lateinit var buttonPreguntaAmbiente1: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonPreguntaAmbiente1= view.findViewById(R.id.button4_FragmentPregunta1_Ambiente)

        setListeners()

    }

    private fun setListeners() {
        buttonPreguntaAmbiente1.setOnClickListener {

            requireView().findNavController().navigate(R.id.action_preguntaAmbiente1_to_preguntaAmbiente2)



        }
    }
}