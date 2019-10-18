package com.example.jacklee.viewpager_example;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private String[] tabTitles = new String[]{"Monday", "Tuesday", "Wednesday"};

    public SimpleFragmentPagerAdapter (FragmentManager fm){
        super(fm);
    }

    /**
     * Override two method getCount() and getItem() method;
     * @return
     */

    //Tell the viewPager there are how many page;
    @Override
    public int getCount() {
        return 3;
    }

    //return each page corresponding Fragment;
    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new MondayFragment();
        }else if (position == 1){
            return new TuesdayFragment();
        }else
            return new WednesdayFragment();
    }

    //If use TabLayout, you should Override the getPageTitle() method
    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
