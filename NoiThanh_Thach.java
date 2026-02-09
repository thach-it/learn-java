package nguyenquangthach_test;

public class NoiThanh_Thach extends Xe_Thach {
    private int soTuyen;
    private double soKM;

    public NoiThanh_Thach() {
        soTuyen = 0;
        soKM = 0;
    }

    public void setSoTuyen(int soTuyen) {
        this.soTuyen = soTuyen;
    }

    public void setSoKM(double soKM) {
        this.soKM = soKM;
    }

    public int getSoTuyen() {
        return soTuyen;
    }

    public double getSoKM() {
        return soKM;
    }

    protected double tinhPC() {
        if (soKM < 100) {
            return 0;
        }
        else {
            return doanhThu * 0.1;
        }
    }

    protected void xuat() {
        super.xuat();
        System.out.println(soTuyen + " - " + soKM + " - " + tinhPC());
    }
}
