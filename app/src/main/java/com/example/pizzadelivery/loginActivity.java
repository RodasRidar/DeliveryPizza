package com.example.pizzadelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goContainer(View view){
        Intent intent = new Intent(this , ContainerActivity.class);
        startActivity(intent);

    }

    public void goCreate(View view) {
        Intent intent = new Intent(this , CreateAccountActivity.class);
        startActivity(intent);

    }
}