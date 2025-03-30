package anhkien.android.luyentap_tonghop_my;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Cau3_CarAdapter extends RecyclerView.Adapter<Cau3_CarAdapter.Cau3_CarViewHolder> {

    private List<Cau3_Car> danhSachXe;
    public Cau3_CarAdapter(List<Cau3_Car> danhSachXe){
        this.danhSachXe = danhSachXe;
    }

    @NonNull
    @Override
    public Cau3_CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cau3_car, parent, false);
        return new Cau3_CarViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Cau3_CarViewHolder holder, int position) {
        Cau3_Car xe = danhSachXe.get(position);
        holder.tenxe.setText(xe.getTen());
        holder.hinhAnhXe.setImageResource(xe.getHinhAnhId());
        holder.moTaXe.setText(xe.getMoTa());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Cau3_CarDetail.class);
                intent.putExtra("car_name", xe.getTen());
                intent.putExtra("car_image", xe.getHinhAnhId());
                intent.putExtra("car_desc", xe.getMoTa());
                v.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return danhSachXe.size();
    }


    public class Cau3_CarViewHolder extends RecyclerView.ViewHolder {
        TextView tenxe;
        ImageView hinhAnhXe;
        TextView moTaXe;

        public Cau3_CarViewHolder(@NonNull View itemView) {
            super(itemView);
            tenxe = itemView.findViewById(R.id.ten_xe);
            hinhAnhXe = itemView.findViewById(R.id.hinh_anh_xe);
            moTaXe = itemView.findViewById(R.id.mo_ta_xe);
        }
    }
}
