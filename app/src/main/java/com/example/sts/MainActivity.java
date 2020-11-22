package com.example.sts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Display;

import java.util.ArrayList;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcv;
    myadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv = (RecyclerView) findViewById(R.id.recView);
        rcv.setLayoutManager( new LinearLayoutManager(this));
        adapter = new myadapter(dataqueue());
        rcv.setAdapter(adapter);




    }



    public ArrayList<Model> dataqueue()
    {


        ArrayList <Model> holder  = new ArrayList<>();

        Model ob1 = new Model();
        ob1.setHeader("Name1");
        ob1.setDesc("Father Name1");
        ob1.setImgname(R.drawable.childpic);
        holder.add(ob1);

        Model ob2 = new Model();
        ob1.setHeader("Name2");
        ob1.setDesc("Father Name2");
        ob1.setImgname(R.drawable.childpic);
        holder.add(ob2);


        Model ob3 = new Model();
        ob1.setHeader("Name3");
        ob1.setDesc("Father Name3");
        ob1.setImgname(R.drawable.childpic);
        holder.add(ob3);

        Model ob4 = new Model();
        ob1.setHeader("Name4");
        ob1.setDesc("Father Name4");
        ob1.setImgname(R.drawable.childpic);
        holder.add(ob4);


        Model ob5 = new Model();
        ob1.setHeader("Name5");
        ob1.setDesc("Father Name5");
        ob1.setImgname(R.drawable.childpic);
        holder.add(ob5);


        Model ob6 = new Model();
        ob1.setHeader("Name6");
        ob1.setDesc("Father Name6");
        ob1.setImgname(R.drawable.childpic);
        holder.add(ob6);


        Model ob7 = new Model();
        ob1.setHeader("Name7");
        ob1.setDesc("Father Name7");
        ob1.setImgname(R.drawable.childpic);
        holder.add(ob7);


        Model ob8 = new Model();
        ob1.setHeader("Name8");
        ob1.setDesc("Father Name8");
        ob1.setImgname(R.drawable.childpic);
        holder.add(ob8);


        Model ob9 = new Model();
        ob1.setHeader("Name9");
        ob1.setDesc("Father Name9");
        ob1.setImgname(R.drawable.childpic);
        holder.add(ob9);


        Model ob10 = new Model();
        ob1.setHeader("Name10");
        ob1.setDesc("Father Name10");
        ob1.setImgname(R.drawable.childpic);
        holder.add(ob10);


        Model ob11 = new Model();
        ob1.setHeader("Name11");
        ob1.setDesc("Father Name11");
        ob1.setImgname(R.drawable.childpic);
        holder.add(ob11);





        return holder;

    }
}