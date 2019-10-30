package com.example.thebest;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Group1TableAdapter extends RecyclerView.Adapter<Group1TableAdapter.Group1Holder> {
    Context context;
    List<Group1Table> mData;

    public Group1TableAdapter(Context context, List<Group1Table> mData) {
        this.context = context;
        this.mData = mData;
    }
    @NonNull
    @Override
    public Group1Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.item_group1,parent,false);
        return  new Group1Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Group1Holder holder,final int position) {


        holder.title.setText(mData.get(position).getTitle());
        holder.image.setImageResource(mData.get(position).getImgsrc());
        holder.price.setText(mData.get(position).getPrice());
        holder.con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context,DetailsActivity.class);

                // passing data to the book activity
                intent.putExtra("Title",mData.get(position).getTitle());
                intent.putExtra("Description",mData.get(position).getDescription());
                intent.putExtra("price",mData.get(position).getPrice());
                intent.putExtra("img",mData.get(position).getImgsrc());
                // start the activity
                context.startActivity(intent);


            }
        });


    }


    @Override
    public int getItemCount() {
        return mData.size();
    }






    public class Group1Holder extends RecyclerView.ViewHolder{

        private TextView title;
        private TextView price;
        private ImageView image;

        private ConstraintLayout con;





        public Group1Holder(@NonNull View itemView) {
            super(itemView);

            title=itemView.findViewById(R.id.item_group1_title);
            price=itemView.findViewById(R.id.item_group1_Price);
            image=itemView.findViewById(R.id.item_group1_image);
            con=itemView.findViewById(R.id.constra1);


        }
    }
}
