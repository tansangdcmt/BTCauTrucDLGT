package com.sangvt2004110053;

import java.util.Date;
import java.util.Scanner;

public class menu {

	static Scanner bienNhap = new Scanner(System.in);
	public static khohanghoa khohang = new khohanghoa();
	
 
	public static void main(String[] args) {
        }
		{
		
			
			
			while (true){
				System.out.println();
				System.out.println("--------------------MENU-----------------");
				System.out.println("1>>            Them san pham		     ");
				System.out.println("2>>         In thong tin san pham	     ");
				System.out.println("3>>             Xoa san pham             ");
				System.out.println("4>>             Tim san pham   		     ");
				System.out.println("5>>           Thong ke san pham          ");
				System.out.println("6>>              Thoat MENU              ");
				System.out.print("Vui long chon yeu cau: ");
				int key = bienNhap.nextInt();
				
				switch(key){
				case 1:	ThemSanPham(khohang);break;
				case 2:	InThongTin(khohang);break;
				case 3:	XoaHang(khohang);break;
				case 4:	TimHang(khohang);break;
				case 5:	ThongKeKho(khohang);break;
				default: break;
				}
			}
		}
		
		public static void ThemSanPham(khohanghoa khohanghoa) {
			khohanghoa.ThemSanPham(bienNhap);
		}
		
		public static void InThongTin(khohanghoa khohanghoa){
			khohanghoa.inThongTin();
		}
		
		public static void XoaHang(khohanghoa khohanghoa) {
			khohanghoa.XoaHang(bienNhap);
		}
		
		public static void TimHang(khohanghoa khohanghoa) {
			khohanghoa.TimHang(bienNhap);
		}
		
		public static void ThongKeKho(khohanghoa khohanghoa) {
			khohanghoa.ThongKeKho(bienNhap);
		
    } 
}
