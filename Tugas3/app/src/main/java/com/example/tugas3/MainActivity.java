package com.example.tugas3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Integer> image = new ArrayList<Integer>();
    private ArrayList<String> judul = new ArrayList<>();
    private ArrayList<String> maker = new ArrayList<>();
    private ArrayList<String> detail = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataTeamBasketball();
    }

    private void processRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.rv_games);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(image, judul, maker, detail,this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataTeamBasketball(){
        judul.add("Minecraft");
        image.add(R.drawable.pict1);
        maker.add("By Moajang");
        detail.add("Decs Minecraft");

        judul.add("League of Legend");
        image.add(R.drawable.pict2);
        maker.add("By Riot Games");
        detail.add("Decs LoL");

        judul.add("Counter-Strike: Global Offensive");
        image.add(R.drawable.pict3);
        maker.add("By Valve Corporation");
        detail.add("Decs CSGO");

        judul.add("Call of Duty: Modern Warfare/Warzone");
        image.add(R.drawable.pict4);
        maker.add("By Activision");
        detail.add("Decs Warzone");

        judul.add("Valorant");
        image.add(R.drawable.pict6);
        maker.add("By Riot Games");
        detail.add("Decs game beta");

        judul.add("Grand Theft Auto V");
        image.add(R.drawable.pict7);
        maker.add("By Rockstar Games");
        detail.add("Decs GTA");

        judul.add("Fortnite");
        image.add(R.drawable.pict7);
        maker.add("By Epic Games");
        detail.add("Decs Fornut");

        judul.add("Apex Legend");
        image.add(R.drawable.pict8);
        maker.add("By Electronic Arts");
        detail.add("Decs Apex");

        judul.add("Roblox");
        image.add(R.drawable.pict9);
        maker.add("By Roblox Corporation");
        detail.add("Decs Roblux");

        judul.add("Rocket League");
        image.add(R.drawable.pict10);
        maker.add("By Psyonix");
        detail.add("Decs Tsubasha");

        processRecyclerViewAdapter();
    }
}