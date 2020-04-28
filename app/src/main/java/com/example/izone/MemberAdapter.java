package com.example.izone;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class MemberAdapter extends RecyclerView.Adapter<MemberAdapter.ListViewHolder> {
    private ArrayList<Member> listMember;
    public MemberAdapter(ArrayList<Member> list) {
        this.listMember = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_member, viewGroup, false);
        return new ListViewHolder(view);
    }

    private OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Member member = listMember.get(position);
        Glide.with(holder.itemView.getContext())
                .load(member.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(member.getName());
        holder.tvDetail.setText(member.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listMember.get(holder.getAdapterPosition()));

            }
        });
    }

    public interface OnItemClickCallback {
        void onItemClicked(Member data);
    }

    @Override
    public int getItemCount() {
        return listMember.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        ListViewHolder(@NonNull View itemView) {
            super(itemView);
                imgPhoto = itemView.findViewById(R.id.img_item_photo);
                tvName = itemView.findViewById(R.id.tv_item_name);
                tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
