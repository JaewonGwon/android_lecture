package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.Visibility;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView labelImage1;
    ImageView imageIconBlack;
    ImageView imageIconBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        labelImage1 = findViewById(R.id.label_image1);
        imageIconBlack = findViewById(R.id.image_icon_black);
        imageIconBlue = findViewById(R.id.image_icon_blue);
        labelImage1.setOnClickListener(click -> onClickForColorChange());
        imageIconBlack.setOnClickListener(view -> onClickForColorChange());
        imageIconBlue.setOnClickListener(view -> onClickForColorChange());
    }

    protected void onClickForColorChange() {
        String currentColor = getCurrentColor();
        changeColor(currentColor);
    }

    protected String getCurrentColor() {
        if (imageIconBlue.getVisibility() == View.GONE) return "black";
        else return "blue";
    }

    protected void changeColor(String currentColor) {
        if (currentColor.equals("black")) imageIconBlue.setVisibility(View.VISIBLE);
        else imageIconBlue.setVisibility(View.GONE);
    }
}