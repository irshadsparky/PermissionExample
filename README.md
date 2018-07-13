# PermissionExample

use dependancy
 maven { url 'https://jitpack.io' }
 
  implementation 'com.github.irshadsparky:PermissionLib:master-SNAPSHOT'
  
  
  
  
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



