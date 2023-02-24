package com.example.springjdbc.service.impl;

import com.example.springjdbc.entity.User;
import com.example.springjdbc.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int add(User user) {
        String sql = "insert into t_user(id,name,age)values(?,?,?)";
        Object args[] = {user.getId(),user.getName(),user.getAge()};
        return jdbcTemplate.update(sql, args);
    }

    public int delete(int id) {
        String sql = "delete from t_user where id = ?";
        Object args[] = new Object[]{id};
        return jdbcTemplate.update(sql,args);
    }

    public int update(User user) {
        String sql = "update t_user set name = ? where id = ?";
        Object args[] = new Object[]{user.getName(),user.getId()};
        return jdbcTemplate.update(sql,args);
    }

    public List<Map<String, Object>> getList() {
        List<Map<String, Object>> list=jdbcTemplate.queryForList("select * from t_user ");
        return list;
    }

}
