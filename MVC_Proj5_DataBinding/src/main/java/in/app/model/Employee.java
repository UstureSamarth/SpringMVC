package in.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	private Integer eno;
	private String ename;
	private String edesg;
	private Double salary;

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", edesg=" + edesg + ", salary=" + salary + "]";
	}

}
