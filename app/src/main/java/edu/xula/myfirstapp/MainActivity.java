package edu.xula.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("info", "Hello, Android studio");
    }

    public void sendMessage(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        //Log.i("joshua", "\n**Is editText null?\t" + editText + "**\n");
        String message = editText.getText().toString();
        Button button = (Button) findViewById(R.id.send);
        button.setText(message);
        editText.setVisibility(view.INVISIBLE);
    }
}
