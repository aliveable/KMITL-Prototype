package kmitl.lab05.topusenpai.newkmitlapp.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kmitl.lab05.topusenpai.newkmitlapp.R;

public class mainFragment extends Fragment {


    public static mainFragment newInstance() {
        
        Bundle args = new Bundle();
        
        mainFragment fragment = new mainFragment();
        fragment.setArguments(args);
        return fragment;
    }
    public mainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        return rootView;
    }

}
