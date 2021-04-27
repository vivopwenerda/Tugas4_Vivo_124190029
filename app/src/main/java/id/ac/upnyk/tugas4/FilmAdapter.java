package id.ac.upnyk.tugas4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class FilmAdapter extends RecyclerView.Adapter<FilmAdapter.ViewHolder> {
    private Context context;
    private ArrayList<FilmModel> filmModels;

    public FilmAdapter(Context context) {
        this.context = context;
    }
    public ArrayList<FilmModel> getFilmModels() {
        return filmModels;
    }
    public void setFilmModels(ArrayList<FilmModel> filmodels) {
        this.filmModels = filmModels;
    }

    @NonNull
    @Override
    public FilmAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.item_film,viewGroup,false);
        return new ViewHolder(itemRow);
    }
    @Override
    public void onBindViewHolder(@NonNull FilmAdapter.ViewHolder viewHolder, int i) {
        Glide.with(context).load(getFilmModels().get(i).getGambarFilm()).into
                (viewHolder.ivGambarFilm);
        viewHolder.tvNamaFilm.setText(getFilmModels().get(i).getNamaFilm());
    }
    @Override
    public int getItemCount() {
        return getFilmList().size();
}
    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView ivGambarFilm;
        private TextView tvNamaFilm;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivGambarFilm = itemView.findViewById(R.id.cetak_gambar);
            tvNamaFilm = itemView.findViewById(R.id.nama_film);
        }
    }
}
