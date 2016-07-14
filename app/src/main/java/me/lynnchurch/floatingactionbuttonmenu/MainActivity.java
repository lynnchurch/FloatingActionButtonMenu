package me.lynnchurch.floatingactionbuttonmenu;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import me.lynnchurch.library.FloatingActionButtonMenu;

public class MainActivity extends AppCompatActivity
{
    private List<String> mItems=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButtonMenu fabMenu = (FloatingActionButtonMenu) findViewById(R.id.fab_menu);
        fabMenu.setOnMenuItemClickListener(new FloatingActionButtonMenu.OnMenuItemClickListener()
        {
            @Override
            public void onMenuItemClick(FloatingActionButton button, int btnId)
            {
                switch (btnId)
                {
                    case R.id.card_giftcard:
                        Toast.makeText(MainActivity.this, "card_giftcard", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.backup:
                        Toast.makeText(MainActivity.this, "backup", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.grade:
                        Toast.makeText(MainActivity.this, "grade", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                }
            }
        });

        for (int i = 0; i <50 ; i++)
        {
            mItems.add("item"+i);
        }
        StringsAdapter mAdapter=new StringsAdapter(mItems);
        RecyclerView rv_items=(RecyclerView)findViewById(R.id.rv_items);
        rv_items.setAdapter(mAdapter);
        rv_items.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
