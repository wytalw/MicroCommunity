

**1\. 退房 **
###### 接口功能
> 退房接口

###### URL
> [http://api.java110.com:8008/api/room.exitRoom](http://api.java110.com:8008/api/room.exitRoom)

###### 支持格式
> JSON

###### HTTP请求方式
> POST

###### 请求参数(header部分)
|参数名称|约束|类型|长度|描述|取值说明|
| :-: | :-: | :-: | :-: | :-: | :-:|
|app_id|1|String|30|应用ID|Api服务分配                      |
|transaction_id|1|String|30|请求流水号|不能重复 1000000000+YYYYMMDDhhmmss+6位序列 |
|sign|1|String|-|签名|请参考签名说明|
|req_time|1|String|-|请求时间|YYYYMMDDhhmmss|

###### 请求参数(body部分)
|参数名称|约束|类型|长度|描述|取值说明|
| :-: | :-: | :-: | :-: | :-: | :-: |
|communityId|1|String|30|组织ID|-|
|ownerId|1|String|12|小区ID|-|
|roomId|1|String|10|组织级别|-|
|storeId|1|String|200|级别名称|-|



###### 返回协议

当http返回状态不为200 时请求处理失败 body内容为失败的原因

当http返回状态为200时请求处理成功，body内容为返回内容，



###### 举例
> 地址：[http://api.java110.com:8008/api/room.exitRoom](http://api.java110.com:8008/api/room.exitRoom)

``` javascript
请求头信息：
Content-Type:application/json
USER_ID:1234
APP_ID:8000418002
TRANSACTION_ID:10029082726
REQ_TIME:20181113225612
SIGN:aabdncdhdbd878sbdudn898
请求报文：

{
	"ownerId": "772019092517890016",
	"communityId": "7020181217000001",
	"storeId": "402019032924930007",
	"userId": "30518940136629616640",
	"roomId": "752019103088990077"
}

返回报文：

成功

```
