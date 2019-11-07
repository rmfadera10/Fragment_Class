package com.letstravel.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import fragment.FirstFragment;
import fragment.SecondFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button btn1;
private  Boolean status=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button)findViewById(R.id.loadfragment);
        btn1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        if(status){
            FirstFragment firstFragment=new FirstFragment();
            fragmentTransaction.replace(R.id.linearlayout1, firstFragment);
            fragmentTransaction.commit();
            fragmentTransaction.addToBackStack(null);
            btn1.setText("Load Second Fragment");
            status=false;
        }
        else {
            SecondFragment secondFragment=new SecondFragment();
            fragmentTransaction.replace(R.id.linearlayout1, secondFragment);
            fragmentTransaction.commit();
            fragmentTransaction.addToBackStack(null);
            btn1.setText("Load First Fragment");
            status=true;
        }

    }
}
