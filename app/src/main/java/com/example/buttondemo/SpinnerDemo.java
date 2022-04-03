package com.example.buttondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class SpinnerDemo extends BaseActivity {

    private List<College> collegeList1 = new ArrayList<>();

    private String []grade;
    private String []majorDianQi;
    private String []majorZhiNeng;
    private String []majorJiXie;
    private String []majorHuaGong;
    private String []majorCaiLiao;
    private String []majorTuMu;
    private String []majorDianXin;
    private String []majorNengHuan;
    private String []majorShengMing;
    private String []majorJianYi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_demo);

        Spinner spinner_college = (Spinner) findViewById(R.id.spinner_college);
        Spinner spinner_grade = (Spinner) findViewById(R.id.spinner_grade);
        Spinner spinner_major = (Spinner) findViewById(R.id.spinner_major);

        grade = getResources().getStringArray(R.array.GradeData);

        TextView textView_grade = (TextView) findViewById(R.id.textView_selectedGradleData);
        TextView textView_college = (TextView) findViewById(R.id.textView_selectedCollegeData);
        TextView textView_major = (TextView) findViewById(R.id.textView_selectedMajorData);


        spinner_grade.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                textView_grade.setText(grade[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        InitColleges1();
        SpinnerAdapter spinnerAdapter = new SpinnerAdapter(SpinnerDemo.this,
                R.layout.college_item,collegeList1);
        spinner_college.setAdapter(spinnerAdapter);

        spinner_college.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                College college = collegeList1.get(position);
                int collegeId = college.getCollegeId();
                textView_college.setText(college.getName());
                switch(collegeId){
                    case R.drawable.dianqi:{
                        majorDianQi = getResources().getStringArray(R.array.MajorData_dianqi);
                        spinner_major.setPromptId(R.string.dianqi);
                        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SpinnerDemo.this,
                                android.R.layout.simple_list_item_1,majorDianQi);
                        spinner_major.setAdapter(adapter);
                        break;
                    }
                    case R.drawable.jixie: {
                        majorJiXie = getResources().getStringArray(R.array.MajorData_jiexie);
                        spinner_major.setPromptId(R.string.jiexie);
                        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SpinnerDemo.this,
                                android.R.layout.simple_list_item_1,majorJiXie);
                        spinner_major.setAdapter(adapter);
                        break;
                    }
                    case R.drawable.cailiao:{
                        majorCaiLiao = getResources().getStringArray(R.array.Major_cailiao);
                        spinner_major.setPromptId(R.string.cailiao);
                        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SpinnerDemo.this,
                                android.R.layout.simple_list_item_1,majorCaiLiao);
                        spinner_major.setAdapter(adapter);
                        break;
                    }
                    case R.drawable.huagong:{
                        majorHuaGong = getResources().getStringArray(R.array.Major_huagong);
                        spinner_major.setPromptId(R.string.huagong);
                        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SpinnerDemo.this,
                                android.R.layout.simple_list_item_1,majorHuaGong);
                        spinner_major.setAdapter(adapter);
                        break;
                    }
                    case R.drawable.shengming:{
                        majorShengMing = getResources().getStringArray(R.array.Major_shengming);
                        spinner_major.setPromptId(R.string.shengming);
                        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SpinnerDemo.this,
                                android.R.layout.simple_list_item_1,majorShengMing);
                        spinner_major.setAdapter(adapter);
                        break;
                    }
                    case R.drawable.tumu:{
                        majorTuMu = getResources().getStringArray(R.array.Major_tumu);
                        spinner_major.setPromptId(R.string.tumu);
                        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SpinnerDemo.this,
                                android.R.layout.simple_list_item_1,majorTuMu);
                        spinner_major.setAdapter(adapter);
                        break;
                    }
                    case R.drawable.dianxin:{
                        majorDianXin = getResources().getStringArray(R.array.Major_dianxin);
                        spinner_major.setPromptId(R.string.dianxin);
                        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SpinnerDemo.this,
                                android.R.layout.simple_list_item_1,majorDianXin);
                        spinner_major.setAdapter(adapter);
                        break;
                    }
                    case R.drawable.nenghuan:{
                        majorNengHuan = getResources().getStringArray(R.array.Major_nenghuan);
                        spinner_major.setPromptId(R.string.nenghuan);
                        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SpinnerDemo.this,
                                android.R.layout.simple_list_item_1,majorNengHuan);
                        spinner_major.setAdapter(adapter);
                        break;
                    }
                    case R.drawable.jianyi:{
                        majorJianYi = getResources().getStringArray(R.array.Major_jianyi);
                        spinner_major.setPromptId(R.string.jianyi);
                        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SpinnerDemo.this,
                                android.R.layout.simple_list_item_1,majorJianYi);
                        spinner_major.setAdapter(adapter);
                        break;
                    }
                    case R.drawable.zhineng:{
                        majorZhiNeng = getResources().getStringArray(R.array.MajorData_zhineng);
                        spinner_major.setPromptId(R.string.zhineng);
                        ArrayAdapter<String> adapter = new ArrayAdapter<String>(SpinnerDemo.this,
                                android.R.layout.simple_list_item_1,majorZhiNeng);
                        spinner_major.setAdapter(adapter);
                        break;
                    }
                    default:break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });


        spinner_major.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                textView_major.setText(spinner_major.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    private void InitColleges1(){
        College dianQi = new College("电气学院",R.drawable.dianqi);
        collegeList1.add(dianQi);

        College jiXie = new College("机械学院",R.drawable.jixie);
        collegeList1.add(jiXie);

        College HuaGong = new College("化工学院",R.drawable.huagong);
        collegeList1.add(HuaGong);

        College Cailiao = new College("材料学院",R.drawable.cailiao);
        collegeList1.add(Cailiao);

        College ShengMing = new College("生命学院",R.drawable.shengming);
        collegeList1.add(ShengMing);

        College DianXin = new College("电信学院",R.drawable.dianxin);
        collegeList1.add(DianXin);

        College TuMu = new College("土木学院",R.drawable.tumu);
        collegeList1.add(TuMu);

        College NengHuan = new College("能环学院",R.drawable.nenghuan);
        collegeList1.add(NengHuan);

        College JianYi = new College("建艺学院",R.drawable.jianyi);
        collegeList1.add(JianYi);

        College ZhiNeng = new College("智能学院",R.drawable.zhineng);
        collegeList1.add(ZhiNeng);
    }
}