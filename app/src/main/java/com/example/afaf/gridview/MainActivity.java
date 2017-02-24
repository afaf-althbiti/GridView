package com.example.afaf.gridview;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

     GridView myGrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myGrid=(GridView) findViewById(R.id.gridVirw);
    }
}
 class categories
 {
     int imageId;
     String categoriesNames;
     categories(int imageId,String categoriesNames)
     {
         this.imageId=imageId;
         this.categoriesNames=categoriesNames;
     }
 }
 class MyAdapter extends BaseAdapter{

     ArrayList<categories> list;
     MyAdapter(Context context)
     {
         list=new ArrayList<categories>();
         Resources res=context.getResources();
        String[] tempCategoriesNames= res.getStringArray(R.array.categories);
        int[] categoriesImages={R.drawable.1,R.drawable.2,R.drawable.3,R.drawable.4,R.drawable.5,R.drawable.6
        ,R.drawable.7,R.drawable.8,R.drawable.9,R.drawable.10,R.drawable.11,R.drawable.12};
     }
     @Override
     public int getCount() {
         return 0;
     }

     @Override
     public Object getItem(int i) {
         return null;
     }

     @Override
     public long getItemId(int i) {
         return 0;
     }

     @Override
     public View getView(int i, View view, ViewGroup viewGroup) {
         return null;
     }
 }