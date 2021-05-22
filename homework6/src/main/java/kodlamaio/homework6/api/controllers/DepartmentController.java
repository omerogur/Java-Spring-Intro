package kodlamaio.homework6.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.homework6.business.abstracts.DepartmentService;
import kodlamaio.homework6.entities.concretes.JobTitles;

@RestController
@RequestMapping("/api/jobtitles")
public class DepartmentController {

	private DepartmentService departmentService;

	@Autowired
	public DepartmentController(DepartmentService departmentService) {
		super();
		this.departmentService = departmentService;
	}

	@GetMapping("/getall")
	public List<JobTitles> getAll() {

		return this.departmentService.getAll();
	}
}
