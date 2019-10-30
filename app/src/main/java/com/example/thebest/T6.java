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
public class T6 extends Fragment {


    public T6() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_t6, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        List<Group1Table> movieList=new ArrayList<>();
        movieList.add(new Group1Table("فانوس رباعي",R.drawable.f1,"السعر : 120£","طبع 2 صورة \n  ارتفاع 45سم \n  يوجد بية صوت ونور \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList.add(new Group1Table("فانوس الجامع ",R.drawable.f2,"السعر : 125£","طبع 2 صورة \n  مقاس 50سم \n يوجد بية صوت ونور \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList.add(new Group1Table("كفر موبايل ",R.drawable.ka1,"السعر : 110£","اي كفر موبايل \n  جميع انواع الجربات   \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £ "));

        RecyclerView myrv = (RecyclerView)view.findViewById(R.id.rev_T6);
        Group1TableAdapter myAdapter = new Group1TableAdapter(getActivity(),movieList);
        myrv.setLayoutManager(new GridLayoutManager(getActivity(),2));
        myrv.setAdapter(myAdapter);

    }

}
