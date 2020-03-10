package com.example.volumbalok;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText txtpanjang, txtlebar, txttinggi;
    Button btnhitung;
    TextView txthasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtpanjang=findViewById(R.id.panjang);
        txtlebar=findViewById(R.id.lebar);
        txttinggi=findViewById(R.id.tinggi);
        btnhitung=findViewById(R.id.hitung);
        txthasil=findViewById(R.id.hasil);

        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int p, l, t, v;

                if(txtpanjang.getText().toString().isEmpty()){
                    txtpanjang.setError("harap diisi dahulu");
                    return;
                }
                if(txtlebar.getText().toString().isEmpty()){
                    txtlebar.setError("harap diisi dahulu");
                    return;
                }
                if(txttinggi.getText().toString().isEmpty()){
                    txttinggi.setError("harap diisi dahulu");
                    return;
                }

                p=Integer.parseInt(txtpanjang.getText().toString());
                l=Integer.parseInt(txtlebar.getText().toString());
                t=Integer.parseInt(txttinggi.getText().toString());

                v=p*l*t;

                txthasil.setText(String.valueOf(v));
            }
        });
    }
}