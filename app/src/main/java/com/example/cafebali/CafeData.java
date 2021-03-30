package com.example.cafebali;

import java.util.ArrayList;

public class CafeData {
    private static String [] cafeName = {
            "Montana Del Cafe",
            "Dear Lucy Cafe",
            "Koral Restaurant",
            "Penny Lane",
            "Abunawas Restaurant",
            "Akasha Restaurant",
            "Da Maria Bali",
            "The Slow",
            "La Brisa Bali"
    };

    private static String [] cafeDetail = {
            "Montana Del Cafe memiliki design cafe serba putih dan terbuat dari kaca serta pemandangan belakang cafe berupa view Gunung Batur yang sangat megah.",
            "Dear Lucy Cafe menawarkan interior yang instagramable dan dog friendly serta menu makanan yang sehat.",
            "Koral Restaurant memiliki tema underwater restaurant sehingga fine dining disini terasa seperti ditemani ikan-ikan.",
            "Penny Lane memiliki design interior yang unik dan instagramable dengan berbagai artwork dan lukisan-lukisan terkenal bergaya rebel.",
            "Abunawas Restaurant memiliki design arsitektur dan interior bergaya Arabic/Timur Tengah ala-ala Aladdin.",
            "Akasha Restaurant memiliki design yang mengusung tinggi gaya sustainable architecture dengan dekorasi gabungan Abunawas dan Penny Lane.",
            "Da Maria Bali merupakan restaurant Italian yang mengusung tema Osteria (Wine&Simple Food) dengan interior yang didominasi warna baby blue.",
            "The Slow memiliki interior bergaya Scandinavian dilengkapi dengan furniture kayu dan designer cutleries.",
            "La Brisa memiliki atmosfir seperti berada di pantai terdampar dengan interior dan pernak pernik ala bajak laut yang keren."
    };

    private static int [] cafeImage = {
            R.drawable.montana,
            R.drawable.dearlucy,
            R.drawable.koral,
            R.drawable.pennylane,
            R.drawable.abunawas,
            R.drawable.akasha,
            R.drawable.damariacf,
            R.drawable.theslowcf,
            R.drawable.labrisacf
    };

    static ArrayList<Cafe> getListData(){
        ArrayList<Cafe> list = new ArrayList<>();
        for (int position = 0; position <cafeName.length; position++) {
            Cafe cafe = new Cafe();
            cafe.setName(cafeName[position]);
            cafe.setDetail(cafeDetail[position]);
            cafe.setPhoto(cafeImage[position]);
            list.add(cafe);
        }
        return list;
    }
}