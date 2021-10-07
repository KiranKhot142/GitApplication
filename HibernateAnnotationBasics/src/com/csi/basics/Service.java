package com.csi.basics;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Service {
	private static SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();

	public static void main(String[] args) {

	}

	static void saveData() {

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Employee employee = new Employee();
		employee.setEmpId(1234);
		employee.setEmpName("Mansi");
		employee.setEmpSalary(576878.20);

		session.save(employee);
		transaction.commit();
	}

	static void updateData() {

	}

	static void deleteData() {

	}

	static void getData() {

	}

}
