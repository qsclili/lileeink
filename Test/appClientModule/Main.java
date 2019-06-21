import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.apache.commons.codec.digest.DigestUtils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import pojo.result;

public class Main {
	
	String url = "https://prod.gxb.io/datamatrix/risk/v2/risk_complex?";
	String name = "吴帅";
	String idcard = "320683199007150431";
	String mobile = "18604597578";
	String appId = "gxb12cf4251aeb61c20";
	String sequenceNo = "2019061712280001";
	long timestamp = System.currentTimeMillis();
	String appSecret = "0344c0da4b4340acaf55f2690398f668";
	String authItem = "risk_complex";
	

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Main m = new Main();
		
		String bizContent = URLEncoder.encode("{\"name\":\"吴春荣\",\"idcard\":\"230107197906190627\",\"mobile\":\"13019717070\"}");
		//String str = "{\"name\":\"吴春荣\",\"idcard\":\"230107197906190627\",\"mobile\":\"13019717070\"}";
		
		//JSONArray jsonArray = JSONArray.parseArray(str);
		//System.out.println(jsonArray);
		String sgin = DigestUtils.md5Hex(getContentBytes(m.appId + m.appSecret + m.authItem + m.timestamp + m.sequenceNo + "", "utf-8"));
		StringBuffer sb = new StringBuffer();
		String get = sb.append(m.url)
				.append("bizContent="+bizContent)
				.append("&sign="+sgin)
				.append("&appId="+m.appId)
				.append("&sequenceNo="+m.sequenceNo)
				.append("&timestamp="+m.timestamp).toString();
		System.out.println("请求url："+get);
		String s = get(get, "UTF-8");
		System.out.println(s);
		result r = JSONObject.parseObject(s, result.class);
		System.out.println(JSONObject.toJSON(r));
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