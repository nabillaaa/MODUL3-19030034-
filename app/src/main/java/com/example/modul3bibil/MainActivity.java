package com.example.modul3bibil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button input;

    String TAG = " Main Activity ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = (Button) findViewById(R.id.inputbtn);
        input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText inputnamatimA = findViewById(R.id.inputtimA);
                EditText inputnamatimB = findViewById(R.id.inputtimB);

                String namaTimA = inputnamatimA.getText().toString();
                Log.d(TAG, namaTimA);

                String namaTimB = inputnamatimB.getText().toString();
                Log.d(TAG, namaTimB);


                Intent intent = new Intent(getApplicationContext(), SkorActivity.class);
                intent.putExtra("Tim A", namaTimA);
                intent.putExtra("Tim B", namaTimB);
                startActivity(intent);

            }
        });
    }
}
