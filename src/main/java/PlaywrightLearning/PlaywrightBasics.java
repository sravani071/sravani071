package PlaywrightLearning;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightBasics {

	public static void main(String[] args) {
		
		
		
		Playwright pw = Playwright.create(); //initialize the new Playwright instance or establish the connection with server
		
		//to open the chrome browser directly
		LaunchOptions lo = new LaunchOptions().setChannel("msedge");// Browser distribution channel. Supported values are "chrome", "chrome-beta", "chrome-dev", "chrome-canary", "msedge", "msedge-beta", "msedge-dev", "msedge-canary".
		lo.setHeadless(false);
		
		Browser browse = pw.chromium().launch(lo);
		
		//Browser browse = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false)); //it will open the chromium browser 
		Page page = browse.newPage();
		page.navigate("https://playwright.dev/");
		System.out.println(page.title());
		System.out.println(page.url());
		browse.close();
		pw.close();
		
	}

}
