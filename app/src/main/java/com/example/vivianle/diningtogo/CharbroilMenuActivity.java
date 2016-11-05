package com.example.vivianle.diningtogo;

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


public class CharbroilMenuActivity extends AppCompatActivity {

    protected boolean[] orders;

    public CharbroilMenuActivity() {
        orders = new boolean[4];
        for (int i = 0; i < orders.length; i++) {
            orders[i] = false;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charbroil_menu);
        final EditText notice = (EditText) findViewById(R.id.note);


        final CheckBox slicedTurkeyBr = (CheckBox) findViewById(R.id.checkBox);
        slicedTurkeyBr.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (slicedTurkeyBr.isChecked()) {
                    System.out.println("Checked");
                    orders[0] = true;

                } else {
                    System.out.println("Un-Checked");
                    orders[0] = false;
                }
            }
        });


        final CheckBox checkTurkeySand = (CheckBox) findViewById(R.id.checkBox3);
        checkTurkeySand.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (checkTurkeySand.isChecked()) {
                    System.out.println("Checked");
                    orders[1] = true;

                } else {
                    System.out.println("Un-Checked");
                    orders[1] = false;
                }
            }
        });


        final CheckBox checkRoastBeef = (CheckBox) findViewById(R.id.checkBox4);
        checkRoastBeef.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (checkRoastBeef.isChecked()) {
                    System.out.println("Checked");
                    orders[2] = true;


                } else {
                    System.out.println("Un-Checked");
                    orders[2] = false;
                }
            }
        });


        final CheckBox checkHam = (CheckBox) findViewById(R.id.checkBox5);
        checkHam.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (checkHam.isChecked()) {
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
                        LoginActivity.getCurrentStu().getMyCart().addToCart(1, i, notice.getText().toString());
                }
                Intent cartIntent = new Intent(CharbroilMenuActivity.this, CartActivity.class);
                CharbroilMenuActivity.this.startActivity(cartIntent);
            }
        });
    }
}