package com.example.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        getSupportActionBar().setTitle("SignIN");
    }

    public void btn_SignUp(View view)
    {
        startActivity(new Intent(getApplicationContext(), SignUp.class));
    }

    public void btn_ForgotPass(View view)
    {
        startActivity(new Intent(getApplicationContext(), ForgetPassword.class));
    }
    public void btn_SignIn(View view)
    {
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }
}
