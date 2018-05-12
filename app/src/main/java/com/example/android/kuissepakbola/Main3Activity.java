package com.example.android.kuissepakbola;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    EditText jawabanKedua;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        castingId();
        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                if (jawabanKedua.getText().toString().equals("Ahmad Bustomi")){
                    Intent jawaban = new Intent(Main3Activity.this, Main4Activity.class);
                    startActivity(jawaban);
                    Toast.makeText(getApplicationContext(),"Jawaban Kamu Benar!",Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(getApplicationContext(),"Jawaban Kamu Salah, Coba Lagi.",Toast.LENGTH_SHORT).show();                }
            }
        });
    }

    public void castingId(){
        jawabanKedua = (EditText) findViewById(R.id.jawabKedua);
        next = (Button) findViewById(R.id.cekJawabKedua);
    }
}
