package com.gameutil.oop;

/**
 * 此类为加载图片工具类
 * 
 * @author Leon
 *
 */
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class LoadImage {
	public static Image loadImage(String path) {
		URL u = LoadImage.class.getClassLoader().getResource(path);
		BufferedImage img = null;
		try {
			img = ImageIO.read(u);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return img;
	}

}
