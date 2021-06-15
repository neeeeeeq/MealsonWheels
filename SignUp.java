package com.example.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getSupportActionBar().setTitle("SignUp");
    }

    public void btn_SignUP2(View view)
    {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }

    public void btn_SignIn2(View view)
    {
        startActivity(new Intent(getApplicationContext(), LogIn.class));
    }

}
