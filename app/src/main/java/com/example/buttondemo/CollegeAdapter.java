package com.example.buttondemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CollegeAdapter extends ArrayAdapter<College> {

    //College类型的list数据是无法直接传递给ListView的，需要借助适配器（adapter）来完成
    //ArrayAdapter:适配器的实现类，通过“泛型”来指定要适配的数据类型，然后在其构造函数中把要适配的数据传进去

    private int resourceId;

    public CollegeAdapter(Context context, int textviewResourceId, List<College> collegeList){
        super(context,textviewResourceId,collegeList);
        this.resourceId = textviewResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        /*覆写了getView方法：这个方法是在子项被滚动到屏幕内的时候会被调用*/
        College college = getItem(position);
        /*获取当前college子项实例*/
        View view;
        ViewHolder viewHolder;
        /*ViewHolder为内部类，用来存储子项的imageView和TextView*/
        if(convertView == null){
            /*getView方法中的convertView参数用于将之前加载好的布局进行缓存，以便以后可以进行重用
             * 如果为空，我们就去调用LayoutInflater去加载布局，如果不为空则直接对convertView进行复用以提升运行效率*/
            view = LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
            /*使用LayoutInflater方法来为这个子项动态加载我们传入的布局：resourceId
             * 父布局：parent
             * false：表示只让我们在父布局中声明的layout属性生效，但不为这个view添加父布局
             * 因为一旦view有了父布局之后，它就不能再添加到ListView中了*/
            viewHolder = new ViewHolder();
            /*使用新增的内部类：viewHolder，对控件的实例进行缓存*/
            viewHolder.imageView = view.findViewById(R.id.imageView_item01);
            viewHolder.textView = view.findViewById(R.id.textView_item01);
            view.setTag(viewHolder);
            /*使用setTag方法，把ViewHolder类型的实例"捆绑存储"在view上*/
        }
        else{
            view = convertView;
            viewHolder = (ViewHolder)view.getTag();
        }

        viewHolder.imageView.setImageResource(college.getCollegeId());
        viewHolder.textView.setText(college.getName());

        return view;
    }

    class ViewHolder{
        /*内部类：用于对控件的实例进行缓存*/
        ImageView imageView;
        TextView textView;
    }
}
