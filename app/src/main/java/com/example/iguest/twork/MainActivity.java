package com.example.iguest.twork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "TWORK";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textView);

        String fileName = "textfile";
        File file = new File(getBaseContext().getFilesDir(), fileName);
//        try{
//            OutputStream out = openFileOutput(fileName, getBaseContext().MODE_PRIVATE);
//            textView.setText
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Button has been pressed");
                try{
                    OutputStream out = openFileOutput("textfile", getBaseContext().MODE_PRIVATE);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
