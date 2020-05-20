package com.example.simpleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText fn;EditText sn;
    Button button;
    TextView out;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fn=(EditText)findViewById(R.id.fn);
        sn=(EditText)findViewById(R.id.sn);
        button=(Button)findViewById(R.id.button);
        out=findViewById(R.id.out);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i=Integer.parseInt(fn.getText().toString());
                int j=Integer.parseInt(sn.getText().toString());
                int k=i+j;
                out.setText("Ans is"+k);
            }
        });
    }
}
