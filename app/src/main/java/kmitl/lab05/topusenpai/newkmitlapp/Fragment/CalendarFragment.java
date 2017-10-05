package kmitl.lab05.topusenpai.newkmitlapp.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import kmitl.lab05.topusenpai.newkmitlapp.Adapter.CalendarGrid;
import kmitl.lab05.topusenpai.newkmitlapp.R;

public class CalendarFragment extends Fragment {

    public static CalendarFragment newInstance() {

        Bundle args = new Bundle();

        CalendarFragment fragment = new CalendarFragment();
        fragment.setArguments(args);
        return fragment;
    }
    public CalendarFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_calendar, container, false);
        final CalendarGrid cg = new CalendarGrid(getActivity().getApplicationContext());

        GridView gridview = rootView.findViewById(R.id.gridView);
        gridview.setAdapter(cg);
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String[][][] detail = cg.getDetail();

                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.daysContainer, new DaysFragment().newInstance(detail[i], i));
                transaction.commit();
            }
        });

        return rootView;
    }

}
