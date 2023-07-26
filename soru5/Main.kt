package com.example.uygulamaseansi.uygulamaseansi2_26072023.soru5

fun main() {
    val isimlerListesi = arrayListOf("Ahmet", "Mehmet", "Ayşe", "Feyza", "Emir")
    println("İsimler listesi: $isimlerListesi")

    println("Değiştirmek istediğiniz ismin indeksini girin: ")
    val indeks = readLine()?.toIntOrNull()

    if (indeks != null && indeks >= 0 && indeks < isimlerListesi.size) {
        println("Yeni ismi girin: ")
        val yeniIsim = readLine()

        if (!yeniIsim.isNullOrEmpty()) {
            isimlerListesi[indeks] = yeniIsim
            println("Yeni liste: $isimlerListesi")
        } else {
            println("Yeni isim boş olamaz.")
        }
    } else {
        println("İndeks numarası hatalı.")
    }
}
