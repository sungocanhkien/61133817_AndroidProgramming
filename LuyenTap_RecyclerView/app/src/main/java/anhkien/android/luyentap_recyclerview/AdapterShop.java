package anhkien.android.luyentap_recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterShop extends RecyclerView.Adapter<>{

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
