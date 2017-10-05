package kmitl.lab05.topusenpai.newkmitlapp.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kmitl.lab05.topusenpai.newkmitlapp.R;

public class ShowEventFragment extends Fragment {

    public static ShowEventFragment newInstance() {

        Bundle args = new Bundle();
        ShowEventFragment fragment = new ShowEventFragment();
        fragment.setArguments(args);
        return fragment;
    }


    public ShowEventFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_show_event, container, false);
    }

}
