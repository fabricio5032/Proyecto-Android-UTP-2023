package com.example.appvidasana

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.appvidasana.R

class EmergenciaFragment : Fragment() {

    private lateinit var btnCallEmergency: Button
    private lateinit var btnSendAlert: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_emergencia, container, false)

        // Obtener referencias a los elementos de la interfaz de usuario
        btnCallEmergency = view.findViewById(R.id.btnCallEmergency)
        btnSendAlert = view.findViewById(R.id.btnSendAlert)

        // Configurar listeners para los botones
        btnCallEmergency.setOnClickListener {
            callEmergencyNumber()
        }

        btnSendAlert.setOnClickListener {
            sendEmergencyAlert()
        }

        return view
    }

    private fun callEmergencyNumber() {
        // Lógica para realizar una llamada de emergencia
        Toast.makeText(context, "Llamando al número de emergencia", Toast.LENGTH_SHORT).show()
    }

    private fun sendEmergencyAlert() {
        // Lógica para enviar una alerta de emergencia
        Toast.makeText(context, "Enviando alerta de emergencia", Toast.LENGTH_SHORT).show()
    }
}