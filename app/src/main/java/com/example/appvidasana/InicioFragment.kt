package com.example.appvidasana

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.appvidasana.R

class InicioFragment : Fragment() {

    private lateinit var btnEmergency: Button
    private lateinit var btnCitas: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_inicio, container, false)

        // Obtener referencias a los elementos de la interfaz de usuario
        btnEmergency = view.findViewById(R.id.btnEmergency)
        btnCitas = view.findViewById(R.id.btnCitas)

        // Configurar listeners para los botones
        btnEmergency.setOnClickListener {
            navigateToEmergency()
        }

        btnCitas.setOnClickListener {
            navigateToCitas()
        }

        return view
    }

    private fun navigateToEmergency() {
        // Lógica para navegar a la pantalla de emergencia
        Toast.makeText(context, "Navegar a la pantalla de emergencia", Toast.LENGTH_SHORT).show()
    }

    private fun navigateToCitas() {
        // Lógica para navegar a la pantalla de citas
        Toast.makeText(context, "Navegar a la pantalla de citas", Toast.LENGTH_SHORT).show()
    }
}