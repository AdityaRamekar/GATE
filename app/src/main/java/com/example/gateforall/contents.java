package com.example.gateforall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class contents extends AppCompatActivity {
    private Button button,button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contents);

        button = (Button) findViewById(R.id.genaptitude);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_cseintro();
            }
        });

        button1 = (Button) findViewById(R.id.ds);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_dsintro();
            }
        });

        button = (Button) findViewById(R.id.mcq);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_McqActivity();
            }
        });
    }
    public void openactivity_cseintro(){
        Intent intent = new Intent(this,cseintro.class);
        startActivity(intent);
    }
    public void openactivity_dsintro(){
        Intent intent = new Intent(this,dsintro.class);
        startActivity(intent);
    }
    public void openactivity_McqActivity(){
        Intent intent = new Intent(this,McqActivity.class);
        startActivity(intent);
    }
    public void displayToast(View view)
    {
        Toast.makeText(this,"Coming Soon",Toast.LENGTH_SHORT).show();
    }
}