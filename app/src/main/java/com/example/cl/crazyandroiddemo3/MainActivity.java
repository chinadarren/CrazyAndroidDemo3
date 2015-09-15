package com.example.cl.crazyandroiddemo3;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;


public class MainActivity extends Activity {
//定义一个访问图片的数组
    int[] images = new int[]{
        R.drawable.java1,
        R.drawable.ee1,
        R.drawable.classic1,
        R.drawable.ajax1,
        R.drawable.xml1,};
int crrentImg = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取LinearLayout布局容器
        LinearLayout main = (LinearLayout) findViewById(R.id.root);
        //程序创建 ImageView组件
        final ImageView image = new ImageView(this);
        //将ImageView组件添加到LinearLayout布局容器中
        main.addView(image);
        //初始化时显示第一张图片
        image.setImageResource(images[0]);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //改变ImageView里显示的图片
                image.setImageResource(images[++crrentImg % images.length]);
            }
        });
    }
}
