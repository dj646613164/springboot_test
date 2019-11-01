package com.emotte.springboot_test.mapper;
import org.springframework.stereotype.Repository;
import com.emotte.springboot_test.entity.User;
import java.util.List;
import java.util.Map;

@Repository
public interface UserMapper {
	 List<User> getAll();
	 User getUserById(long id);
	 int save(Map<String, Object> map);
	 int update(Map<String, Object> map);
	 int delete(long id);
}
