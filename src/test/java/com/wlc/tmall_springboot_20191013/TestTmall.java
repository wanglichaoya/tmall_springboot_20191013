package com.wlc.tmall_springboot_20191013;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestTmall {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tmall_springboot?useUnicode=true&characterEncoding=utf8",
                    "root", "123456");
            Statement s = connection.createStatement();
            for (int i = 0; i <= 10; i++) {
                String sqlFormat = "insert into category values (null, '测试分类%d')";
                String sql = String.format(sqlFormat, i);
                s.execute(sql);

            }
            System.out.println("已经成功创建10条分类测试数据");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
