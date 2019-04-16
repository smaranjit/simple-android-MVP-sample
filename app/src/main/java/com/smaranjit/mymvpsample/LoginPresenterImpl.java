package com.smaranjit.mymvpsample;

public class LoginPresenterImpl implements LoginContract.LoginPresenter {
    LoginContract.LoginView mView;

    LoginPresenterImpl(LoginContract.LoginView mView){
        this.mView = mView;
    }
    @Override
    public void onLoginClick(String mobile_no) {

        mView.showProgress();
        //Apply Logic Here for small interaction, but for large interaction use interactor Class as Model
        //when task completed use
        //mView.hideProgress();
        //To pass information to view use
        mView.showAlertMessage("Test");
    }

    @Override
    public void onDestroy() {

    }
}
