package com.alom.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

	
	private Integer id;
	private String name;
	private String email;
	private long phone;
	private String address;
}
