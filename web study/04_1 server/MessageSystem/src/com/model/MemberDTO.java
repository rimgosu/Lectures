package com.model;

public class MemberDTO {

	private String email;
	private String pw;
	private String phone;
	private String addr;
	
	
	

	@Override
	public String toString() {
		return "MessageDTO [email=" + email + ", pw=" + pw + ", phone=" + phone + ", addr=" + addr + "]";
	}

	public MemberDTO(String email, String pw, String phone, String addr) {
		this.email = email;
		this.pw = pw;
		this.phone = phone;
		this.addr = addr;
	}
	public MemberDTO(String email, String pw) {
		super();
		this.email = email;
		this.pw = pw;
	}

	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	

	
}
