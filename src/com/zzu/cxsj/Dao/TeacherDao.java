package com.zzu.cxsj.Dao;
import java.util.List;

import com.zzu.cxsj.dbBean.*;

public class TeacherDao {
	DBTeacher teacher;

	public TeacherDao(DBTeacher teacher) {
		this.teacher = teacher;
	}
	
	public DBBook listAllBookOf(String courseid){
		return null;
	}
	
	public DBBook listBooksWith(String courseid,String classifycode){
		return null;
	}
	public void addTextBookWithISBN(String courseid,String isbn){
		
	}
	public void makeOrder(List<DBBook> booklist){
	}
	
	

}
