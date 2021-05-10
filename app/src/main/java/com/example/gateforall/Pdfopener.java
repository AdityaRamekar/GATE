package com.example.gateforall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Pdfopener extends AppCompatActivity {

    PDFView pdfViewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfopener);

        pdfViewer=(PDFView)findViewById(R.id.pdfView);
        String getItem = getIntent().getStringExtra("pdfFileName");

        if(getItem.equals("GATE 2019"))
        {//put google drive link of question paper here

         //   pdfViewer.fromAsset("GATE 2019.pdf").load();
            pdfViewer.fromAsset("GATE 2019.pdf").load();
        }
        if(getItem.equals("GATE 2020"))
        {
            //   pdfViewer.fromAsset("GATE 2019.pdf").load();
            pdfViewer.fromAsset("GATE 2020.pdf").load();
        }
        if(getItem.equals("GATE 2021"))
        {
            //   pdfViewer.fromAsset("GATE 2019.pdf").load();
            pdfViewer.fromAsset("GATE 2021.pdf").load();
        }
    }
}