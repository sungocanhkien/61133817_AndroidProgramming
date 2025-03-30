package anhkien.android.luyentap_tonghop_my;

public class Cau3_Car {
    private String ten;
    private int hinhAnhId;
    private String moTa;

    public Cau3_Car(String ten, int hinhAnhId, String moTa) {
        this.ten = ten;
        this.hinhAnhId = hinhAnhId;
        this.moTa = moTa;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getHinhAnhId() {
        return hinhAnhId;
    }

    public void setHinhAnhId(int hinhAnhId) {
        this.hinhAnhId = hinhAnhId;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
}
