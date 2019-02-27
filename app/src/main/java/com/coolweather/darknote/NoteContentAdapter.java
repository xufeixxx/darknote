package com.coolweather.darknote;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class NoteContentAdapter extends RecyclerView.Adapter<NoteContentAdapter.ViewHolder> {

    private List<NoteContent> noteContentList;
    public NoteContentAdapter(List<NoteContent> list){
        noteContentList=list;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView noteContent;
        private TextView time;
        private CardView cardView;
        public ViewHolder(View itemView) {
            super(itemView);
            noteContent=(TextView)itemView.findViewById(R.id.note_content);
            time=(TextView)itemView.findViewById(R.id.note_date);
            cardView=(CardView)itemView;
        }
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(MyApplication.getmContext()).inflate(R.layout.note_recycle_item,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        NoteContent content = noteContentList.get(i);
        viewHolder.time.setText(content.getDate());
        viewHolder.noteContent.setText(content.getContent());
    }

    @Override
    public int getItemCount() {
        return noteContentList.size();
    }

}
