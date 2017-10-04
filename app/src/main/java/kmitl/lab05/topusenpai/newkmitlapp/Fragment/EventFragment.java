package kmitl.lab05.topusenpai.newkmitlapp.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kmitl.lab05.topusenpai.newkmitlapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventFragment extends Fragment {

    public static EventFragment newInstance() {
        
        Bundle args = new Bundle();
        
        EventFragment fragment = new EventFragment();
        fragment.setArguments(args);
        return fragment;
    }
    public EventFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_event, container, false);
    }

}
