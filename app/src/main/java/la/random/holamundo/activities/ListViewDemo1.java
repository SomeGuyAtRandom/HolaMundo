package la.random.holamundo.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

import la.random.holamundo.Main;
import la.random.holamundo.R;

public class ListViewDemo1 extends AppCompatActivity {

    private ListView myListView;
    private Spinner mySpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_demo1);
        mySpinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> spinnerItems = ArrayAdapter.createFromResource(this,
                R.array.spinner_array, android.R.layout.simple_spinner_item);

        spinnerItems.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(spinnerItems);


        myListView = (ListView) findViewById(R.id.listView);
        String[] values = new String[]{"Beatles", "INXS", "Tears for Fears",
                "Grateful Dead", "The Who", "Madonna", "Men without Hats", "Kiss",
                "Mumford & Sons", "Devo", "Johny Cash", "Black Sabbath", "Flock of Seagulls", "ZZ Top",
                "Rolling Stones", "Earth Wind and Fire", "The Crickets", "The Black Keys", "Pink Floyd", "Queen",
                "Doors", "One Direction", "NIN"};

        List<String> list = Arrays.asList(values);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        myListView.setAdapter(adapter);

        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {


            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListViewDemo1.this, "You Selected position: " + position, Toast.LENGTH_SHORT).show();

                if(position==3)
                {
                    Intent intent = new Intent(ListViewDemo1.this, Main.class);
                    startActivity(intent);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });
    }
}
