package anhkien.android.luyentap_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterShop extends RecyclerView.Adapter<AdapterShop.shopViewHolder>{
    Context context;
    ArrayList<Shop> arrayListShop;

    public AdapterShop(Context context, ArrayList<Shop> arrayListShop) {
        this.context = context;
        this.arrayListShop = arrayListShop;
    }

    @NonNull
    @Override
    public shopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater giaybongro = LayoutInflater.from(context);
        View viewSP = giaybongro.inflate(R.layout.item_sanpham, parent, false);
        shopViewHolder viewHolder = new shopViewHolder(viewSP);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull shopViewHolder holder, int position) {
        Shop shopHienThi = arrayListShop.get(position);
        int anh = shopHienThi.getHinhAnh();
        String tenAnh = shopHienThi.getTenAnh();
        String motaAnh = shopHienThi.getMoTa();
        int AnhHienThi = shopHienThi.getHinhAnh();
        holder.textViewTenSp.setText(shopHienThi.tenAnh);
        holder.textViewMota.setText(shopHienThi.moTa);
        String packagename = holder.itemView.getContext().getPackageName();
        int imageID = holder.itemView.getResources().getIdentifier(String.valueOf(AnhHienThi), "mipmap", packagename);
        holder.imageSanpham.setImageResource(imageID);
    }

    @Override
    public int getItemCount() {
        return arrayListShop.size();
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
