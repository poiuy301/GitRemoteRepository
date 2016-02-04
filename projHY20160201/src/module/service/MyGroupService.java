package module.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import module.dao._17_Group_UserDAO;
import module.model._16_Group_RecordVO;
import module.model._17_Group_UserVO;
import module.util.HibernateUtil;

public class MyGroupService {
	 _17_Group_UserDAO aaa=new _17_Group_UserDAO();
	
	 //查詢會員所參加的團購	
	 public List<_17_Group_UserVO> selectByGroupUserId(Integer id){
		 List<_17_Group_UserVO> beans = aaa.findByGroupUserId(id);
		 return beans;
	 }
	
	
	 
	 
	 
	
	public static void main(String[] args) {
		System.out.println("111111");
		
	}

}
