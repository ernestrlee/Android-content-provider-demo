package com.example.contentproviderdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2;
    ContentValues values = new ContentValues();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = findViewById(R.id.edit1);
        e2 = findViewById(R.id.edit2);
    }

    public void saveContent(View view) {
        values.put("emp name", e1.getText().toString());
        values.put("profile", e2.getText().toString());

        Uri uri = getContentResolver().insert(MyContentProvider.CONTENT_URI, values);
        Toast.makeText(this,uri.toString(), Toast.LENGTH_SHORT).show();
    }

    public void loadContent(View view) {

    }
}