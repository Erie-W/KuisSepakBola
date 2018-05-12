package com.example.android.kuissepakbola;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    TextView UserName;
    String str_Username;
    EditText jawabanPertama;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        castingId();
        UserName.setText("Halo, "+str_Username);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(jawabanPertama.getText().toString().equals("Bambang Pamungkas")) {
                    Intent jawaban = new Intent(Main2Activity.this, Main3Activity.class);
                    startActivity(jawaban);
                    Toast.makeText(getApplicationContext(),"Jawaban Kamu Benar!",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getApplicationContext(), "Jawaban Salah! Coba lagi.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


    public void castingId(){
        str_Username = getIntent().getStringExtra("Username");
        UserName = (TextView) findViewById(R.id.username);
        jawabanPertama = (EditText) findViewById(R.id.jawabPertama);
        next = (Button) findViewById(R.id.cekJawabPertama);
    }
}
