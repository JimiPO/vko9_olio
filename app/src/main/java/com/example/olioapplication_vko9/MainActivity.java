package com.example.olioapplication_vko9;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.Button;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
    private Button switchToShow;
    userStorage s = userStorage.getInstance();
    ArrayList<User> list = s.getMyArrayList();
    private RadioButton late;
    private RadioButton tite;
    private RadioButton tuta;
    private RadioButton säte;
    private EditText firstName, lastName, email;
    private String degree = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switchToShow = findViewById(R.id.button2);
        switchToShow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                for(User user : list){
                    System.out.println(user.getFirstName() + " " + user.getLastName() + " " + user.getDegreeProgram() + " " + user.getEmail());}
            }
        });

        userStorage s = userStorage.getInstance();
        firstName = findViewById(R.id.etunimi);
        lastName = findViewById(R.id.sukunimi);
        email = findViewById(R.id.sapo);

        RadioGroup radioGroup = findViewById(R.id.radio_g);
        late = findViewById(R.id.late);
        tite = findViewById(R.id.tite);
        tuta = findViewById(R.id.tuta);
        säte = findViewById(R.id.säte);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                User user = new User(firstName.getText().toString(), lastName.getText().toString(), email.getText().toString(), degree);
                s.addUsers(user);
                System.out.println("Käyttäjä lisätty: " + user.getFirstName() + " " + user.getLastName() + " " + user.getDegreeProgram() + " " + user.getEmail());
            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch(checkedId) {
                    case R.id.late:
                        degree = "Laskennallinen tekniikka";
                        break;
                    case R.id.tite:
                        degree = "tietotekniikka";
                        break;
                    case R.id.tuta:
                        degree = "tuotantotalous";
                        break;
                    case R.id.säte:
                        degree = "Sähkötekniikka";
                        break;
                }
            }
        });
    }
}
