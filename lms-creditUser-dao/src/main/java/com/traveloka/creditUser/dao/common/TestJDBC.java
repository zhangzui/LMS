package com.traveloka.creditUser.dao.common;

import java.sql.Connection;

/**
 * Created by zhangzuizui on 2017/8/23.
 */
public class TestJDBC {
    public static void main(String[] args) {
        JdbcUtils jdbcUtils = new JdbcUtils();
        String sql = "insert into zz_user(userName,userPass,userTel) values('zzz','sasas','1212121212')";
        jdbcUtils.executeUpdate(sql,null);
    }
}
