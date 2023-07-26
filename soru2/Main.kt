package com.example.uygulamaseansi.uygulamaseansi2_26072023.soru2

fun main() {
    val mercedes = Otomobil(hiz = 200, yakitTuketimi = 10.0, bagajHacmi = 500.0)

    println("Mercedes'in hızı: ${mercedes.hiz} km/saat")
    println("Mercedes'in yakıt tüketimi: ${mercedes.yakitTuketimi} lt/100km")
    println("Mercedes'in bagaj hacmi: ${mercedes.bagajHacmi} litre")

    mercedes.bagajAc()
}
