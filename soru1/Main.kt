package com.example.uygulamaseansi.uygulamaseansi2_26072023.soru1
/*
Bir "Dikdörtgen" adlı sınıf oluşturun ve uzunluk ve genişlik gibi özellikleri içeren özellikleri tanımlayın.
Ardından, bu sınıftan bir dikdörtgen nesnesi oluşturun ve dikdörtgenin alanını ve çevresini hesaplayan
bir fonksiyon yazın.
 */
fun main() {
    val dikdortgen = Dikdortgen(5.0, 3.0)

    println("Dikdörtgenin Alanı: ${dikdortgen.alanHesapla()}")
    println("Dikdörtgenin Çevresi: ${dikdortgen.cevreHesapla()}")
}