package com.example.chahatbnsl2496.fragmentsdemo;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button mchat,mcall,mcontact;
    FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mchat= (Button) findViewById(R.id.chat_button);
        mcall= (Button) findViewById(R.id.call_button);
        mcontact= (Button) findViewById(R.id.contact_button);
        manager=getSupportFragmentManager();
        manager.beginTransaction().add(R.id.container,new contactfrag()).addToBackStack("one").commit();

        mchat.setOnClickListener(this);
        mcontact.setOnClickListener(this);
        mcall.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.contact_button)
        {
            manager.beginTransaction().add(R.id.container,new contactfrag()).addToBackStack("one").commit();

        }
        if(view.getId()==R.id.call_button)
        {
            manager.beginTransaction().add(R.id.container,new callfrag()).addToBackStack("two").commit();

        }
        if(view.getId()==R.id.chat_button)
        {
            manager.beginTransaction().add(R.id.container,new chatfrag()).addToBackStack("three").commit();

        }

    }
}
