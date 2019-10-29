package com.e.homestool;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SigeritemView extends LinearLayout {

    ImageView imageView;
    TextView textView;
    TextView textView2;
    public SigeritemView(Context context) {
        super(context);
        init(context);
    }

    public SigeritemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private  void init(Context context){

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        inflater.inflate(R.layout.singer_item,this,true);

        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView1);

        imageView = (ImageView) findViewById(R.id.imageview2);

    }


    public void setName(String name){

        textView.setText(name);

    }

    public void setPhone(String phone){

        textView2.setText(phone);

    }


    public void setImageView(int resid){
        imageView.setImageResource(resid);

    }

}



