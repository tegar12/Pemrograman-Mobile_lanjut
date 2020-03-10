package com.example.mybiodata;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class biodata extends AppCompatActivity implements View.OnClickListener {
Button telf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
        telf = findViewById(R.id.hp);
        telf.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.hp:
                String telfone = "08157977739";
                Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: " + telfone));
                startActivity(callIntent);

        }
    }
}
