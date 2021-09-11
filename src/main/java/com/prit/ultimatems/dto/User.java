package com.prit.ultimatems.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class User {

	private Long id;
	private String name;
	private String address;
	private int age;
	private String emailId;
	private String contactNumber;
}
