package com.ivanescobar.morsachat;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;

public class LoadingDialog {

        private Activity activity;
        private AlertDialog dialog;

        LoadingDialog(Activity myActivity){
            activity = myActivity;
        }

        void startLoadingAlertDialog(){
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);

            LayoutInflater inflater = activity.getLayoutInflater();
            builder.setView(inflater.inflate(R.layout.custom_dialog, null));
            builder.setCancelable(false);

            dialog = builder.create();
            dialog.show();

        }

        void dismissDialog(){
            dialog.dismiss();
        }
    }

