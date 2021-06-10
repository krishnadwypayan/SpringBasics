package com.example.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Krishna Kota on 09/06/21
 */
@Repository
public class MyDao extends JdbcDaoSupport {

    @Autowired
    public MyDao(DataSource dataSource) {
        super.setDataSource(dataSource);
    }

    @PostConstruct
    public void doQuery() {
//        jdbcTemplate.update("insert into employee values (1, 'Krishna', 'SDE')");
        getJdbcTemplate().query("select name, department from employee", new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet rs) throws SQLException {
                String name = rs.getString("name");
                String department = rs.getString("department");
                System.out.println(String.format("Name: [%s], dept: [%s]", name, department));
            }
        });
    }
}
