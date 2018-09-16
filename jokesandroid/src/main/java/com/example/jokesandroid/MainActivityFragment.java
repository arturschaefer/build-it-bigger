package com.example.jokesandroid;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    private static final String GCE_RESULT = "gce_result";

    private TextView mTextView;
    private String mJoke;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        mTextView = view.findViewById(R.id.tv_joke);

        mJoke = getArguments().getString(GCE_RESULT);
        mTextView.setText(mJoke);

        return view;
    }
}
