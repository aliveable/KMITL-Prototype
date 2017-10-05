package kmitl.lab05.topusenpai.newkmitlapp.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import kmitl.lab05.topusenpai.newkmitlapp.Adapter.DaysList;
import kmitl.lab05.topusenpai.newkmitlapp.R;

public class DaysFragment extends Fragment {

    public static DaysFragment newInstance(String[][] detail, int month) {
        int length = detail.length;

        Bundle args = new Bundle();

        DaysFragment fragment = new DaysFragment();
        args.putInt("month", month);
        args.putInt("length", length);
        for(int i = 0; i < length; i++) {
            args.putStringArray("detail"+i, detail[i]);
        }
        fragment.setArguments(args);
        return fragment;
    }
    public DaysFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_days, container, false);

        int length = getArguments().getInt("length");
        String[][] detail = new String[length][];

        for(int i = 0; i < length; i++) {
            detail[i] = getArguments().getStringArray("detail"+i);
        }
        final String[][] EVENT = detail;

        ListView listview = rootView.findViewById(R.id.listView);
        listview.setAdapter(new DaysList(getActivity().getApplicationContext(), detail));
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.FragmentContainer, new DetailFragment().newInstance(EVENT[i], getArguments().getInt("month")));
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });

        return rootView;
    }

}
