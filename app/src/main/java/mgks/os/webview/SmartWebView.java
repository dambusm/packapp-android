package com.nocodeco.webview;

/*
* Android Smart WebView is an Open Source Project available on GitHub.
* Developed by Ghazi Khan (http://mgks.infeeds.com) under MIT Open Source License.
* This program is free to use for private and commercial purposes.
* Please mention project source or developer credits in your Application's License(s) Wiki.
* Giving right credit to developers encourages them to create better projects, just want you to know that :)
*/

class SmartWebView {

	//Permission variables
	static boolean ASWP_JSCRIPT     = true;     //enable JavaScript for webview
	static boolean ASWP_FUPLOAD     = <uploads>;     //upload file from webview
	static boolean ASWP_CAMUPLOAD   = <camera>;     //enable upload from camera for photos
 	static boolean ASWP_MULFILE     = false;    //upload multiple files in webview; not stable yet
	static boolean ASWP_LOCATION    = <gps>;     //track GPS locations
	static boolean ASWP_RATINGS     = <ratings>;     //show ratings dialog; auto configured, edit method get_rating() for customizations
	static boolean ASWP_PBAR        = <progressBar>;     //show progress bar in app
	static boolean ASWP_ZOOM        = <zoom>;    //zoom control for webpages view
	static boolean ASWP_SFORM       = false;    //save form cache and auto-fill information
	static boolean ASWP_OFFLINE     = false;    //whether the loading webpages are offline or online
	static boolean ASWP_EXTURL      = <externalUrls>;     //open external url with default browser instead of app webview

	//Configuration variables
	static String ASWV_URL          = "<url>"; //complete URL of your website or webpage
	static String ASWV_F_TYPE       = "*/*";  //to upload any file type using "*/*"; check file type references for more

	//Rating system variables
	static int ASWR_DAYS            = <ratingDays>;        //after how many days of usage would you like to show the dialoge
	static int ASWR_TIMES           = 10;       //overall request launch times being ignored
	static int ASWR_INTERVAL        = 2;        //reminding users to rate after days interval
}
