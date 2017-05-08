package theappfoundry.exeapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Toast;

/**
 * CalendarActivity
 *
 * Screen that shows a monthly calendar.
 */
public class CalendarActivity extends AppCompatActivity {
    CalendarView calendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        calendarView = (CalendarView) findViewById(R.id.calendarView);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            /**
             * When user selects a day on the calendar, a toast will show the date touched.
             *
             * @param view Screen
             * @param year Year of date user touched.
             * @param month Month of date user touched.
             * @param dayOfMonth Day of month user touched.
             */
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                month++;    // Correct month value.
                String date = month+"/" + dayOfMonth + "/" + year;
                Toast.makeText(getApplicationContext(), date, Toast.LENGTH_SHORT).show();
            }
        });
    }
}