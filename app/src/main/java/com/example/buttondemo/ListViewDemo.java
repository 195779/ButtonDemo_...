package com.example.buttondemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;

import java.util.ArrayList;
import java.util.List;

public class ListViewDemo extends BaseActivity {


    private List<College> collegeList1 = new ArrayList<>();
    private List<College> collegeList2 = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_demo);


        ImageView imageView = (ImageView)findViewById(R.id.hebut_ImageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https:hebut.edu.cn/"));
                startActivity(intent);
            }
        });


        InitColleges1();
        InitCollege2();

        //放在list里的College类型的数据是无法直接传递给ListView的，需要借助适配器（adapter）来完成
        //ArrayAdapter:适配器的实现类，通过“泛型”来指定要适配的数据类型，然后在其构造函数中把要适配的数据传进去
        CollegeAdapter collegeAdapter = new CollegeAdapter(ListViewDemo.this,
                R.layout.college_item_listview,collegeList1);
        ListView listView = (ListView) findViewById(R.id.listview01);
        listView.setAdapter(collegeAdapter);

        CollegeAdapter collegeAdapter2 = new CollegeAdapter(ListViewDemo.this,
                R.layout.college_item_listview,collegeList2);
        ListView listView2 = (ListView)findViewById(R.id.listview02);
        listView2.setAdapter(collegeAdapter2);




        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                College college = collegeList1.get(position);
                switch(college.getCollegeId()){
                    case R.drawable.dianqi:{
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://ee.hebut.edu.cn/"));
                        startActivity(intent);
                        break;
                    }
                    case R.drawable.jixie:{
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://mes.hebut.edu.cn/"));
                        startActivity(intent);
                        break;
                    }
                    case R.drawable.huagong:{
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://chemeng.hebut.edu.cn/"));
                        startActivity(intent);
                        break;
                    }
                    case R.drawable.cailiao:{
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://clxy.hebut.edu.cn/"));
                        startActivity(intent);
                        break;
                    }
                    default:break;
                }
            }
        });

        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                College college = collegeList2.get(position);
                switch(college.getCollegeId()){
                    case R.drawable.shengming:{
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://hsbme.hebut.edu.cn/"));
                        startActivity(intent);
                        break;
                    }
                    case R.drawable.dianxin:{
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://eie.hebut.edu.cn/"));
                        startActivity(intent);
                        break;
                    }
                    case R.drawable.tumu:{
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://tm.hebut.edu.cn/"));
                        startActivity(intent);
                        break;
                    }
                    case R.drawable.nenghuan:{
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://see.hebut.edu.cn/"));
                        startActivity(intent);
                        break;
                    }
                    case R.drawable.jianyi:{
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://jzyyssjxy.hebut.edu.cn/"));
                        startActivity(intent);
                        break;
                    }
                    case R.drawable.zhineng:{
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://ai.hebut.edu.cn/"));
                        startActivity(intent);
                        break;
                    }
                    default:break;
                }
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
    }

    private void InitCollege2(){
        College ShengMing = new College("生命学院",R.drawable.shengming);
        collegeList2.add(ShengMing);

        College DianXin = new College("电信学院",R.drawable.dianxin);
        collegeList2.add(DianXin);

        College TuMu = new College("土木学院",R.drawable.tumu);
        collegeList2.add(TuMu);

        College NengHuan = new College("能环学院",R.drawable.nenghuan);
        collegeList2.add(NengHuan);

        College JianYi = new College("建艺学院",R.drawable.jianyi);
        collegeList2.add(JianYi);

        College ZhiNeng = new College("智能学院",R.drawable.zhineng);
        collegeList2.add(ZhiNeng);
    }

}