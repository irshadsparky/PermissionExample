# Runtime Permission AnyWhere In Application



### Installing

The `Permission library` Use the following in your `build.gradle`:

```groovy
use dependency

 maven { url 'https://jitpack.io' }

dependencies {
   implementation 'com.github.irshadsparky:PermissionLib:master-SNAPSHOT'
}
```

### Basic setup and usage

1. Your application will need the permissions that you required for runtime.

2. The `Permission Library` to your Manifest xml:

    ```xml

  <activity android:name="com.irshad.runtimepermissionlib.PermissionUtils$PermissionActivity" />
```

3.Now you need to add class in your package to use direct in anywhere in your application.
["PermissionHelper.java" ](https://github.com/irshadsparky/PermissionExample/blob/master/app/src/main/java/com/irshad/permissionexample/helper/PermissionHelper.java)
["DialogHelper.java"](https://github.com/irshadsparky/PermissionExample/blob/master/app/src/main/java/com/irshad/permissionexample/helper/DialogHelper.java)

    ```
    you can modify them as per your requirement.
    
4. Finally, you can use library like:

    ```java

  
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
    ```
    you can also develope your require permission.
5. That's it!

### Contributing

0. Fork this repo and clone your fork
0. Make your desired changes
0. Add tests for your new feature and ensure all tests are passing
0. Commit and push
0. Submit a Pull Request through Github's interface and a project maintainer will
decide your change's fate.

_Note: issues can be submitted via [github issues](https://github.com/irshadsparky/PermissionExample/issues/new)_

Developed By
------------
Mohammad Irshad Sheikh - ir9977(at).gmail.com

### License

PlacesAutocomplete is released under a [BSD 2-Clause License](http://opensource.org/licenses/BSD-2-Clause), viewable [here](LICENSE.txt)
