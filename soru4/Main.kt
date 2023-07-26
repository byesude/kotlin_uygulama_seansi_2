package com.example.uygulamaseansi.uygulamaseansi2_26072023.soru4

import java.util.Scanner
/*
Bir Integer türünde ArrayList oluşturun ve kullanıcıdan alınan 5 adet sayıyı bu listeye ekleyin.
Ardından, listedeki sayıları toplayan bir fonksiyon yazın ve sonucu ekrana yazdırın.
 */
fun main() {
    val sayiListesi = arrayListOf<Int>()

    val scanner = Scanner(System.`in`)
    for (i in 1..5) {
        print("Sayı $i: ")
        val sayi = scanner.nextInt()
        sayiListesi.add(sayi)
    }

    val toplam = toplamiHesapla(sayiListesi)

    println("Girilen sayıların toplamı: $toplam")
}

fun toplamiHesapla(sayilar: ArrayList<Int>): Int {
    var toplam = 0
    for (sayi in sayilar) {
        toplam += sayi
    }
    return toplam
}
