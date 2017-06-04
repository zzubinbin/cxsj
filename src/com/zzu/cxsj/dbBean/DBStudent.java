package com.zzu.cxsj.dbBean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stu")
public class DBStudent {
	@Id
	private String id;
	@Column
	private String name;
	@Column
	private String password;
	@Column
	private String yuanxi;
	@Column
	private String zhuanye;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	
	public String getZhuanye() {
		return zhuanye;
	}
	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}
	

}
