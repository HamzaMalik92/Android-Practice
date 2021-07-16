package com.example.androiddiceapppractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


public class Practice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);

        Toast.makeText(this,"onCreate is called",Toast.LENGTH_LONG).show();

        Button btn_SignUp=findViewById(R.id.btn_signUp);
        btn_SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText name=findViewById(R.id.txt_name);
                EditText email=findViewById(R.id.txt_email);
                EditText password=findViewById(R.id.txt_password);
                CheckBox checkBox=findViewById(R.id.checkBox);

                if(name.getText().toString().length()==0 ){
                    name.setError("Enter your name here");
                }
                else if(email.getText().toString().length()==0 ){
                    email.setError("Enter your email here");
                }
                else if(password.getText().toString().length()==0 ){
                    password.setError("Enter your password here");
                }
                else if(checkBox.isChecked()==false){
                    checkBox.setError("Please agree to terms and condition to signup");
                    System.out.println(name.getText().toString());
                }
                else{
                    name.setError(null);
                    email.setError(null);
                    password.setError(null);
                    checkBox.setError(null);

                    Toast.makeText(Practice.this,"Your Id has been created successfully",Toast.LENGTH_SHORT).show();

                    // navigate to dice screen
                    startActivity(new Intent(Practice.this, RollDiceScreen.class));
                }
            }
        });
    }


    @Override
    protected void onResume() {
        super.onResume();
Toast.makeText(this,"onResume is called",Toast.LENGTH_LONG).show();

    }
}