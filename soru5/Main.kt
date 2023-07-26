package com.example.uygulamaseansi.uygulamaseansi2_26072023.soru5
/*
Bir String türünde ArrayList oluşturun ve içine "ahmet", "mehmet", "ayşe", "feyza", "emir" gibi
isimleri ekleyin. Kullanıcıdan alınan bir indeks numarasına göre listedeki ismi güncelleyen bir
fonksiyon yazın. Yani kullanıcı, "ahmet" isminin indeksini ve yeni ismi (örn. "ali") girerek
listedeki "ahmet" ismini "ali" olarak değiştirebilsin.
 */
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
