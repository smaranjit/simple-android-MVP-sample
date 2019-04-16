package com.smaranjit.mymvpsample;

/* This Interface could be treated as contractor for Model, View and Presenter Layer*/
public interface LoginContract {
    /*This Interface is used to interact with view layer, avoid interaction with view layer directly
    Implement this from Activity Class or Fragment View layer
     */
    interface LoginView {
        void showProgress();

        void hideProgress();
        void showAlertMessage(String msg);
        void clearUI();
        void changeActivity();

    }
    //Implement This Interface as Model Layer, This is treated as Model Layer
    interface LoginInteractor {
        boolean verifyLogin(String mobile_no);
    }

    //This Interface is treated as Presenter Layer
    interface LoginPresenter {

        void onLoginClick(String mobile_no);

        void onDestroy();
    }
}
