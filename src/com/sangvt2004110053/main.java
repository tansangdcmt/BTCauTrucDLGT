package com.sangvt2004110053;

import java.util.Date;
import java.util.Scanner;

public class main {

	static Scanner bienNhap = new Scanner(System.in);
	public static khohang kho = new khohang();
	
 public static void main(String[] args) {
        
    } {
		
		Date a = new Date();
		
		sanhsu headss = new sanhsu(1, "1", 1, a);
		thucpham headtp = new thucpham(2, "2", 2, a);
		    
		sanhsu ss1 = new sanhsu(3, "3", 3, a);
		headss.next = ss1;
		thucpham tp1 = new thucpham(4, "4", 4, a);
		headtp.next = tp1;
		
		sanhsu ss2 = new sanhsu(5, "5", 5, a);
		ss1.next = ss2;
		thucpham tp2 = new thucpham(6, "6", 6, a);
		tp1.next = tp2;
		
		kho.headsanhsu = headss;
		kho.headthucpham = headtp;
		
		
		while (true){
        	System.out.println();
    		System.out.println("____________MENU____________");
            System.out.println("1)  Them san pham		");
            System.out.println("2)  In thong tin san pham	");
            System.out.println("3)  Xoa san pham    ");
            System.out.println("4)  Tim hang hoa   		");
            System.out.println("5)  Thong ke hang hoa    ");
            System.out.println("6)  Thoat  ");
            System.out.print("Vui long chon chuong trinh: ");
            int key = bienNhap.nextInt();
            
            switch(key){
        	case 1:	ThemHang(kho);break;
        	case 2:	InThongTin(kho);break;
        	case 3:	XoaHang(kho);break;
        	case 4:	TimHang(kho);break;
        	case 5:	ThongKeHangHoa(kho);break;
        	default: break;
        	}
		}
	}
	
	public static void ThemHang(khohang kho) {
		kho.ThemHang(bienNhap);
	}
	
	public static void InThongTin(khohang kho){
		kho.InTT();
	}
	
	public static void XoaHang(khohang kho) {
		kho.XoaHang(bienNhap);
	}
	
	public static void TimHang(khohang kho) {
		kho.TimHang(bienNhap);
	}
	
	public static void ThongKeKho(khohang kho) {
		kho.ThongKe(bienNhap);
	}
}
