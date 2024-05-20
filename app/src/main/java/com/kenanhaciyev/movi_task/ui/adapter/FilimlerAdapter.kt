package com.kenanhaciyev.movi_task.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.kenanhaciyev.movi_task.data.entity.Filim
import com.kenanhaciyev.movi_task.databinding.CardTasarimBinding
import com.kenanhaciyev.movi_task.fragment.AnasayfaFragmentDirections

class FilimlerAdapter(var context: Context,var filimList:List<Filim>):RecyclerView.Adapter<FilimlerAdapter.CardTasrimTutucu>() {

    inner class CardTasrimTutucu(var tasarim:CardTasarimBinding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasrimTutucu {
        val binding=CardTasarimBinding.inflate(LayoutInflater.from(context),parent,false)
        return CardTasrimTutucu(binding)

    }

    override fun getItemCount(): Int {
      return  filimList.count()
    }
    override fun onBindViewHolder(holder: CardTasrimTutucu, position: Int) {
        val filim = filimList.get(position)
        val t = holder.tasarim

        t.imageViewUzun.setImageResource(context.resources.getIdentifier(filim.resim,"drawable",context.packageName))
        t.textViewFilimadd.text = "${filim.ad}"


        t.cardUzunId.setOnClickListener(){
            val kecid = AnasayfaFragmentDirections.kecidDetay(filim)
            Navigation.findNavController(it).navigate(kecid)
        }

    }

}