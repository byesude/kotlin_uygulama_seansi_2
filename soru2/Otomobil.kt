package com.example.uygulamaseansi.uygulamaseansi2_26072023.soru2

class Otomobil(hiz : Int, yakitTuketimi : Double, val bagajHacmi : Double) : Arac(hiz, yakitTuketimi)
{
    fun bagajAc() {
        println("Bagaj açıldı.")
    }
}