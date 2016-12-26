package com.example.deep.fragmentcontrolapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;

import layout.FragmentA;
import layout.FragmentB;

public class MainActivityFragment extends AppCompatActivity {


    FragmentA fra= new FragmentA();
    FragmentB frb= new FragmentB();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragment);
    }

    public void change(View v){
        FragmentManager fm=getFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragment,fra,"Fragment1");
        ft.commit();
    }

    public void change2(View v){
        FragmentManager fm=getFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.fragment,frb,"Fragment2");
        ft.commit();
    }
//Hello
}
