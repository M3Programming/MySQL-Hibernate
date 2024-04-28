package mysqlhibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.Scanner;

public class App {

	private static Scanner scanner;

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Employee.class);
		try {
			SessionFactory sf = config.buildSessionFactory();
			Session session = sf.openSession();
			
			Employee emp = new Employee();
			scanner = new Scanner(System.in);
			
			System.out.println("Please Enter Employee Name:  ");
			String empname = scanner.nextLine();
			System.out.println("Please Enter Department: ");
			String department = scanner.next();
			
			emp.setEmpName(empname);
			emp.setDept(department);
			
			session.beginTransaction();
			session.persist(emp);
			session.getTransaction().commit();
			
			
			
			
		}catch(Exception e) {
			
		}

	}

}
