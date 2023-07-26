package com.example.uygulamaseansi.uygulamaseansi2_26072023.soru3

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