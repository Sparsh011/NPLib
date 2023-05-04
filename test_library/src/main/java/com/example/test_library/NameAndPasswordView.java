package com.example.test_library;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

public class NameAndPasswordView extends ConstraintLayout {
    private EditText mNameEditText;
    private EditText mPasswordEditText;
    private Button btn;

    public NameAndPasswordView(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.name_and_password, this);
        mNameEditText = view.findViewById(R.id.name);
        mPasswordEditText = view.findViewById(R.id.password);
        btn = view.findViewById(R.id.btn);
        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, getName() + " " + getPassword(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public String getName(){
        return mNameEditText.getText().toString();
    }

    public String getPassword(){
        return mPasswordEditText.getText().toString();
    }
}

