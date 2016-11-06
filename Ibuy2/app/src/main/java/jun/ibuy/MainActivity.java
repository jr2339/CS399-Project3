package jun.ibuy;

import android.icu.util.RangeValueIterator;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import java.text.*;
import java.util.*;
import java.lang.String;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ArrayList<String> shoppingList = new ArrayList<String>();

    private EditText itemName,itemDate,itemCost,itemUrgency,itemListView;
    private ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Shopping List");

         itemName = (EditText)findViewById(R.id.item_name);
         itemDate = (EditText)findViewById(R.id.item_date);
         itemCost = (EditText)findViewById(R.id.item_cost);
         itemUrgency = (EditText)findViewById(R.id.item_urgency);

        ListView shoppingListView = (ListView)findViewById(R.id.item_list);

        Button addItem = (Button) findViewById(R.id.add_item);
        addItem.setOnClickListener(this);

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,shoppingList);
        shoppingListView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if (!itemName.getText().toString().equals("")){
            shoppingList.add(itemName.getText().toString()+"     "+itemDate.getText().toString()+"       "+itemCost.getText().toString()+"       "+itemUrgency.getText().toString());
            adapter.notifyDataSetChanged();
            itemName.setText("");
            itemCost.setText("");
        }
    }
}
