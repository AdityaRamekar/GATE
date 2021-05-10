package com.example.gateforall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class dsintro extends AppCompatActivity implements View.OnClickListener {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dsintro);

        TextView textView1= findViewById(R.id.cprog);
        TextView textView2= findViewById(R.id.recursion);
        TextView textView3= findViewById(R.id.arrays);
        TextView textView4= findViewById(R.id.stacks);
        TextView textView5= findViewById(R.id.queues);
        TextView textView6= findViewById(R.id.linkedlists);
        TextView textView7= findViewById(R.id.trees);
        TextView textView8= findViewById(R.id.binarysearch);
        TextView textView9= findViewById(R.id.binaryheaps);
        TextView textView10= findViewById(R.id.graphs);

        textView1.setOnClickListener(this);
        textView2.setOnClickListener(this);
        textView3.setOnClickListener(this);
        textView4.setOnClickListener(this);
        textView5.setOnClickListener(this);
        textView6.setOnClickListener(this);
        textView7.setOnClickListener(this);
        textView8.setOnClickListener(this);
        textView9.setOnClickListener(this);
        textView10.setOnClickListener(this);
        button = findViewById(R.id.opennotesds);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://drive.google.com/file/d/11ALJSqlLdjr4ST0_WA7oh6PFeE6SmDOX/view?usp=sharing"));
                intent.setPackage("com.android.chrome");
                startActivity(intent);
            }
        });
    }
    public void openVideo(String videourl) {
        Intent intent= new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(videourl));
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cprog://done
                openVideo("https://youtube.com/playlist?list=PLir19lgiavA105XgPtU2Fb5cEpLnJJBqt");
                break;
            case R.id.recursion://done
                openVideo("https://www.youtube.com/watch?v=YXmqv8nrFIc");
                break;
            case R.id.arrays://done
                openVideo("https://youtu.be/IIX_NTDHoEw");
                break;
            case R.id.stacks://done
                openVideo("https://youtu.be/_36RRFZvuiw");
                break;
            case R.id.queues://done
                openVideo("https://youtu.be/vhlYvGZ-5_g");
                break;
            case R.id.linkedlists:
                openVideo("https://youtu.be/WZohENYqY4A");
                break;
            case R.id.trees:
                openVideo("https://www.youtube.com/watch?v=7vw2iIdqHlM&t=28s");
                break;
            case R.id.binarysearch://done
                openVideo("https://youtu.be/YPfMFsetBqQ");
                break;
            case R.id.binaryheaps://done
                openVideo("https://youtu.be/3Y3UpzNNjs0");
                break;
            case R.id.graphs://done
                openVideo("https://youtu.be/_cwMscp3_Ls");
                break;

        }

    }
}
