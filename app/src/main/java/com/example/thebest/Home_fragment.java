package com.example.thebest;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


/**
 * A simple {@link Fragment} subclass.
 */
public class Home_fragment extends Fragment {

    private List<Slide> listslide;
    private ViewPager slidepager;
    private TabLayout indicator;

    RecyclerView recyclerViewgroup1;
    RecyclerView recyclerViewgroup2;
    RecyclerView recyclerViewgroup3;
    RecyclerView recyclerViewgroup4;
    RecyclerView recyclerViewgroup5;


    public Home_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return  inflater.inflate(R.layout.fragment_home_fragment, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



        //Scrol
        recyclerViewgroup1=view.findViewById(R.id.rv_table);

        LinearLayoutManager layoutManager=new LinearLayoutManager(getActivity());
        RecyclerView.LayoutManager rvLayoutManager=layoutManager;

        recyclerViewgroup1.setLayoutManager(rvLayoutManager);



        // SLIDE

        slidepager=view.findViewById(R.id.pager);
        indicator=view.findViewById(R.id.indicator);

        listslide=new ArrayList<>();
        listslide.add(new Slide(R.drawable.f1,"فانوس رباعي"));
        listslide.add(new Slide(R.drawable.s2,"ساعة حائط قلوب"));
        listslide.add(new Slide(R.drawable.b1,"بوكس ساعة "));
        listslide.add(new Slide(R.drawable.t7,"تابلوة حائط "));
        listslide.add(new Slide(R.drawable.t1,"تابلوة قلب "));

        SlidePagerAdapter adapter=new SlidePagerAdapter(getActivity(),listslide);
        slidepager.setAdapter(adapter);

        //setup timer
        Timer timer=new Timer();
        timer.scheduleAtFixedRate(new SliderTimer(),4000,6000);
        indicator.setupWithViewPager(slidepager,true);





        // set Group 1
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



        Group1TableAdapter movieAdapter=new Group1TableAdapter(getActivity(),movieList);
        recyclerViewgroup1.setAdapter(movieAdapter);
        recyclerViewgroup1.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));





        // set Group 2
        recyclerViewgroup2=view.findViewById(R.id.rv_table2);


        List<Group1Table> movieList2=new ArrayList<>();
        movieList2.add(new Group1Table("ساعة حائط",R.drawable.s1,"السعر : 180£","طبع 9صور \n  مقاس 50سم في 50سم \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList2.add(new Group1Table("ساعة حائط قلوب",R.drawable.s2,"السعر : 180£","طبع 9 صور \n  مقاس 50سم في 50سم \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList2.add(new Group1Table("ساعة حائط قلوب احمر ",R.drawable.s3,"السعر : 100£"," طبع 7 صور \n  مقاس 45سم في 45سم \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList2.add(new Group1Table("ساعة حائط دائرة",R.drawable.s4,"السعر : 190£","طبع 13 صورة \n  مقاس 50سم في 50سم \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));



        Group1TableAdapter movieAdapter2=new Group1TableAdapter(getActivity(),movieList2);
        recyclerViewgroup2.setAdapter(movieAdapter2);
        recyclerViewgroup2.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));





        // set Group 3
        recyclerViewgroup3=view.findViewById(R.id.rv_table3);

        List<Group1Table> movieList3=new ArrayList<>();
        movieList3.add(new Group1Table("بوكس ساعة ",R.drawable.b1,"السعر : 100£","بوكس هدايا \n  طبع 5صور \n  مقاس 20سم في 20سم \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList3.add(new Group1Table("تي شيرت",R.drawable.te1,"السعر : 110£","طبع اي صورة او تصميم  علي تي شيرت \n   الالوان المتاحة\n  ابيض  \n اصفر \n  برتقالي \n  رومادي \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £  "));


        Group1TableAdapter movieAdapter3=new Group1TableAdapter(getActivity(),movieList3);
        recyclerViewgroup3.setAdapter(movieAdapter3);
        recyclerViewgroup3.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));



        // set Group 4
        recyclerViewgroup4=view.findViewById(R.id.rv_table4);

        List<Group1Table> movieList4=new ArrayList<>();
        movieList4.add(new Group1Table("مداليات",R.drawable.ma1,"السعر:20£"," مدالية  جميع الاشكال \n  مربع مستطيل ودائرة وفانوس \n  طبع 2 صور \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList4.add(new Group1Table("مدالية  قلب",R.drawable.ma2,"السعر:20£","طبع 2 صورة وش وظهر \n   الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList4.add(new Group1Table("مدالية مستطيل",R.drawable.ma3,"السعر:20£","طبع 2 صورة وش و ظهر \n   الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList4.add(new Group1Table("نوت بوك",R.drawable.no1,"السعر:89£","طبع 2 صورة \n مقاس 20سم في 30سم \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £ "));


        Group1TableAdapter movieAdapter4=new Group1TableAdapter(getActivity(),movieList4);
        recyclerViewgroup4.setAdapter(movieAdapter4);
        recyclerViewgroup4.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));




        // set Group 5
        recyclerViewgroup5=view.findViewById(R.id.rv_table5);

        List<Group1Table> movieList5=new ArrayList<>();
        movieList5.add(new Group1Table("ساقية الذكريات ",R.drawable.sa1,"السعر : 120£","طبع 16 صورة  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £ "));
        movieList5.add(new Group1Table("بازل كبير ",R.drawable.p1,"السعر : 65£","طبع 1 صورة \n  مقاس 20 في 30سم \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList5.add(new Group1Table("فانوس رباعي",R.drawable.f1,"السعر : 120£","طبع 2 صورة \n  ارتفاع 45سم \n  يوجد بية صوت ونور \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList5.add(new Group1Table("فانوس الجامع ",R.drawable.f2,"السعر : 125£","طبع 2 صورة \n  مقاس 50سم \n يوجد بية صوت ونور \n سمك الخشب 8مللي الطبع علي الخشب مباشر  \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));
        movieList5.add(new Group1Table("كفر موبايل ",R.drawable.ka1,"السعر : 110£","اي كفر موبايل \n  جميع انواع الجربات   \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £ "));
        movieList5.add(new Group1Table("مج سحري",R.drawable.ka1,"السعر : 75£","طبع 1 صورة الي 3 صورة \n    الشحن : خدمة توصيل اي محطة مترو وتكلفة (يومين)  25.00 £"));


        Group1TableAdapter movieAdapter5=new Group1TableAdapter(getActivity(),movieList5);
        recyclerViewgroup5.setAdapter(movieAdapter5);
        recyclerViewgroup5.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));

    }

    class SliderTimer extends TimerTask {


        @Override
        public void run() {

            if(getActivity() == null){
                return  ;
            }


          getActivity().runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (slidepager.getCurrentItem() < listslide.size() - 1) {
                        slidepager.setCurrentItem(slidepager.getCurrentItem() + 1);

                    } else {
                        slidepager.setCurrentItem(0);
                    }
                }
            });
        }

    }

}
