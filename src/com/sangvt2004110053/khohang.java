package com.sangvt2004110053;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class khohang {
	sanhsu headsanhsu;
	thucpham headthucpham;
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
	
	khohang(){
		
	}
	
	khohang ( sanhsu _headsanhsu, thucpham _headthucpham){
		headsanhsu = _headsanhsu;
		headthucpham = _headthucpham;
	}
	
	public void ThemHang(Scanner scanner) {
		System.out.println("Vui long chon loai hang ");
		System.out.print("1/ Sanh Su");
        System.out.print("2/ Thuc Pham");	
        System.out.print(" Lua chon:");
		int loaiHang = scanner.nextInt();
		
		}else if (loaiHang == 1) {
			sanhsu cur = headsanhsu;
			while (cur != null) {
				if (cur.next == null) {
					sanhsu itemMoi = new sanhsu();
					itemMoi.ma = NhapId(scanner, loaiHang);
					itemMoi.NhapTT(scanner);
					cur.next = itemMoi;
					break;
				}
				cur = cur.next;
			}
		}else if (loaiHang == 2) {
			thucpham cur = headthucpham;
			while (cur != null) {
				if (cur.next == null) {
					thucpham itemMoi = new thucpham();
					itemMoi.ma = NhapId(scanner, loaiHang);
					itemMoi.NhapTT(scanner);
					cur.next = itemMoi;
					break;
				}
				cur = cur.next;
			}
		}
	}
	
	
	
	int NhapId(Scanner scanner, int loaiHang) {
		
		System.out.print("Hay nhap ID hang: ");
		int id = scanner.nextInt();
		
		if (loaihang == 1) {
			sanhsu cur = headsanhsu;
			while (cur != null) {
				if (cur.ma == id) {
					System.out.print("Id nay da co mat trong kho");
					return NhapId(scanner, loaihang);
				}
				cur = cur.next;
			}
		}
		
		if (loaihang == 2) {
			thucpham cur = headthucpham;
			while (cur != null) {
				if (cur.ma == id) {
					System.out.print("Id nay da co mat trong kho");
					return NhapId(scanner, loaihang);
				}
				cur = cur.next;
			}
		}
		return id;
	}
	
	public void InTT(){
		sanhsu curss = headsanhsu;
		phucpham curtp = headthucpham;
		
		while (curss != null) {
			curss.inTT();
			curss = curss.next;
		}
		
		System.out.println();
		
		while (curtp != null) {
			curtp.inTT();
			curtp = curtp.next;
		}
		
	}
	
	public void XoaHang(Scanner scanner) {
		System.out.println("Muon xoa loai hang nao theo cach nao");
		System.out.print("1/ theo id");
        System.out.print("2/ theo ten");	
        System.out.print(" Lua chon:");
		int cachxoa = scanner.nextInt();
		
		if (cachxoa == 1) {
			System.out.print("Hay nhap Id can xoa: ");
			int idCanXoa = scanner.nextInt();
			
			if (headsanhsu.ma == idCanXoa) {
				headsanhsu = headsanhsu.next;
				return;
			}
			
			if (headthucpham.ma == idCanXoa) {
				headthucpham = headthucpham.next;
				return;
			}
			
			sanhsu curss = headsanhsu;
			thucpham curtp = headthucpham;
			
			while (curss.next != null) {
				if (curss.next.ma == idCanXoa) {
					curss.next = curss.next.next;
					return;
				}
				curss = curss.next;
			}
			
			while (curtp != null) {
				if (curtp.next.ma == idCanXoa) {
					curtp.next = curtp.next.next;
					return;
				}
				curtp = curtp.next;
			}
			System.out.println("Xoa thanh cong");
		}
		
		if (cachxoa == 2) {
			System.out.print("Hay nhap ten can xoa: ");
			scanner.nextLine();
			String idCanXoa = scanner.nextLine();
			
			if (headsanhsu.ten.equalsIgnoreCase(idCanXoa)) {
				headsanhsu = headsanhsu.next;
				return;
			}
			
			if (headthucpham.ten.equalsIgnoreCase(idCanXoa)) {
				headthucpham = headthucpham.next;
				return;
			}
			
			sanhsu curss = headsanhsu;
			thucpham curtp = headthucpham;
			
			while (curss.next != null) {
				if (curss.next.ten.equalsIgnoreCase(idCanXoa)) {
					curss.next = curss.next.next;
					return;
				}
				curss = curss.next;
			}
			
			while (curtp != null) {
				if (curtp.next.ten.equalsIgnoreCase(idCanXoa)) {
					curtp.next = curTtp.next.next;
					return;
				}
				curtp = curtp.next;
			}
			System.out.println("Xoa Thanh Cong");
		}

		if (cachxoa == 3) {
			
		}
		
	}
	
	public void TimHang(Scanner scanner) {
		System.out.println("Muon tim  theo cach nao");
		System.out.print("1/ theo loai");
        System.out.print("2/ theo gia");
        System.out.print("2/ theo ngay nhap hang ");	
        System.out.print(" Lua chon:");
		
		int cachtim = scanner.nextInt();
		
		
		if (cachtim == 1) {
			System.out.println("Vui long chon loai hang muon tim\n  ");
        System.out.print("1/ Sanh Su");	
        System.out.print("2/ Thuc Pham");
        System.out.print(" Lua chon:");
			int loai = scanner.nextInt();
			
			}else if (loai == 1) {
				SanhSu cur = headSanhSu;
				while (cur != null) {
					cur.inTT();
					cur = cur.next;
				}
			}else if (loai == 2) {
				thucpham cur = headthucpham;
				while (cur != null) {
					cur.inTT();
					cur = cur.next;
				}
			}
			
			
		}else if (cachtim == 2) {
			System.out.print("Hay nhap  gia cua hang hoa ban muon tim\n Tu: ");
			float start = scanner.nextFloat();
			System.out.print("Den: ");
			float end = scanner.nextFloat();
			
			sanhsu curss = headsanhsu;
			thucpham curtp = headthucpham;
			
			
			while (curss != null) {
				if (curss.gia >= start && curss.gia <= end)
					curss.inTT();
				curss = curss.next;
			}
			System.out.println();
			
			while (curtp!= null) {
				if (curtp.gia >= start && curtp.gia <= end)
					curtp.inTT();
				curtp = curtp.next;
			}
			
		}
        else if (cachtim == 3) {
			System.out.println("Hay nhap khoang ngay nhap muon tim (dd-mm-yyyy)\n Từ : ");
			String date = scanner.nextLine();
			Date startDate;
			try {
				startDate = dateFormat.parse(date);
			} catch (ParseException e) {
				System.err.println("Nhap sai vui long nhap lai");
				return;
			}
        }
	
	public void ThongKe(Scanner scanner) {
		int tongSLHang = 0;
		int tongSLsanhsu = 0;
		int tongSLthucpham = 0;
		
		float tongGiaTri = 0;
		float tongGiaTrisanhsu = 0;
		float tongGiaTrithucpham = 0;
		
		sanhsu curss = headsanhsu;
		thucpham curtp = headthucpham;
		
		while (curss != null) {
			tongSLsanhsu++;
			tongGiaTrisanhsu += curss.gia;
			curss = curss.next;
		}
		
		while (curtp != null) {
			tongSLthucpham++;
			tongGiaTrithucpham += curtp.gia;
			curtp = curtp.next;
		}
		
		tongSLHang = tongSLsanhsu + tongSLthucpham;
		tongGiaTri = tongGiaTrisanhsu + tongGiaTrithucpham;
		
		System.out.println("Tong so luong hang hoa trong kho: " + tongSLHang + " san pham");
		System.out.println("Tong giá tien nhap kho: " + tongGiaTri + "dong\n");
		
		System.out.println("Sanh su : " + tongSLSanhSu + " san pham");
		System.out.println("Thuc pham : " + tongSLThucPham + " san pham");
