package propreties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test3 {

	public static void main(String[] args) {
		String ipAddr = GetipAddress.getIpAddress();
		System.out.printf("%s 로 접속..",ipAddr);
	}

}
