package com.coffeebean.slide.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.coffeebean.slide.R;
import com.coffeebean.slide.model.Post;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by steven on 2016-12-23.
 */

public class LogGeneralFragment extends Fragment {

    @Bind(R.id.rv)
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_feed_general, container, false);
        ButterKnife.bind(this, view);
        Log.d("FEEDGENERAL", "onCreateView");
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(new PostAdapter(Post.getFakeLogs()));
        return view;
    }

    public static class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {

        List<Post> posts;

        PostAdapter(List<Post> list) {
            this.posts = list;
        }

        @Override
        public void onBindViewHolder(final PostViewHolder holder, int position) {
            holder.title.setText(posts.get(position).getTitle());
            holder.location.setText(posts.get(position).getLocation());
            holder.days.setText(posts.get(position).getDaysAgo());
            holder.image.setVisibility(View.GONE);

        }

        @Override
        public PostViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_posts, viewGroup, false);
            return new PostViewHolder(v);
        }

        static class PostViewHolder extends RecyclerView.ViewHolder {
            @Bind(R.id.tv_title)
            TextView title;
            @Bind(R.id.tv_location)
            TextView location;
            @Bind(R.id.tv_days)
            TextView days;
            @Bind(R.id.iv_favorite)
            ImageView image;

            boolean isSelected = false;

            PostViewHolder(View itemView){
                super(itemView);
                ButterKnife.bind(this,itemView);
            }
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public int getItemCount() {
            return posts.size();
        }
    }
}
