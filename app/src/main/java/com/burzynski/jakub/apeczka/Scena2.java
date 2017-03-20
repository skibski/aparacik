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


        RowLista RowBean_data[] = new RowLista[] {

                new RowLista(R.drawable.slowacki, "Mercedes"),
                new RowLista(R.drawable.slowacki, "Volkswagen"),
                new RowLista(R.drawable.slowacki, "BMW"),
                new RowLista(R.drawable.slowacki, "Aston Martin"),
                new RowLista(R.drawable.slowacki, "Mercedes"),
                new RowLista(R.drawable.slowacki, "Volkswagen"),
                new RowLista(R.drawable.slowacki, "BMW"),
                new RowLista(R.drawable.slowacki, "Aston Martin"),
                new RowLista(R.drawable.slowacki, "Mercedes"),
                new RowLista(R.drawable.slowacki, "Volkswagen"),
                new RowLista(R.drawable.slowacki, "BMW"),
                new RowLista(R.drawable.slowacki, "Aston Martin"),
                new RowLista(R.drawable.slowacki, "Mercedes"),
                new RowLista(R.drawable.slowacki, "Volkswagen"),
                new RowLista(R.drawable.slowacki, "BMW"),
                new RowLista(R.drawable.slowacki, "Aston Martin")
        };

        RowAdapter adapter = new RowAdapter(this,
                R.layout.main_layout, RowBean_data);

        list = (ListView) findViewById(R.id.list);

        list.setAdapter(adapter);
    }
}




