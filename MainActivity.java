package com.example.soyoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickVerify(View view) {

        EditText inputPhoneno = (EditText) findViewById(R.id.inputPhoneno);

        EditText editOTP = (EditText) findViewById(R.id.editOTP);

        Log.i("Phone no.", inputPhoneno.getText().toString());

        Log.i("Phone no.", editOTP.getText().toString());

        Log.i("info", "Verify and Next page");

    }

   // public void openFRONTPAGE  (View view) {

   // }
    public void openCategories (View view) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button buttonnm = findViewById(R.id.buttonm);

        buttonnm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,Categories.class);

                MainActivity.this.startActivity(intent);

            }
        });

    }


}
