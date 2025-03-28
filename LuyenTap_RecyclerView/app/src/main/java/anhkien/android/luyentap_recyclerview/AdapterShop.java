package anhkien.android.luyentap_recyclerview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterShop extends RecyclerView.Adapter<AdapterShop.shopViewHolder>{

    @NonNull
    @Override
    public shopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull shopViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class shopViewHolder extends RecyclerView.ViewHolder{
        ImageView imageSanpham;
        TextView textViewTenSp, textViewMota;

        public shopViewHolder(@NonNull View itemView) {
            super(itemView);
            imageSanpham = itemView.findViewById(R.id.imgSanPham);
            textViewTenSp = itemView.findViewById(R.id.txtTenSanPham);
            textViewMota = itemView.findViewById(R.id.txtMoTa);
        }
    }
}
