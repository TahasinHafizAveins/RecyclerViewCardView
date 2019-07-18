package com.example.recyclerviewcardview;

import java.util.ArrayList;

class Data {

  public   static ArrayList<Information> getData(){

        ArrayList<Information> data = new ArrayList<>();

        int[] image = { R.drawable.bird,R.drawable.kingfisher,R.drawable.green,R.drawable.deer,R.drawable.dog,R.drawable.frog,
                        R.drawable.river,R.drawable.sky,R.drawable.bird,R.drawable.kingfisher,R.drawable.green,R.drawable.deer,
                        R.drawable.dog,R.drawable.frog,R.drawable.river,R.drawable.sky,R.drawable.bird,R.drawable.kingfisher,
                        R.drawable.green,R.drawable.deer,R.drawable.dog,R.drawable.frog,R.drawable.river,R.drawable.sky,
                        R.drawable.bird,R.drawable.kingfisher,R.drawable.green,R.drawable.deer,R.drawable.dog,R.drawable.frog,
                        R.drawable.river,R.drawable.sky,R.drawable.bird,R.drawable.kingfisher,R.drawable.green,R.drawable.deer,
                        R.drawable.dog,R.drawable.frog,R.drawable.river,R.drawable.sky,R.drawable.bird,R.drawable.kingfisher,
                        R.drawable.green,R.drawable.deer,R.drawable.dog,R.drawable.frog,R.drawable.river,R.drawable.sky};

        String[] catagories = { "bird","kingfisher","green","deer","dog","frog","river","sky","bird","kingfisher","green",
                                "deer","dog","frog","river","sky","bird","kingfisher","green","deer","dog","frog","river",
                                "sky","bird","kingfisher","green","deer","dog","frog","river","sky","bird","kingfisher",
                                "green","deer","dog","frog","river","sky","bird","kingfisher","green","deer","dog","frog",
                                "river","sky"};

        for (int i=0;i<image.length;i++)
        {
            Information current = new Information();
            current.title = catagories[i];
            current.imageId = image[i];

            data.add(current);
        }

        return data;
    }
}
