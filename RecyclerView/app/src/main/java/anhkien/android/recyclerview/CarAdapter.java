package anhkien.android.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.CarViewHolder> {

    private List<Car> danhSachXe;
    public CarAdapter(List<Car> danhSachXe){
        this.danhSachXe = danhSachXe;
    }

    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_car, parent, false);
        return new CarViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {
        Car xe = danhSachXe.get(position);
        holder.tenxe.setText(xe.getTen());
        holder.hinhAnhXe.setImageResource(xe.getHinhAnhId());
        holder.moTaXe.setText(xe.getMoTa());
    }

    @Override
    public int getItemCount() {
        return danhSachXe.size();
    }

    static class CarViewHolder extends RecyclerView.ViewHolder{
        TextView tenxe;
        ImageView hinhAnhXe;
        TextView moTaXe;


        public CarViewHolder(View view) {
            super(view);
            tenxe = view.findViewById(R.id.ten_xe);
            hinhAnhXe = view.findViewById(R.id.hinh_anh_xe);
            moTaXe = view.findViewById(R.id.mo_ta_xe);
        }
    }
}
