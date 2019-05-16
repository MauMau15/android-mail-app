package com.example.fragmentlist;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.fragmentlist.fragments.FragmentList;
import com.example.fragmentlist.models.Mail;

public class MainActivity extends AppCompatActivity implements FragmentList.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onItemClicked(Mail mail) {
        Intent intent = new Intent(MainActivity.this,MailDetailsActivity.class);
        intent.putExtra("Mail",mail);
        startActivity(intent);
    }
}
