package kodlamaio.homework6.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.homework6.business.abstracts.DepartmentService;
import kodlamaio.homework6.dataAccess.abstracts.DepartmentDao;
import kodlamaio.homework6.entities.concretes.JobTitles;
@Service
public class DepartmentManager implements DepartmentService {

	private DepartmentDao departmentDao;
	@Autowired
	public DepartmentManager(DepartmentDao departmentDao) {
		super();
		this.departmentDao = departmentDao;
	}
	
	@Override
	public List<JobTitles> getAll() {
		return this.departmentDao.findAll();
	}

	

}
