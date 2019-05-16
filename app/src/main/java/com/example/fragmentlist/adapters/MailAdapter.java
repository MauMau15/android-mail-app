package com.example.fragmentlist.adapters;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.fragmentlist.R;
import com.example.fragmentlist.models.Mail;

import java.util.List;

public class MailAdapter extends BaseAdapter {

    private Context context;
    private List<Mail> mails;
    private int layout;

    public MailAdapter(Context context, List<Mail> mails, int layout) {
        this.context = context;
        this.mails = mails;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return this.mails.size();
    }

    @Override
    public Object getItem(int position) {
        return this.mails.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null){
            LayoutInflater layoutInflater = LayoutInflater.from(this.context);
            convertView = layoutInflater.inflate(this.layout,null);

            viewHolder = new ViewHolder();

            viewHolder.senderName = convertView.findViewById(R.id.textSenderName);
            viewHolder.subject = convertView.findViewById(R.id.textSubject);
            viewHolder.message = convertView.findViewById(R.id.textMessage);

            convertView.setTag(viewHolder);

        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Mail currentMail = mails.get(position);

        viewHolder.senderName.setText(currentMail.getSenderName());
        viewHolder.subject.setText(currentMail.getSubject());
        viewHolder.message.setText(currentMail.getMessage());

        return convertView;
    }

    static class ViewHolder{
        private TextView subject;
        private TextView message;
        private TextView senderName;
    }
}
