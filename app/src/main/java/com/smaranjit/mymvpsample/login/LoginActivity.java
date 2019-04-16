package com.smaranjit.mymvpsample.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.smaranjit.mymvpsample.R;

public class LoginActivity extends AppCompatActivity implements LoginContract.LoginView {

    ProgressBar mProgressBar;
    TextView mTextViewAlert;
    LoginContract.LoginPresenter mLoginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLoginPresenter = new LoginPresenterImpl(this);
        mProgressBar = (ProgressBar) findViewById(R.id.progressBar_loading);
        mTextViewAlert = (TextView) findViewById(R.id.TextView_alert);
        final EditText mEditTextMobileNo = (EditText) findViewById(R.id.textinput_mobileno);
        Button mButtonLogin = (Button) findViewById(R.id.button_login);
        mButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mLoginPresenter.onLoginClick(mEditTextMobileNo.getText().toString());
            }
        });
    }

    @Override
    public void showProgress() {
        mProgressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        mProgressBar.setVisibility(View.GONE);
    }

    @Override
    public void showAlertMessage(String msg) {
        mTextViewAlert.setVisibility(View.VISIBLE);
        mTextViewAlert.setText(msg);
    }

    @Override
    public void clearUI() {
        mTextViewAlert.setVisibility(View.GONE);
        mProgressBar.setVisibility(View.GONE);;
    }

    @Override
    public void changeActivity() {
        //Logic For opening new activity or fragment
    }
}
