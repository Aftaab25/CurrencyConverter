package io.chromiumhead.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void dollar2rupee(View view){
//        Toast.makeText(this, "Button 1Click Click!!", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, Dollars2Rupees.class);
        startActivity(intent);
    }

    public void rupee2dollar(View view){
//        Toast.makeText(this, "Click Click!!", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, Rupees2Dollars.class);
        startActivity(intent);
    }
}