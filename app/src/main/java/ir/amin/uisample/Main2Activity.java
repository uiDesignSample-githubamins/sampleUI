package ir.amin.uisample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.WindowManager;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        getWindow().addFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView( R.layout.activity_main2 );
    }
}
