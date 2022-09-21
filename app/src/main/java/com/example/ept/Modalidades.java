package com.example.ept;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;


public class Modalidades extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modalidades);

    }

    public void futsal(View view){
        gotoLink(getResources().getString(R.string.link_futsal));
    }

    public void voileibol(View view){
        gotoLink(getResources().getString(R.string.link_voileibol));
    }
    public void basquetebol(View view){
        gotoLink(getResources().getString(R.string.link_basquetebol));
    }
    public void queimada(View view){
        gotoLink(getResources().getString(R.string.link_queimada));
    }
    public void handbol(View view){
        gotoLink(getResources().getString(R.string.link_handbol));
    }
    private void gotoLink(String link){
        Uri uri = Uri.parse(link);
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(Intent.createChooser(it, getString(R.string.chNavegador)));

    }

}