package kmitl.lab05.topusenpai.newkmitlapp.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import kmitl.lab05.topusenpai.newkmitlapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FeedFragment extends Fragment implements View.OnClickListener {

    public interface FragmentListener {
        void detaillistener(int resource);
    }

    private View rootview;
    private LinearLayout news1;
    private LinearLayout news2;
    private LinearLayout news3;
    private LinearLayout news4;
    private LinearLayout news5;
    private LinearLayout news6;
    private LinearLayout news7;
    private FragmentListener listener;

    public void setListener(FragmentListener listener) {
        this.listener = listener;
    }

    public static FeedFragment newInstance() {

        Bundle args = new Bundle();
        FeedFragment fragment = new FeedFragment();
        fragment.setArguments(args);
        return fragment;
    }

    public FeedFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootview = inflater.inflate(R.layout.fragment_feed, container, false);
        listener = (FragmentListener) getActivity();
        news1 = rootview.findViewById(R.id.news1);
        news2 = rootview.findViewById(R.id.news2);
        news3 = rootview.findViewById(R.id.news3);
        news4 = rootview.findViewById(R.id.news4);
        news5 = rootview.findViewById(R.id.news5);
        news6 = rootview.findViewById(R.id.news6);
        news7 = rootview.findViewById(R.id.news7);
        news1.setOnClickListener(this);
        news2.setOnClickListener(this);
        news3.setOnClickListener(this);
        news4.setOnClickListener(this);
        news5.setOnClickListener(this);
        news6.setOnClickListener(this);
        news7.setOnClickListener(this);
        // Inflate the layout for this fragment
        return rootview;
    }

    @Override
    public void onClick(View view) {
        if(R.id.news1 == view.getId()){
            listener.detaillistener(R.layout.fragment_news1);
        }else if(R.id.news2 == view.getId()){
            listener.detaillistener(R.layout.fragment_news2);
        }else if(R.id.news3 == view.getId()){
            listener.detaillistener(R.layout.fragment_news3);
        }else if(R.id.news4 == view.getId()){
            listener.detaillistener(R.layout.fragment_news4);
        }else if(R.id.news5 == view.getId()){
            listener.detaillistener(R.layout.fragment_news5);
        }else if(R.id.news6 == view.getId()){
            listener.detaillistener(R.layout.fragment_news6);
        }else if(R.id.news7 == view.getId()){
            listener.detaillistener(R.layout.fragment_news7);
        }
    }
}
