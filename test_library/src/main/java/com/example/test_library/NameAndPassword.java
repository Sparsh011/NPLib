package com.example.test_library;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

public class NameAndPassword {
    private EditText mNameEditText;
    private EditText mPasswordEditText;

    public NameAndPassword(Context context) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.name_and_password, null);
        mNameEditText = view.findViewById(R.id.name);
        mPasswordEditText = view.findViewById(R.id.password);
    }

    public String getName(){
        return mNameEditText.getText().toString();
    }

    public String getPassword(){
        return mPasswordEditText.getText().toString();
    }
}
