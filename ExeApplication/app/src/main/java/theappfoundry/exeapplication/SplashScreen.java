package theappfoundry.exeapplication; // package name (where all the classes are) theappfoundry/exeapplication

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * SplashScreen
 *
 * SplashScreen is a derived/subclass of the SuperClass/Parent Class AppCompatActivity.
 * SplashScreen inherits all methods(public) and (all)instance variables from AppCompatActivity.
 */
public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen); // inherited method. Sets view from xml

        Thread timer = new Thread() {

            @Override
            public void run() {
                try {
                    sleep(2000);
                    Intent goToMain = new Intent(getBaseContext(), MainActivity.class);
                    startActivity(goToMain);

                    // TODO: LoginActivity.
                    // Intent goToLogin = new Intent(getBaseContext(), LoginActivity.class);
                    // startActivity(goToLogin);
                }
                catch(InterruptedException e) {
                    // TODO: Only printStackTrace() in debug.
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
