package com.example.recyclerviewcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         recyclerView = (RecyclerView)findViewById(R.id.recycler_view);

         adapter = new Adapter(this, Data.getData());

         recyclerView.setLayoutManager(new LinearLayoutManager(this));  //vertical orientation
         recyclerView.setAdapter(adapter);


    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @SuppressLint("WrongConstant")
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        switch (id)

        {
            case R.id.linearLayout_vertical:
                LinearLayoutManager linearLayoutManager_vertical = new LinearLayoutManager(this);
                linearLayoutManager_vertical.setOrientation(LinearLayoutManager.VERTICAL);
                recyclerView.setLayoutManager(linearLayoutManager_vertical);
                break;

            case R.id.linearLayout_horizontal:
                LinearLayoutManager linearLayoutManager_horizontal = new LinearLayoutManager(this);
                linearLayoutManager_horizontal.setOrientation(LinearLayoutManager.HORIZONTAL);
                recyclerView.setLayoutManager(linearLayoutManager_horizontal);
                break;

            case R.id.grid_view:
                GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
                recyclerView.setLayoutManager(gridLayoutManager);
                break;

            case R.id.staggeredview_horizontal:
                StaggeredGridLayoutManager staggeredGridLayoutManager_horizontal = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.HORIZONTAL);
                recyclerView.setLayoutManager(staggeredGridLayoutManager_horizontal);
                break;

            case R.id.staggeredview_vertical:
                StaggeredGridLayoutManager staggeredGridLayoutManager_vertical = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
                recyclerView.setLayoutManager(staggeredGridLayoutManager_vertical);
                break;


        }

        return super.onOptionsItemSelected(item);
    }
}
