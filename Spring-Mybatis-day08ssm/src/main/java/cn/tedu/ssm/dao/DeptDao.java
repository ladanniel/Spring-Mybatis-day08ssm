package cn.tedu.ssm.dao;

import java.util.List;
import cn.tedu.ssm.bean.Dept;
public interface DeptDao {
	public void insertDept(Dept dept);
	public void updateDept(Dept dept);
	public void selectById(Integer id);
	public void deleteById(Integer id);
	public List<Dept> selectAll();

}
