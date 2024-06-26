package com.kenanhaciyev.movi_task.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.kenanhaciyev.movi_task.R
import com.kenanhaciyev.movi_task.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnLogin.setOnClickListener {

            if(binding.etLoginEmail.text.toString() =="kenan" && binding.etLoginPassword.text.toString() =="123"){
                findNavController().navigate(R.id.kecid_anasayfa)
            }else{
                Snackbar.make(view, "Email veya şifre yanlış", Snackbar.LENGTH_SHORT).show()
            }



        }
        binding.tvRegisterLink.setOnClickListener {
            findNavController().navigate(R.id.kecid_registration)
        }

    }
}




