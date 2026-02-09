package nguyenquangthach_test;

public class NgoaiThanh_Thach extends Xe_Thach {
    private String noiDen;
    private int soNgay;

    public NgoaiThanh_Thach() {
        noiDen = "";
        soNgay = 0;
    }

    protected double tinhPC() {
        if (soNgay < 3) {
            return 0;
        }
        else {
            return doanhThu * 0.05;
        }
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public void setSoNgay(int soNgay) {
        this.soNgay = soNgay;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public int getSoNgay() {
        return soNgay;
    }

    protected void xuat() {
        super.xuat();
        System.out.println(noiDen + " - " + soNgay + " - " + tinhPC());
    }
}
