package com.xl.demo;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class AsciiPic {
	 
	/**
	 * @param path
	 *            图片路径
	 */
	public static void createAsciiPic(final String path) {
		final String base = "@#&$%*O0oo";// 字符串由复杂到简单
		File file = new File("C:/Users/Administrator/Pictures/3.txt");
		try {
			file.createNewFile();
			FileOutputStream os = new FileOutputStream(file);
			final BufferedImage image = ImageIO.read(new File(path));
			for (int y = 0; y < image.getHeight(); y += 2) {
				for (int x = 0; x < image.getWidth(); x++) {
					final int pixel = image.getRGB(x, y);
					final int r = (pixel & 0xff0000) >> 16, g = (pixel & 0xff00) >> 8, b = pixel & 0xff;
					final float gray = 0.299f * r + 0.578f * g + 0.114f * b;
					final int index = Math.round(gray * (base.length() + 1) / 255);
					System.out.print(index >= base.length() ? " " : String.valueOf(base.charAt(index)));
					os.write(index >= base.length() ? "o".getBytes() : String.valueOf(base.charAt(index)).getBytes());
				}
				os.write("\r\n".getBytes());
			}
			os.close();
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}
 
	/**
	 * test
	 *
	 * @param args
	 */
	public static void main(final String[] args) {
		AsciiPic.createAsciiPic("C:/Users/Administrator/Pictures/1534234590(1).png");
	}
}