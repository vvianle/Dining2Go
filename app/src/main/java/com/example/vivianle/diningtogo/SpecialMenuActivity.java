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

public class SpecialMenuActivity extends AppCompatActivity {

    protected boolean[] orders;

    public SpecialMenuActivity() {
        orders = new boolean[4];
        for (int i = 0; i < orders.length; i++) {
            orders[i] = false;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_special_menu);
        final EditText notice = (EditText) findViewById(R.id.note);

        final CheckBox checkPadThai = (CheckBox) findViewById(R.id.checkBox);
        checkPadThai.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (checkPadThai.isChecked()) {
                    System.out.println("Checked");
                    orders[0] = true;

                } else {
                    System.out.println("Un-Checked");
                    orders[0] = false;
                }
            }
        });

        final CheckBox checkPho = (CheckBox) findViewById(R.id.checkBox3);
        checkPho.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (checkPho.isChecked()) {
                    System.out.println("Checked");
                    orders[1] = true;

                } else {
                    System.out.println("Un-Checked");
                    orders[1] = false;
                }
            }
        });

        final CheckBox checkDal = (CheckBox) findViewById(R.id.checkBox4);
        checkDal.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (checkDal.isChecked()) {
                    System.out.println("Checked");
                    orders[2] = true;


                } else {
                    System.out.println("Un-Checked");
                    orders[2] = false;
                }
            }
        });


        final CheckBox checkRice = (CheckBox) findViewById(R.id.checkBox5);
        checkRice.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                if (checkRice.isChecked()) {
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
                        LoginActivity.getCurrentStu().getMyCart().addToCart(4, i, notice.getText().toString());
                }
                Intent cartIntent = new Intent(SpecialMenuActivity.this, CartActivity.class);
                SpecialMenuActivity.this.startActivity(cartIntent);
            }
        });
    }

}
