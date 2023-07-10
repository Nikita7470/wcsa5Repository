package Assignmentpackage;

public class HowToCloseOnlyChildBrowser {

	public static void main(String[] args) {
		
		String parentHandle=driver.getWindowHandle();
		
		//get the address or handle of parent and child window
		set<String> =driver.getWindowindowHandles();
		//how to close only child browser...
		for(String wh:allHandles)
		{
			if(!parentHandle.equals(wh))
			{
				Thread.sleep(2000);
				driver.switchTo().window(wh).close();
				break;
			}
		}

	}

}
