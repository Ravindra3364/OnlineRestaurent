package com.example.tickets4you;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Items extends AppCompatActivity {
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);
        b1=findViewById(R.id.payment);

        ListView simpleList;
        String countryList[] = {"Dosa", "Idly", "Chapathi", "Vada", "Upma", "Pesarattu","Bonda","Uggani","Puri","Uttapam","Samosa","Gobhi","AlluDosa","Uggani","Puri","Uttapam","Samosa","Gobhi","AlluDosa"};
        simpleList = (ListView)findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.listview, R.id.textView, countryList);
        simpleList.setAdapter(arrayAdapter);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Items.this,Payment.class);
                startActivity(i);
            }
        });
    }
}
