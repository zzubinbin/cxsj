package com.zzu.cxsj.dbBean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.alibaba.fastjson.JSONObject;

@Entity
@Table(name = "book")
public class DBBook {
	@Id
	public String isbn;
	@Column
	public String name;
	@Column
	public Float price;
	@Column
	public JSONObject pic_path;
	@Column
	public String describe;
	@Column
	public String classifycode;
	
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public JSONObject getPic_path() {
		return pic_path;
	}
	public void setPic_path(JSONObject pic_path) {
		this.pic_path = pic_path;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public String getClassifycode() {
		return classifycode;
	}
	public void setClassifycode(String classifycode) {
		this.classifycode = classifycode;
	}
		

}
