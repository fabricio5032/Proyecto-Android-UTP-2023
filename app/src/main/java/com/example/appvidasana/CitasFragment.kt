package com.example.appvidasana

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.appvidasana.R

class CitasFragment : Fragment() {

    private lateinit var btnAgendarCita: Button
    private lateinit var txtDoctor: TextView
    private lateinit var txtPaciente: TextView
    private lateinit var txtHorario: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_citas, container, false)

        // Obtener referencias a los elementos de la interfaz de usuario
        btnAgendarCita = view.findViewById(R.id.btnAgendarCita)
        txtDoctor = view.findViewById(R.id.txtDoctor)
        txtPaciente = view.findViewById(R.id.txtPaciente)
        txtHorario = view.findViewById(R.id.txtHorario)

        // Configurar el contenido inicial de los elementos
        txtDoctor.text = "Nombre del doctor"
        txtPaciente.text = "Nombre del paciente"
        txtHorario.text = "Horario de la cita"

        // Configurar el listener del botón para agendar cita
        btnAgendarCita.setOnClickListener {
            agendarCita()
        }

        return view
    }

    private fun agendarCita() {
        // Lógica para agendar la cita
        Toast.makeText(context, "Cita agendada", Toast.LENGTH_SHORT).show()
    }
}