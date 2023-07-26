package com.example.uygulamaseansi.uygulamaseansi2_26072023.soru2
/*
"Arac" adlı bir üst sınıf oluşturun ve bu sınıfta araçların hızı ve yakıt tüketimi gibi özellikleri
tanımlayın. Ardından "Otomobil" adlı bir alt sınıf oluşturun ve bu sınıfta otomobil türüne özgü
özellikleri ekleyin. "Otomobil" sınıfı "Arac" sınıfından kalıtım almalıdır. Otomobil sınıfında
"bagajHacmi" adlı bir özelliği ve "bagajAc" adlı bir metodu ekleyin.
 */
fun main() {
    val mercedes = Otomobil(hiz = 200, yakitTuketimi = 10.0, bagajHacmi = 500.0)

    println("Mercedes'in hızı: ${mercedes.hiz} km/saat")
    println("Mercedes'in yakıt tüketimi: ${mercedes.yakitTuketimi} lt/100km")
    println("Mercedes'in bagaj hacmi: ${mercedes.bagajHacmi} litre")

    mercedes.bagajAc()
}
