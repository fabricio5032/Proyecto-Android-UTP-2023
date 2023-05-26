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

class PerfilFragment : Fragment() {

    private lateinit var btnEditarPerfil: Button
    private lateinit var txtNombre: TextView
    private lateinit var txtEdad: TextView
    private lateinit var txtEmail: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_perfil, container, false)

        // Obtener referencias a los elementos de la interfaz de usuario
        btnEditarPerfil = view.findViewById(R.id.btnEditarPerfil)
        txtNombre = view.findViewById(R.id.txtNombre)
        txtEdad = view.findViewById(R.id.txtEdad)
        txtEmail = view.findViewById(R.id.txtEmail)

        // Configurar el contenido inicial de los elementos
        txtNombre.text = "Nombre del usuario"
        txtEdad.text = "Edad del usuario"
        txtEmail.text = "Email del usuario"

        // Configurar el listener del botón para editar el perfil
        btnEditarPerfil.setOnClickListener {
            editarPerfil()
        }

        return view
    }

    private fun editarPerfil() {
        // Lógica para editar el perfil
        Toast.makeText(context, "Editar perfil", Toast.LENGTH_SHORT).show()
    }
}