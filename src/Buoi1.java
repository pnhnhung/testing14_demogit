import java.util.Scanner;
public class Buoi1 {

    //comment code: ctrl + /
    //main + tab/enter: tạo hàm main nhanh
    //snippet code: gõ code nhanh
    public static void main(String[] args) {
        //1. lệnh xuất dữ liệu / in dữ liệu dưới terminal
        //print: in dữ liệu trên cùng  một dòng
        //println: in dữ liệu trên một dòng, sau đó xuống dòng mới
//            System.out.print("Hello World");
//            System.out.print("Helo nè");
        System.out.println("Hello World");
        System.out.println("Helo nè");
        //sout + tab/enter: tạo lệnh System.out.println nhanh


        //2. biến: là một khu vực vùng nhớ để lưu trữ dữ liệu
        //cú pháp: <kiểu dữ liệu> <tên biến> = <giá trị>
        //chuỗi: String
        //số: int (số nguyên), float/double (số thập phân),
        //float: 7,8 số sau dấu phẩy, double: 15-16 số sau dấu phẩy
        //boolean: true/false


        // tạo ra biến tên là họ tên
//        String name = "Mason Nguyễn";
//        String diaChi = "Hà Nội";
//        int tuoi = 27;
//        System.out.println(name);
//        System.out.println(diaChi);
//        System.out.println(tuoi);
//
//        Boolean isStudent = true;
//        Boolean isLogin = false;
//        System.out.println("Họ và tên: " + name);
//
//        //3. scanner: dùng để nhận dữ liệu từ người dùng
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Vui lòng nhập họ và tên: ");
////      name = sc.nextLine();
//        String fullName = sc.nextLine(); //nhận dữ liệu dạng chuỗi
//        System.out.println("Họ và tên: " + fullName);
//        //ví dụ: nhập và in thông tin học sinh bao gồm họ tên, tuổi, trường, lớp
//
//        //họ tên học sinh
//        System.out.println("Nhập họ và tên: ");
//        String studentName = sc.nextLine();
//        //tuổi học sinh
//        System.out.println("Nhập tuổi: ");
//        int studentAge = sc.nextInt();
//        sc.nextLine(); //xóa dòng
//        //trường học sinh
//        System.out.println("Trường: ");
//        String studentSchool = sc.next();
//        //lớp học sinh
//        System.out.println("Lớp: ");
//        String studentClass =sc.next();
//
//        System.out.println("Họ và tên: " + studentName);
//        System.out.println("Tuổi: " + studentAge);
//        System.out.println("Trường: " + studentSchool);
//        System.out.println("Lớp: " + studentClass);
//        //họ tên: hoTen, tuổi: age, ....
//        System.out.println("Họ tên học sinh: " + studentName + ", Tuổi: " + studentAge + ", Trường: " + studentSchool + ", Lớp: " + studentClass);
        //4. toán tử
        //4. toán tử số học + - * /
        int soA = 5;
        int soB = 10;
        int tinhTong = soA + soB;
        int tinhHieu = soB - soA;
        int tinhTich = soA * soB;
        int tinhThuong = soA / soB;
        //%: chia lấy dư
        int tinhDu = soA % soB;
        System.out.println("Tổng: " + tinhTong + ", Hiệu: " + tinhHieu);
        //4.2 toán tử so sánh
        //so sánh ==
        Boolean kq1 = soA == soB; // true hoặc false
        System.out.println("kq1:" + kq1);
        //so sanh khác !=
        Boolean kq2 = soA != soB; //true
        System.out.println("kq2:" + kq2);

        //so sánh lớn hơn, bé hơn, lớn hơn bằng, bé hơn bằng
        Boolean kq3 = soA > soB; // <
        Boolean kq4 = soA >= soB; // <=
        System.out.println("kq3:" + kq3 + ", kq4: " + kq4);

        String a = "Hello";
        System.out.println(System.identityHashCode(a)); // tìm tới vị trí trên string pool
        String b = "Hello";
        System.out.println(System.identityHashCode(b));
        String c = new String("Hello");
        System.out.println(System.identityHashCode(c));
        //để so sánh được string ==: ko sử dụng, equal: giá trị nội dung
        Boolean kq5 = a == b; //true
        Boolean kq6 = b.equals(c); //?? false
        Boolean kq7 = b == c; // false
        System.out.println("kq6:" + kq6);
    }

}
