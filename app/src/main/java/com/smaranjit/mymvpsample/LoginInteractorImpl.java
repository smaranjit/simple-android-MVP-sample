package com.smaranjit.mymvpsample;

public class LoginInteractorImpl implements LoginContract.LoginInteractor {
   //for complex code implement LoginContract.LoginInteractor separately, otherwise we can implement it from Presenter Implementation
    @Override
    public boolean verifyLogin(String mobile_no) {

        return true;
    }
}
