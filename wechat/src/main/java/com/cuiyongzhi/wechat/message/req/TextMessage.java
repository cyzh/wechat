package com.cuiyongzhi.wechat.message.req;

/**
 * ClassName: TextMessage
 * @Description: 文本消息
 * @author dapengniao
 * @date 2016年3月7日 下午3:06:40
 */
public class TextMessage extends BaseMessage {  
    // 消息内容   
    private String Content;  
  
    public String getContent() {  
        return Content;  
    }  
  
    public void setContent(String content) {  
        Content = content;  
    }  
}  
