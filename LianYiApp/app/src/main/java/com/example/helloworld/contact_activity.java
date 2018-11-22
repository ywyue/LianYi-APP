package com.example.helloworld;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class contact_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_layout);

        ImageButton deynaimic_button = (ImageButton) findViewById(R.id.buttom_deynaimic);

        deynaimic_button.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent intent = new Intent(contact_activity.this, Ball_Activity.class);

                startActivity(intent);

            }

        });
        ImageButton setting_button = (ImageButton) findViewById(R.id.buttom_setting);

        setting_button.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Intent intent = new Intent(contact_activity.this, setting_Activity.class);

                startActivity(intent);

            }

        });
        }
    }

