package com.cuiyongzhi.wechat.message.resp;

/**
 * ClassName: TextMessage
 * @Description: 文本消息消息体
 * @author dapengniao
 * @date 2016年3月7日 下午3:54:22
 */
public class TextMessage extends BaseMessage {  
    // 回复的消息内容   
    private String Content;  
  
    public String getContent() {  
        return Content;  
    }  
  
    public void setContent(String content) {  
        Content = content;  
    }  
}  
