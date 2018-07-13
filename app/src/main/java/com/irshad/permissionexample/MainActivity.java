package com.irshad.permissionexample;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.irshad.permissionexample.helper.PermissionHelper;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //--------request camera permission------------------------
        PermissionHelper.requestCamera(new PermissionHelper.OnPermissionGrantedListener() {
            @Override
            public void onPermissionGranted() {

            }
        });
        //--------request Storage permission------------------------
        PermissionHelper.requestStorage(new PermissionHelper.OnPermissionGrantedListener() {
            @Override
            public void onPermissionGranted() {

            }
        });
        //--------request Phone permission------------------------
        PermissionHelper.requestPhone(new PermissionHelper.OnPermissionGrantedListener() {
            @SuppressLint("MissingPermission")
            @Override
            public void onPermissionGranted() {

            }
        });
        //--------request Phone permission------------------------
        PermissionHelper.requestPhone(
                new PermissionHelper.OnPermissionGrantedListener() {
                    @SuppressLint("MissingPermission")
                    @Override
                    public void onPermissionGranted() {

                    }
                },
                new PermissionHelper.OnPermissionDeniedListener() {
                    @Override
                    public void onPermissionDenied() {

                    }
                }
        );
//--------request Sms permission------------------------
        PermissionHelper.requestSms(new PermissionHelper.OnPermissionGrantedListener() {
            @SuppressLint("MissingPermission")
            @Override
            public void onPermissionGranted() {

            }
        });
        //--------request Location permission------------------------
        PermissionHelper.requestLocation(new PermissionHelper.OnPermissionGrantedListener() {
            @Override
            public void onPermissionGranted() {

            }
        });

    }
}
