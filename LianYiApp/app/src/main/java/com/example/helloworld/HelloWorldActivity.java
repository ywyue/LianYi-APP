package com.example.helloworld;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

    public class HelloWorldActivity extends AppCompatActivity {
    private EditText accountEdit;
    private EditText passwordEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in_layout);
        Button button1=(Button)findViewById(R.id.button_1);
        Button button2=(Button)findViewById(R.id.button_2);
        Button button4=(Button)findViewById(R.id.button_4);
        accountEdit=(EditText)findViewById(R.id.edit_text1) ;
        passwordEdit=(EditText)findViewById(R.id.edit_text2) ;

        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                String account=accountEdit.getText().toString();
                String password=passwordEdit.getText().toString();
                if(account.equals("123456")&&password.equals("123456")) {

                    Intent intent = new Intent(HelloWorldActivity.this, Ball_Activity.class);
                    startActivity(intent);
                    finish();
                }
                else{
                    Toast.makeText(HelloWorldActivity.this,"您的账号或密码不正确，请重新输入！",Toast.LENGTH_SHORT).show();
                }

            }
        });
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        button4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:10086"));
                startActivity(intent);

            }
        });

    }



    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"暂无系统消息",Toast.LENGTH_LONG).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"暂无好友消息",Toast.LENGTH_LONG).show();
                break;
            default:
        }
        return true;
    }
}
