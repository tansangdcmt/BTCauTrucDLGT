package com.sangvt2004110053;

import java.util.Date;
import java.util.Scanner;

import javax.swing.text.MaskFormatter;

public class sanhsu {
	int maSanPham;
	String tenSanPham;
	float giaSanPham;
	Date ngayNhapKho;
	
    sanhsu next;
	
	sanhsu(){
		
	}
	
	sanhsu(int _id, String _ten, float _gia, Date _ngayNhapKho){
		maSanPham = _id;
		tenSanPham = _ten;
		giaSanPham = _gia;
		ngayNhapKho = _ngayNhapKho;
	}
	
	public void NhapTT(Scanner scanner) {
		
		scanner.nextLine();
		System.out.print("Nhap ten san pham: ");
		tenSanPham = scanner.nextLine();
		
		System.out.print("Hay nhap gia tri san pham: ");
		giaSanPham = scanner.nextFloat();
		
		ngayNhapKho = new Date();
	}
	
	public void inTT() {
		System.out.println("Ten : " +tenSanPham+ ", Loai : sanh su, Id: " +maSanPham+ ", Gia: " +giaSanPham+ ", Ngay nhap: "+ngayNhapKho);
	}
	
	public String GetName() {
		System.out.println(tenSanPham);
		return tenSanPham;
	}

}