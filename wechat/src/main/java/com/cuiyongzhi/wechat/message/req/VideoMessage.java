package com.cuiyongzhi.wechat.message.req;

/**
 * ClassName: VideoMessage
 * @Description: 视频/小视屏消息
 * @author dapengniao
 * @date 2016年3月7日 下午3:12:51
 */
public class VideoMessage extends BaseMessage {

	private String MediaId; // 视频消息媒体id，可以调用多媒体文件下载接口拉取数据
	private String ThumbMediaId; // 视频消息缩略图的媒体id，可以调用多媒体文件下载接口拉取数据

	public String getMediaId() {
		return MediaId;
	}

	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}

	public String getThumbMediaId() {
		return ThumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		ThumbMediaId = thumbMediaId;
	}

}
