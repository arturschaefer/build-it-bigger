package com.example.jokesandroid;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private Toolbar mToolbar;

    private static final String GCE_RESULT = "gce_result";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);


        if (savedInstanceState == null) {
            Bundle bundle = new Bundle();
            bundle.putString(GCE_RESULT, getIntent().getStringExtra(GCE_RESULT));

            MainActivityFragment fragment = new MainActivityFragment();
            fragment.setArguments(bundle);

            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment, fragment)
                    .commit();
        }
    }

}
