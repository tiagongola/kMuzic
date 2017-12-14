package com.example.fn.kmuzik;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import Models.Album;
import Models.Artista;
import Models.Track;
import Models.artistTrackList;

public class Telaartistadetalhada extends AppCompatActivity {

    RecyclerView   listademusicas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listademusicas = findViewById(R.id.listademusicas);
        setTitle("Força sSuprema");
        Artista fs= new Artista(  1, "Força suprema",  "description",  "Hip-Hop",
                R.drawable.header,  true);
        Track urna=  new Track();
        Album caveira= new Album("caveira","",fs.getId(),  "2k17",  "500,00" );
        urna.setAlbum(caveira);
        urna.setArtist(fs);
        urna.setTrackCover(R.drawable.fs);
        urna.setId(1);
        urna.setaName("urna");
        ArrayList<Track> tracks = new ArrayList<>();
        tracks.add(urna);
        artistTrackList fsTrackList = new artistTrackList( 1, fs.getId(),tracks);
        LinearLayoutManager linearLayoutManeger = new LinearLayoutManager( this );
        listademusicas.setLayoutManager(linearLayoutManeger);




    }
}
