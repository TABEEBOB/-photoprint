package com.example.phonephotoprint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   //declare and initialize all variables to use
    EditText copies;
    TextView cost;
    RadioButton _4x6_19_cents;
    RadioButton  _5x7_49_cents;
    RadioButton  _8x10_79_cents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //set the logo to be displayed on app
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher_foreground);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

            //link all variables to ids created in string.xml
        copies = (EditText)findViewById(R.id.numOfcopies);
        cost = (TextView)findViewById(R.id.total_cost);
        _4x6_19_cents = (RadioButton)findViewById(R.id.rdo4x6);
        _5x7_49_cents = (RadioButton)findViewById(R.id.rdo5x7);
        _8x10_79_cents = (RadioButton)findViewById(R.id.rdo8x10);
    }

    public void price_view(View view) {
        double copies_entered = new Double(copies.getText().toString()); //convert value entered into string
        double price = 0;
        if (_4x6_19_cents.isChecked() && copies_entered <= 50){

            price = copies_entered * .19;
            double rounded = Math.round(price); //use the math.round() to round price to the nearest whole
            cost.setText(Double.toString(rounded));
        }
        else if (_5x7_49_cents.isChecked() && copies_entered <= 50){
            price = copies_entered * .49;
            double rounded = Math.round(price);//use the math.round() to round price to the nearest whole
            cost.setText(Double.toString(rounded));
        }
        else  if(_8x10_79_cents.isChecked() && copies_entered <= 50){
            price = copies_entered * .79;
            double rounded = Math.round(price); //use the math.round() to round price to the nearest whole
            cost.setText(Double.toString(rounded));
        }
    }
}
