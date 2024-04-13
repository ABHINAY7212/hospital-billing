package com.real.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Hsplentity {
	
	
   @Id
   private int pid;
   private String pname;
   private int bill;
   private int apaid;
   private int due;
   
   
   
public Hsplentity() {
	super();
	// TODO Auto-generated constructor stub
}
public Hsplentity(int pid, String pname, int bill, int apaid, int due) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.bill = bill;
	this.apaid = apaid;
	this.due = due;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getBill() {
	return bill;
}
public void setBill(int bill) {
	this.bill = bill;
}
public int getApaid() {
	return apaid;
}
public void setApaid(int apaid) {
	this.apaid = apaid;
}
public int getDue() {
	return due;
}
public void setDue(int due) {
	this.due = due;
}



}
