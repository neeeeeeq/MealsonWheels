package com.example.ui;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            if (bundle.getString ("some")!= null)
            {
                Toast.makeText(getApplicationContext(),
                        "Choose Your " + bundle.getString ("some"),
                        Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void btn_food1(View view)
    {
        startActivity(new Intent(getApplicationContext(), CheckOut.class));
    }

    public void btn_food2(View view)
    {
        startActivity(new Intent(getApplicationContext(), CheckOut.class));
    }

    public void btn_food3(View view)
    {
        startActivity(new Intent(getApplicationContext(), CheckOut.class));
    }

    public void btn_food4(View view)
    {
        startActivity(new Intent(getApplicationContext(), CheckOut.class));
    }

    public void btn_food5(View view)
    {
        startActivity(new Intent(getApplicationContext(), CheckOut.class));
    }

    public void btn_food6(View view)
    {
        startActivity(new Intent(getApplicationContext(), CheckOut.class));
    }

    public void btn_food7(View view)
    {
        startActivity(new Intent(getApplicationContext(), CheckOut.class));
    }

}

