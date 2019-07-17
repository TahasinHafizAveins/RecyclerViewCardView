package com.example.recyclerviewcardview;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;

import androidx.recyclerview.widget.RecyclerView;

public class Animation {

    public  static void animate(RecyclerView.ViewHolder holder,boolean goesDown)
    {
        AnimatorSet animatorSet = new AnimatorSet();

        ObjectAnimator animatorTranslationY = ObjectAnimator
                .ofFloat(holder.itemView, "translationY",goesDown==true ?200: -200,0);
        animatorTranslationY.setDuration(1000);

        ObjectAnimator animatorTranslationX = ObjectAnimator
                .ofFloat(holder.itemView, "translationX",-50,50,-30,30,-20,20,-5,5,0);
        animatorTranslationY.setDuration(1000);

        animatorSet.playTogether(animatorTranslationX,animatorTranslationY);
        //animatorSet.playTogether(animatorTranslationY);
        animatorSet.start();

    }
}
