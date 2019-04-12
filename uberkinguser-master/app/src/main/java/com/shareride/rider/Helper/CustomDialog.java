package com.shareride.rider.Helper;
/**
 * @Developer Faysal
 * @Company AAPBD
 **/

import android.app.ProgressDialog;
import android.content.Context;
import android.view.Window;

import com.shareride.rider.R;


public class CustomDialog extends ProgressDialog {

    public CustomDialog(Context context) {
        super(context);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setIndeterminate(true);
        setMessage(context.getResources().getString(R.string.please_wait));
      //  setContentView(R.layout.custom_dialog);
    }
}
