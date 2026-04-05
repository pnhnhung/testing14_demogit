import java.util.Arrays;
import java.util.Scanner;

public class Buoi3 {
    public static void main(String[] args) {
        int soA = 10;
        int soB = 20;
        //array: mảng là một cấu trúc dữ liệu dùng để lưu trữ nhiều giá trị cùng kiểu dữ liệu
        //cùng 1 mục đích sử dụng;
        //khai báo biến: kiểu dữ liệu tenBien = giá trị
        //vị trí của giá trị trong 1 mảng được gọi là index, bắt đầu từ 0
        //khai báo mảng: kiểu dữ liệu[] tenMang = new kiểu dữ liệu[kích thước]; -> số lượng phần tử của mảng
        int [] mangSo = new int [5];
        mangSo[0] = 1;
        mangSo[1] = 2;
        mangSo[2] = 3;
        mangSo[3] = 4;
        mangSo[4] = 5;

        System.out.println("Giá trị của phần tử c index 0: " + mangSo[0]);
        System.out.println("Giá trị của mảng: " + Arrays.toString(mangSo));

        //khai báo mảng: kiểu dữ liệu[] tenMang = {giá trị 1, giá trị 2, giá trị 3,...};
        String[] mangTen = {"Trinh An Thành", "Khôi", "Hùng"};
        mangTen[0] = "Nguyễn Bảo Giang";
        System.out.println("Giá trị của phần tử có index 0: " + mangTen[0]);
        System.out.println("Số lượng phần tử của mảng: " + mangTen.length);
                                                //.length: trả về số lượng của phần tử của mảng
        //duyệt mảng: sử dụng vòng lặp for để duyệt qua tất cả phần tử của mảng
        for(int i = 0; i <= mangTen.length; i++){
            System.out.println("Phần tử có index " + i + " là: " + mangTen[i]);
        }
        //for...each
        //cú pháp: for (kiểu dữ liệu tenBien : tenMang){logic sử dụng tenBien}
        for (String ten : mangTen) {
            System.out.println("Tên học sinh: " + ten);
        }

        //if else if statment
        //ví dụ
        int diem = 85;
        if (diem >= 80) {
            System.out.println("Học sinh đạt điều kiện");
        } else {
            System.out.println("Học sinh đạt không đạt điều kiện");
        }
        //toán tử 3 ngôi:
        //cú pháp: điều kiện dđúng ? thực hiện logic A có kết quả : thực hiện logic B có kết quả
        System.out.println(diem >= 80 ? "Học sinh đạt điều kiện" : "Học sinh không đạt điều kiện");
//        String ketQua = diem >= 80 ? "Học sinh đạt điều kiện" : "Học sinh không đạt điều kiện";
//        System.out.println(ketQua);

        //ép kiểu dữ liệu: chuyển đổi một giá trị từ dữ liệu này sang dữ liệu khác
        //ép kiểu ngầm định: tự động chuyển đổi kiểu dữ liệu nhỏ hơn sang kiểu dữ liêu lớn hớn (của cùng một loại dữ liệu)
        //kiểu dữ liệu là số: byte < short < int < long < float < double
        byte so1 = 10;
        int so2 = so1; //ép kiểu ngầm đinh từ byte sang int
        System.out.println("Giá trị của so2: " + so2);

        //ép kiểu tường minh: tự động chuyển đổi kiểu dữ liệu lớn hơn sang kiểu dữ liệu nhỏ hơn (của cùng một loai dữ liệu)
        //cú pháp: <kiểu dữ liệu cần chuyển> tenBien = (kiểu dữ liệu cần chuyển) giá trị cần chuyển
        double so3 = 3.14;
        int so4 = (int) so3; //ép kiểu tường minh từ double sang int
        System.out.println("Giá trị của số 4: " + so4);

        //ép từ số sang chuỗi hoặc ngược lại
        int so5 = 100;
        String str5 = Integer.toString(so5); //ép từ số sang chuỗi
        String str5_1 = String.valueOf(str5); //cách khác để ép từ số sang chuỗi
        System.out.println("Giá trị của số str5: " + str5);

        String str6 = "200";
        int so6 = Integer.parseInt(str6); //ép từ chuỗi sang số
        //cú pháp: Kiểu dữ liệu cần chuyển.parseKiểu dữ liệu cần chuyển(giá trị cần chuyển)

        //đây là dòng code mới để test git
    }
}
