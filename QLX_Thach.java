package nguyenquangthach_test;

import java.util.ArrayList;
import java.util.Scanner;

public class QLX_Thach {
    ArrayList<Xe_Thach> a = new ArrayList<>();
    void menu() {
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("0 - Thoat");
            System.out.println("1 - Nhap xe noi thanh");
            System.out.println("2 - Nhap xe ngoai thanh");
            System.out.println("3 - Xuat TAT CA");
            System.out.println("4 - Xuat xe noi thanh");
            System.out.println("5 - Xuat xe ngoai thanh co so tuyen 36");
            System.out.println("6 - Tong doanh thu TAT CA xe");
            System.out.println("7 - Tong doanh thu cho xe NT");
            System.out.println("8 - Dem co bao nhieu xe co doanh thu > 1 trieu");
            System.out.println("9 - Dem co bao nhieu xe noi thanh co doanh thu > 1 trieu");
            System.out.println("10 - Tinh trung binh doanh thu tat ca xe");
            System.out.println("11 - Tinh trung binh doanh thu tat ca xe NT");
            System.out.println("Moi ban chon");
            chon = sc.nextInt();
            switch (chon) {
                case 0:
                    break;
                case 1:
                    sc.nextLine();
                    NoiThanh_Thach nt = new NoiThanh_Thach();
                    System.out.println("Nhap ma so chuyen");
                    nt.maChuyen = sc.nextLine();
                    System.out.println("Nhap ho ten");
                    nt.hoTen = sc.nextLine();
                    System.out.println("Nhap nam sinh");
                    nt.namSinh = sc.nextLine();
                    System.out.println("Nhap so xe");
                    nt.soXe = sc.nextLine();
                    boolean flag;
                    do {
                        flag = true;
                        try {
                            System.out.println("Nhap doanh thu");
                            nt.doanhThu = sc.nextDouble();
                            if (nt.doanhThu <= 0) {
                                throw new Exception();
                            }
                        } catch (Exception e) {
                            System.out.println("Doanh thu la so > 0");
                            sc.nextLine();
                            flag = false;
                        }
                    } while (flag == false);
                    System.out.println("Nhap so tuyen");
                    nt.setSoTuyen(sc.nextInt());
                    System.out.println("Nhap so KM");
                    nt.setSoKM(sc.nextDouble());
                    a.add(nt);
                    break;
                case 2:
                    break;
                case 3:
                    for (int i = 0; i < a.size(); i++) {
                        a.get(i).xuat();
                    }
                    break;
                case 4:
                    for (int i = 0; i < a.size(); i++) {
                        if (a.get(i) instanceof NoiThanh_Thach) {
                            a.get(i).xuat();
                        }
                    }
                    break;
                case 5:
                    for (int i = 0; i < a.size(); i++) {
                        if (a.get(i) instanceof NoiThanh_Thach) {
                            if (((NoiThanh_Thach)a.get(i)).getSoTuyen() == 36) {
                                a.get(i).xuat();
                            }
                        }                     
                    }
                    break;
                case 6:
                    double S = 0;
                    for (int i = 0; i < a.size(); i++) {
                        S += a.get(i).doanhThu;
                    }
                    System.out.print("Tong doanh thu = " + S);
                    break;
                case 7:
                    double S_nt = 0;
                    for (int i = 0; i < a.size(); i++) {
                        if (a.get(i) instanceof NoiThanh_Thach) {
                            S_nt += a.get(i).doanhThu;
                        }
                    }
                    System.out.print("Tong doanh thu = " + S_nt);
                    break;
                case 8:
                    int dem = 0;
                    boolean flag1 = false;
                    for (int i = 0; i < a.size(); i++) {
                        if (a.get(i).doanhThu > 1000000) {
                            dem++;
                            flag1 = true;
                        }
                    }
                    System.out.print("So xe co doanh thu tren 1 trieu: " + dem);
                    if (!flag1) {
                        System.out.println("Khong co xe nao co doanh thu tren 1 trieu");
                    }
                    break;
                case 9:
                    int dem1 = 0;
                    boolean flag2 = false;
                    for (int i = 0; i < a.size(); i++) {
                        if (a.get(i) instanceof NoiThanh_Thach) {
                            if (a.get(i).doanhThu > 1000000) {
                                dem1++;
                                flag2 = true;
                            }
                        }
                    }
                    System.out.print("So xe co doanh thu tren 1 trieu: " + dem1);
                    if (!flag2) {
                        System.out.println("Khong co xe NT nao co doanh thu tren 1 trieu");
                    }
                    break;
                case 10:
                    double S_dt = 0;
                    int dem_dt = 0;
                    for (int i = 0; i < a.size(); i++) {
                        if (a.get(i).doanhThu) {
                            S += a.get(i).doanhThu;
                            dem++;
                        }
                    }
                    System.out.print("Tong doanh thu cua tat ca xe: " + (S_dt/dem_dt));
                    break;
                case 19:
                    for (int i = 0; i < a.size(); i++) {
                        if (a.get(i).namSinh == 2000) {
                            a.get(i).xuat();
                        }
                    }
                    break;
                default:
                    System.out.println("Nhap sai. Nhap lai!");
            }
        }while(chon != 0);
    }
}


