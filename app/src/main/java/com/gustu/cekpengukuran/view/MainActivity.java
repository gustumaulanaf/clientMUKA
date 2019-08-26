package com.gustu.cekpengukuran.view;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDialog;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.gustu.cekpengukuran.R;
import com.gustu.cekpengukuran.adapter.MainAdapter;
import com.gustu.cekpengukuran.interfaces.MainView;
import com.gustu.cekpengukuran.model.DataMuka;
import com.gustu.cekpengukuran.presenter.MainPresenter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView {
  //  DataDatabase dataDatabase;
    MainPresenter mainPresenter;
    MainAdapter mainAdapter;
    EditText cari;
    RecyclerView recyclerView;
    AppCompatDialog appCompatDialog;
    FloatingActionButton fabCari;
    List<DataMuka> dataMukaList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter = new MainPresenter(this);
        mainPresenter.setContext(this);
        cari = findViewById(R.id.etCariNoBerkas);
        fabCari = findViewById(R.id.btCari);
        fabCari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String noBerkas = cari.getText().toString();
                mainPresenter.getData(noBerkas);
            }
        });
       // dataDatabase = DataDatabase.getInstance(this);
    }


    @Override
    public void _onCheck(List<DataMuka> dataMukaList) {
        if (dataMukaList.size()==0){
            Toast.makeText(MainActivity.this,"Data Tidak Ditemukan",Toast.LENGTH_SHORT).show();
        }
        mainAdapter  = new MainAdapter(dataMukaList);
        recyclerView = findViewById(R.id.rvData);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this,RecyclerView.VERTICAL,false);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(mainAdapter);
    }
        public boolean onCreateOptionsMenu(final Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {

            case R.id.tentang:
               appCompatDialog = new AppCompatDialog(MainActivity.this);
                appCompatDialog.setContentView(R.layout.item_tentang);
                appCompatDialog.show();
                break;

            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}
