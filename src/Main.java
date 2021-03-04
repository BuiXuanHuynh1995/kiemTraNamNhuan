import java.util.Scanner;

public class Main {

//    public static void check(int year){
//        boolean flag = true;
//        if (year%100==0){
//            if (year%400==0){
//                flag = true;
//            }else {
//                flag = false;
//            }
//        }else if (year%4==0){
//            flag=true;
//        }else {
//            flag=false;
//        }
//
//        if (flag){
//            System.out.println(year+" la nam nhuan");
//        }else {
//            System.out.println(year+ " khong la nham nhuan");
//        }
//    }
//
    public static void check(int year){
        if (year%100==0){
            if (year%400==0){
                System.out.println(year+ " la nam nhuan");
            }else {
                System.out.println(year+" khong la nam nhuan");
            }
        }else if (year%4==0){
            System.out.println(year+ " la nam nhuan");
        }else {
            System.out.println(year+ " khong la nam nhuan");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap nam: ");
        int year = scanner.nextInt();
        check(year);
    }
}
