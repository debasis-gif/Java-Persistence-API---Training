package com.pcsglobal.JPADemo;

import javax.persistence.Entity;  
import javax.persistence.Id;

import javax.persistence.Table;

@Entity  
@Table(name = "alien") 
public class AlienJPA 
{   
	@Id
	private int aid;
	private String aname;
	private String tech;
	private String color;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	@Override
	public String toString() {
		return "aid=" + aid + ", aname=" + aname + ", tech=" + tech + ", color=" + color;
	}

}
