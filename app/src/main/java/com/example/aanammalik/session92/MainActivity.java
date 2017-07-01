package com.example.aanammalik.session92;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // declaring id
    private static final int item_1 = Menu.FIRST;
    private static final int item_2 = Menu.FIRST + 1;
    private static final int item_3 = Menu.FIRST + 2;
    private static final int item_4 = Menu.FIRST + 3;
    private static final int item_5 = Menu.FIRST + 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override// on create option  method
    public boolean onCreateOptionsMenu(Menu menu) {
        // adding menu id,title

        menu.add(0, item_1, 0, "Computer");
        menu.add(0, item_2, 0, "GamePad");
        menu.add(0, item_3, 0, "Camera");
        menu.add(0, item_4, 0, "Video");
        menu.add(0, item_5, 0, "E-Mail");
        return true;

    }

    @Override// on select item
    public boolean onOptionsItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();// adapter
        switch (item.getItemId()) {
            case item_1:
                Toast.makeText(getApplicationContext(), "Computer", Toast.LENGTH_SHORT).show();// toast for show

                return true;
            case item_2:
                Toast.makeText(getApplicationContext(), "GamePad", Toast.LENGTH_SHORT).show();

                return true;
            case item_3:
                Toast.makeText(getApplicationContext(), "Camera", Toast.LENGTH_SHORT).show();

                return true;
            case item_4:
                Toast.makeText(getApplicationContext(), "Video", Toast.LENGTH_SHORT).show();

                return true;
            case item_5:
                Toast.makeText(getApplicationContext(), "E-Mail", Toast.LENGTH_SHORT).show();

            default:
                return super.onContextItemSelected(item);
        }

    }
}
