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
    }

    static class CarViewHolder extends RecyclerView.ViewHolder{
        TextView tenxe;
        ImageView hinhAnhXe;
        TextView moTaXe;

        public CarViewHolder(View view) {
            super(itemView);
            tenxe = itemView.findViewById(R.id.ten_xe);
            hinhAnhXe = itemView.findViewById(R.id.hinh_anh_xe);
            moTaXe = itemView.findViewById(R.id.mo_ta_xe);
        }
    }
}
