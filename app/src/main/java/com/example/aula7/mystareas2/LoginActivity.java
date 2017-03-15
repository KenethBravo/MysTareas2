package com.example.aula7.mystareas2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }
     public void onShowAccount(View view){
         Intent intent = new Intent(this, CreateAccountActivity.class);
         startActivity(intent);
     }

}
