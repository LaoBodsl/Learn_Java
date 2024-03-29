package mybatis.demo;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import mybatis.demo.dao.EmployeeMapper;


public class Mybatis_test {
	public SqlSessionFactory getSqlSessionFactory() throws IOException {
		String resource="mybatis-conf.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		return factory;
	}
	
	@Test
	public void test() throws IOException {
		String resource="mybatis-conf.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession openSession = factory.openSession();
		try {
			
			Employee employee = openSession.selectOne("mybatis.demo.EmployeeMapper.selectEmple", 1);
			System.out.println(employee);
//			System.out.println("ggggg");
		}
		finally {
			openSession.close();
		}
		
	}
	@Test
	public void test01() throws IOException {
		SqlSessionFactory sessionFactory = getSqlSessionFactory();
		SqlSession openSession = sessionFactory.openSession();
		try {
			EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
			List<Employee> emplByLikeName = mapper.getEmplByLikeName("%lao%");
			for (Employee employee2 : emplByLikeName) {
				System.out.println(employee2);
			}
//			Employee employee = mapper.getEmplById(1);
//			System.out.println(employee);
		} finally {
			// TODO: handle finally clause
			openSession.close();
		}
		
	}
	@Test
	public void test02() throws IOException {
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession openSession = sqlSessionFactory.openSession();
		try {
			EmployeeMapper mapper = openSession.getMapper(EmployeeMapper.class);
			Employee employee = new Employee(null,"laobo","1","gq@qq.com");
			mapper.InsertEmpl(employee);
			openSession.commit();
		} finally {
			// TODO: handle finally clause
			openSession.close();
		}
	}
}
