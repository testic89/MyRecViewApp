package com.example.macbook.myrecviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new MyAdapter(getPersonList(),this);
        recyclerView.setAdapter(adapter);


    }


    private List<PersonModel> getPersonList(){
        List<PersonModel> personModelList = new ArrayList<>();
        personModelList.add(new PersonModel("Amy","Adams", "amyadams@gmail.com", "+1556677899", false, "/Users/MAcBook/AndroidStudioProjects/MyRecViewApp/app/src/main/res/drawable/amy.jpg"));
        personModelList.add(new PersonModel("Bob","James", "bobjames@gmail.com", "+1840267594", true, "/Users/MAcBook/AndroidStudioProjects/MyRecViewApp/app/src/main/res/drawable/bob.jpg"));
        personModelList.add(new PersonModel("Dan","Stevens", "danstevens@gmail.com", "+155667776778", true, "/Users/MAcBook/AndroidStudioProjects/MyRecViewApp/app/src/main/res/drawable/dan.jpg"));
        personModelList.add(new PersonModel("Rachel","Mcadams", "rachelmcadams@gmail.com", "+155667462", false, "/Users/MAcBook/AndroidStudioProjects/MyRecViewApp/app/src/main/res/drawable/rachel.jpg"));
        personModelList.add(new PersonModel("Steve","Jobbs", "stevejobbs@gmail.com", "+1557569340", true, "/Users/MAcBook/AndroidStudioProjects/MyRecViewApp/app/src/main/res/drawable/steve.jpg"));
        return personModelList;
    }


}
