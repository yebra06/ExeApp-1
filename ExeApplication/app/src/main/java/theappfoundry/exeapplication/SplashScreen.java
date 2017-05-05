package theappfoundry.exeapplication; // package name (where all the classes are) theappfoundry/exeapplication

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

// SplashScreen is a derived/subclass of the SuperClass/Parent Class AppCompatActivity
// SplashScreen inherits all methods(public) and (all)instance variables from AppCompatActivity
public class SplashScreen extends AppCompatActivity {

    // @override not necessary, good practice. Oncreate is being overridden.
    @Override // changing the method definition in this subclass (Splash) from superclass AppCompat.
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // calling superclasse's onCreate method?
        setContentView(R.layout.activity_splash_screen); // inherited method. Sets view from xml

        Thread timer = new Thread() {

            @Override
            public void run() {
                try {
                    sleep(2000);
                    Intent goToLogin = new Intent(getBaseContext(), LoginActivity.class);
                    startActivity(goToLogin);
                }
                catch(InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    finish();
                }
            }
        };

        timer.start();
    }
}
