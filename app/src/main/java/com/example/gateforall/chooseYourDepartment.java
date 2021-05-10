package com.example.gateforall;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class chooseYourDepartment extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_your_department);

        button = (Button) findViewById(R.id.CSE);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity_contents();
            }
        });
    }
    public void displayToast(View view)
    {
        Toast.makeText(chooseYourDepartment.this,"Coming Soon",Toast.LENGTH_SHORT).show();
    }
    public void openactivity_contents(){
        Intent intent = new Intent(this,contents.class);
        startActivity(intent);
    }

}
