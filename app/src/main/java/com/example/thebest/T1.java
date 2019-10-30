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
public class T1 extends Fragment {


    public T1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_t1, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        List<Group1Table> movieList=new ArrayList<>();
        movieList.add(new Group1Table("تابلوة قلب ",R.drawable.t1,"السعر :  90£"," طبع 9 صور  \n مقاس 45 سم في 45 سم \n  سمك الخشب 8 مللي الطبع علي الخشب مباشر \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList.add(new Group1Table("تابلوة الملكة ",R.drawable.t2,"السعر : 80£"," طباعة 5 صور  \n   مقاس 60سم في 60سم \n   سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList.add(new Group1Table("تابلوة رمضان ",R.drawable.t3,"السعر : 120£"," طبع 6 صور \n   مقاس 40في 50 سم \n   سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList.add(new Group1Table("تابلوة MOM",R.drawable.t4,"السعر : 80£"," طبع 3 صور  \n  مقاس 45سم في 45سم \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList.add(new Group1Table("تابلوة الجامع ",R.drawable.t5,"السعر : 155£","طبع 10 صور \n  مقاس 60 في 60سم  \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList.add(new Group1Table("تابلوة استند ",R.drawable.t6,"السعر : 70£","مقاس 20 في 30 سم  \n  طبع 1 صورة \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList.add(new Group1Table("تابلوة حائط ",R.drawable.t7,"السعر : 70£","مقاس 20 في 30 سم \n  طبع 1 صورة \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList.add(new Group1Table(" جيتار  ",R.drawable.t8,"السعر : 100£","طبع 5 صور \n  مقاس 30سم  عرض و 50سم ارتفاع  \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList.add(new Group1Table("تابلوة تلفزيون 1 ",R.drawable.t9,"السعر : 110£","طبع 13 صورة \n  مقاس 45سم في 50سم \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList.add(new Group1Table("تابلوة تلفيزيون 2 ",R.drawable.t10,"السعر : 115£","طبع 13 صورة \n  مقاس 50سم في 50سم \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList.add(new Group1Table("تابلوة قلب استند ",R.drawable.t11,"السعر : 50£","طبع 1 صورة \n  مقاس 20سم في 20سم \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList.add(new Group1Table("تابلوة LOVE ",R.drawable.t12,"السعر : 100£","طبع 3 صور \n  مقاس 45سم في 50سم \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList.add(new Group1Table("تابلوة وردة ",R.drawable.t13,"السعر : 80£","طبع 1 صورة \n  مقاس 20سم في 30سم \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList.add(new Group1Table("تابلوة  الشجرة ",R.drawable.t14,"السعر : 100£"," طبع 5 صور \n  مقاس 45سم في 45سم \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £  "));
        movieList.add(new Group1Table(" باندة ",R.drawable.t15,"السعر : 95£","طبع 1 صورة \n  مقاس 30 في 30سم \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £ "));
        movieList.add(new Group1Table("تابلوة الخطوبة ",R.drawable.t16,"السعر : 99E","طبع 3 صور \n  مقاس 45سم في 45سم \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList.add(new Group1Table("تابلوة  I Love You ",R.drawable.t17,"السعر : 110£","طبع 3 صور \n مقاس 45سم في 45سم \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList.add(new Group1Table("تابلوة العيد ",R.drawable.t18,"السعر : 115£","طبع 5 صور \n  مقاس 45سم في 45سم \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList.add(new Group1Table("تابلوة قلب تاج ",R.drawable.t19,"السعر : 80£","طبع 1صوره \n  مقاس 30سم في 30سم \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList.add(new Group1Table("تابلوة Love ",R.drawable.t20,"السعر : 105£","طبع 3صور \n  مقاس 45سم في 45سم \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList.add(new Group1Table("تابلوة",R.drawable.t21,"السعر : 80£","طبع 1صورة \n  مقاس 45سم في 45سم \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList.add(new Group1Table("تابلوة Love استند",R.drawable.t22,"السعر : 90£","طبع 1صورة \n  مقاس 50سم في 30سم \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList.add(new Group1Table("تابلوة تاج الملوك ",R.drawable.t23,"السعر : 105£","طبع 4 صور \n  مقاس 45سم في 45سم \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));

        RecyclerView myrv = (RecyclerView)view.findViewById(R.id.rev_T1);
        Group1TableAdapter myAdapter = new Group1TableAdapter(getActivity(),movieList);
        myrv.setLayoutManager(new GridLayoutManager(getActivity(),2));
        myrv.setAdapter(myAdapter);

    }

    }
