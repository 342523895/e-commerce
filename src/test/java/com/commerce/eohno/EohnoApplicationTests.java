package com.commerce.eohno;

import com.commerce.eohno.mapper.UserMapper;
import com.commerce.eohno.pojo.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EohnoApplicationTests {

	@Autowired
	UserMapper userMapper;
	@Test
	public void contextLoads() {

		PageHelper.startPage(1,10);
		List<User> list = userMapper.selectAll();
		PageInfo pageInfo = new PageInfo(list);
		System.out.println();
	}

}
