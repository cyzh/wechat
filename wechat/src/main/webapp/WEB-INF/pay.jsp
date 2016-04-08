<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width" />
<title>微信支付</title>
<script src="http://res.wx.qq.com/open/js/jweixin-1.0.0.js"></script>

<script src="http://static.yuhuaws.com/resource/js/jquery.min.js"></script>
<script type="text/javascript">
	function jssdk() {
		$.ajax({
			url : "http://wechat.cuiyongzhi.com/wechatconfig/jssdk",
			type : 'post',
			dataType : 'json',
			contentType : "application/x-www-form-urlencoded; charset=utf-8",
			data : {
				'url' : location.href.split('#')[0]
			},
			success : function(data) {
				wx.config({
					debug : true,
					appId : data.appId,
					timestamp : data.timestamp,
					nonceStr : data.nonceStr,
					signature : data.signature,
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
				//{timestamp: 1458271845, nonceStr: "eeK5bv7k0koo3MdPKtoBfIwFFaiiolcr", package: "prepay_id=wx2016031811304521cdd52a2a0536569204", signType: "MD5", paySign: "2F6311C926EE37944D05E8E875188668"}
				wx.ready(function() {
					wx.chooseWXPay({
						timestamp : 1458271845, // 支付签名时间戳，注意微信jssdk中的所有使用timestamp字段均为小写。但最新版的支付后台生成签名使用的timeStamp字段名需大写其中的S字符
						nonceStr : "eeK5bv7k0koo3MdPKtoBfIwFFaiiolcr", // 支付签名随机串，不长于 32 位
						package : "prepay_id=wx2016031811304521cdd52a2a0536569204", // 统一支付接口返回的prepay_id参数值，提交格式如：prepay_id=***）
						signType : "MD5", // 签名方式，默认为'SHA1'，使用新版支付需传入'MD5'
						paySign : "2F6311C926EE37944D05E8E875188668", // 支付签名
						success : function(res) {
							var o,result = [];
							for(o in res){
								result[result.length] = o.key+'='+o.value;
							}
							alert(result.join('&'));
						}
					});
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
// 		            if (isWeiXin5() == false) {
// 		                alert("您的微信版本低于5.0，无法使用微信支付功能，请先升级！");
// 		            }

		jssdk();
	};
</script>
</head>
<body>
</body>
</html>
