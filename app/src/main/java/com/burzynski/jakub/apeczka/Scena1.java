package com.burzynski.jakub.apeczka;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by student on 14.03.2017.
 */

public class Scena1 extends AppCompatActivity {
    ImageButton p5;
    Button b1, b2;
    TextView t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scena1);

        t3 = (TextView) findViewById(R.id.t3);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        p5 = (ImageButton) findViewById(R.id.p5);

        p5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t3.setText("To jest lepsze niż u Szerszenia, Marcinie");

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t3.setTextColor(0x3fff3f3f);
            }
        });


    }
}