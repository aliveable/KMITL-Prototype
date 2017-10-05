package kmitl.lab05.topusenpai.newkmitlapp.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import kmitl.lab05.topusenpai.newkmitlapp.R;

public class DetailFragment extends Fragment {
    private final String[] MONTHS = {"มกราคม", "กุมภาพันธ์", "มีนาคม", "เมษายน", "พฤษภาคม", "มิถุนายน", "กรกฎาคม", "สิงหาคม"
            , "กันยายน", "ตุลาคม", "พฤศจิกายน", "ธันวาคม"};

    public static DetailFragment newInstance(String[] event, int month) {

        Bundle args = new Bundle();

        DetailFragment fragment = new DetailFragment();
        args.putInt("month", month);
        args.putStringArray("event", event);
        fragment.setArguments(args);
        return fragment;
    }
    public DetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);

        String[] event = getArguments().getStringArray("event");

        TextView topictext = rootView.findViewById(R.id.topic_text);
        TextView datetext = rootView.findViewById(R.id.date_text);
        topictext.setText(event[1]);
        datetext.setText(event[0]+" "+MONTHS[getArguments().getInt("month")]+" 2017");

        return rootView;
    }

}
