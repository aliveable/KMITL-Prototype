package kmitl.lab05.topusenpai.newkmitlapp.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import kmitl.lab05.topusenpai.newkmitlapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventFragment extends Fragment implements View.OnClickListener{

    View event1, event2, rootView;
    onSelectEventListener listerner;

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
        rootView = inflater.inflate(R.layout.fragment_event, container, false);
        listerner = (onSelectEventListener) getActivity();
        event1 = rootView.findViewById(R.id.event);

        event1.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View view) {
        listerner.onSelectListener("event1");
    }


    public interface onSelectEventListener{
        void onSelectListener(String select);
    }

    public void setEventListener(onSelectEventListener listener){
        this.listerner = listener;
    }


}
