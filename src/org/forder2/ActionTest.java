package org.forder2;

import com.opensymphony.xwork2.ActionSupport;

public class ActionTest extends ActionSupport{

	
	public String execute() {
		System.out.print("execute(*)");
		return "success";
	}
}
