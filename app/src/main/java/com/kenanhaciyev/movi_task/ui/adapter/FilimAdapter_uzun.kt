package com.kenanhaciyev.movi_task.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.kenanhaciyev.movi_task.data.entity.Filim
import com.kenanhaciyev.movi_task.databinding.CardEnTasarimBinding
import com.kenanhaciyev.movi_task.databinding.CardTasarimBinding
import com.kenanhaciyev.movi_task.fragment.AnasayfaFragmentDirections

class FilimAdapter_uzun(var context: Context, var filimList_uzun:List<Filim>):RecyclerView.Adapter<FilimAdapter_uzun.CartTasarimTutucuEn>(){

    inner class CartTasarimTutucuEn(var tasarim:CardEnTasarimBinding):RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartTasarimTutucuEn {
        val binding = CardEnTasarimBinding.inflate(LayoutInflater.from(context),parent,false)
        return CartTasarimTutucuEn(binding)


    }

    override fun getItemCount(): Int {
       return filimList_uzun.size
    }

    override fun onBindViewHolder(holder: CartTasarimTutucuEn, position: Int) {
        val filim = filimList_uzun.get(position)
        val t = holder.tasarim

        t.imageViewEnId.setImageResource(context.resources.getIdentifier(filim.resim,"drawable",context.packageName))


        t.cardEnId.setOnClickListener(){
            val kecid =AnasayfaFragmentDirections.kecidDetay(filim)
            Navigation.findNavController(it).navigate(kecid)
        }
    }


}
