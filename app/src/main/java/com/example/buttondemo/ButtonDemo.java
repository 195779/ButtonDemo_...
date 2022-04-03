package com.example.buttondemo;

import android.content.Intent;
import android.icu.text.AlphabeticIndex;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ButtonDemo extends BaseActivity{

    private static int i = 0;
    private static int j = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_demo);



        setTitle("实验四的第一问");

        TextView textView01 = (TextView) findViewById(R.id.textView01);

        Button button01 = (Button) findViewById(R.id.Button01);
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (j % 2 == 0) {
                    textView01.setText("Button按钮");
                }
                else{
                    textView01.setText(R.string.hello);
                }
                j++;
            }
        });


        ImageButton imageButton01 = (ImageButton) findViewById(R.id.ImageButton01);
        imageButton01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i % 2 == 0) {
                    textView01.setText("ImageButton按钮");
                    imageButton01.setImageResource(R.drawable.ic_launcher_background);
                }
                else{
                    textView01.setText(R.string.hello);
                    imageButton01.setImageResource(R.drawable.ic_launcher_foreground);
                }
                i++;
            }
        });


        ImageView imageView = (ImageView) findViewById(R.id.image01);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ButtonDemo.this,"戳我干嘛！！！",Toast.LENGTH_SHORT).show();
            }
        });

        Button button_toCBRB = (Button) findViewById(R.id.toCBRB);
        button_toCBRB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ButtonDemo.this,CheckBoxRaidoButtonDemo.class);
                startActivity(intent);
            }
        });

        Button button_toTD = (Button)findViewById(R.id.toTD);
        button_toTD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ButtonDemo.this, TabDemo.class);
                startActivity(intent);
            }
        });

        Button button_hebut = (Button)findViewById(R.id.button_hebut);
        button_hebut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ButtonDemo.this, ListViewDemo.class);
                startActivity(intent);
            }
        });

        Button button_GCM = (Button)findViewById(R.id.button_GCM);
        button_GCM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ButtonDemo.this, SpinnerDemo.class);
                startActivity(intent);
            }
        });
    }
}