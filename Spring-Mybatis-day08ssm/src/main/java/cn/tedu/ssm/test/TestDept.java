package cn.tedu.ssm.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.ssm.bean.Dept;
import cn.tedu.ssm.dao.DeptDao;
import cn.tedu.ssm.service.DeptService;
//����mysql 8.0�汾���ʺ�
public class TestDept {
	@Test
	public void testInsertDept(){
		//��ȡSpring���� 
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("application-dao.xml");
		//��ȡbean����
		DeptDao dao = ac.getBean("deptDao",DeptDao.class);
		//���÷�������������
		Dept dept = new Dept();
		dept.setDeptName("���Ŀ�����");
        dept.setDeptLoc("����ʡ�Ͼ���");
		dao.insertDept(dept);
		//�ر�����
		ac.close();
	}
	@Test
	public void testDeptService(){
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("application-service.xml","application-dao.xml");//ҵ�����ó־ò㣬���������г־ò�������ļ�
		DeptService service = ac.getBean("deptService",DeptService.class);
		Dept dept = new Dept();
	    dept.setDeptName("�����з���");
	    dept.setDeptLoc("�ɶ�");
		service.addDept(dept);
		ac.close();
	}
	@Test
	public void testSelectAll(){
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("application-service.xml","application-dao.xml");//ҵ�����ó־ò㣬���������г־ò�������ļ�
		DeptDao dao = ac.getBean("deptDao",DeptDao.class);
		List<Dept> list = dao.selectAll();
		for(Dept de:list){
			System.out.println(de.getId()+de.getDeptName()+de.getDeptLoc());
		}
		ac.close();
	}
	@Test
	public void testDeleteById(){
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("application-service.xml","application-dao.xml");//ҵ�����ó־ò㣬���������г־ò�������ļ�
		DeptDao dao = ac.getBean("deptDao",DeptDao.class);
		Dept dept = new Dept();
		dao.deleteById(15);
		ac.close();
	}
	@Test
	public void testupdateDept(){
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("application-service.xml","application-dao.xml");//ҵ�����ó־ò㣬���������г־ò�������ļ�
		DeptDao dao = ac.getBean("deptDao",DeptDao.class);
		Dept dept = new Dept();
		dept.setId(18);
		dept.setDeptName("�����з���");
		dept.setDeptLoc("����ʡ������");
		dao.updateDept(dept);
		System.out.println(dept);
		ac.close();
	}

}
