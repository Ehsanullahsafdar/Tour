package com.example.tour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {

    Spinner spinnerExample;
    int currentItem = 0;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        Spinner spinner = findViewById(R.id.spinner);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (currentItem == position){
                    return;
                }else if(position ==2){
                    Intent i =new Intent(login.this,Regis2.class);
                    startActivity(i);
                }else
                {
                    Intent i =new Intent(login.this,Regis.class);
                    startActivity(i);

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
       // ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.name,android.R.layout.simple_spinner_item);
        //adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //spinner.setAdapter(adapter);
        //spinner.setOnItemSelectedListener(this);
    tv1 =  findViewById(R.id.signup);
    tv1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(login.this, "Welcome", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(login.this,mainmenu.class);
            startActivity(i);
        }
    });
    }

//    @Override
  //  public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
    //    String text = parent.getItemAtPosition(position).toString();
      //  Intent i = new Intent(login.this,Regis.class);
        //startActivity(i);
    //}

    //@Override
    //public void onNothingSelected(AdapterView<?> parent) {

    //}
}