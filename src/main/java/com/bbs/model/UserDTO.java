package com.bbs.model;

import java.sql.Timestamp;

import lombok.Data;

@Data // Data = getter + setter + toString
public class UserDTO {

	private Long uno;
	private String uname;
	private String utel;
	private String uaddress;
	private int uage;
	private String ugender;
	private Timestamp uregdate;

}
