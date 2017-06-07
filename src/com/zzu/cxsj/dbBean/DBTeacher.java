package com.zzu.cxsj.dbBean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "m_teacher")
public class DBTeacher {
	@Id
	private int userid;
	@Column
	private String name;
	@Column
	private String password;
	@Column
	private String yuanxi;
	@Column
	private Float yue;
	@Column
	private int courceids;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getYuanxi() {
		return yuanxi;
	}
	public void setYuanxi(String yuanxi) {
		this.yuanxi = yuanxi;
	}
	public Float getYue() {
		return yue;
	}
	public void setYue(Float yue) {
		this.yue = yue;
	}
	public int getCourceids() {
		return courceids;
	}
	public void setCourceids(int courceids) {
		this.courceids = courceids;
	}
	
}
