/**
 * 
 */
package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * <pre>
 * org.dimigo.io
 *    |_ SaveImageFromUrl
 *
 *   1. 개요 :
 *   2. 작성일 : 2015. 10. 26.
 *  </pre>
 *
 * @author      : 이명현
 * @version     : 1.0
 * @github      : http://github.com/wp132321
 */

public class SaveImageFromUrl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String imgUrl = "https://igcdn-photos-a-a.akamaihd.net/hphotos-ak-xaf1/t51.2885-15/e35/12144073_1490398267955920_1564307333_n.jpg";
		
		try {
			URL url = new URL(imgUrl);
			
			try(InputStream is = url.openStream();
				OutputStream os = new FileOutputStream("files/ty.jpg")) {
				
				int result;
				byte[] buf = new byte[100];
				
				while((result = is.read(buf)) != -1) {
					os.write(buf, 0, result);
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
