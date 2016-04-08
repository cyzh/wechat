package com.cuiyongzhi.wechat.common;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONObject;

import com.cuiyongzhi.web.util.GlobalConstants;
import com.cuiyongzhi.wechat.util.HttpUtils;

/**
 * ClassName: WeChatTask
 * @Description: 微信两小时定时任务体
 * @author dapengniao
 * @date 2016年3月10日 下午1:42:29
 */
public class WeChatTask {
	/**
	 * @Description: 任务执行体
	 * @param @throws Exception
	 * @author dapengniao
	 * @date 2016年3月10日 下午2:04:37
	 */
	public void getToken_getTicket() throws Exception {
		Map<String, String> params = new HashMap<String, String>();
		//获取token执行体
		params.put("grant_type", "client_credential");
		params.put("appid", GlobalConstants.getInterfaceUrl("appid"));
		params.put("secret", GlobalConstants.getInterfaceUrl("AppSecret"));
		String jstoken = HttpUtils.sendGet(
				GlobalConstants.getInterfaceUrl("tokenUrl"), params);
		String access_token = JSONObject.fromObject(jstoken).getString(
				"access_token"); // 获取到token并赋值保存
		GlobalConstants.interfaceUrlProperties.put("access_token", access_token);
		
		//获取jsticket的执行体
		params.clear();
		params.put("access_token", access_token);
		params.put("type", "jsapi");
		String jsticket = HttpUtils.sendGet(
				GlobalConstants.getInterfaceUrl("ticketUrl"), params);
		String jsapi_ticket = JSONObject.fromObject(jsticket).getString(
				"ticket"); 
		GlobalConstants.interfaceUrlProperties
		.put("jsapi_ticket", jsapi_ticket); // 获取到js-SDK的ticket并赋值保存
		
		System.out.println("jsapi_ticket================================================" + jsapi_ticket);
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())+"token为=============================="+access_token);

	}

}
