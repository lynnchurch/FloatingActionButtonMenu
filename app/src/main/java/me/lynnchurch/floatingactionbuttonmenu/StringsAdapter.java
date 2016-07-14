package me.lynnchurch.floatingactionbuttonmenu;

import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Lynn on 2016-7-9.
 */

public class StringsAdapter extends BaseAdapter
{
    private List<String> mDataSet;

    public StringsAdapter(List<String> dataSet)
    {
        mDataSet = dataSet;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.strings_item, parent, false));
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position)
    {
        final ViewHolder vh = (ViewHolder) holder;
        vh.tv_feature_name.setText(mDataSet.get(position));
    }

    @Override
    public int getItemCount()
    {
        return mDataSet.size();
    }

    class ViewHolder extends BaseAdapter.ViewHolder
    {
        AppCompatTextView tv_feature_name;

        public ViewHolder(View itemView)
        {
            super(itemView);
            tv_feature_name = (AppCompatTextView) itemView.findViewById(R.id.tv_feature_name);
        }
    }

}
