package anhkien.android.recyclerview;

import android.view.View;
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
    
    static class CarViewHolder extends RecyclerView.ViewHolder{
        TextView tenxe;
        ImageView hinhAnhXe;
        TextView moTaXe;

        public CarViewHolder(@NonNull View itemView, TextView tenxe, ImageView hinhAnhXe, TextView moTaXe) {
            super(itemView);
            tenxe = itemView.findViewById(R.id.ten_xe);
            hinhAnhXe = itemView.findViewById(R.id.hinh_anh_xe);
            moTaXe = itemView.findViewById(R.id.mo_ta_xe);
        }
    }
}
