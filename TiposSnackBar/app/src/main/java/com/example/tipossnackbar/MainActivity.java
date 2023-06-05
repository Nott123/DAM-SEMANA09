package com.example.tipossnackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnSnackBar;
    Button btnSnackBar1;
    Button btnSnackBar2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSnackBar = findViewById(R.id.buttonlonger);
        btnSnackBar.setOnClickListener(this);
        btnSnackBar1 = findViewById(R.id.buttonshort);
        btnSnackBar1.setOnClickListener(this);
        btnSnackBar2 = findViewById(R.id.buttonindef);
        btnSnackBar2.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.buttonlonger){
            Snackbar.make(view, "Mensaje de Tipo SnackBar", Snackbar.LENGTH_LONG).show();
        }
        if(view.getId()==R.id.buttonshort){
            Snackbar.make(view, "Mensaje de Tipo SnackBar", Snackbar.LENGTH_SHORT).show();
        }
        if(view.getId()==R.id.buttonindef){
            Snackbar.make(view, "Mensaje de Tipo SnackBar", Snackbar.LENGTH_INDEFINITE).show();
        }
    }
}