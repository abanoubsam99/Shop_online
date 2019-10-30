package com.example.thebest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class SlidePagerAdapter extends PagerAdapter {

    private Context mcontext;
    private List<Slide> mlist;


    public SlidePagerAdapter(Context mcontext, List<Slide> mlist) {
        this.mcontext = mcontext;
        this.mlist = mlist;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        LayoutInflater inflater=(LayoutInflater)mcontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View slidelayout=inflater.inflate(R.layout.slide_item,null);

        ImageView slide_image=slidelayout.findViewById(R.id.slide_image);
        TextView slide_title=slidelayout.findViewById(R.id.slide_title);

        slide_image.setImageResource(mlist.get(position).getImage());
        slide_title.setText(mlist.get(position).getTitle());

        container.addView(slidelayout);
        return slidelayout;




    }

    @Override
    public int getCount() {
        return mlist.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }


    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);

    }
}
