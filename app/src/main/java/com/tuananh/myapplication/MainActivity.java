package com.tuananh.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout activity_linearlayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initLayoutByReleative();
        setContentView(R.layout.activity_linearlayout);
    }
    public void initLayoutByReleative(){
        activity_linearlayout = new RelativeLayout(this);
        RelativeLayout relativeLayoutSecond = new RelativeLayout(this);
        RelativeLayout.LayoutParams reLayoutParamsSecond = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        relativeLayoutSecond.setId(R.id.rl);
        relativeLayoutSecond.setLayoutParams(reLayoutParamsSecond);

        ImageView imageViewAvata = new ImageView(this);
        imageViewAvata.setLayoutParams(new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        imageViewAvata.setId(R.id.imgAvatar);
        imageViewAvata.setImageResource(R.mipmap.ic_launcher);

        TextView tv = new TextView(this);
        RelativeLayout.LayoutParams layoutParamsTv = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParamsTv.addRule(RelativeLayout.CENTER_VERTICAL);
        layoutParamsTv.setMargins(20,0,0,0);
        layoutParamsTv.addRule(RelativeLayout.RIGHT_OF,imageViewAvata.getId());
        tv.setText(getString(R.string.sologan));
        tv.setLayoutParams(layoutParamsTv);

        relativeLayoutSecond.addView(imageViewAvata);
        relativeLayoutSecond.addView(tv);

        Button btn1 = new Button(this);
        RelativeLayout.LayoutParams layoutParamsbtn1 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParamsbtn1.addRule(RelativeLayout.BELOW,relativeLayoutSecond.CENTER_HORIZONTAL);
        btn1.setPadding(10,10,10,10);
        btn1.setText(getString(R.string.btn1));

        Button btn2 = new Button(this);
        RelativeLayout.LayoutParams layoutParamsbtn2 = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutParamsbtn2.addRule(RelativeLayout.BELOW,relativeLayoutSecond.CENTER_HORIZONTAL);
        btn2.setText(getString(R.string.btn1));

        activity_linearlayout.addView(relativeLayoutSecond,reLayoutParamsSecond);
        activity_linearlayout.addView(btn1,layoutParamsbtn1);
        activity_linearlayout.addView(btn2,layoutParamsbtn2);
    }

}