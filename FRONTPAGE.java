package com.example.soyoc;

         import androidx.appcompat.app.AppCompatActivity;

         import android.content.Intent;
         import android.os.Bundle;
         import android.view.View;
         import android.widget.Button;

public class FRONTPAGE extends AppCompatActivity {

    public void openGroceries(View view) {

    }

    public void openMedicines(View view) {
    }

    public void openResturants(View view) {
    }

    public void openDoctors(View view) {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f_r_o_n_t_p_a_g_e);

        Button buttong1 = findViewById(R.id.buttong1);

        buttong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( FRONTPAGE.this, Groceries.class);

                 FRONTPAGE.this.startActivity(intent);

                //  Button button = findViewById(R.id.button);

                startActivity(intent);
            }
        });


        Button buttong2 = findViewById(R.id.buttonm2);

        buttong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( FRONTPAGE.this, Medicines.class);

                 FRONTPAGE.this.startActivity(intent);

                //  Button button2= findViewById(R.id.button);

                startActivity(intent);
            }
        });
        Button buttonr3 = findViewById(R.id.buttonr3);

        buttonr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( FRONTPAGE.this, RESTURANTS.class);

                 FRONTPAGE.this.startActivity(intent);

                // Button button3 = findViewById(R.id.button3);

                startActivity(intent);
            }
        });

        Button buttond4 = findViewById(R.id.buttond4);

        buttond4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( FRONTPAGE.this, DOCTORS.class);

                 FRONTPAGE.this.startActivity(intent);

                // Button button4 = findViewById(R.id.button4);

                startActivity(intent);
            }
        });

        Button buttong5 = findViewById(R.id.buttong5);

        buttong5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( FRONTPAGE.this, GIFTS.class);

                 FRONTPAGE.this.startActivity(intent);

                // Button button5 = findViewById(R.id.button5);

                startActivity(intent);
            }
        });

        Button buttond6 = findViewById(R.id.buttond6);

        buttond6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( FRONTPAGE.this, DAILYNEEDS.class);

                 FRONTPAGE.this.startActivity(intent);
            }
        });
        Button buttonc7 = findViewById(R.id.buttonc7);

        buttonc7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( FRONTPAGE.this, CLOTHS.class);

                FRONTPAGE.this.startActivity(intent);

                // Button button7 = findViewById(R.id.button7);

                startActivity(intent);
            }
        });

        Button button8 = findViewById(R.id.buttono8);

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FRONTPAGE.this, OTHERS.class);

                FRONTPAGE.this.startActivity(intent);

                // Button button8 = findViewById(R.id.button8);

                startActivity(intent);
            }
        });

    }
}