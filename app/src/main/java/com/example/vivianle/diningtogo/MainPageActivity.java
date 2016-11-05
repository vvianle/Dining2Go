package com.example.vivianle.diningtogo;
        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.ImageButton;
        import android.widget.ImageView;
        import android.widget.TextView;

public class MainPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        //final EditText

        // final ImageButton saladButton = (ImageButton) findViewById(R.id.SaladButton);
        // saladButton.setOnClickListener(new View.OnClickListener() {
        //     @Override
        //     public void onClick(View v) {
        //         Intent saladIntent = new Intent(MainPageActivity.this, SaladMenuActivity.class);
        //         MainPageActivity.this.startActivity(saladIntent);
        //     }
        // });


        final ImageButton grilledButton = (ImageButton) findViewById(R.id.GrilledButton);
        grilledButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent grilledIntent = new Intent(MainPageActivity.this,GrilledMenuActivity.class);
                MainPageActivity.this.startActivity(grilledIntent);
            }
        });

        final ImageButton charbroilButton = (ImageButton) findViewById(R.id.CharBroilButton);

        charbroilButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent charbroilIntent = new Intent(MainPageActivity.this, CharbroilMenuActivity.class);
                MainPageActivity.this.startActivity(charbroilIntent);
            }
        });

        final ImageButton specialButton = (ImageButton) findViewById(R.id.Special);

        specialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent specialIntent = new Intent(MainPageActivity.this, SpecialMenuActivity.class);
                MainPageActivity.this.startActivity(specialIntent);
            }
        });

        final ImageView cartView = (ImageView) findViewById(R.id.cart);

        cartView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cartIntent = new Intent(MainPageActivity.this, CartActivity.class);
                MainPageActivity.this.startActivity(cartIntent);
            }
        });

        final ImageView balanceView = (ImageView) findViewById(R.id.balance);

        balanceView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent balanceIntent = new Intent(MainPageActivity.this, BalanceActivity.class);
                MainPageActivity.this.startActivity(balanceIntent);
            }
        });

        final TextView signOut = (TextView) findViewById(R.id.signout);

        signOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent singinIntent = new Intent(MainPageActivity.this, LoginActivity.class);
                MainPageActivity.this.startActivity(singinIntent);
                MainPageActivity.this.finish();
            }
        });
    }

}