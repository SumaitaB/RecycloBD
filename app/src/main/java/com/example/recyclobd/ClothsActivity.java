package com.example.recyclobd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ClothsActivity extends AppCompatActivity {
    private EditText weight;
    private Button submit,sell;
    private TextView result;
    double result0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cloths);
        submit = (Button) findViewById(R.id.submit_button);
        sell= (Button) findViewById(R.id.sell);
        result = (TextView) findViewById(R.id.result);
        weight=(EditText)findViewById(R.id.weight);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double amount= Double.parseDouble(weight.getText().toString());
                result0=(amount*20);
                result.setText(String.valueOf("Total Price of your product is:\t"+result0+"Tk"));

            }
        });
        sell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ClothsActivity.this, PaymentActivity.class);

                startActivity(intent);


            }
        });

    }
}
