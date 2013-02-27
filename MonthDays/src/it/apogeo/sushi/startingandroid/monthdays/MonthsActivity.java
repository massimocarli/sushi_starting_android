package it.apogeo.sushi.startingandroid.monthdays;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MonthsActivity extends Activity {
	
	private final static String TAG = "MonthsActivity";
    
    private String selectedMonthName;
    
    private int selectedMonthDays;
    
    private int[] monthDays;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_months);
        // We get the int array
        monthDays = getResources().getIntArray(R.array.month_length);
        if(BuildConfig.DEBUG){
        	Log.i(TAG, "MonthsActivity initialized");
        }
    }

    /**
     * Called when a month button is pressed  
     * @param button The month button pressed
     */
    public void monthPressed(View button){
        // We use a catch to get the button pressed id
        int buttonId = button.getId();
        // The text to show
        getDataForMonth(buttonId);
        String toShow = getResources().getString(R.string.month_output_value, selectedMonthName,selectedMonthDays);    
        // We use a Toast to show the Data
        Toast toast = Toast.makeText(this, toShow, Toast.LENGTH_SHORT);
        toast.show();
        if(BuildConfig.DEBUG){
        	Log.v(TAG, "Selected "+selectedMonthName);
        }
    }
    
    private void getDataForMonth(int monthId){
        Resources resources = getResources();
        switch (monthId) {
        case R.id.jan_button:
            selectedMonthName = resources.getString(R.string.jan);
            selectedMonthDays = monthDays[0];
            break;
        case R.id.feb_button:
            selectedMonthName=  resources.getString(R.string.feb);
            selectedMonthDays = monthDays[1];
            break;    
        case R.id.mar_button:
            selectedMonthName=  resources.getString(R.string.mar);
            selectedMonthDays = monthDays[2];
            break;    
        case R.id.apr_button:
            selectedMonthName=  resources.getString(R.string.apr);
            selectedMonthDays = monthDays[3];
            break;    
        case R.id.may_button:
            selectedMonthName=  resources.getString(R.string.may);
            selectedMonthDays = monthDays[4];
            break;    
        case R.id.jun_button:
            selectedMonthName=  resources.getString(R.string.jun);
            selectedMonthDays = monthDays[5];
            break;    
        case R.id.jul_button:
            selectedMonthName=  resources.getString(R.string.jul);
            selectedMonthDays = monthDays[6];
            break;    
        case R.id.aug_button:
            selectedMonthName=  resources.getString(R.string.aug);
            selectedMonthDays = monthDays[7];
            break;    
        case R.id.sep_button:
            selectedMonthName=  resources.getString(R.string.sep);
            selectedMonthDays = monthDays[8];
            break;    
        case R.id.oct_button:
            selectedMonthName=  resources.getString(R.string.oct);
            selectedMonthDays = monthDays[9];
            break;    
        case R.id.nov_button:
            selectedMonthName=  resources.getString(R.string.nov);
            selectedMonthDays = monthDays[10];
            break;
        case R.id.dic_button:
            selectedMonthName=  resources.getString(R.string.dic);    
            selectedMonthDays = monthDays[11];
            break;
        default:
            selectedMonthName=  "Unknown";
            selectedMonthDays=  0;
        }
    }
    
}
