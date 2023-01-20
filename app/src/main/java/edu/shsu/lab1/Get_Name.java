package edu.shsu.lab1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Get_Name extends Activity implements View.OnClickListener {

    android.widget.EditText name;
    android.widget.Button button;

    public void onClick(View arg0){
        Intent myIntent = new Intent(this,MainActivity.class);
        myIntent.putExtra("uname",name.getText().toString());
        this.startActivity(myIntent);
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.name_getter);

        name = (EditText) this.findViewById(R.id.editTextTextPersonName);
        button = (Button) this.findViewById(R.id.button);

        button.setOnClickListener(this);
    }
}

