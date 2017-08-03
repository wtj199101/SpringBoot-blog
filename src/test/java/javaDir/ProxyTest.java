package javaDir;

import java.io.BufferedInputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Administrator on 2017/07/24.
 */
public class ProxyTest {
    public static void main(String[] args) {
//        System.getProperties().setProperty("http.proxyHost", "183.240.87.229");
//        System.getProperties().setProperty("http.proxyPort", "8080");
        System.out.println(getHtml("https://www.baidu.com")); //判断代理是否设置成功
    }
    private static String getHtml(String address){
        StringBuffer html = new StringBuffer();
        String result = null;
        try{
            URL url = new URL(address);
            Proxy proxy=new Proxy(Proxy.Type.HTTP,new InetSocketAddress("119.57.112.181",8080));
            URLConnection conn = url.openConnection(proxy);
            conn.setConnectTimeout(5000);
            conn.setRequestProperty("User-Agent","Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 5.1; GTB5; .NET CLR 2.0.50727; CIBA)");
            BufferedInputStream in = new BufferedInputStream(conn.getInputStream());
            try {
                String inputLine;
                byte[] buf = new byte[4096];
                int bytesRead = 0;
                while (bytesRead >= 0) {
                    inputLine = new String(buf, 0, bytesRead, "ISO-8859-1");
                    html.append(inputLine);
                    bytesRead = in.read(buf);
                    inputLine = null;
                }
                buf = null;
            } finally {
                in.close();
                conn = null;
                url = null;
            }
            result = new String(html.toString().trim().getBytes("ISO-8859-1"), "gb2312").toLowerCase();
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
        html = null;
        return result;
    }
}
