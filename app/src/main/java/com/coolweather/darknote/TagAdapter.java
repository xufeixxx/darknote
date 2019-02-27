package com.coolweather.darknote;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

public class TagAdapter extends RecyclerView.Adapter<TagAdapter.ViewHolder> {

    private List<Tag> tagList;
    public TagAdapter(List<Tag> list){
        tagList=list;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private RelativeLayout relativeLayout;
        private ImageView imageView;
        private TextView textView;
        private TextView textView1;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            relativeLayout=(RelativeLayout)itemView;
            imageView=(ImageView)itemView.findViewById(R.id.tag_imageview);
            textView=(TextView)itemView.findViewById(R.id.tag_name);
            textView1=(TextView)itemView.findViewById(R.id.tag_count);
        }
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(MyApplication.getmContext()).inflate(R.layout.tag_item_layout,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        Tag tag = tagList.get(i);
        viewHolder.imageView.setImageResource(tag.getIamgeId());
        viewHolder.textView.setText(tag.getTagName());
        viewHolder.textView1.setText(tag.getTagCount());
    }

    @Override
    public int getItemCount() {
        return tagList.size();
    }

}
