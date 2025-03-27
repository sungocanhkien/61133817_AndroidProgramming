package anhkien.android.recyclerview;

public class Car {
    private String ten;
    private int hinhAnhId;
    private String moTa;

    public Car(String ten, int hinhAnhId, String moTa) {
        this.ten = ten;
        this.hinhAnhId = hinhAnhId;
        this.moTa = moTa;
    }

    public String getTen() {
        return ten;
    }

    public int getHinhAnhId() {
        return hinhAnhId;
    }

    public String getMoTa() {
        return moTa;
    }
}
