package com.example.storage2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private EditText text;
    private Button writeButton;
    private TextView textReader;
    private Button readButton;
    private final static String FILE_NAME="content.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=findViewById(R.id.save_text);
        writeButton=findViewById(R.id.saveButton);
        textReader=findViewById(R.id.text);
        readButton=findViewById(R.id.buttonRead);
        writeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        readButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private File getExternalPath()
    {
        return  new File(Environment.getExternalStorageDirectory(),FILE_NAME);
    }

    private void saveText() throws IOException {
        FileOutputStream fos=null;
        String t=text.getText().toString();
        fos=new FileOutputStream(getExternalPath());
        fos.write(t.getBytes());

    }
}
