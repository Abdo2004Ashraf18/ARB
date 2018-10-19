package com.asat.arb;

import android.app.Dialog;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton floatingActionButton;

    String nametxt;
    String buttonValue;
    ArrayList<test>name = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nametxt = getIntent().getStringExtra("name");
        final test t = new test(nametxt);

        floatingActionButton = findViewById(R.id.action_button);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , AddWorker.class);
                startActivity(intent);
                finish();
            }
        });

        name.add(t);
        RecyclerView recyclerView = findViewById(R.id.rec);
        Adapter adapter = new Adapter(name  ,  MainActivity.this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this , LinearLayoutManager.VERTICAL ,false);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

    }
}
