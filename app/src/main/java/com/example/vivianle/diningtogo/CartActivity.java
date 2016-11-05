package com.example.vivianle.diningtogo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class CartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        final TextView order = (TextView) findViewById(R.id.order);

        order.setText(LoginActivity.getCurrentStu().getMyCart().toString());

        final TextView sumT = (TextView) findViewById(R.id.sum);

        sumT.setText(Double.toString(LoginActivity.getCurrentStu().getMyCart().getPrice()));

        final Button orderBtn = (Button) findViewById(R.id.orderBtn);

        orderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                LoginActivity.getCurrentStu().resetCart();


                Cart cart = LoginActivity.getCurrentStu().getMyCart();

                if (!LoginActivity.getCurrentStu().getSwipeMeal()) {
                    if (cart.getPrice() > 7.5) {
                        if (cart.getPrice() - 7.5 < LoginActivity.getCurrentStu().getDiningDollars()) {
                            LoginActivity.getCurrentStu().setSwipeMeal();
                            LoginActivity.getCurrentStu().decreaseDiningDollar(cart.getPrice() - 7.5);
                            LoginActivity.getCurrentStu().resetCart();
                            order.setText(null);
                            sumT.setText("0.0");
                        }
                    }
                    else {
                        LoginActivity.getCurrentStu().setSwipeMeal();
                        LoginActivity.getCurrentStu().resetCart();
                        order.setText(null);
                        sumT.setText("0.0");
                    }
                }
                else {
                    if (cart.getPrice() < LoginActivity.getCurrentStu().getDiningDollars()) {
                        LoginActivity.getCurrentStu().decreaseDiningDollar(cart.getPrice());
                        LoginActivity.getCurrentStu().resetCart();
                        order.setText(null);
                        sumT.setText("0.0");
                    }
                }
            }
        });
    }
}
