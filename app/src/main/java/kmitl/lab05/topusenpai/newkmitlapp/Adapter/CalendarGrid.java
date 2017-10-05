package kmitl.lab05.topusenpai.newkmitlapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import kmitl.lab05.topusenpai.newkmitlapp.R;

public class CalendarGrid extends BaseAdapter {
    private final String[] MONTHS = {"ม.ค.", "ก.พ.", "มี.ค.", "เม.ย.", "พ.ค.", "มิ.ย.", "ก.ค."
            , "ส.ค.", "ก.ย", "ต.ค.", "พ.ย.", "ธ.ค."};
    private final String[][][] DETAIL = { {{"1", "ลงทะเบียน"}, {"2", "ลงทะเบียน"}, {"3", "ลงทะเบียน"}, {"4", "ลงทะเบียน"}
                , {"5", "ลงทะเบียน"}, {"6", "ลงทะเบียน"}, {"7", "ลงทะเบียนล่าช้า"}, {"8", "ลงทะเบียนล่าช้า"}, {"9", "ลงทะเบียนล่าช้า"}
                , {"10", "ลงทะเบียนล่าช้า"}}//JAN
            , {{"1", "ถอนวิชาเรียน"}, {"2", "ถอนวิชาเรียน"}, {"3", "ถอนวิชาเรียน"}, {"4", "ถอนวิชาเรียน"}, {"5", "ถอนวิชาเรียน"}
                , {"6", "ถอนวิชาเรียน"}, {"7", "ถอนวิชาเรียน"}, {"8", "ถอนวิชาเรียน"}, {"9", "ถอนวิชาเรียน"}, {"10", "ถอนวิชาเรียน"}}//FEB
            , {{"1", "สอบกลางภาค"}, {"2", "สอบกลางภาค"}, {"3", "สอบกลางภาค"}, {"4", "สอบกลางภาค"}, {"5", "สอบกลางภาค"}}//MAR
            , {{"8", "ประเมินการสอนอาจารย์"}, {"9", "ประเมินการสอนอาจารย์"}, {"10", "ประเมินการสอนอาจารย์"}}//APR
            , {{"1", "ลงทะเบียน"}}//MAY
            , {{"1", "ลงทะเบียน"}}//JUN
            , {{"1", "ลงทะเบียน"}}//JUL
            , {{"1", "ลงทะเบียน"}}//AUG
            , {{"1", "ลงทะเบียน"}}//SEP
            , {{"1", "ลงทะเบียน"}}//OCT
            , {{"1", "ลงทะเบียน"}}//NOV
            , {{"1", "ลงทะเบียน"}} };

    private Context c;

    public CalendarGrid(Context c) {
        this.c = c;
    }

    @Override
    public int getCount() {
        return MONTHS.length;
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
            v = inflater.inflate(R.layout.grid_calendar, null);
            TextView textView = v.findViewById(R.id.grid_text);
            textView.setText(MONTHS[i]);
        } else {
            v = view;
        }

        return v;
    }

    public String[][][] getDetail() {
        return DETAIL;
    }
}
