package com.example.vivianle.diningtogo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    private student[] arStu = {new student("Vivian Le", "le27l", "12345", 12345678, 30), new student("Phuong Le", "le26l", "12345", 12345678, 30),new student("Yu Hu", "le28l", "12345", 12345678, 30), new student("Carol", "le29l", "12345", 12345678, 30),};
    public static student currentStu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText etUsername = (EditText)findViewById(R.id.etUsername);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final Button bLogin = (Button) findViewById(R.id.bLogin);



        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for (int i = 0; i < arStu.length; i++) {
                    if ((etUsername.getText().toString().equals(arStu[i].getUsername())) && (etPassword.getText().toString().equals(arStu[i].getPassword()))) {
                        currentStu = arStu[i];
                        Intent mainIntent = new Intent(LoginActivity.this, MainPageActivity.class);
                        LoginActivity.this.startActivity(mainIntent);
                        return;
                    }
                }
            }
        });
    }

    public static student getCurrentStu() {
        return currentStu;
    }
}
