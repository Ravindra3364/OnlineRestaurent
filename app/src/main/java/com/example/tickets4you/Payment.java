package com.example.tickets4you;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class Payment extends AppCompatActivity {
RadioButton radioButton,radioButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        radioButton=findViewById(R.id.radio1);
        radioButton2=findViewById(R.id.radio2);
    }

    public  void paytm(View v)
    {

        String  url = "http://m.p-y.tm";

        if (radioButton.isChecked()) {
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }

        if(radioButton2.isChecked()) {
            Intent ii = new Intent(this, ordersuccess.class);
            startActivity(ii);
        }
    }
}
