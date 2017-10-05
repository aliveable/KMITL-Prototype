package kmitl.lab05.topusenpai.newkmitlapp.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFragment extends Fragment {

    int resource;

    public static NewsFragment newInstance(int resource) {

        Bundle args = new Bundle();
        NewsFragment fragment = new NewsFragment();
        args.putInt("source", resource);
        fragment.setArguments(args);
        return fragment;
    }

    public NewsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        resource = getArguments().getInt("source");
        return inflater.inflate(resource, container, false);
    }

}
