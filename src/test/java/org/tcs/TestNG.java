package org.tcs;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {

		@Test 
		private void single() {
		System.out.println("11");
		}
		@Test
		private void Single1() {
		System.out.println("44");

		}
		@Test(priority=-1)
		private void single3() {
		System.out.println("354");
		}

	}
