package com.king.administrator.kingdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by Administrator on 2017\10\14 0014.
 */

public class FirstFragment extends Fragment {
    ImageView img_first;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_fragmrnt,container,false);
        Button btn_first_fragment = (Button)view.findViewById(R.id.button1);
        final ImageView img_first = (ImageView)view.findViewById(R.id.imageView1);
        img_first.setImageResource(R.drawable.jin3);
        btn_first_fragment.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity().getApplicationContext(),"这是第一页效果",Toast.LENGTH_SHORT).show();

            }
        });
        return view;


    }
}
