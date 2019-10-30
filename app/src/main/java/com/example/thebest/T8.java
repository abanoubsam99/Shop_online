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
public class T8 extends Fragment {


    public T8() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_t8, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        List<Group1Table> movieList=new ArrayList<>();
        movieList.add(new Group1Table("عرض 1",R.drawable.ard1,"السعر :  235£"," مج عادي \n نوت بوك مقاس 20 في 30سم  \n  كوستر  \n  مدالية \n بازل مقاس 20 في 30 سم  \n  الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  0.00 £"));
        movieList.add(new Group1Table("عرض مج سحري ",R.drawable.ard2,"السعر : 100£"," مج سحري  \n   بوكس مج طبع 4 صور  \n      الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList.add(new Group1Table("عرض تابلوة ",R.drawable.ard3,"السعر : 140£"," تابلوة 20 في 30 سم  \n   نوت بوك مقاس 20 في 30 سم  \n  مج عادي  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList.add(new Group1Table("عرض المدالية ",R.drawable.ard4,"السعر : 70£"," 6 مدالية شكل علي حسب اختيارك   \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList.add(new Group1Table("عرض بازل ",R.drawable.ard5,"السعر : 120£"," بازل مقاس 20في 30سم  \n  نوت بوك مقاس 20 في 30سم  \n     الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList.add(new Group1Table("عرض المدرس ",R.drawable.ard6,"السعر : 210£"," 3 نوت بوك مقاس 20 في 30سم   \n  مج عادي \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  0.00 £"));
        movieList.add(new Group1Table("عرض السوبر ",R.drawable.ard77,"السعر : 250£"," ساعة حائط 9 صور   \n   عدد 2  مدالية   \n تابلوة قلب استند  \n   وكمان شحن مجانا   \n  الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  0.00 £"));


        RecyclerView myrv = (RecyclerView)view.findViewById(R.id.rev_T8);
        Group1TableAdapter myAdapter = new Group1TableAdapter(getActivity(),movieList);
        myrv.setLayoutManager(new GridLayoutManager(getActivity(),2));
        myrv.setAdapter(myAdapter);

    }
}
