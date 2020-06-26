package com.example.bloodbank.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bloodbank.R;

public class RegisterActivity extends AppCompatActivity {
    private EditText nameEt,cityEt,bloodGroupEt,passwordEt,mobileEt;
    private Button submitButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        /* using findViewByTd method binded the java objects
        with the created xml */

        nameEt = findViewById(R.id.name);
        cityEt = findViewById(R.id.city);
        bloodGroupEt = findViewById(R.id.blood_group);
        passwordEt = findViewById(R.id.password);
        mobileEt = findViewById(R.id.number);
        submitButton = findViewById(R.id.submit_button);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name,city,blood_group,password,mobile;
                name = nameEt.getText().toString();
                city = cityEt.getText().toString();
                blood_group = bloodGroupEt.getText().toString();
                password = passwordEt.getText().toString();
                mobile = mobileEt.getText().toString();
                showMessage(name+"\n"+city+"\n"+blood_group+"\n"+password+"\n"+mobile);

            }
        });

    }


    private void showMessage(String mgs){
        Toast.makeText(this, mgs , Toast.LENGTH_SHORT).show();
    }
}
