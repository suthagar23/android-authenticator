package org.xwiki.android.authenticator.activities;

import android.view.View;

import org.xwiki.android.authenticator.auth.AuthenticatorActivity;

/**
 * Created by lf on 2016/5/16.
 */
public class SignUpStep1ViewFlipper extends BaseViewFlipper{

    public SignUpStep1ViewFlipper(AuthenticatorActivity activity, View contentRootView) {
        super(activity, contentRootView);
    }

    @Override
    public void doNext() {
        mActivity.showViewFlipper(AuthenticatorActivity.ViewFlipperLayoutId.SIGN_UP_STEP2);
    }

    @Override
    public void doPrevious() {
        mActivity.showViewFlipper(AuthenticatorActivity.ViewFlipperLayoutId.SETTING_IP);
    }
}