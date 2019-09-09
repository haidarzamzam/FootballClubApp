package com.haidar.root.footballclubapp.menu.club.views

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.haidar.root.footballclubapp.menu.club.adapter.ClubAdapter
import com.haidar.root.footballclubapp.menu.club.models.ClubModel
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.recyclerview.v7.recyclerView
import org.jetbrains.anko.setContentView

class ClubActivity : AppCompatActivity() {

    private val listClub: ArrayList<ClubModel> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ClubsActivityUI().setContentView(this)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        listClub.add(
            ClubModel(
                "Barcelona FC",
                "Fútbol Club Barcelona, juga dikenal sebagai Barcelona atau Barça, adalah klub sepak bola profesional yang berbasis di Barcelona, Catalunya, Spanyol.",
                "http://haidev.xyz/assets/icon_dicoding/img_barca.png"
            )
        )
        listClub.add(
            ClubModel(
                "Real Madrid FC",
                "Real Madrid Club de Fútbol, umumnya dikenal sebagai Real Madrid, adalah klub sepak bola profesional yang berbasis di Madrid, Spanyol. Didirikan pada tahun 1902 sebagai Madrid Football Club, secara tradisional mengenakan kostum kandang putih.",
                "http://haidev.xyz/assets/icon_dicoding/img_madrid.png"
            )
        )
        listClub.add(
            ClubModel(
                "Bayern Munich FC",
                "Fußball-Club Bayern München e.V., juga dikenal sebagai FC Bayern München, FC Bayern Munich, atau FC Bayern, adalah sebuah klub olahraga Jerman yang berbasis di München, Bavaria.",
                "http://haidev.xyz/assets/icon_dicoding/img_bayern.png"
            )
        )
        listClub.add(
            ClubModel(
                "Manchester City FC",
                "Manchester City Football Club adalah sebuah klub sepak bola profesional dari Inggris yang bermain di Liga Premier Inggris. Klub ini merupakaan klub sekota dengan Manchester United dan bermarkas di Stadion Etihad, Manchester. Pertandingan pertama dimainkan pada bulan November 1880.",
                "http://haidev.xyz/assets/icon_dicoding/img_city.png"
            )
        )
        listClub.add(
            ClubModel(
                "Manchester United FC",
                "Manchester United Football Club adalah sebuah klub sepak bola profesional Inggris yang berbasis di Old Trafford, Manchester Raya, yang bermain di Liga Inggris.",
                "http://haidev.xyz/assets/icon_dicoding/img_mu.png"
            )
        )
        listClub.add(
            ClubModel(
                "AC Milan FC",
                "Associazione Calcio Milan, sering disebut sebagai A.C. Milan atau hanya Milan, adalah sebuah klub sepak bola Italia yang berbasis di Milan, Lombardia, yang bermain di Serie A. Mereka bermain dengan seragam bergaris merah-hitam dan celana putih, sehingga dijuluki rossoneri.",
                "http://haidev.xyz/assets/icon_dicoding/img_acm.png"
            )
        )
        listClub.add(
            ClubModel(
                "Chelsea FC",
                "Chelsea Football Club adalah sebuah klub sepak bola Inggris yang bermarkas di Fulham, London. Chelsea didirikan pada tahun 1905 dan kini berkompetisi di Liga Utama Inggris. Kesuksesan pertama Chelsea diraih saat meraih gelar juara liga pada tahun 1955.",
                "http://haidev.xyz/assets/icon_dicoding/img_chelsea.png"
            )
        )
        listClub.add(
            ClubModel(
                "Arsenal FC",
                "Arsenal Football Club adalah klub sepak bola profesional Inggris yang berbasis di daerah Holloway, London. didirikan pada 1886 dengan nama Dial Square.",
                "http://haidev.xyz/assets/icon_dicoding/img_arsenal.png"
            )
        )
        listClub.add(
            ClubModel(
                "Arema FC",
                "Arema FC, atau biasa disebut dan dikenal sebagai Arema, adalah sebuah klub sepak bola yang berasal dari Malang, Jawa Timur, Indonesia. Arema didirikan pada tanggal 11 Agustus 1987, Arema mempunyai julukan Singo Edan.",
                "http://haidev.xyz/assets/icon_dicoding/img_arema.png"
            )
        )
        listClub.add(
            ClubModel(
                "Persebaya FC",
                "Persebaya Surabaya yang sempat merubah namanya menjadi Persebaya 1927 adalah sebuah klub Sepak bola profesional di Indonesia yang berbasis di Surabaya yang berdiri pada 18 Juni 1927 dengan nama Soerabajasche Indische Voetbal Bond dan sudah malang melintang dikancah sepakbola Indonesia.",
                "http://haidev.xyz/assets/icon_dicoding/img_persebaya.png"
            )
        )
        listClub.add(
            ClubModel(
                "Persib FC",
                "Persib Bandung adalah sebuah tim sepak bola Indonesia terbesar yang berdiri pada 14 Maret 1933, klub ini berbasis di Bandung, Jawa Barat. Persib saat ini bermain di Gojek Liga 1 Indonesia dan Piala Indonesia. Julukan mereka adalah Maung Bandung dan Pangeran Biru.",
                "http://haidev.xyz/assets/icon_dicoding/img_persib.png"
            )
        )
        listClub.add(
            ClubModel(
                "Persija FC",
                "Persija adalah sepak bola Indonesia yang berbasis di Jakarta. Persija saat ini berlaga di Liga Indonesia. Persija didirikan pada 28 November 1928, tepat sebulan setelah Sumpah Pemuda, dengan cikal bakal bernama Voetbalbond Indonesische Jacatra.",
                "http://haidev.xyz/assets/icon_dicoding/img_persija.png"
            )
        )

        val rv = findViewById<RecyclerView>(ClubsActivityUI.recyclerViewId)
        rv.adapter = ClubAdapter(this, listClub)
    }

    class ClubsActivityUI : AnkoComponent<ClubActivity> {
        companion object {
            const val recyclerViewId = 1
        }

        override fun createView(ui: AnkoContext<ClubActivity>) = with(ui) {
            recyclerView {
                id = recyclerViewId
                layoutManager = LinearLayoutManager(context)
            }
        }
    }

}
