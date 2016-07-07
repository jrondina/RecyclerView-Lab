package example.com.recyclerviewlab;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

/**
 * Created by jamesrondina on 7/5/16.
 */
public class CustomRecyclerViewAdapter2 extends RecyclerView.Adapter<CustomViewHolder> {

    List<CustomObject> mCustomObjectsList;

    public CustomRecyclerViewAdapter2(final List<CustomObject> customObjectList) {
        mCustomObjectsList = customObjectList;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View parentView = LayoutInflater.from(parent.getContext()).inflate(R.layout.customlayout, parent, false);
        CustomViewHolder viewHolder = new CustomViewHolder(parentView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder2 holder, int position) {
        final CustomObject customObject = mCustomObjectsList.get(position);
        holder.mTextView1.setText(customObject.getTitleText());
        holder.mTextView2.setText(customObject.getDescriptionText());
        holder.mSquare.setText(customObject.getColorText());
        holder.mCheckBox.setChecked(customObject.isChecked);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), customObject.getTitleText(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mCustomObjectsList.size();
    }
}
