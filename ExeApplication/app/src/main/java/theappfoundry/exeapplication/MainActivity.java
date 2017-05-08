package theappfoundry.exeapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * goToCalendarView
     *
     * This is an onClick event to route user to the main calendar view where authenticated users
     * are able to crud events on the calendar.
     */
    public void goToCalendarView(View view) {
        Intent goToCalendarView = new Intent(getBaseContext(), CalendarActivity.class);
        startActivity(goToCalendarView);
    }
}
