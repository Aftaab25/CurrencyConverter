package io.chromiumhead.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Rupees2Dollars extends AppCompatActivity {

    private EditText etRupeeInput;
    private TextView convValue;
    private Button btn_r2d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rupees2_dollars);
    }

    public void rupee2dollarconvert(View view){
        etRupeeInput = findViewById(R.id.ET_rupee_input);
        convValue = findViewById(R.id.tv_converted_value2);
        btn_r2d = findViewById(R.id.btn_convert_r2d);

        String rupeeValue = etRupeeInput.getText().toString();

        if(rupeeValue.equals("")){
            Toast.makeText(this, "Please enter a value", Toast.LENGTH_SHORT).show();
        } else{
            double rupeeValueDouble = Double.parseDouble(rupeeValue);

            double ans = rupeeValueDouble / 80.5;

            convValue.setText("Rupees\n" + String.format("%.2f", ans) );
        }


    }

}