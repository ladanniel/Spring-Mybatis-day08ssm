package cn.tedu.ssm.bean;

import java.io.Serializable;

public class Dept implements Serializable{
	/**
	 * ���л��汾��
	 */
	private static final long serialVersionUID = 5524696295685616451L;
	private Integer id;
	private String deptName;
	private String deptLoc;
	@Override
	public String toString() {
		return "Dept [id=" + id + ", deptName=" + deptName + ", deptLoc=" + deptLoc + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptLoc() {
		return deptLoc;
	}
	public void setDeptLoc(String deptLoc) {
		this.deptLoc = deptLoc;
	}
	
	

}
