package com.example.uygulamaseansi.uygulamaseansi2_26072023.soru3
/*
Bir string içindeki tüm sesli harfleri kaldıran bir fonksiyon yazın. Fonksiyon, kullanıcıdan alınan
bir string içindeki tüm sesli harfleri kaldırarak yeni bir string döndürmelidir.
 */
fun main() {
    println("Lütfen bir metin girin:")
    val girdi = readLine()?.trim() ?: ""
    val sonuc = sesliSil(girdi)
    println("Sesli harfler çıkarıldıktan sonra: $sonuc")
}

fun sesliSil(input: String): String {
    val sesliHarf = "aeiouAEIOU"
    return input.filter { it !in sesliHarf }
}