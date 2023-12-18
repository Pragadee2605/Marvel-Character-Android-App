package com.pragadees.marvelassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler

class MainActivity : AppCompatActivity() {
    private lateinit var  recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     recyclerView = findViewById(R.id.recycler_view)

        val list = ArrayList<marvel>()
        list.add(marvel(R.drawable.ironman , "IRON MAN"))
        list.add(marvel(R.drawable.spiderman , "SPIDER MAN"))
        list.add(marvel(R.drawable.blackpanther , "BLACK PANTHER"))
        list.add(marvel(R.drawable.captainamerica , "CAPTAIN AMERICA"))
        list.add(marvel(R.drawable.destroyer , "DRAX THE DESTROYER"))
        list.add(marvel(R.drawable.doctorstrange , "DOCTOR STRANGE"))
        list.add(marvel(R.drawable.falkan , "FALCON"))
        list.add(marvel(R.drawable.gamora , "GAMORA"))
        list.add(marvel(R.drawable.groot , "GROOT"))
        list.add(marvel(R.drawable.hakai , "HAWKEYE"))
        list.add(marvel(R.drawable.hela , "HELA"))
        list.add(marvel(R.drawable.nickfury , "NICK FURY"))
        list.add(marvel(R.drawable.rona , "RONA"))
        list.add(marvel(R.drawable.wintersolider, "WINTER SOLIDER"))
        list.add(marvel(R.drawable.warmission, "WAR MISSION"))
        list.add(marvel(R.drawable.vision, "VISION"))
        list.add(marvel(R.drawable.thanos, "THANOS"))
        list.add(marvel(R.drawable.thor, "THOR"))
        list.add(marvel(R.drawable.starload, "STAR LOAD"))
        list.add(marvel(R.drawable.shehulk, "SHE HULK"))
        list.add(marvel(R.drawable.redskill, "RED SKILL"))
        list.add(marvel(R.drawable.msmarval, "MS MARVAL"))
        list.add(marvel(R.drawable.moonnight, "MOON KNIGHT"))
        list.add(marvel(R.drawable.loki, "LOKI"))
        list.add(marvel(R.drawable.captainmarvel, "CAPTAIN MARVEL"))
     val marvelAdapter = marvelAdapter(list)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = marvelAdapter
    }
}