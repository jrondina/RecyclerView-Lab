package example.com.recyclerviewlab;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by jamesrondina on 7/5/16.
 */
public class CustomViewHolder extends RecyclerView.ViewHolder {

    TextView mSquare;
    TextView mTextView1;
    TextView mTextView2;

    public CustomViewHolder(View itemView) {
        super(itemView);

        mSquare = (TextView) itemView.findViewById(R.id.square);
        mTextView1 = (TextView) itemView.findViewById(R.id.text1);
        mTextView2 = (TextView) itemView.findViewById(R.id.text2);
    }

    public TextView getmSquare() {
        return mSquare;
    }

    public void setmSquare(TextView mSquare) {
        this.mSquare = mSquare;
    }

    public TextView getmTextView1() {
        return mTextView1;
    }

    public void setmTextView1(TextView mTextView1) {
        this.mTextView1 = mTextView1;
    }

    public TextView getmTextView2() {
        return mTextView2;
    }

    public void setmTextView2(TextView mTextView2) {
        this.mTextView2 = mTextView2;
    }
}
