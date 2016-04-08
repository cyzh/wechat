package com.cuiyongzhi.wechat.message.resp;

/**
 * ClassName: MusicMessage
 * @Description: 音乐消息
 * @author dapengniao
 * @date 2016年3月7日 下午3:53:38
 */
public class MusicMessage extends BaseMessage {  
    // 音乐   
    private Music Music;  
  
    public Music getMusic() {  
        return Music;  
    }  
  
    public void setMusic(Music music) {  
        Music = music;  
    }  
}  
