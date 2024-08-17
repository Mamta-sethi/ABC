package DDF;

import java.io.FileInputStream;
import java.util.Properties;

public class property_fetching {
public static void main(String[] args) throws Throwable {
	//creat obj of file inputstream class
	FileInputStream fis=new FileInputStream("C:\\Users\\Mamta\\eclipse-workspace\\Coreselenium1\\src\\test\\resources\\C.properties");
	//creat obj of propertiesfile
	Properties p=new Properties();
	//load the notepad in properties cls
	p.load(fis);
	//write the key and value can be printing
	String UN = p.getProperty("un");
	System.out.println(UN);
	//creat key
	 String PWD = p.getProperty("pwd");
	 System.out.println(PWD);
	
	
	
}
}
