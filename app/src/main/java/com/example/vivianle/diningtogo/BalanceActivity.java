package com.example.vivianle.diningtogo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import android.widget.CheckBox;
import android.widget.TextView;

public class BalanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance);

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));

        final TextView today = (TextView) findViewById(R.id.date);
        today.setText(dateFormat.format(date));

        final TextView name = (TextView) findViewById(R.id.name);
        name.setText(LoginActivity.getCurrentStu().getName());

        final TextView email = (TextView) findViewById(R.id.email);
        email.setText("Email: " + LoginActivity.getCurrentStu().getUsername() + "@mtholyoke.edu");

        final TextView dollar = (TextView) findViewById(R.id.dollar);
        dollar.setText("Dining Dollars: " + Double.toString(LoginActivity.getCurrentStu().getDiningDollars()));

        final CheckBox swipe = (CheckBox) findViewById(R.id.swipe);
        if (LoginActivity.getCurrentStu().getSwipeMeal())
            swipe.isChecked();

        final TextView id = (TextView) findViewById(R.id.id);
        id.setText("MHC ID: " + Integer.toString(LoginActivity.getCurrentStu().getUserID()));
    }
}
