package com.example.fragmentlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.fragmentlist.models.Mail;

public class MailDetailsActivity extends AppCompatActivity {

    TextView mailSender;
    TextView mailSubject;
    TextView mailMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail_details);

        bindUI();

        Mail mail = (Mail) getIntent().getSerializableExtra("Mail");

        this.mailSender.setText(mail.getSenderName());

        this.mailSubject.setText(mail.getSubject());

        this.mailMessage.setText(mail.getMessage());

    }

    private void bindUI(){
        this.mailSender = findViewById(R.id.mailSenderName);
        this.mailSubject = findViewById(R.id.mailSubject);
        this.mailMessage = findViewById(R.id.mailMessage);
    }
}
