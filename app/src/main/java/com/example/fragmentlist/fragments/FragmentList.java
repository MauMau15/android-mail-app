package com.example.fragmentlist.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.fragmentlist.R;
import com.example.fragmentlist.Utils.Utils;
import com.example.fragmentlist.adapters.MailAdapter;
import com.example.fragmentlist.models.Mail;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentList extends Fragment {

    private TextView subject;
    private TextView senderName;
    private TextView message;

    ListView mailList;

    List<Mail> mails;

    private OnItemClickListener callback;

    public FragmentList() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            callback = (OnItemClickListener) context;
        }catch (Exception e){
            throw new ClassCastException(context.toString() + "Should implement list listener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_list,container,false);

        mailList = view.findViewById(R.id.listMail);

        mails = Utils.generateDummyMails();

        MailAdapter mailAdapter = new MailAdapter(this.getContext(), mails,R.layout.mail);

        mailList.setAdapter(mailAdapter);

        mailList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                displayMail(mails.get(position));
            }
        });

        // Inflate the layout for this fragment
        return view;
    }

    private void displayMail(Mail mail){
        callback.onItemClicked(mail);
    }

    public interface OnItemClickListener{
        void onItemClicked(Mail mail);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        callback = null;
    }
}
