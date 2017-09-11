package com.medialablk.easytoast;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RotateDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class EasyToast {

    private static LayoutInflater mInflater;
    private static Toast mToast;
    private static View mView;

    public static void success(Context context, CharSequence text){
        success(context, text, Toast.LENGTH_SHORT);
    }

    public static void success(Context context, CharSequence text, int duration) {
        mInflater = LayoutInflater.from(context);
        mView = mInflater.inflate(R.layout.simpletoast, null);
        setButtonMessage(text);
        setImageView(R.drawable.success);
        setLayout(R.drawable.round_success);
        mToast = new Toast(context);
        mToast.setView(mView);
        mToast.setDuration(duration);
        mToast.show();
    }

    public static void success(Context context, CharSequence text, int resId, int duration) {
        mInflater = LayoutInflater.from(context);
        mView = mInflater.inflate(R.layout.simpletoast, null);
        setButtonMessage(text);
        setImageView(resId);
        setLayout(R.drawable.round_success);
        mToast = new Toast(context);
        mToast.setView(mView);
        mToast.setDuration(duration);
        mToast.show();
    }

    public static void error(Context context, CharSequence text) {
        error(context, text,Toast.LENGTH_SHORT);
    }

    public static void error(Context context, CharSequence text, int duration) {
        mInflater = LayoutInflater.from(context);
        mView = mInflater.inflate(R.layout.simpletoast, null);
        setButtonMessage(text);
        setImageView(R.drawable.error);
        setLayout(R.drawable.round_error);
        mToast = new Toast(context);
        mToast.setView(mView);
        mToast.setDuration(duration);
        mToast.show();
    }

    public static void error(Context context, CharSequence text, int resId, int duration) {
        mInflater = LayoutInflater.from(context);
        mView = mInflater.inflate(R.layout.simpletoast, null);
        setButtonMessage(text);
        setImageView(resId);
        setLayout(R.drawable.round_error);
        mToast = new Toast(context);
        mToast.setView(mView);
        mToast.setDuration(duration);
        mToast.show();
    }

    public static void info(Context context, CharSequence text) {
        info(context,text,Toast.LENGTH_SHORT);
    }

    public static void info(Context context, CharSequence text, int duration) {
        mInflater = LayoutInflater.from(context);
        mView = mInflater.inflate(R.layout.simpletoast, null);
        setButtonMessage(text);
        setImageView(R.drawable.info);
        setLayout(R.drawable.round_info);
        mToast = new Toast(context);
        mToast.setView(mView);
        mToast.setDuration(duration);
        mToast.show();
    }

    public static void info(Context context, CharSequence text, int resId, int duration) {
        mInflater = LayoutInflater.from(context);
        mView = mInflater.inflate(R.layout.simpletoast, null);
        setButtonMessage(text);
        setImageView(resId);
        setLayout(R.drawable.round_info);
        mToast = new Toast(context);
        mToast.setView(mView);
        mToast.setDuration(duration);
        mToast.show();
    }

    public static void warning(Context context, CharSequence text) {
        warning(context, text,Toast.LENGTH_SHORT);
    }

    public static void warning(Context context, CharSequence text, int duration) {
        mInflater = LayoutInflater.from(context);
        mView = mInflater.inflate(R.layout.simpletoast, null);
        setButtonMessage(text, Color.BLACK);
        setImageView(R.drawable.warning, Color.BLACK);
        setLayout(R.drawable.round_warning);
        mToast = new Toast(context);
        mToast.setView(mView);
        mToast.setDuration(duration);
        mToast.show();
    }

    public static void warning(Context context, CharSequence text, int resId, int duration) {
        mInflater = LayoutInflater.from(context);
        mView = mInflater.inflate(R.layout.simpletoast, null);
        setButtonMessage(text, Color.BLACK);
        setImageView(resId);
        setLayout(R.drawable.round_warning);
        mToast = new Toast(context);
        mToast.setView(mView);
        mToast.setDuration(duration);
        mToast.show();
    }

    public static void custom(Context context, CharSequence text) {
        warning(context, text, Toast.LENGTH_SHORT);
    }

    public static void custom(Context context, CharSequence text, int duration) {
        mInflater = LayoutInflater.from(context);
        mView = mInflater.inflate(R.layout.simpletoast, null);
        setButtonMessage(text);
        setLayout(R.drawable.round_custom);
        mToast = new Toast(context);
        mToast.setView(mView);
        mToast.setDuration(duration);
        mToast.show();
    }

    public static void custom(Context context, CharSequence text, int resId, int duration) {
        mInflater = LayoutInflater.from(context);
        mView = mInflater.inflate(R.layout.simpletoast, null);
        setButtonMessage(text);
        setImageView(resId);
        setLayout(R.drawable.round_custom);
        mToast = new Toast(context);
        mToast.setView(mView);
        mToast.setDuration(duration);
        mToast.show();
    }

    public static void custom(Context context, String msg, int resId, int toastBackgroundColor, int toastTextColor, int duration) {
        mInflater = LayoutInflater.from(context);
        mView = mInflater.inflate(R.layout.simpletoast, null);
        setButtonMessage(msg, toastTextColor);
        setImageView(resId, toastTextColor);
        setLayout(true, toastBackgroundColor);
        mToast = new Toast(context);
        mToast.setView(mView);
        mToast.setDuration(duration);
        mToast.show();
    }

    private static Button setButtonMessage(CharSequence text) {
        Button mButton = (Button) mView.findViewById(R.id.button);
        mButton.setText(text);
        return mButton;
    }

    private static Button setButtonMessage(CharSequence text, int toastTextColor) {
        Button mButton = (Button) mView.findViewById(R.id.button);
        mButton.setText(text);
        mButton.setTextColor(toastTextColor);
        return mButton;
    }

    private static ImageView setImageView(int resId) {
        ImageView imgStatus = (ImageView) mView.findViewById(R.id.imgStatus);
        imgStatus.setImageResource(resId);
        return imgStatus;
    }

    private static ImageView setImageView(int resId, int toastTextColor) {
        ImageView imgStatus = (ImageView) mView.findViewById(R.id.imgStatus);
        imgStatus.setImageResource(resId);
        imgStatus.setColorFilter(toastTextColor);
        return imgStatus;
    }

    private static RelativeLayout setLayout(int resId){
        RelativeLayout relativeLayout = (RelativeLayout) mView.findViewById(R.id.layout);
        relativeLayout.setBackgroundResource(resId);
        return relativeLayout;
    }

    private static RelativeLayout setLayout(Boolean bool, int toastBackgroundColor){
        GradientDrawable shape = new GradientDrawable();
        shape.setCornerRadius(50);
        try{
            shape.setColor(toastBackgroundColor);
        }catch (NullPointerException e){
            e.printStackTrace();
        }
        RelativeLayout relativeLayout = (RelativeLayout) mView.findViewById(R.id.layout);
        if (android.os.Build.VERSION.SDK_INT >= 16){
            relativeLayout.setBackground(shape);
        } else{
            relativeLayout.setBackgroundDrawable(shape);
        }
        return relativeLayout;
    }

}
