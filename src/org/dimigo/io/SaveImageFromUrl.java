package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class SaveImageFromUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String imageUrl="http://image.bugsm.co.kr/album/images/original/4229/422995.jpg";
		try {
			URL url = new URL(imageUrl);
			
			try(InputStream is = url.openStream();
				OutputStream os = new FileOutputStream("files/logo.jpg");) {
				byte[] buf = new byte[100];
				int result;
				while((result=is.read(buf))!=-1) {
					os.write(buf, 0, result);
				}
				System.out.println("생성 완료");
			} catch (Exception e) {
				throw e;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
