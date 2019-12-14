package com.rohitsuthar.androidcustombottomnav.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.rohitsuthar.androidcustombottomnav.R;
import com.rohitsuthar.androidcustombottomnav.models.ContestsModel;
import java.util.ArrayList;

public class ContestsAdapter extends RecyclerView.Adapter<ContestsAdapter.MyViewHolder> {
    private Context mContext;
    private ArrayList<ContestsModel> contestsModelArrayList;

    public ContestsAdapter(Context mContext, ArrayList<ContestsModel> contestsModelArrayList) {
        this.mContext = mContext;
        this.contestsModelArrayList = contestsModelArrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rv_model, viewGroup, false);
        return new MyViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder myViewHolder, int i) {
        final ContestsModel current_item = contestsModelArrayList.get(i);
        myViewHolder.tvGameName.setText(current_item.getGame_name());
        myViewHolder.tvCurrentUsers.setText(String.valueOf(current_item.getCurrent_users()));
        myViewHolder.tvTotalUsers.setText("/" + current_item.getTotal_users());
        myViewHolder.tvGameType.setText(current_item.getGame_type());
        myViewHolder.tvGameDateAndTime.setText(current_item.getDate_and_time());
        myViewHolder.tvCoins.setText(String.valueOf(current_item.getCoins()));
        if(current_item.isLive()) {
            myViewHolder.tvStatus.setText("LIVE");
            myViewHolder.imgStatus.setVisibility(View.VISIBLE);
        }
        else {
            myViewHolder.tvStatus.setText("ENDED");
        }
        myViewHolder.imgThumbnail.setImageResource(current_item.getImg_thumb());

        myViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "You clicked the card!", Toast.LENGTH_SHORT).show();
            }
        });

        if(i == contestsModelArrayList.size() - 1) {
            ViewGroup.MarginLayoutParams layoutParams =
                    (ViewGroup.MarginLayoutParams) myViewHolder.cardView.getLayoutParams();
            layoutParams.setMargins(convertDpToPixel(12,mContext),convertDpToPixel(12,mContext),convertDpToPixel(12,mContext),convertDpToPixel(12,mContext));
            myViewHolder.cardView.requestLayout();
        }
    }

    private int convertDpToPixel(float dp, Context context){
        return (int) (dp * ((float) context.getResources().getDisplayMetrics().densityDpi / DisplayMetrics.DENSITY_DEFAULT));
    }

    @Override
    public int getItemCount() {
        return contestsModelArrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView tvGameName, tvGameType, tvGameDateAndTime, tvCoins, tvCurrentUsers, tvTotalUsers, tvStatus;
        private ImageView imgThumbnail, imgStatus;
        private CardView cardView;

        MyViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.card_view);
            tvGameName = itemView.findViewById(R.id.tv_gamename);
            tvGameType = itemView.findViewById(R.id.tv_type);
            tvGameDateAndTime = itemView.findViewById(R.id.tv_date);
            tvCoins = itemView.findViewById(R.id.tv_coins);
            tvCurrentUsers = itemView.findViewById(R.id.tv_users_current);
            tvTotalUsers = itemView.findViewById(R.id.tv_users_total);
            tvStatus = itemView.findViewById(R.id.tv_status);
            imgThumbnail = itemView.findViewById(R.id.img_thumb);
            imgStatus = itemView.findViewById(R.id.img_status);
        }
    }
}
