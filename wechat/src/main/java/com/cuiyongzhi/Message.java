package com.cuiyongzhi;

/**
 * ClassName: Message
 * @Description: 用于消息回复
 * @author dapengniao
 * @date 2016年4月8日 上午11:44:11
 */
public class Message {
	private int code;
	private String msg;
	private Object data;
	public Message() {
		
	}
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	public Message(int code,String msg) {
		this.code=code;
		this.msg=msg;
	}

	public Message(int code,String msg,Object data) {
		this.code=code;
		this.msg=msg;
		this.data=data;
	}
	

	/**
	 * 返回成功消息
	 * @param content 内容
	 * @return 成功消息
	 */
	public static Message success(String content, Object data) {
		return new Message(Code.SUCCESS, content, data);
	}
	
	/**
	 * 返回成功消息
	 * @param content 内容
	 * @return 成功消息
	 */
	public static Message success(String content) {
		return new Message(Code.SUCCESS, content);
	}
	
	/**
	 * 返回成功消息
	 * @param content 内容
	 * @return 成功消息
	 */
	public static Message success(Object data) {
		return new Message(Code.SUCCESS, "操作成功",data);
	}
	
	/**
	 * 返回成功消息
	 * @param content 内容
	 * @return 成功消息
	 */
	public static Message success() {
		return new Message(Code.SUCCESS, "操作成功");
	}
	
	/**
	 * 返回失败消息
	 * @param content 内容
	 * @return 成功消息
	 */
	public static Message error(int code,String content, Object data) {
		return new Message(code, content, data);
	}
	/**
	 * 返回失败消息
	 * @param content 内容
	 * @return 成功消息
	 */
	public static Message error(String content, Object data) {
		return new Message(Code.FAIL, content, data);
	}
	
	/**
	 * 返回失败消息
	 * @param content 内容
	 * @return 成功消息
	 */
	public static Message error(String content) {
		return new Message(Code.FAIL, content);
	}
	
	/**
	 * 返回失败消息
	 * @param content 内容
	 * @return 成功消息
	 */
	public static Message error() {
		return new Message(Code.FAIL, "操作失败");
	}

}
