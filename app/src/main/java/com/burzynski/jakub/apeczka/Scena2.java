package com.burzynski.jakub.apeczka;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by student on 20.03.2017.
 */

public class Scena2 extends AppCompatActivity {

    private ListView list ;
    private ArrayAdapter<String> adapter ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scena2);

        list = (ListView) findViewById(R.id.list);

        String cars[] = {"Honda", "Mercedes", "Fiat", "Ferrari", "Porshe", "Citroen", "Peugeot", "Ford","Honda", "Mercedes", "Fiat", "Ferrari", "Porshe", "Citroen", "Peugeot", "Ford","Honda", "Mercedes", "Fiat", "Ferrari", "Porshe", "Citroen", "Peugeot", "Ford","Honda", "Mercedes", "Fiat", "Ferrari", "Porshe", "Citroen", "Peugeot", "Ford"};

        ArrayList<String> carL = new ArrayList<String>();
        carL.addAll( Arrays.asList(cars) );

        adapter = new ArrayAdapter<String>(this, R.layout.row, carL);
        list.setAdapter(adapter);


    }
}

