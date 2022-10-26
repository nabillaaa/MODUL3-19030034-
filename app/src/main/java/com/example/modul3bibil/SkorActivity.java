package com.example.modul3bibil;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SkorActivity extends AppCompatActivity {
    int skorA = 0;
    int skorB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skor);

        TextView namaTimA = findViewById(R.id.tv_TimA);
        TextView namaTimB = findViewById(R.id.tv_TimB);

        String namaA = getIntent().getStringExtra("Tim A") ;
        String namaB = getIntent().getStringExtra("Tim B");

    }

    public void tambah (View view) {
        if (view.getId()==R.id.A1) {
            skorA=skorA+1;
        }else if (view.getId()==R.id.A2){
            skorA=skorA+2;
        }else if ( view. getId()==R.id.A3){
            skorA=skorA+3;
        }else if ( view. getId()==R.id.B1) {
            skorB= skorB+1;
        }else if ( view. getId()==R.id.B2) {
            skorB= skorB+2;
        }else if ( view. getId()==R.id.B3) {
            skorB=skorB+3;
        }
        TextView skorTimA = findViewById(R.id.SkorA);
        TextView skorTimB = findViewById(R.id.SkorB);

        skorTimA.setText(String.valueOf(skorA));
        skorTimB.setText(String.valueOf(skorB));
    }
    public void Reset(View view){
        if(view.getId()==R.id.ResetA){
            skorA=0;
        }
        else if (view.getId()==R.id.ResetB){
            skorB=0;
        }
        TextView skortimA = findViewById(R.id.SkorA);
        TextView skortimB = findViewById(R.id.SkorB);

        skortimA.setText(String.valueOf(skorA));
        skortimB.setText(String.valueOf(skorB));
    }
}
