package lao.jdbc;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class jdbcdemo {
	@Resource(name="jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	@Test
	public void demo1() {
		jdbcTemplate.update("insert into account values (1,?,?)", "laobo",1000);
	}
	
}
