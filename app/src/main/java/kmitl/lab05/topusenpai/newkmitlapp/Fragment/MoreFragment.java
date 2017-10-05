package kmitl.lab05.topusenpai.newkmitlapp.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

import kmitl.lab05.topusenpai.newkmitlapp.CustomAdapter;
import kmitl.lab05.topusenpai.newkmitlapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MoreFragment extends Fragment {
    public static MoreFragment newInstance() {
        
        Bundle args = new Bundle();
        
        MoreFragment fragment = new MoreFragment();
        fragment.setArguments(args);
        return fragment;
    }
    public MoreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_more, container, false);
        int[] resId = { R.mipmap.micro
                , R.mipmap.shop, R.mipmap.student
                , R.mipmap.book, R.mipmap.feedback
                , R.mipmap.photo};

        String[] list = { "Free Microsoft Office", "KMITL Promotion", "Student Benefit"
                , "Contact", "Feedback & Report", "KMITL Sharing Photo"};

        CustomAdapter adapter = new CustomAdapter(getContext(), list, resId);

        ListView listView = (ListView)v.findViewById(R.id.listView1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {

            }
        });
        return v;
    }


}
