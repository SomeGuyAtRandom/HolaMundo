package la.random.holamundo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import la.random.holamundo.activities.ListViewDemo1;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }


    public void gotoListViewDemo(View view){

        Intent intent = new Intent(this, ListViewDemo1.class);
        startActivity(intent);

    }
}
