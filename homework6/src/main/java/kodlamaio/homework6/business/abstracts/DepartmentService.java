package kodlamaio.homework6.business.abstracts;

import java.util.List;

import kodlamaio.homework6.entities.concretes.JobTitles;

public interface DepartmentService {

	List<JobTitles> getAll();
}
