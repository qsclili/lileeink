import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class InsaneGet {
		
	
	public static void main(String[] args) {
		
		Thread t = new Thread(){
			public void run(){
				for (int i = 0; i < 100; i++) {
					String s = get("http://mydmanagement.laidui.vip/salesman/guidePage.action?salesmanSign=","utf-8");
					System.out.println(i+"===========");
					try {
						sleep(20);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}};
		t.start();
	}
	
	public static String get(String urlAll, String charset)
	  {
	    BufferedReader reader = null;
	    String result = null;
	    StringBuffer sbf = new StringBuffer();
	    String userAgent = "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.66 Safari/537.36";
	    try
	    {
	      URL url = new URL(urlAll);
	      HttpURLConnection connection = (HttpURLConnection)url.openConnection();
	      connection.setRequestMethod("GET");
	      connection.setReadTimeout(30000);
	      connection.setConnectTimeout(30000);
	      connection.setRequestProperty("User-agent", userAgent);
	      connection.connect();
	      InputStream is = connection.getInputStream();
	      reader = new BufferedReader(new InputStreamReader(is, charset));
	      String strRead = null;
	      while ((strRead = reader.readLine()) != null)
	      {
	        sbf.append(strRead);
	        sbf.append("\r\n");
	      }
	      reader.close();
	      result = sbf.toString();
	    }
	    catch (Exception e)
	    {
	      e.printStackTrace();
	    }
	    return result;
	  }
	
}
