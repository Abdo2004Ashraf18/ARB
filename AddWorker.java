package com.asat.arb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class AddWorker extends AppCompatActivity{
    EditText name;
    Button add;
    public static final String BUTTON_KEY = "Button_key";
    public static final String BUTTON_VALUE = "Add";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_worker);

        name = findViewById(R.id.nametxt);
        add = findViewById(R.id.add);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddWorker.this , MainActivity.class);
                intent.putExtra("name" , name.getText().toString());
                intent.putExtra(BUTTON_KEY , BUTTON_VALUE);
                startActivity(intent);
                finish();
            }
        });
    }
}
