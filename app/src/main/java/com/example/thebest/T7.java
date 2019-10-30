package com.example.thebest;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class T7 extends Fragment {


    public T7() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_t7, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        List<Group1Table> movieList=new ArrayList<>();
        movieList.add(new Group1Table("بوكس ساعة ",R.drawable.b1,"السعر : 100£","بوكس هدايا \n  طبع 5صور \n  مقاس 20سم في 20سم \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList.add(new Group1Table("تي شيرت",R.drawable.te1,"السعر : 110£","طبع اي صورة او تصميم  علي تي شيرت \n   الالوان المتاحة\n  ابيض  \n اصفر \n  برتقالي \n  رومادي \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £  "));

        RecyclerView myrv = (RecyclerView)view.findViewById(R.id.rev_T7);
        Group1TableAdapter myAdapter = new Group1TableAdapter(getActivity(),movieList);
        myrv.setLayoutManager(new GridLayoutManager(getActivity(),2));
        myrv.setAdapter(myAdapter);

    }
}
