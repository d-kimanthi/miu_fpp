package lab8.Prob2.prob2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class EmployeeAdmin {
	
	/**
		
	Your method prepareReport should return a list of all Employees in the input table 
	whose social security number is in the input list socSecNums and whose salary is greater than $80,000. 
	In addition, this list of Employees must be sorted by social security number, in ascending order (from numerically smallest to numerically largest).
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//IMPLEMENT
        List<Employee> result = new ArrayList<>();

        for (String ssn : socSecNums) {
            Employee employee = table.get(ssn);
            if (employee != null && employee.getSalary() > 80000) {
                result.add(employee);
            }
        }

        Collections.sort(result, (e1, e2) -> e1.getSsn().compareTo(e2.getSsn()));

        return result;
		
	}
	
}
