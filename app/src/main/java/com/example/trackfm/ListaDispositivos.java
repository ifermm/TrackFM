package com.example.trackfm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListaDispositivos extends AppCompatActivity {

    private ArrayList disps;
    private ArrayAdapter adaptador1;
    private ListView lis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_dispositivos);
        disps=new ArrayList();
        disps.add("NAUTEL GV5 - 5KW");
        disps.add("DB Mozart NEXT7000 - 7KW");
        disps.add("DB Mozart NEXT1000 - 1KW");
        adaptador1 = new ArrayAdapter(this,android.R.layout.simple_list_item_1,disps);
        lis=findViewById(R.id.ListV);
        lis.setAdapter(adaptador1);

    }
}