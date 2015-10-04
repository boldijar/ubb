package com.ubb.app.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shirwa.simplistic_rss.RssItem;
import com.ubb.app.R;
import com.ubb.app.viewholders.NewsViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Browsing on 10/4/2015.
 */
public class NewsAdapter extends RecyclerView.Adapter<NewsViewHolder> {

    private List<RssItem> items = new ArrayList<>();

    public void setItems(List<RssItem> items) {
        this.items = items;
    }

    public List<RssItem> getItems() {
        return items;
    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news, null);
        return new NewsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int position) {
        RssItem item = items.get(position);

        holder.title.setText(item.getTitle());
        holder.content.setText(item.getDescription());

    }

    @Override
    public int getItemCount() {
        if (items == null) {
            return 0;
        }
        return items.size();
    }
}