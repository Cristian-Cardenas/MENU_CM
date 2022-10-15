package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if (id == R.id.inicio){
            startActivity(new Intent(MainActivity.this, HomeActivity.class));
        } else if (id == R.id.mapas){
            startActivity(new Intent(MainActivity.this, LocationActivity.class));
        }else if (id == R.id.lugares){
            startActivity(new Intent(MainActivity.this, LugaresActivity.class));
        }else if (id == R.id.info){
            startActivity(new Intent(MainActivity.this, MainActivity.class));
        }
        return super.onOptionsItemSelected(item);
    }
}