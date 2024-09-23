package com.example.myapplication;

public class İslemler {
    public double ortalamahesapla(double... sayilar){

        double toplam = 0;

        for (double d:sayilar){
            toplam = toplam + d;
        }
        return toplam/sayilar.length;
    }
}
