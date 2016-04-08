<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width" />
<title>JSSDk配置</title>
<script src="http://res.wx.qq.com/open/js/jweixin-1.0.0.js"></script>
<script src="http://static.yuhuaws.com/resource/js/jquery.min.js"></script>
<script type="text/javascript">
	function jssdk() {
		$.ajax({
			url : "http://wechat.cuiyongzhi.com/wechat/wechatconfig/jssdk",
			type : 'post',
			dataType : 'json',
			contentType : "application/x-www-form-urlencoded; charset=utf-8",
			data : {
				'url' : location.href.split('#')[0]
			},
			success : function(data) {
				wx.config({
					debug : true,
					appId : data.data.appId,
					timestamp : data.data.timestamp,
					nonceStr : data.data.nonceStr,
					signature : data.data.signature,
					jsApiList : [ 'checkJsApi', 'onMenuShareTimeline',
							'onMenuShareAppMessage', 'onMenuShareQQ',
							'onMenuShareWeibo', 'hideMenuItems',
							'showMenuItems', 'hideAllNonBaseMenuItem',
							'showAllNonBaseMenuItem', 'translateVoice',
							'startRecord', 'stopRecord', 'onRecordEnd',
							'playVoice', 'pauseVoice', 'stopVoice',
							'uploadVoice', 'downloadVoice', 'chooseImage',
							'previewImage', 'uploadImage', 'downloadImage',
							'getNetworkType', 'openLocation', 'getLocation',
							'hideOptionMenu', 'showOptionMenu', 'closeWindow',
							'scanQRCode', 'chooseWXPay',
							'openProductSpecificView', 'addCard', 'chooseCard',
							'openCard' ]
				});
			}
		});
	}

	function isWeiXin5() {
		var ua = window.navigator.userAgent.toLowerCase();
		var reg = /MicroMessenger\/[5-9]/i;
		return reg.test(ua);
	}

	window.onload = function() {
		// 	if (isWeiXin5() == false) {
		// 		  alert("您的微信版本低于5.0，无法使用微信支付功能，请先升级！");
		// 		}
		jssdk();
	};
</script>
</head>
<body>
</body>
</html>
