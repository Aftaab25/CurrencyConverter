package io.chromiumhead.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Dollars2Rupees extends AppCompatActivity {

//    ET_dollar_input
//    tv_converted_value

    private EditText etDollarInput;
    private TextView convValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dollars2_rupees);
    }

    public void dollar2rupeeconvert(View view){
        etDollarInput = findViewById(R.id.ET_dollar_input);
        convValue = findViewById(R.id.tv_converted_value1);

        String dollarValue = etDollarInput.getText().toString();

        if(dollarValue.equals("")){
            Toast.makeText(this, "Please enter a value", Toast.LENGTH_SHORT).show();
        } else{
            double dollarValueDouble = Double.parseDouble(dollarValue);

            double ans = 80.5 * dollarValueDouble;

            convValue.setText("Rupees\n" + String.format("%.2f", ans) );
        }

    }

}