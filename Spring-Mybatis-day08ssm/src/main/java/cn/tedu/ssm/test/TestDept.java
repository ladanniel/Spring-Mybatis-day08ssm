package cn.tedu.ssm.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.ssm.bean.Dept;
import cn.tedu.ssm.dao.DeptDao;
import cn.tedu.ssm.service.DeptService;
//测试mysql 8.0版本不适合
public class TestDept {
	@Test
	public void testInsertDept(){
		//获取Spring容器 
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("application-dao.xml");
		//获取bean对象
		DeptDao dao = ac.getBean("deptDao",DeptDao.class);
		//调用方法并给定对象
		Dept dept = new Dept();
		dept.setDeptName("第四开发部");
        dept.setDeptLoc("江苏省南京市");
		dao.insertDept(dept);
		//关闭容器
		ac.close();
	}
	@Test
	public void testDeptService(){
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("application-service.xml","application-dao.xml");//业务层调用持久层，所以配置有持久层的配置文件
		DeptService service = ac.getBean("deptService",DeptService.class);
		Dept dept = new Dept();
	    dept.setDeptName("第三研发部");
	    dept.setDeptLoc("成都");
		service.addDept(dept);
		ac.close();
	}
	@Test
	public void testSelectAll(){
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("application-service.xml","application-dao.xml");//业务层调用持久层，所以配置有持久层的配置文件
		DeptDao dao = ac.getBean("deptDao",DeptDao.class);
		List<Dept> list = dao.selectAll();
		for(Dept de:list){
			System.out.println(de.getId()+de.getDeptName()+de.getDeptLoc());
		}
		ac.close();
	}
	@Test
	public void testDeleteById(){
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("application-service.xml","application-dao.xml");//业务层调用持久层，所以配置有持久层的配置文件
		DeptDao dao = ac.getBean("deptDao",DeptDao.class);
		Dept dept = new Dept();
		dao.deleteById(15);
		ac.close();
	}
	@Test
	public void testupdateDept(){
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("application-service.xml","application-dao.xml");//业务层调用持久层，所以配置有持久层的配置文件
		DeptDao dao = ac.getBean("deptDao",DeptDao.class);
		Dept dept = new Dept();
		dept.setId(18);
		dept.setDeptName("第四研发部");
		dept.setDeptLoc("云南省昆明市");
		dao.updateDept(dept);
		System.out.println(dept);
		ac.close();
	}

}
