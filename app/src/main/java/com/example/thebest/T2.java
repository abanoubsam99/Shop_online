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
public class T2 extends Fragment {


    public T2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_t2, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        List<Group1Table> movieList2=new ArrayList<>();
        movieList2.add(new Group1Table("ساعة حائط",R.drawable.s1,"السعر : 180£","طبع 9صور \n  مقاس 50سم في 50سم \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList2.add(new Group1Table("ساعة حائط قلوب",R.drawable.s2,"السعر : 180£","طبع 9 صور \n  مقاس 50سم في 50سم \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList2.add(new Group1Table("ساعة حائط قلوب احمر ",R.drawable.s3,"السعر : 100£"," طبع 7 صور \n  مقاس 45سم في 45سم \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList2.add(new Group1Table("ساعة حائط دائرة",R.drawable.s4,"السعر : 190£","طبع 13 صورة \n  مقاس 50سم في 50سم \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));

        RecyclerView myrv = (RecyclerView)view.findViewById(R.id.rev_T2);
        Group1TableAdapter myAdapter = new Group1TableAdapter(getActivity(),movieList2);
        myrv.setLayoutManager(new GridLayoutManager(getActivity(),2));
        myrv.setAdapter(myAdapter);
    }

}
