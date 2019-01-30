package dao;

import java.util.List;

import domain.EmployeeDTO;

public class EmployeeDAOImpl implements EmployeeDAO{

	private static EmployeeDAOImpl instance = new EmployeeDAOImpl();
	private EmployeeDAOImpl() {dao = EmployeeDAOImpl.getInstance();}
	public static EmployeeDAOImpl getInstance() {return instance;}
	EmployeeDAOImpl dao;
	
	@Override
	public void insertEmployee(EmployeeDTO emp) {
		dao.insertEmployee(emp);
		
	}

	@Override
	public List<EmployeeDTO> selectEmployeeList() {

		return dao.selectEmployeeList();
	}

	@Override
	public List<EmployeeDTO> selectEmployeesByName(String SearchWord) {
		return dao.selectEmployeesByName(SearchWord);
	}

	@Override
	public EmployeeDTO selectEmployee(String SearchWord) {
		return dao.selectEmployee(SearchWord);
	}

	@Override
	public int countEmployees() {
		return dao.countEmployees();
	}

	@Override
	public void updateEmployee(EmployeeDTO emp) {
		
	}

	@Override
	public void deleteEmployee(EmployeeDTO emp) {
		
	}

}
