package anhkien.android.luyentap_recyclerview;

public class Shop {
    int hinhAnh;
    String tenAnh;
    String moTa;

    public Shop(int hinhAnh, String tenAnh, String moTa) {
        this.hinhAnh = hinhAnh;
        this.tenAnh = tenAnh;
        this.moTa = moTa;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getTenAnh() {
        return tenAnh;
    }

    public void setTenAnh(String tenAnh) {
        this.tenAnh = tenAnh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}
