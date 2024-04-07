package com.kenanhaciyev.movi_task.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.kenanhaciyev.movi_task.R
import com.kenanhaciyev.movi_task.data.entity.Filim
import com.kenanhaciyev.movi_task.databinding.FragmentAnasayfaBinding
import com.kenanhaciyev.movi_task.ui.adapter.FilimAdapter_uzun
import com.kenanhaciyev.movi_task.ui.adapter.FilimlerAdapter

class AnasayfaFragment : Fragment() {
private lateinit var binding:FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding=FragmentAnasayfaBinding.inflate(inflater,container,false)
        binding.filimRv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)

        val filimler = ArrayList<Filim>()
        val f1 = Filim(1,"Avangers","avangers",15)
        val f2 = Filim(2,"Brave","brave",10)
        val f3 = Filim(3,"Dune","dune",13)
        val f4 = Filim(4,"Harry","harry",15)
        val f5 = Filim(5,"Host","host",25)
        val f6 = Filim(6,"Karma","karma",55)
        val f7 = Filim(7,"Klon","klon",10)
        val f8 = Filim(8,"Spiderman","spiderman",95)
        val f9 = Filim(9,"Women","women",55)

        filimler.add(f1)
        filimler.add(f2)
        filimler.add(f3)
        filimler.add(f4)
        filimler.add(f5)
        filimler.add(f6)
        filimler.add(f7)
        filimler.add(f8)
        filimler.add(f9)

        binding.filimRvUzun.layoutManager = StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)
        val filimUzun = java.util.ArrayList<Filim>()
        val f10 = Filim(10,"47 day","en_47day",78)
        val f11 = Filim(11,"Endofze","en_endofzoe",78)
        val f12 = Filim(12,"Fallen","en_fallen",78)
        val f13 = Filim(13,"Hind","en_hind",78)
        val f14 = Filim(14,"Komar","en_komar",78)
        val f15 = Filim(15,"Lord Of Ring","en_lordofring",78)
        val f16 = Filim(16,"Spider Man","en_spiderman",78)
        val f17 = Filim(17,"Winder Woman","en_wonder",78)

        val filimAdapter = FilimlerAdapter(requireContext(),filimler)
        binding.filimRv.adapter = filimAdapter

        filimUzun.add(f10)
        filimUzun.add(f11)
        filimUzun.add(f12)
        filimUzun.add(f13)
        filimUzun.add(f14)
        filimUzun.add(f15)
        filimUzun.add(f16)
        filimUzun.add(f17)

        val filimadapterUzun = FilimAdapter_uzun(requireContext(),filimUzun)
        binding.filimRvUzun.adapter = filimadapterUzun

        return binding.root


    }
}