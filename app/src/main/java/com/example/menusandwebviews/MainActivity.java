package com.example.menusandwebviews;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setup Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Menus & WebView App");
        }

        // Initialize UI buttons
        Button btnOpenWeb = findViewById(R.id.btn_open_webview);
        Button btnStudentDetails = findViewById(R.id.btn_student_details);
        Button btnPopupMenu = findViewById(R.id.btn_popup_menu);

        btnOpenWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                startActivity(intent);
            }
        });

        btnStudentDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StudentDetailsActivity.class);
                startActivity(intent);
            }
        });

        btnPopupMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu(v);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the options menu
        getMenuInflater().inflate(R.menu.options_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_home) {
            Toast.makeText(this, "Already on Home Screen", Toast.LENGTH_SHORT).show();
            return true;
        } else if (id == R.id.action_webview) {
            Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.action_student_details) {
            Intent intent = new Intent(MainActivity.this, StudentDetailsActivity.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.action_exit) {
            Toast.makeText(this, "Exiting application...", Toast.LENGTH_SHORT).show();
            finishAffinity();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void showPopupMenu(View view) {
        PopupMenu popupMenu = new PopupMenu(MainActivity.this, view);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.popup_help) {
                    Toast.makeText(MainActivity.this, "Help: Use Options Menu or buttons to navigate.", Toast.LENGTH_LONG).show();
                    return true;
                } else if (id == R.id.popup_contact) {
                    Toast.makeText(MainActivity.this, "Support: Spencer Aaron Fernandes (25MCAR0123)", Toast.LENGTH_LONG).show();
                    return true;
                }
                return false;
            }
        });
        popupMenu.show();
    }
}
