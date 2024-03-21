package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.jdbc.core.JdbcTemplate;
@Service
public class DataService {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	 public void printTableData() {
	        String sql = "SELECT * FROM your_table_name";
	        jdbcTemplate.query(sql, (rs, rowNum) -> {
	            System.out.println("Column 1: " + rs.getString("column1_name"));
	            System.out.println("Column 2: " + rs.getString("column2_name"));
	            // Add more columns as needed
	            return null;
	        });
	    }
}
