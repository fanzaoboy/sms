package com.sms.Utils;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;

public class WeatherUtil {

	public String getWeather(String cityName) throws Exception {
		URL url = new URL("http://api.k780.com/?app=weather.future&weaid=1&appkey=10003&sign=b59bc3ef6191eb9f747dd4e83c99f2a4&format=json");
		InputStream in=url.openStream();
        ByteArrayOutputStream out=new ByteArrayOutputStream();
        try {
            byte buf[]=new byte[1024];
            int read = 0;
            while ((read = in.read(buf)) > 0) {
                out.write(buf, 0, read);
            }
        }  finally {
            if (in != null) {
                in.close();
            }
        }
        byte b[]=out.toByteArray( );
        System.out.println(new String(b,"utf-8"));
        return new String(b,"utf-8");
	}
}
