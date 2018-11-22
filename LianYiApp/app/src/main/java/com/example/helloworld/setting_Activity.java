package com.example.helloworld;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class setting_Activity extends BaseActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_layout);
        Log.d("setting_Activity", "Task id is " + getTaskId());


        Button button2 = (Button) findViewById(R.id.button_2);

        button2.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                ActivityCollector.finishAll();
                android.os.Process.killProcess(android.os.Process.myPid());


            }

        });
        ImageButton news_button = (ImageButton) findViewById(R.id.buttom_news);

        news_button.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent intent = new Intent(setting_Activity.this, contact_activity.class);

                startActivity(intent);

            }

        });
        ImageButton deynaimic_button = (ImageButton) findViewById(R.id.buttom_deynaimic);

        deynaimic_button.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent intent = new Intent(setting_Activity.this, Ball_Activity.class);

                startActivity(intent);

            }

        });


    }
}
