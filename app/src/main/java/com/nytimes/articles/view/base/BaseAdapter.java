package com.nytimes.articles.view.base;

import android.support.v7.widget.RecyclerView;

import java.util.List;

/**
 * Generic Base adapter for recycler views
 * Author: PRAMOD K P
 * Email: pramodpnckr@gmail.com
 * Created: 3/28/2019
 * Modified: 3/28/2019
 */
public abstract class BaseAdapter<T extends RecyclerView.ViewHolder, D> extends RecyclerView.Adapter<T>{

    public abstract void setData(List<D> data);
}