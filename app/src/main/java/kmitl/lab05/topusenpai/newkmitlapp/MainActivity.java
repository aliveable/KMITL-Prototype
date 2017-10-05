package kmitl.lab05.topusenpai.newkmitlapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import kmitl.lab05.topusenpai.newkmitlapp.Fragment.CalendarFragment;
import kmitl.lab05.topusenpai.newkmitlapp.Fragment.EventFragment;
import kmitl.lab05.topusenpai.newkmitlapp.Fragment.FeedFragment;
import kmitl.lab05.topusenpai.newkmitlapp.Fragment.MapFragment;
import kmitl.lab05.topusenpai.newkmitlapp.Fragment.MoreFragment;
import kmitl.lab05.topusenpai.newkmitlapp.Fragment.mainFragment;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private Fragment fragment;
    private FragmentManager fragmentManager;
    private BottomNavigationView navigation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);

        navigation = (BottomNavigationView) findViewById(R.id.navigation);
        //navigation.inflateMenu(R.menu.navigation);
        fragmentManager = getSupportFragmentManager();

        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                final FragmentTransaction transaction = fragmentManager.beginTransaction();
                switch (id) {
                    case R.id.navigation_Feed:
                        mTextMessage.setText(R.string.title_Feed);
                        fragment = new FeedFragment();
                        transaction.replace(R.id.FragmentContainer, fragment).commit();
                        break;
                        //return true;
                    case R.id.navigation_Calendar:
                        mTextMessage.setText(R.string.title_Calendar);
                        fragment = new CalendarFragment();
                        transaction.replace(R.id.FragmentContainer, fragment).commit();
                        break;
                        //return true;
                    case R.id.navigation_Event:
                        mTextMessage.setText(R.string.title_Event);
                        fragment = new EventFragment();
                        transaction.replace(R.id.FragmentContainer, fragment).commit();
                        break;
                        //return true;
                    case R.id.navigation_Map:
                        mTextMessage.setText(R.string.title_Map);
                        fragment = new MapFragment();
                        transaction.replace(R.id.FragmentContainer, fragment).commit();
                        break;
                        //return true;
                    case R.id.navigation_More:
                        mTextMessage.setText(R.string.title_More);
                        fragment = new MoreFragment();
                        transaction.replace(R.id.FragmentContainer, fragment).commit();
                        break;
                        //return true;
                }

                return true;
            }

        });

        //navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.FragmentContainer, new FeedFragment()).commit();

    }

}
