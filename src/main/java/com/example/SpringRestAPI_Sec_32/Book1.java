package com.example.SpringRestAPI_Sec_32;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Book1 {
	
	@Id
	private int bno;
	private String bname;
	private int bpages;
	private int bprice;
	public int getBno() {
		return bno;
	}
	
	
	
	



	public Book1() {
		super();
		// TODO Auto-generated constructor stub
	}







	public Book1(int bno, String bname, int bpages, int bprice) {
		super();
		this.bno = bno;
		this.bname = bname;
		this.bpages = bpages;
		this.bprice = bprice;
	}






	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getBpages() {
		return bpages;
	}
	public void setBpages(int bpages) {
		this.bpages = bpages;
	}
	public int getBprice() {
		return bprice;
	}
	public void setBprice(int bprice) {
		this.bprice = bprice;
	}
	@Override
	public String toString() {
		return "Book1 [bno=" + bno + ", bname=" + bname + ", bpages=" + bpages + ", bprice=" + bprice + "]";
	}
	
	

}
