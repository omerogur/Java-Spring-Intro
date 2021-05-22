package kodlamaio.homework6.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.homework6.entities.concretes.JobTitles;

public interface DepartmentDao extends JpaRepository<JobTitles, Integer> {

}
