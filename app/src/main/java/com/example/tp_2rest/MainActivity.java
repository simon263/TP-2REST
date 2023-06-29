package com.example.tp_2rest;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                EditText Text1 = (EditText) findViewById(R.id.myEditTextName);
                EditText Text2 = (EditText) findViewById(R.id.myEditTextPassword);
                String username = Text1.getText().toString();
                String password = Text2.getText().toString();

                if (checkUserPass(username, password)) {
                    Toast.makeText(MainActivity.this, "Hello, 2!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity (intent);

                } else
                    Toast.makeText(MainActivity.this, "Mot de passe incorrecte!", Toast.LENGTH_SHORT).show();

            }


        });


    }

    public boolean checkUserPass(String username, String password) {

        return password.equals("JimMorrisson");


    }

    /*public void sendMessage(View view){

        EditText editText = (EditText) findViewById(R.id.myEditTextName);
        String message = editText.getText().toString();
        intent.putExtra("myMessage", message);

    }*/

}
