package laobo.crud.dao;

import java.util.List;
import laobo.crud.bean.Department;
import laobo.crud.bean.DepartmentExample;
import org.apache.ibatis.annotations.Param;

public interface DepartmentMapper {
	long countByExample(DepartmentExample example);

	int deleteByExample(DepartmentExample example);

	int deleteByPrimaryKey(Integer deptId);

	int insert(Department record);

	int insertSelective(Department record);

	List<Department> selectByExample(DepartmentExample example);

	Department selectByPrimaryKey(Integer deptId);

	int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

	int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);

	int updateByPrimaryKeySelective(Department record);

	int updateByPrimaryKey(Department record);
}