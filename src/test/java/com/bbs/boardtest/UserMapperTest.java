package com.bbs.boardtest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bbs.mapper.UserMapper;
import com.bbs.model.UserDTO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class UserMapperTest {
	
	@Autowired
	private UserMapper userMapper;
	
//	@Test
	public void userInsertTest() {
				
		for(int i=1; i<=10; i++) {
			UserDTO dto = new UserDTO();
			dto.setUname("회원"+i);
			dto.setUtel("010-0000-0000");
			dto.setUaddress("주소"+i);
			dto.setUage(25+i);
			if(i%2==0) {
				dto.setUgender("m");
			}else {
				dto.setUgender("f");
			}
			
			userMapper.insert(dto);
		}
	}
	
	
	
}
