package com.jbstore.o2o.model1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Bezier3 c1;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       c1 = (Bezier3) findViewById(R.id.c1);
        /*c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c1.sta
            }
        });*/
       /*  btn = (Button) findViewById(R.id.btn);
        ObjectAnimator animator = ObjectAnimator.ofFloat(c1, "alpha", 1f, 0, 1f);
        animator.setDuration(2000);
        animator.start();
        ObjectAnimator animator1 = ObjectAnimator.ofFloat(btn, "scaleX", 3f,1f, 5f);
        animator1.setDuration(10000);
        animator1.start();*/
    }
}
