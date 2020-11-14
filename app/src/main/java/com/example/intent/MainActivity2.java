package com.example.intent;

import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        findViewById(R.id.button).setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity2.this, MainActivity.class);
            intent.putExtra("text", ((EditText) findViewById(R.id.editTextTextPersonName)).getText().toString());
            startActivity(intent);
        });
        if (getIntent() != null) {
            ((TextView) findViewById(R.id.textView)).setText(getIntent().getStringExtra("text"));
        }
    }
}