package com.example.olioapplication_vko9;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public abstract class ShowActivity  extends AppCompatActivity{
    private View name;
    private View degree;
    private View email;
    private Button backButton;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        userStorage s = userStorage.getInstance();
        ArrayList<User> list = s.getMyArrayList();
        TextView name = findViewById(R.id.show_nimi);
        TextView degree = findViewById(R.id.koulutus);
        TextView email = findViewById(R.id.meili);
        backButton = findViewById(R.id.button3);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

         for(User user : list){
            name.setText(user.getFirstName() + " " + user.getLastName());
            degree.setText(user.getDegreeProgram());
            email.setText(user.getEmail());}
            try {Thread.sleep(150);}
            catch (InterruptedException e) {throw new RuntimeException(e);}
    }
}
