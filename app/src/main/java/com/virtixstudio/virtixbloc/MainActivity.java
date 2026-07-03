package com.virtixstudio.virtixbloc;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
public class MainActivity extends Activity {
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        TextView t = new TextView(this);
        t.setText("VIRTIX BLOC");
        t.setTextSize(40);
        t.setTextColor(0xFF00AAFF);
        t.setGravity(17);
        setContentView(t);
    }
}
