import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.codec.digest.DigestUtils;

public class Page {

	
	
	public static void main(String[] args) {
		
		String url = "https://prod.gxb.io/datalist.html?";
		String isReport = "true";
		String token = "03429018320008BX1bGsKzq5bVvabDzi";
		String mobile = "18604597578";
		String appId = "gxb12cf4251aeb61c20";
		String appSecret = "0344c0da4b4340acaf55f2690398f668";
		long timestamp = System.currentTimeMillis();
		String sign = DigestUtils.md5Hex(String.format("%s%s%s", appId, appSecret, timestamp));
		String authItem = "risk_complex";
		StringBuffer sb = new StringBuffer();
		String get = sb.append(url)
				.append("token="+token)
				.append("&isReport="+isReport)
				.append("&appId="+appId)
				.append("&sign="+sign)
				.append("&timestamp="+timestamp)
				.append("&authItem="+authItem).toString();
		System.out.println("请求url："+get);
		String s = get(get, "UTF-8");
		System.out.println(s);
		
		
	}
	
	
	 private static byte[] getContentBytes(String content, String charset) {
	        if (charset == null || "".equals(charset)) {
	            return content.getBytes();
	        }
	        try {
	            return content.getBytes(charset);
	        } catch (UnsupportedEncodingException e) {
	            throw new RuntimeException("MD5签名过程中出现错误,指定的编码集不对,您目前指定的编码集是:" + charset);
	        }
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
