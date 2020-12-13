package com.example.desbloqueacontuhuella;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    private Object View;

    public void una(){
        setContentView(R.layout.activity_main2);

    }
    Button cerrar= (Button) findViewById(R.id.Salir);
    public void onClick(android.view.View v) {
        finish();
    }
}


