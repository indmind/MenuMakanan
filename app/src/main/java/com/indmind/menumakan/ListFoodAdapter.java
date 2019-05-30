package com.indmind.menumakan;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListFoodAdapter extends RecyclerView.Adapter<ListFoodAdapter.CategoryViewHolder> {
    private Context context;
    private ArrayList<Food> foodsList;

    public ListFoodAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Food> getFoodsList() {
        return foodsList;
    }

    public void setFoodsList(ArrayList<Food> foodsList) {
        this.foodsList = foodsList;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_foods, viewGroup, false);

        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull final CategoryViewHolder categoryViewHolder, int i) {
        Food food = getFoodsList().get(i);

        categoryViewHolder.tvName.setText(food.getName());
        categoryViewHolder.tvPrice.setText(food.getPrice());

        Glide.with(context)
                .load(food.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(categoryViewHolder.imgPhoto);

        final Context currentContext = context;

        categoryViewHolder.itemView.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Intent foodDetailIntent = new Intent(currentContext, FoodDetails.class);

                foodDetailIntent.putExtra(FoodDetails.EXTRA_POSITION, position);

                currentContext.startActivity(foodDetailIntent);
            }
        }));
    }

    @Override
    public int getItemCount() {
        return getFoodsList().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvPrice;
        ImageView imgPhoto;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvPrice = itemView.findViewById(R.id.tv_item_price);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
