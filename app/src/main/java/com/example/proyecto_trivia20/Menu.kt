package com.example.proyecto_trivia20

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.proyecto_trivia20.R

class Menu: Fragment(R.layout.fragment_menu)  {
    private lateinit var buttonHistoria: ImageButton
    private lateinit var buttonCiencia: ImageButton
    private lateinit var buttonDeporte: ImageButton
    private lateinit var buttonLiteratura: ImageButton
    private lateinit var buttonReligion: ImageButton
    private lateinit var buttonAmbiente: ImageButton
    private lateinit var buttonGeografia: ImageButton
    private lateinit var buttonMusica: ImageButton
    private lateinit var buttonTecnologia: ImageButton

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonHistoria= view.findViewById(R.id.imageButton9)
        buttonCiencia= view.findViewById(R.id.imageButton10)
        buttonDeporte= view.findViewById(R.id.imageButton11)
        buttonLiteratura= view.findViewById(R.id.imageButton12)
        buttonReligion=view.findViewById(R.id.imageButton13)
        buttonAmbiente=view.findViewById(R.id.imageButton14)
        buttonGeografia=view.findViewById(R.id.imageButton15)
        buttonMusica=view.findViewById(R.id.imageButton16)
        buttonTecnologia=view.findViewById(R.id.imageButton17)

        setListeners()

    }

    private fun setListeners() {
        buttonHistoria.setOnClickListener {

            requireView().findNavController().navigate(R.id.action_menu3_to_preguntaHistoria1)



        }
        buttonCiencia.setOnClickListener {

            requireView().findNavController().navigate(R.id.action_menu3_to_preguntaCiencia1)



        }
        buttonDeporte.setOnClickListener {

            requireView().findNavController().navigate(R.id.action_menu3_to_preguntaDeporte1)



        }
        buttonLiteratura.setOnClickListener {

            requireView().findNavController().navigate(R.id.action_menu3_to_preguntaLiteratura1)



        }
        buttonReligion.setOnClickListener {

            requireView().findNavController().navigate(R.id.action_menu3_to_preguntaReligion1)



        }
        buttonAmbiente.setOnClickListener {

            requireView().findNavController().navigate(R.id.action_menu3_to_preguntaAmbiente1)



        }
        buttonGeografia.setOnClickListener {

            requireView().findNavController().navigate(R.id.action_menu3_to_preguntaGeografia1)



        }
        buttonMusica.setOnClickListener {

            requireView().findNavController().navigate(R.id.action_menu3_to_preguntaMusica1)



        }
        buttonTecnologia.setOnClickListener {

            requireView().findNavController().navigate(R.id.action_menu3_to_preguntaTecnologia1)



        }
    }
}