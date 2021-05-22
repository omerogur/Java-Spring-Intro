package kodlamaio.homework6.entities.concretes;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="departments")

public class JobTitles {
	@Id
	@GeneratedValue
	@Column(name="department_id")
	private int id;
	@Column(name="department_name")
	private String departmentName;
	 

}
