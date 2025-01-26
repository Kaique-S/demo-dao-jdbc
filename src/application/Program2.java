package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=====Test 1 , INSERT=====");
		
		Department newDepartment = new Department(null, "GAMES CAMPANY");
		departmentDao.insert(newDepartment);
		
		System.out.println("=====Test 2 , FindAll=====");
		
		
		List<Department> list = departmentDao.findAll();
		
		list = departmentDao.findAll();
		
		for(Department dep : list) {
			System.out.println(dep);
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("===== Test 3 ===== FindById ======");
		
		Department department = departmentDao.findById(7);
		System.out.println(department);
		
		System.out.println();
		System.out.println();
		System.out.println("===== Test 4 ===== Update ======");
		
		department = departmentDao.findById(7);
		department.setName("From Software");
		departmentDao.update(department);
		
		System.out.println("UPDATE COMPLETED: " + department);
		
		
		
		System.out.println();
		System.out.println();
		System.out.println("===== Test 5 ===== DELETE ======");
		
		departmentDao.deleteById(7);
	}

}
