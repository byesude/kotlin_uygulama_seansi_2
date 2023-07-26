package com.example.uygulamaseansi.uygulamaseansi2_26072023.soru1

class Dikdortgen(private val uzunluk: Double, private val genislik: Double) {

    fun alanHesapla(): Double {
        return uzunluk * genislik
    }

    fun cevreHesapla(): Double {
        return 2 * (uzunluk + genislik)
    }
}