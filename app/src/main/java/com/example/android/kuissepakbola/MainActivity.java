package com.example.android.kuissepakbola;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText isiNama;
    Button lanjut;
//    Button lanjut, keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        castingId();
        lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isiNama.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Please Input data !", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent Main2Activity = new Intent(MainActivity.this, Main2Activity.class);
                    Main2Activity.putExtra("Username", isiNama.getText().toString());
                    startActivity(Main2Activity);
                }
            }
        });
//        keluar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                finish();
//            }
//        });
    }

    public void castingId(){
        isiNama = (EditText) findViewById(R.id.isi);
        lanjut = (Button) findViewById(R.id.next);
//        keluar = (Button) findViewById(R.id.exit);
    }
}


