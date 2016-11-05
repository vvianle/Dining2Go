package com.example.vivianle.diningtogo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class GrilledMenuActivity extends AppCompatActivity {

    protected boolean[] orders;

    public GrilledMenuActivity() {
        orders = new boolean[4];
        for (int i = 0; i < orders.length; i++) {
            orders[i] = false;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grilled_menu);
        final EditText notice = (EditText) findViewById(R.id.note);


        final CheckBox checkGrillcheese = (CheckBox) findViewById(R.id.checkBox);
        checkGrillcheese.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (checkGrillcheese.isChecked()) {
                    System.out.println("Checked");
                    orders[0] = true;

                } else {
                    orders[0] = false;
                }
            }
        });


        final CheckBox checkVegetarian = (CheckBox) findViewById(R.id.checkBox3);
        checkVegetarian.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (checkGrillcheese.isChecked()) {
                    System.out.println("Checked");
                    orders[1] = true;

                } else {
                    System.out.println("Un-Checked");
                    orders[1] = false;
                }
            }
        });


        final CheckBox checkMonterey = (CheckBox) findViewById(R.id.checkBox4);
        checkMonterey.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (checkMonterey.isChecked()) {
                    System.out.println("Checked");
                    orders[2] = true;


                } else {
                    System.out.println("Un-Checked");
                    orders[2] = false;
                }
            }
        });


        final CheckBox checkPhilly = (CheckBox) findViewById(R.id.checkBox5);
        checkPhilly.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (checkPhilly.isChecked()) {
                    System.out.println("Checked");
                    orders[3] = true;


                } else {
                    System.out.println("Un-Checked");
                    orders[3] = false;
                }
            }
        });




        final Button addToCartButton = (Button) findViewById(R.id.button);
        addToCartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < orders.length; i++) {
                    if (orders[i])
                        LoginActivity.getCurrentStu().getMyCart().addToCart(2, i, notice.getText().toString());
                }
                Intent cartIntent = new Intent(GrilledMenuActivity.this, CartActivity.class);
                GrilledMenuActivity.this.startActivity(cartIntent);
            }
        });
    }
}
