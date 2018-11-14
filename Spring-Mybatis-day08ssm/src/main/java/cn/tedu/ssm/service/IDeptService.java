package cn.tedu.ssm.service;

import java.util.List;

import cn.tedu.ssm.bean.Dept;

public interface IDeptService {
	public void addDept(Dept dept);
	public void updateDept(Dept dept);
	public void deleteDept(Integer id);
	public void selectById(Integer id);
	public List<Dept> selectAll();
	

}
