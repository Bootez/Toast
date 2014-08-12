package com.example.toast;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private Button textButton;
    private Button imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        textButton = (Button)findViewById(R.id.btn_text);
        imageButton = (Button)findViewById(R.id.btn_image);
        
        textButton.setOnClickListener(new textButtonListener());
        imageButton.setOnClickListener(new imageButtonListener());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    class textButtonListener implements OnClickListener {

        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "Text Toast", Toast.LENGTH_SHORT).show();
        }
    }
    
    class imageButtonListener implements OnClickListener {

        @Override
        public void onClick(View v) {
            Toast toast = new Toast(MainActivity.this);
            ImageView imageView = new ImageView(MainActivity.this);
            imageView.setImageResource(R.drawable.ic_launcher);
            toast.setView(imageView);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.show();
            
        }
    }

}
