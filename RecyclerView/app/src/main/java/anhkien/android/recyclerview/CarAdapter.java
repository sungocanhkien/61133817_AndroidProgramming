package anhkien.android.recyclerview;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter> {
    static class CarViewHolder extends RecyclerView.ViewHolder{
        TextView tenxe;
        ImageView hinhAnhXe;
        TextView moTaXe;
        
    }
}
