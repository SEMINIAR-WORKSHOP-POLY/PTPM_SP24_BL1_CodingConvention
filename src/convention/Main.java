/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convention;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        //Bài 1: Nhập vào điểm Toán, điểm Lý, điểm Hóa, 
        //tính điểm trung bình của bạn. In ra kết quả
        //Bài 2: Nhập điểm Java trong khoảng từ 0-10. 
        // Đưa ra thông báo qua môn hay học lại?
        // Bai 1:
        Scanner sc = new Scanner(System.in);
//        System.out.print("Moi nhap diem toan");
//        float diemToan = Float.valueOf(sc.nextLine());
//        System.out.print("Moi nhap diem ly");
//        float diemLy = Float.valueOf(sc.nextLine());
//        System.out.print("Moi nhap diem hoa");
//        float diemHoa = Float.valueOf(sc.nextLine());
//        float main = (diemLy + diemHoa + diemToan) / 3;
//        System.out.println("Diem trung binh " + main);
        // Bai 2
        // Nhap di nhap lai diem java trong khoang tu 0 - 10 
        int diemJava;
        while (true) {
            System.out.print("Moi nhap diem java:");
            diemJava = Integer.valueOf(sc.nextLine());
            if (diemJava > 10 || diemJava < 0) {
                System.out.println("Diem khong thoa man."
                        + " Yeu cau nhap lai");
            } else {
                if (diemJava >= 5) {
                    System.out.println("Qua mon");
                } else {
                    System.out.println("Hoc lai");
                }
                System.exit(0);
            }
        }
    }

}
