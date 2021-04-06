package com.example.tugasnilai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn_kirim;
    private EditText e_Nama,e_NIM,e_Nilai;
    private TextView t_Nama,t_NIM,t_Nilai;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_kirim = findViewById(R.id.btn_kirim);
        e_Nama = findViewById(R.id.e_Nama);
        e_NIM = findViewById(R.id.e_NIM);
        e_Nilai = findViewById(R.id.e_Nilai);

        btn_kirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setContentView(R.layout.hasil);
                String sNama = e_Nama.getText().toString();
                String sNIM = e_NIM.getText().toString();
                String sNilai = e_Nilai.getText().toString();

                double nilai = Double.parseDouble(sNilai);
                t_Nama = findViewById(R.id.t_Nama);
                t_NIM = findViewById(R.id.t_NIM);
                t_Nilai = findViewById(R.id.t_Nilai);

                t_Nama.setText("Nama : " + sNama);
                t_NIM.setText("NIM : " + sNIM);

                if (nilai <= 4.00) {t_Nilai.setText("Nilai : A ");}
                else  if (nilai <= 3.66) {t_Nilai.setText("Nilai : A-");}
                else  if (nilai <= 3.33) {t_Nilai.setText("Nilai : B+");}
                else  if (nilai <= 3.00) {t_Nilai.setText("Nilai : B ");}
                else  if (nilai <= 2.66) {t_Nilai.setText("Nilai : B-");}
                else  if (nilai <= 2.33) {t_Nilai.setText("Nilai : C+");}
                else  if (nilai <= 2.00) {t_Nilai.setText("Nilai : C ");}
                else  if (nilai <= 1.66) {t_Nilai.setText("Nilai : C-");}
                else  if (nilai <= 1.33) {t_Nilai.setText("Nilai : D+");}
                else  if (nilai == 1.00) {t_Nilai.setText(": D ");}
                else {t_Nilai.setText("Nilai salah input ");}

            }
        });

    }

}