package com.example.gateforall;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class cseintro extends AppCompatActivity implements View.OnClickListener {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cseintro);

        TextView textView1=findViewById(R.id.eg);
        TextView textView2=findViewById(R.id.sc);
        TextView textView3=findViewById(R.id.synonyms);
        TextView textView4=findViewById(R.id.antonyms);
        TextView textView5=findViewById(R.id.reason);
        TextView textView6=findViewById(R.id.numbers);
        TextView textView7=findViewById(R.id.percent);
        TextView textView8=findViewById(R.id.time);
        TextView textView9=findViewById(R.id.ratio);
        TextView textView10=findViewById(R.id.pnc);
        TextView textView11=findViewById(R.id.misc);

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
        textView11.setOnClickListener(this);
        button = (Button)findViewById(R.id.opennotes);
       // textView1.setMovementMethod(LinkMovementMethod.getInstance());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://drive.google.com/file/d/1YsJ9dUigl9fkaRdRFthJP_LjbQOq_6PB/view?usp=sharing"));
                intent.setPackage("com.android.chrome");
                startActivity(intent);
            }
        });
    }

    public void displayToast(View view)
    {
        Toast.makeText(cseintro.this,"Coming Soon",Toast.LENGTH_SHORT).show();
    }

    public void openVideo(String videourl) {
        Intent intent= new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(videourl));
        intent.setPackage("com.google.android.youtube");
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
     //   int temp=v.getId();
        switch(v.getId()) {
            case R.id.eg:
                openVideo("https://www.youtube.com/watch?v=Wt_URzW3Aho&feature=youtu.be");
                break;
            case R.id.sc:
                openVideo("https://www.youtube.com/watch?v=YPEsVvC5Qzw&feature=youtu.be");
                break;
            case R.id.synonyms:
                openVideo("https://www.youtube.com/watch?v=wCV9FTf6_FQ");
                break;
            case R.id.antonyms:
            openVideo("https://www.youtube.com/watch?v=wCV9FTf6_FQ");
            break;
            case R.id.reason:
                openVideo("https://www.youtube.com/watch?v=PjUzKUWcAgo&feature=youtu.be");
                break;
            case R.id.numbers:
                openVideo("https://www.youtube.com/watch?v=nYkP4fvE1Js");
                break;
            case R.id.percent:
                openVideo("https://www.youtube.com/watch?v=OumVsBeK0w4");
                break;
            case R.id.time:
                openVideo("https://www.youtube.com/watch?v=aXU2dcOrva4");
                break;
            case R.id.ratio:
                openVideo("https://www.youtube.com/watch?v=HRNApaZ1DCI&feature=youtu.be");
                break;
            case R.id.pnc:
                openVideo("https://www.youtube.com/watch?v=XJVo_3RFNZo");
                break;
            case R.id.misc:
                openVideo("https://www.youtube.com/watch?v=XJVo_3RFNZo");
                break;
        }

    }
}