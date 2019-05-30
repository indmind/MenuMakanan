package com.indmind.menumakan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class FoodDetails extends AppCompatActivity implements View.OnClickListener {
    public static String EXTRA_POSITION = "extra_position";

    TextView tvFoodName, tvFoodPrice, tvFoodDescription, getTvFoodSeller;
    ImageView ivPhoto;
    Button btnBuy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_details);

        tvFoodName = findViewById(R.id.tv_food_name);
        tvFoodPrice = findViewById(R.id.tv_food_price);
        tvFoodDescription = findViewById(R.id.tv_food_description);
        getTvFoodSeller = findViewById(R.id.tv_food_seller);

        ivPhoto = findViewById(R.id.iv_food_photo);

        btnBuy = findViewById(R.id.btn_buy);

        btnBuy.setOnClickListener(this);

        int position = getIntent().getIntExtra(EXTRA_POSITION, 0);

        Food food = FoodData.getFoodList().get(position);

        tvFoodName.setText(food.getName());
        tvFoodPrice.setText(food.getPrice());
        tvFoodDescription.setText(food.getDescription());
        getTvFoodSeller.setText(food.getSeller());

        Glide.with(this)
                .load(food.getPhoto())
                .apply(new RequestOptions())
                .into(ivPhoto);


        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(food.getName());
        }
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_buy) {
            Toast.makeText(this, "Tunggu, pesananmu segera datang!", Toast.LENGTH_SHORT).show();
        }
    }
}
