package com.zzu.cxsj.dbBean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "m_xuanshu")
public class DBXuanshu {
	@Id
	public int xuanshuid;
	@Column
	public int teacherid;
	@Column
	public int courseid;
	@Column
	public String bookisbns;
	public int getXuanshuid() {
		return xuanshuid;
	}
	public void setXuanshuid(int xuanshuid) {
		this.xuanshuid = xuanshuid;
	}
	public int getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(int teacherid) {
		this.teacherid = teacherid;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getBookisbns() {
		return bookisbns;
	}
	public void setBookisbns(String bookisbns) {
		this.bookisbns = bookisbns;
	}
	
	
}
