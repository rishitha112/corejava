package com.tnsif.constructor;

public class Customer {
	private  String cname;
	private int cid;
	private String caddress;
	//default constructor//
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String cname, int cid, String caddress) {
		
		this.cname = cname;
		this.cid = cid;
		this.caddress = caddress;
	}
	
	// getters and setters//
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	@Override
	public String toString() {
		return "Customer [cname=" + cname + ", cid=" + cid + ", caddress=" + caddress + "]";
	}
	

	

}
