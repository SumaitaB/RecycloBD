package com.example.recyclobd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SellProduct extends AppCompatActivity {
    private Spinner spinner;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_sell_product);
        spinner = findViewById(R.id.spinner);

        button = (Button) findViewById(R.id.btn_submit);


        List<String> categories = new ArrayList<>();
        categories.add(0, "Categories");
        categories.add("Plastic");
        categories.add("Paper");
        categories.add("Books");
        categories.add("Glass");
        categories.add("E-waste");
        categories.add("Clothing");
        categories.add("Metal");
        categories.add("Others");
        ArrayAdapter<String> dataAdapter;
        dataAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item, categories);

        //Dropdown layout style
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (parent.getItemAtPosition(position).equals("Categories"))
                {
                    //do nothing
                }
                else
                {
                    //on selecting a spinner item
                    String item = parent.getItemAtPosition(position).toString();

                    //show selected spinner item
                    Toast.makeText(parent.getContext(), "Selected: " +item, Toast.LENGTH_SHORT).show();

                    //anything else you want to do on item selection do here

                    if (parent.getItemAtPosition(position).equals("Plastic"))
                    {
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(SellProduct.this, PlasticProduct.class);

                                startActivity(intent);


                            }
                        });
                    }
                    if (parent.getItemAtPosition(position).equals("Metal"))
                    {
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(SellProduct.this, MetalActivity.class);

                                startActivity(intent);


                            }
                        });
                    }


                    if (parent.getItemAtPosition(position).equals("Paper"))
                    {
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(SellProduct.this, PaperActivity.class);

                                startActivity(intent);


                            }
                        });
                    }
                    if (parent.getItemAtPosition(position).equals("Clothing"))
                    {
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(SellProduct.this, ClothsActivity.class);

                                startActivity(intent);


                            }
                        });
                    }
                    if (parent.getItemAtPosition(position).equals("E-waste"))
                    {
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(SellProduct.this, Ewaste_Product.class);

                                startActivity(intent);


                            }
                        });
                    }
                    if (parent.getItemAtPosition(position).equals("Glass"))
                    {
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(SellProduct.this, GlassActivity.class);

                                startActivity(intent);


                            }
                        });
                    }
                    if (parent.getItemAtPosition(position).equals("Books"))
                    {
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(SellProduct.this,BookActivity.class);

                                startActivity(intent);


                            }
                        });
                    }
                    if (parent.getItemAtPosition(position).equals("Others"))
                    {
                        button.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(SellProduct.this,OthersProduct.class);

                                startActivity(intent);


                            }
                        });
                    }


                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

                // TODO Auto-generated method stub
            }
        });
    }
}
