package com.kenanhaciyev.movi_task.data.entity

import java.io.Serializable

data class Filim(var id:Int,
                 var ad:String,
                 var resim:String,
                 var qiymet:Int,
                 var url:String):Serializable {
}