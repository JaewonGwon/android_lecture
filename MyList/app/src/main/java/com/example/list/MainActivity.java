package com.example.list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    PersonAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        //GridLayoutManager layoutManager =new GridLayoutManager(this, 2);

        recyclerView.setLayoutManager(layoutManager);
        adapter = new PersonAdapter();
        adapter.addItem(new Person("홍길동", "010-6610-4718"));
        adapter.addItem(new Person("홍동길", "010-5510-4718"));
        adapter.addItem(new Person("길동홍", "010-4410-4718"));
        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new OnPersonItemClickListener() {
            @Override
            public void OnItemClick(PersonAdapter.ViewHolder holder, View view, int position) {
                Person item = adapter.getItem(position);
                showToast("아이템 선택됨 : "+ item.getName());
            }
        });
    }
    public void showToast(String data){
        Toast.makeText(this, data, Toast.LENGTH_LONG).show();
    }
}