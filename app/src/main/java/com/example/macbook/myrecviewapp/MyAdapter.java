package com.example.macbook.myrecviewapp;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<PersonModel> personModelList;
    private Context context;

    public MyAdapter(List<PersonModel> personModelList, Context context) {
        this.personModelList = personModelList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        PersonModel personModel = personModelList.get(position);
        holder.name.setText(personModel.getName());
        holder.surname.setText(personModel.getSurname());

        Glide.with(context)
                .load(personModel.getImgUrl())
                .apply(new RequestOptions().error(R.drawable.ic_launcher_background).circleCrop())
                .into(holder.profileImage);
        changeColor(personModel.isSex(),holder.name,holder.surname);

    }

    @Override
    public int getItemCount() {
        return personModelList.isEmpty()?0:personModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
         private ImageView profileImage;
         private TextView name;
         private  TextView surname;


        public ViewHolder(View itemView) {
            super(itemView);

            profileImage=itemView.findViewById(R.id.profile_image);
            name=itemView.findViewById(R.id.name);
            surname=itemView.findViewById(R.id.surname);
        }
    }

    private void changeColor(boolean gender,TextView... view){
        if (!gender){
            view[0].setTextColor(context.getResources().getColor(R.color.female_color));
            view[1].setTextColor(context.getResources().getColor(R.color.female_color));
        }
    }
}
