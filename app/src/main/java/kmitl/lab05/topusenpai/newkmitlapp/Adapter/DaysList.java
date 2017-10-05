package kmitl.lab05.topusenpai.newkmitlapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import kmitl.lab05.topusenpai.newkmitlapp.R;


public class DaysList extends BaseAdapter {
    private Context c;
    private String[][] detail;

    public DaysList(Context c, String[][] detail) {
        this.c = c;
        this.detail = detail;
    }

    @Override
    public int getCount() {
        return detail.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v;

        if (view == null) {
            v = inflater.inflate(R.layout.list_day, null);
            TextView dayText = v.findViewById(R.id.day_text);
            TextView eventText = v.findViewById(R.id.event_text);
            dayText.setText(detail[i][0]);
            eventText.setText(detail[i][1]);
        } else {
            v = view;
        }

        return v;
    }
}
