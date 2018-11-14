package cn.tedu.ssm.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.tedu.ssm.bean.Dept;
import cn.tedu.ssm.service.IDeptService;

@Controller
@RequestMapping("/dept")
public class DeptController {
	@RequestMapping("/show.do")
	public String showAddDept(){
		
		return "add";
	}
	
	@Resource
	private IDeptService service;
	@RequestMapping("/add.do")
	public String addDept(String deptName,String deptLoc){
		//调用业务层方法（依赖注入）
		Dept dept = new Dept();
		//set方法封装变量
		dept.setDeptName(deptName);
		dept.setDeptLoc(deptLoc);
		service.addDept(dept);
		//响应页面
		return "index";
	}
	@RequestMapping("/showall.do")
	public String selectDept(String deptName,String deptLoc,ModelMap map){
		List<Dept>list = service.selectAll();
	   map.addAttribute("list",list);
	   for (Dept d:list) {
		System.out.println(d.toString());
	}
		System.out.println(list);
		return  "showall";
	}
	@RequestMapping("/delete.do")
	public String deleteDept(Integer id,HttpServletRequest request){
		Dept dept = new Dept();
		dept.setId(id);
		System.out.println(request.getParameter("id"));
		service.deleteDept(Integer.parseInt(request.getParameter("id")));
		return "redirect:showall.do";
	}
	
	@RequestMapping("/up.do")
	public String updateDept(String deptName,String deptLoc,Integer id,HttpServletRequest request){
		Dept dept = new Dept();
		dept.setId(id);
		dept.setDeptName(deptName);
		dept.setDeptLoc(deptLoc);
		service.updateDept(dept);
		System.out.println("id"+id);
		System.out.println(deptName);
		System.out.println(deptLoc);
		return "redirect:showall.do";
	}
	@RequestMapping("/update.do")
	public String updateData(){
		return "update";
	}
	
}
