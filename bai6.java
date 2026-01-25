import java.util.Scanner;
public class bai6 {
    // Bài 6
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = nhap(sc);
        m = nhap(sc);
        int[][] a = new int[n][m];
        nhapMang(a, n, m, sc);
        xuatMang(a, n, m);
        phanTuLonNhatTrongMang(a, n, m);
        phanTuNguyenTo(a, n, m);
        xuatMang(a, n, m);
        hangCoNhieuSoNguyenTo(a, n, m);
    }
    
    public static int nhap(Scanner sc) {
        int x;
        do { 
            System.out.println("Nhap gia tri");
            x = sc.nextInt();
            if (x <= 0) {
                System.out.println("Nhap lai");
            }
        } while (x <= 0);
        return x;
    }

    public static void nhapMang(int[][] a, int n, int m, Scanner sc) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                do { 
                    System.out.println("a[" + i + "] [" + j + "]");
                    a[i][j] = sc.nextInt();
                    if (a[i][j] <= 0 || a[i][j] >= 100) {
                        System.out.println("Nhap lai");
                    }
                } while (a[i][j] <= 0 || a[i][j] >= 100);
            }
        }
    }

    public static void xuatMang(int[][] a, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }

    // a) Tìm phần tử lớn nhất của ma trận cùng với vị trí
    public static void phanTuLonNhatTrongMang(int[][] a, int n, int m) {
        int max = a[0][0];
        System.out.println("\nCau a)");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        System.out.println("Phan tu lon nhat trong mang:" + max);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max == a[i][j]) {
                    System.out.println("Vi tri: Dong " + i + " cot " + j);
                }
            }
        }
    }

    // b) Tìm và in ra các phần tử SNT của ma trận (các phần tử không nguyên tố thì thay bằng số 0)
    public static boolean timSoNguyenTo(int a) {
        if (a < 2) return false;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) return false;
        }
        return true;
    }

    public static void phanTuNguyenTo(int[][] a, int n, int m) {
        System.out.println("\nCau b)");
        System.out.println("Cac phan tu nguyen to cua ma tran");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!timSoNguyenTo(a[i][j])) {
                    a[i][j] = 0;
                }
            }
        }
    }

    // c) Tìm hàng trong ma trận có nhiều SNT nhất
    public static void hangCoNhieuSoNguyenTo(int[][] a, int n, int m) {
        int max = 0;
        System.out.println("\nCau c)");
        for (int i = 0; i < n; i++) {
            int dem = 0; // nếu để biến đếm bên ngoài thì nó sẽ đếm từ đầu đến cuối. 
            for (int j = 0; j < m; j++) {
                if(timSoNguyenTo(a[i][j])) {
                    dem++;
                } // thực hiện xong vòng lặp này nó sẽ reset lại khi đếm dòng tiếp theo
            }
            if (max < dem) {
                max = dem; // SNT đếm được của dòng đó. vd: dem = 2 thì max = 2.                
            }
        }
        for (int i = 0; i < n; i++) {
            int dem = 0; 
            for (int j = 0; j < m; j++) {
                if(timSoNguyenTo(a[i][j])) {
                    dem++;
                }
            }
            if (dem == max) {
                System.out.print("Hang co nhieu so nguyen to nhat o hang " + i);
            }
        }
    }
}