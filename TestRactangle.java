/**
 * 
 */
package iuh.fit.NguyenThiNgocThao;

/**
 * @author Nguyen Thi Ngoc Thao
 * @version 1.0
 */
import java.util.Scanner;

public class TestRectangle {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Nhập chiều dài: ");
	        double length = sc.nextDouble();
	        System.out.print("Nhập chiều rộng: ");
	        double width = sc.nextDouble();

	        // Tạo đối tượng Rectangle
	        try {
	            Rectangle rect = new Rectangle(length, width);
	            System.out.println("Chu vi: " + rect.getPerimeter());
	            System.out.println("Diện tích: " + rect.getArea());
	            System.out.println("Thông tin: " + rect.toString());
	        } catch (IllegalArgumentException e) {
	            System.out.println("Lỗi: " + e.getMessage());
	        }

	        sc.close();
	    }

}