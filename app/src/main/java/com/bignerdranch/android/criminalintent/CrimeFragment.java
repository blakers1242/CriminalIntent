package com.bignerdranch.android.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by blakers1242 on 9/15/15.
 */
public class CrimeFragment extends Fragment {
    private Crime mCrime;
    private EditText mTitleField;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_crime, container, false);

        mTitleField = (EditText)v.findViewById(R.id.crime_title);
        mTitleField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(
                    CharSequence s, int start, int count, int after) {
                    // This space is left intentionally blank
            }

            @Override
            public void onTextChanged(
                    CharSequence s, int start, int before, int after) {
                    mCrime.setTitle(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                    // This space is left intentionally blank
            }
        });
        return v;
    }

}
