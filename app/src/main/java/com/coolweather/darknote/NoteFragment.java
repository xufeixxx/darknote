package com.coolweather.darknote;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class NoteFragment extends Fragment {
    private static final String TAG = "NoteFragment";

    private List<Tag> tagList =new ArrayList<>();
    private TagAdapter adapter;
    public NoteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_note, container, false);
        RecyclerView tagRecyclerView =(RecyclerView)view.findViewById(R.id.tag_recycler);
        initTag();
        adapter=new TagAdapter(tagList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MyApplication.getmContext());
        tagRecyclerView.setAdapter(adapter);
        tagRecyclerView.setLayoutManager(linearLayoutManager);
        return view;
    }
    private void initTag(){
        for(int i=0;i<15;i++){
            Log.d(TAG, "initTag:"+i);
            Tag tag = new Tag();
            tag.setIamgeId(R.drawable.ic_android_light_green_a400_24dp);
            tag.setTagName("安卓");
            tag.setTagCount("5");
            tagList.add(tag);
        }
    }
}
