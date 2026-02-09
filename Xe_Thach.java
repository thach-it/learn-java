package nguyenquangthach_test;

public class Xe_Thach {
    protected  String maChuyen, hoTen, namSinh, soXe;
    protected double doanhThu;

    public Xe_Thach() {
        maChuyen = "";
        hoTen = "";
        namSinh = "";
        soXe = "";
        doanhThu = 0;
    }

    protected abstract double tinhPC();

    protected void xuat() {
        System.out.print(maChuyen + " - "
                        + hoTen + " - "
                        + namSinh + " - "
                        + soXe + " - "
                        + tinhPC() + " - "
        );
    }
}
