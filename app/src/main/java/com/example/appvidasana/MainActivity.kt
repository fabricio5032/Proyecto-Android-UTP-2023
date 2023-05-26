package com.example.appvidasana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.appvidasana.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.menu_inicio -> {
                    replaceFragment(InicioFragment())
                    true
                }
                R.id.menu_emergencia -> {
                    replaceFragment(EmergenciaFragment())
                    true
                }
                R.id.menu_citas -> {
                    replaceFragment(CitasFragment())
                    true
                }
                R.id.menu_perfil -> {
                    replaceFragment(PerfilFragment())
                    true
                }
                else -> false
            }
        }

        // Mostrar el fragmento de Inicio por defecto al iniciar la app
        replaceFragment(InicioFragment())
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frameContainer, fragment)
            .commit()
    }
}