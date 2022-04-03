package com.example.buttondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.Arrays;

public class CheckBoxRaidoButtonDemo extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_raido_button_demo);

        CheckBox checkBox01 = (CheckBox) findViewById(R.id.checkbox01);
        checkBox01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CheckBoxRaidoButtonDemo.this,
                        checkBox01.getText().toString() + "is selected", Toast.LENGTH_SHORT).show();
            }
        });


        CheckBox checkBox02 = (CheckBox) findViewById(R.id.checkbox02);
        checkBox02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CheckBoxRaidoButtonDemo.this,
                        checkBox02.getText().toString() + "is selected", Toast.LENGTH_SHORT).show();
            }
        });


        RadioButton radioButton01 = (RadioButton) findViewById(R.id.radioButton01);
        RadioButton radioButton02 = (RadioButton) findViewById(R.id.radioButton02);


        radioButton01.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Toast.makeText(CheckBoxRaidoButtonDemo.this,
                            radioButton01.getText().toString() + "is selected", Toast.LENGTH_SHORT).show();
                    radioButton02.setChecked(false);
                }
            }
        });


        radioButton02.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    Toast.makeText(CheckBoxRaidoButtonDemo.this,
                            radioButton02.getText().toString() + "is selected", Toast.LENGTH_SHORT).show();
                    radioButton01.setChecked(false);
                }
            }
        });

    }
}