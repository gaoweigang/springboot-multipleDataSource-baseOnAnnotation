package com.gwg.shiro.web.service;

import com.alibaba.fastjson.JSON;
import com.gwg.shiro.web.Application;
import com.gwg.shiro.web.exception.BusinessException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * debug mapper
 * @author Administrator
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class RoleServiceTest {

    private static final Logger logger = LoggerFactory.getLogger(RoleServiceTest.class);

    @Autowired
    private RoleService roleService;


    @Test
    public void testAddRole() throws BusinessException {

        RoleDto dto = new RoleDto();
        dto.setRoleCode("test");
        dto.setRoleName("测试");
        dto.setRemark("测试");
        boolean flag = roleService.addRole(dto);
        logger.info("添加角色，参数：{}, 结果：{}", JSON.toJSON(dto), JSON.toJSON(flag));

    }

    @Test
    public void testQueryRoleById() throws BusinessException{
        RoleDto dto = new RoleDto();
        dto.setId(1L);
        Role role = roleService.queryRoleById(dto);
        logger.info("根据id查询，参数：{}, 结果：{}", JSON.toJSON(dto), JSON.toJSON(role));


    }




}
