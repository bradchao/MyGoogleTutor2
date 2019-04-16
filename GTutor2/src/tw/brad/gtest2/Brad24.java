package tw.brad.gtest2;

public class Brad24 {

	public static void main(String[] args) {
		String url = "https://www.google.com/index?a=1&b=2&c=3";
		String[] myurl = url.split("\\?");

		System.out.println(myurl[0]);
		String[] params = myurl[1].split("&");
		for (String param : params) {
			String[] aparam = param.split("=");
			System.out.println(aparam[0] + " ==> " + aparam[1]);
		}
		
		
		
	}

}
