package cn.tedu.ssm.service;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import cn.tedu.ssm.bean.Dept;
import cn.tedu.ssm.dao.DeptDao;
   @Service
   public class DeptService implements IDeptService{
	    @Resource
	    private DeptDao dao;
	    public void addDept(Dept dept) {
	    	dao.insertDept(dept);
	}
		
		public void deleteDept(Integer id) {
		   dao.deleteById(id);
		}
		public void selectById(Integer id) {
			dao.selectById(id);
			
		}
		public List<Dept> selectAll() {
			return dao.selectAll();
		}

		public void updateDept(Dept dept) {
			dao.updateDept(dept);
			
		}

		

}
