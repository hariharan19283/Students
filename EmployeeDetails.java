class EmployeeDetails {  
int emp_id, salary;  
String name, address, department, email;  
public int getEmp_id() {  
    return emp_id;  
}  
public void setEmp_id(int emp_id) {  
    this.emp_id = emp_id;  
}  
public int getSalary() {  
    return salary;  
}  
public void setSalary(int salary) {  
    this.salary = salary;  
}  
public String getName() {  
    return name;  
}  
public void setName(String name) {  
    this.name = name;  
}  
@Override  
public String toString() {  
    return "Employee [emp_id = " + emp_id + ", salary = " + salary + ", name = " + name + "]";  
    }  
      
}  
public class Employee{  
    public static void main(String args[]) {  
        EmployeeDetails emp = new EmployeeDetails();  
        emp.setEmp_id(101);  
        emp.setName("Emma Watson");  
        emp.setSalary(15000);    
          
        System.out.println(emp);  
          
        int sal = emp.getSalary();  
        int increment = 0;  
        if ((sal >=1000) && (sal <=1500))  
        {  
            increment += (sal * 2)/100;  
            sal = sal+increment;  
              
            emp.setSalary(sal);  
            System.out.println("\n Salary is incremented \n");  
            System.out.println(emp);  
              
        }else if ((sal >=1500) && (sal <=20000)){  
            increment += (sal * 5)/100;  
            sal = sal+increment;  
              
            emp.setSalary(sal);  
            System.out.println("\n Salary is incremented \n");  
            System.out.println(emp);  
        }else {  
            System.out.println("\n Salary is not incremented \n");  
            System.out.println(emp);  
        }         
    }  
} 
