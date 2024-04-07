package com.kenanhaciyev.movi_task.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.google.android.material.snackbar.Snackbar
import com.kenanhaciyev.movi_task.R
import com.kenanhaciyev.movi_task.databinding.FragmentDetayBinding


class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetayBinding.inflate(inflater, container, false)

        val qebul: DetayFragmentArgs by navArgs()
        val gelenFilim = qebul.filim

        binding.toolbarDetaylar.setTitle(gelenFilim.ad)
        binding.textViewFilimFiyat.setText(gelenFilim.qiymet.toString())

        binding.imageViewFilim.setImageResource(
            resources.getIdentifier(gelenFilim.resim, "drawable", requireContext().packageName)
        )

        binding.buttonEkle.setOnClickListener {
            Snackbar.make(it,"Secilen filim sebete elave edilsinmi",Snackbar.LENGTH_SHORT)
                .setAction("Yes"){
                    Snackbar.make(it,"${gelenFilim.ad.uppercase()}-sebete elave edildi",Snackbar.LENGTH_SHORT).show()
                }
                .show()
        }

        return binding.root
    }

}