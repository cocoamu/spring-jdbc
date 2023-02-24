package com.example.springjdbc.service;

import com.example.springjdbc.entity.User;

import java.util.List;
import java.util.Map;

public interface IUserService {

    /**
     * 获取用户列表
     * @return
     */
    List<Map<String, Object>> getList();

    /**
     * 新增用户
     * @param user
     * @return
     */
    int add(User user);

    /**
     * 删除某个用户
     * @param id
     * @return
     */
    int delete(int id);

    /**
     * 更新某个用户
     * @param user
     * @return
     */
    int update(User user);
}
