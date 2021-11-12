package com.testcases;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;



import com.testbase.Base;

public class TestMonefy extends Base {

	@Test(priority = 1, groups = { "Home" })
	public void pieChart() {
		
		boolean pie = driver.findElement(By.id("com.monefy.app.lite:id/piegraph")).isDisplayed();
		Assert.assertEquals(pie, true);
	}
	

	@Test(priority = 2, groups = { "Home" })
	public void income() {
		
		String income= driver.findElement(By.id("com.monefy.app.lite:id/income_amount_text")).getText();
		Assert.assertEquals(income, "£0.00");
		System.out.println("Income is "+income);
	}
	
	@Test(priority = 3, groups = { "Home" })
	public void expense() {
		
		String expense= driver.findElement(By.id("com.monefy.app.lite:id/expense_amount_text")).getText();
		Assert.assertEquals(expense, "£0.00");
		System.out.println("Expense is "+expense);
		
	}
	
	@Test(priority = 4, groups = { "Home" })
	public void expenseButton() throws InterruptedException {
		
		String expense= driver.findElement(By.id("com.monefy.app.lite:id/expense_button_title")).getText();
		Assert.assertEquals(expense, "EXPENSE");
		System.out.println("Button text is "+expense);
		driver.findElement(By.id("com.monefy.app.lite:id/expense_button_title")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.monefy.app.lite:id/buttonKeyboard3")).click();
		driver.findElement(By.id("com.monefy.app.lite:id/keyboard_action_button")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.GridView/android.widget.FrameLayout[3]/android.widget.LinearLayout")).click();
		Thread.sleep(2000);
	}

	
	@Test(priority = 5, groups = { "Add" }, dependsOnMethods="expenseButton")
	public void newExpense() {
		
		String expense= driver.findElement(By.id("com.monefy.app.lite:id/expense_amount_text")).getText();
		Assert.assertEquals(expense, "£3.00");
		System.out.println("New Expense is "+expense);
		
	}
	
	
	@Test(priority = 6, groups = { "Home" })
	public void incomeButton() throws InterruptedException {
		
		String income= driver.findElement(By.id("com.monefy.app.lite:id/income_button_title")).getText();
		Assert.assertEquals(income, "INCOME");
		System.out.println("Button text is "+income);
		driver.findElement(By.id("com.monefy.app.lite:id/income_button_title")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("com.monefy.app.lite:id/buttonKeyboard5")).click();
		driver.findElement(By.id("com.monefy.app.lite:id/keyboard_action_button")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.GridView/android.widget.FrameLayout[1]/android.widget.LinearLayout")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 7, groups = { "Add" }, dependsOnMethods="incomeButton")
	public void newIncome() {
		
		String income = driver.findElement(By.id("com.monefy.app.lite:id/income_amount_text")).getText();
		Assert.assertEquals(income, "£5.00");
		System.out.println("New Income is "+income);
		
	}
	
	
	@Test(priority = 8, groups = { "Balance" }, dependsOnMethods={"expenseButton","incomeButton"})
	public void balanceButton() {
		
		driver.findElement(By.id("com.monefy.app.lite:id/balance_amount")).click();
		String name1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]")).getText();
		Assert.assertEquals(name1, "Deposits");
		String amount1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.RelativeLayout[1]/android.widget.TextView")).getText();
		Assert.assertEquals(amount1, "£5.00");
		System.out.println(name1 +" " + amount1);
		
		
		String name2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.RelativeLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]")).getText();
		Assert.assertEquals(name2, "Clothes");
		String amount2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.RelativeLayout[2]/android.widget.TextView")).getText();
		Assert.assertEquals(amount2, "£3.00");
		System.out.println(name2 +" " + amount2);
	}
	
	
	@Test(priority = 9, groups = { "Delete" }, dependsOnMethods="expenseButton")
	public void deleteExpense() {
		
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]")).click();
		driver.findElement(By.id("com.monefy.app.lite:id/textViewTransactionNote")).click();
		driver.findElement(By.id("com.monefy.app.lite:id/delete")).click();		
		

	}
	
	@Test(priority = 10, groups = { "Delete" }, dependsOnMethods="incomeButton")
	public void deleteIncome() throws InterruptedException {
		Thread.sleep(5000);
		if(driver.findElement(By.id("com.monefy.app.lite:id/settings_button")).isDisplayed())
		{
			driver.findElement(By.id("com.monefy.app.lite:id/expense_button")).click();
		}
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ExpandableListView/android.widget.RelativeLayout/android.widget.LinearLayout")).click();
		driver.findElement(By.id("com.monefy.app.lite:id/textViewTransactionNote")).click();
		driver.findElement(By.id("com.monefy.app.lite:id/delete")).click();		
		
	}

	@Test(priority = 11, groups = { "Home" }, dependsOnMethods= {"deleteIncome","deleteExpense"})
	public void finalAmount() throws InterruptedException {
		Thread.sleep(5000);
	
		driver.findElement(By.id("com.monefy.app.lite:id/balance_amount")).click();
		
		String income= driver.findElement(By.id("com.monefy.app.lite:id/income_amount_text")).getText();
		Assert.assertEquals(income, "£0.00");
		System.out.println("Final Income is "+income);
		
		
		String expense= driver.findElement(By.id("com.monefy.app.lite:id/expense_amount_text")).getText();
		Assert.assertEquals(expense, "£0.00");
		System.out.println("Final Expense is "+expense);
	}
	
	
	
}
