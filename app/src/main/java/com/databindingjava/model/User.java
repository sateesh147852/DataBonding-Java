package com.databindingjava.model;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.databinding.BindingAdapter;
import com.bumptech.glide.Glide;

public class User {

    public static final String TAG = User.class.getSimpleName();

    public String name;
    public int age;
    public String imageUrl;
    public boolean active;

    public User(String name, int age, boolean active,String imageUrl) {
        this.name = name;
        this.age = age;
        this.imageUrl = imageUrl;
        this.active = active;
    }

    public void handleClick(View view){
        Log.i(TAG, "handleClick: "+"handleClick method is called");
    }


    @BindingAdapter("loadImage")
    public static void loadImage(ImageView imageView, String imageUrl){
        Glide.with(imageView)
                .load(imageUrl)
                .into(imageView);
    }
}
