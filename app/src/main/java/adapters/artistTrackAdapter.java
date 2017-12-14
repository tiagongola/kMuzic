package adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fn.kmuzik.R;

import Models.artistTrackList;

/**
 * Created by F.N on 11/12/2017.
 */

public class artistTrackAdapter extends RecyclerView.Adapter<artistTrackAdapter.ViewHolder> {

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.list_item,parent, false);
        ViewHolder holder= new ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mArtistName.setText(trackList.getArtistlist().get(position).getArtist());
        holder.mTrackName.setText(trackList.getArtistlist().get(position).getaName());
        holder.mTrackCover.setImageResource(trackList.getArtistlist().get(position).getTrackCover());
        if(trackList.getArtistlist().get(position).getArtist().isVerified()){
            holder.mArtistVerifiedBadge.setImageResource(R.drawable.ic_verified_user_black_18dp);
        }else {
            //Não apresentamos o bagde pois o artista não foi verificado
        }

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    private artistTrackList trackList;
    private Context context;

    public artistTrackAdapter(Context context, artistTrackList trackList) {

        this.context = context;
        this.trackList = trackList;
    }
    public static class ViewHolder extends  RecyclerView.ViewHolder{
        public ImageView mTrackCover;
        public TextView mArtistName;
        public TextView mTrackName;
        public ImageView mArtistVerifiedBadge;
        public ImageView mTrackDitails;


        public ViewHolder(View itemView){
            super(itemView);
            //criamos os itens do nossos list_item layout
            mTrackCover= itemView.findViewById(R.id.trackCover);
            mTrackDitails= itemView.findViewById(R.id.trackDetails);
            mArtistName= itemView.findViewById(R.id.trackName);
            mArtistVerifiedBadge= itemView.findViewById(R.id.VerifiedAccount);
            mTrackName= itemView.findViewById(R.id.trackName);
        }






    }
}
