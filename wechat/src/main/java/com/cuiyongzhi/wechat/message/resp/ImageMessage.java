package com.cuiyongzhi.wechat.message.resp;

/**
 * ClassName: ImageMessage
 * @Description: 图片消息
 * @author dapengniao
 * @date 2016年3月8日 下午5:58:10
 */
public class ImageMessage extends BaseMessage{
	
	private Image Image;

	public Image getImage() {
		return Image;
	}

	public void setImage(Image image) {
		Image = image;
	}
	

}
