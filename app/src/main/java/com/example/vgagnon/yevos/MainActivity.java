package com.example.vgagnon.yevos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (!isTaskRoot()) {
            finish();
            return;
        }
    }
    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Spinner s = findViewById(R.id.spinner);
        String text = s.getSelectedItem().toString();
        if (text.equals("CPU")) {
            text = "Compucom";
        } else if (text.equals("Compucom")) {
            text = "Compucom";
        } else if (text.equals("Compugen")) {
            text = "Compucom";
        } else if (text.equals("Diebold")) {
            Intent intent = new Intent(this, Diebold_Call_In.class);
            startActivity(intent);
        } else if (text.equals("Maxwell")) {
            text = "Compucom";
        } else if (text.equals("Multitech")) {
            Intent intent = new Intent(this, Multitech_Call_In.class);
            startActivity(intent);
        } else if (text.equals("MSC")) {
            text = "Compucom";
        } else if (text.equals("NCR")) {
            text = "Compucom";
        } else if (text.equals("Progitech")) {
            text = "Compucom";
        } else if (text.equals("Ricoh")) {
            text = "Compucom";
        }
    }

    public void AideMemoire(View view) {
        Spinner s = findViewById(R.id.spinner);
        String text = s.getSelectedItem().toString();
        if (text.equals("CPU")) {
            Intent intent = new Intent(this, AideMemoireCPU.class);
            startActivity(intent);
        } else if (text.equals("Compucom")) {
            text = "Compucom";
        } else if (text.equals("Compugen")) {
            text = "Compucom";
        } else if (text.equals("Diebold")) {
            Intent intent = new Intent(this, AideMemoireDiebold.class);
            startActivity(intent);
        } else if (text.equals("Maxwell")) {
            text = "Compucom";
        } else if (text.equals("Multitech")) {
            Intent intent = new Intent(this, AideMemoireMultitech.class);
            startActivity(intent);
        } else if (text.equals("MSC")) {
            text = "Compucom";
        } else if (text.equals("NCR")) {
            text = "Compucom";
        } else if (text.equals("Progitech")) {
            text = "Compucom";
        } else if (text.equals("Ricoh")) {
            text = "Compucom";
        }
    }



}
