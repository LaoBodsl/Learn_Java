package laobo.dao;

import java.util.List;

import laobo.domain.Student;

public interface StudentDao {
	List<Student> findAll();
}
