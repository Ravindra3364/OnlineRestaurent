package com.example.tickets4you;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.List;

public class HomeActivity extends AppCompatActivity {
ImageView imageOne,imageTwo,imageThree,imageFour,imageFive,imageSix;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

imageOne=findViewById(R.id.hotelOne);
imageTwo=findViewById(R.id.hotelTwo);

        imageThree=findViewById(R.id.hotelThree);
        imageFour=findViewById(R.id.hotelFour);

        imageFive=findViewById(R.id.hotelFive);
        imageSix=findViewById(R.id.hotelSix);
imageOne.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i=new Intent(HomeActivity.this, Items.class);
        startActivity(i);
    }
});
imageTwo.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i=new Intent(HomeActivity.this, Items.class);
        startActivity(i);

    }
});
imageThree.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i=new Intent(HomeActivity.this, Items.class);
        startActivity(i);
    }
});
imageFour.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i=new Intent(HomeActivity.this, Items.class);
        startActivity(i);
    }
});
imageFive.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i=new Intent(HomeActivity.this, Items.class);
        startActivity(i);
    }
});
imageSix.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i=new Intent(HomeActivity.this, Items.class);
        startActivity(i);
    }
});
    }
}
