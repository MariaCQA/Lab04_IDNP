package com.example.lab04_idnp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

class BlankFragment : Fragment() {

    private lateinit var onRegister: (Usuario) -> Unit

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_blank, container, false)

        val edtNombre = view.findViewById<EditText>(R.id.edtNombre)
        val edtApellido = view.findViewById<EditText>(R.id.edtApellido)
        val edtEmail = view.findViewById<EditText>(R.id.edtEmail)
        val edtTelefono = view.findViewById<EditText>(R.id.edtTelefono)
        val edtUsername = view.findViewById<EditText>(R.id.edtUsername)
        val edtPassword = view.findViewById<EditText>(R.id.edtPassword)
        val btnRegister = view.findViewById<Button>(R.id.btnRegister)

        btnRegister.setOnClickListener {
            val user = Usuario(
                edtNombre.text.toString(),
                edtApellido.text.toString(),
                edtEmail.text.toString(),
                edtTelefono.text.toString(),
                edtUsername.text.toString(),
                edtPassword.text.toString()
            )
            onRegister(user)
        }

        return view
    }

    companion object {
        fun newInstance(onRegister: (Usuario) -> Unit): BlankFragment {
            val fragment = BlankFragment()
            fragment.onRegister = onRegister
            return fragment
        }
    }
}
