package com.orange.hrmlive;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupTest {

	@BeforeGroups(groups = "admin")
	public void beforeAdminGroup() {
		System.out.println("Executing Admin Module");
	}

	@BeforeGroups(groups = "leave")
	public void beforeLeaveGroup() {

		System.out.println("Executing Leave Module");
	}

	@Test(groups = "admin")
	public void adminmodule1() {
		System.out.println("Executing adminmodule1");
	}

	@Test(groups = "admin")
	public void adminmodule2() {
		System.out.println("Executing adminmodule2");
	}

	@Test(groups = "leave")
	public void leavemodule1() {
		System.out.println("Executing leavemodule1");
	}

	@Test(groups = "leave")
	public void leavemodule2() {
		System.out.println("Executing leavemodule2");
	}

}
