package com.example.communitysystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class HomeInfo {

	//主页的标题
	private String title;
	//主页的地址
	private String href;

}
