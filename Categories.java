package com.example.soyoc;

            import androidx.appcompat.app.AppCompatActivity;

            import android.content.Intent;
            import android.net.Uri;
            import android.os.Bundle;
            import android.view.View;
            import android.widget.Button;

public class Categories extends AppCompatActivity {

    public void openFrontpage (View view) {

    }


    public void  openWhatsapp (View view) {



        String text = "WELCOME TO SOYOC FAMILY!!";// Replace with your message.

        String toNumber = "919307473197"; // Replace with mobile phone number without +Sign or leading zeros, but with country code
        //Suppose your country is India and your phone number is “xxxxxxxxxx”, then you need to send “91xxxxxxxxxx”.


        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://api.whatsapp.com/send?phone="+toNumber +"WELCOME TO SOYOC FAMILY!!"+"&text="+text));
        startActivity(intent);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);



            Button button40 = findViewById(R.id.button40);

            button40.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(Categories.this,FRONTPAGE.class);

                    Categories.this.startActivity(intent);

                }
            });
    }
}