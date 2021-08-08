
public class Website {
	static String getdomain(String s) {
		if(s.startsWith("https://")){
			s=s.substring(8);
			}
		else if(s.startsWith("http;//")) {
			s=s.substring(7);
		}
		int i=s.indexOf("/");
		s=s.substring(0,i);
		return s;
		
		
	}

	public static void main(String[] args) {
		System.out.println(getdomain("https://www.jdoodle.com/online-java-compiler/"));
		System.out.println(getdomain("https://en.wikipedia.org/wiki/Main_Page"));
		
		
		
		
	}	

}
