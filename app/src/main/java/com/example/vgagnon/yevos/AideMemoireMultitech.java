package com.example.vgagnon.yevos;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.util.Linkify;
import android.view.View;
import android.widget.TextView;

public class AideMemoireMultitech extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aide_memoire_multitech);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView noteView = (TextView) findViewById(R.id.textMultitech);
        Linkify.addLinks(noteView, Linkify.ALL);

    }
}
