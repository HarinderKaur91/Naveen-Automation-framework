package com.naveenautomation.Browsers;

public enum Browsers {
	
	GOOGLE_CHROME("chrome"),
	EDGE("microsoft edge"),
	FIREFOX("firefox");
	
	String browserName;
	
	private Browsers(String name) {
		this.browserName = name;
	}
	
	public String getName() {
		return browserName;
	}
}
