package com.example.izone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMember;
    private ArrayList<Member> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("IZONE Member");
        rvMember = findViewById(R.id.rv_izone);
        rvMember.setHasFixedSize(true);

        list.addAll(MemberData.getListData());
        showRecyclerList();
    }
    private void showRecyclerGrid() {
        rvMember.setLayoutManager(new GridLayoutManager(this, 2));
        GridMemberAdapter gridMemberAdapter = new GridMemberAdapter(list);
        rvMember.setAdapter(gridMemberAdapter);

        gridMemberAdapter.setOnItemClickCallback(new GridMemberAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Member data) {
                //Berpindah Activity dan Mempassing data Nama pada Activity Selanjutnya
                Intent sendData = new Intent(MainActivity.this, MemberDetail.class);
                sendData.putExtra("MyName", data.getName());
                sendData.putExtra("MyFoto",data.getPhoto());
                sendData.putExtra("MyDetail",data.getDetail());
                startActivity(sendData);
            }
        });
    }
    private void showRecyclerList(){
        rvMember.setLayoutManager(new LinearLayoutManager(this));
        MemberAdapter MemberAdapter = new MemberAdapter(list);
        rvMember.setAdapter(MemberAdapter);
        MemberAdapter.setOnItemClickCallback(new MemberAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Member data) {
                //Berpindah Activity dan Mempassing data Nama pada Activity Selanjutnya
                Intent sendData = new Intent(MainActivity.this, MemberDetail.class);
                sendData.putExtra("MyName", data.getName());
                sendData.putExtra("MyFoto",data.getPhoto());
                sendData.putExtra("MyDetail",data.getDetail());
                startActivity(sendData);
            }
        });
    }

    //menampilkan menu pada action bar dari Res menu file menu_main
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        getMenuInflater().inflate(R.menu.menu_item, menu);
        return super.onCreateOptionsMenu(menu);
    }
    //jika menu pada action bar diklik
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
            setMode(item.getItemId());
            return super.onOptionsItemSelected(item);
        }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                showRecyclerList();
                break;
            case R.id.action_grid:
                showRecyclerGrid();
                break;
            case R.id.miAbout:
                Intent about = new Intent(MainActivity.this, About.class);
                startActivity(about);
                break;
            default:
        }
    }
}
