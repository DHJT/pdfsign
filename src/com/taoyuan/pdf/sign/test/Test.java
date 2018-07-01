package com.taoyuan.pdf.sign.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import com.taoyuan.pdf.sign.itext.PdfSignBox;
import com.taoyuan.pdf.sign.itext.PdfSignItext;

public class Test {
	public static void main(String[] args) throws  Exception {
		     String KEYSTORE="C:/Workspaces/eclipse_oxygen/pdfsign/src/test.p12";
		       char[] PASSWORD = "123".toCharArray();//keystory密码
		       String SRC="C:/Workspaces/eclipse_oxygen/pdfsign/src/demo.pdf" ;//原始pdf
		       String DEST="C:/Workspaces/eclipse_oxygen/pdfsign/src/demo_signed_box.pdf" ;//签名完成的pdf
		       String DEST2="C:/Workspaces/eclipse_oxygen/pdfsign/src/demo_signed_itext.pdf" ;//签名完成的pdf
		      String chapterPath="C:/Workspaces/eclipse_oxygen/pdfsign/src/chapter.png";//签章图片
		      String signername="測試";
		      String reason="数据不可更改";
		      String location="桃源乡";

	PdfSignBox.sign(PASSWORD, new FileInputStream(KEYSTORE),
			new FileInputStream(chapterPath),
			new File(SRC),new File(DEST),signername, reason, location);


	PdfSignItext.sign(new FileInputStream(SRC), new FileOutputStream(DEST2),
			new FileInputStream(KEYSTORE), PASSWORD,
		 reason, location, chapterPath);
	}
}
