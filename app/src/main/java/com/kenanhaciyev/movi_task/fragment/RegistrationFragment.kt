package com.kenanhaciyev.movi_task.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.kenanhaciyev.movi_task.R
import com.kenanhaciyev.movi_task.databinding.FragmentRegistrationBinding


class RegistrationFragment : Fragment() {
lateinit var binding: FragmentRegistrationBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentRegistrationBinding.inflate(inflater,container,false)


        binding.btnRegister.setOnClickListener {
            findNavController().navigate(R.id.kecidRegister_anaseyfe)
        }

        return binding.root
    }


}
