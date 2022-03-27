
### 一、项目简介

##### 1. 物美智能 [wumei-smart](http://wumei.live/) 是一个简单易用的生活物联网平台。可用于搭建物联网平台以及二次开发和学习。

##### 2. 设备接入使用EMQX消息服务器，认证采用EMQX内置的Http插件对称加密认证。后端采用Spring boot；前端采用Vue；移动端采用Uniapp；数据库采用Mysql、Redis和TDengine；设备端支持硬件SDK生成，例如ESP32、ESP8266、树莓派等；设备模拟器采用Android和WPF框架，不仅能模拟硬件设备，还可以控制和监测电脑、手机。系统架构图如下：
<img src="https://oscimg.oschina.net/oscnet/up-98eefff896394066a60d664b875a3d05d1d.png" max-width="800" />


### 二、功能
- 权限管理： 用户管理、部门管理、岗位管理、菜单管理、角色管理、字典和参数管理等
- 系统监控： 操作日志、登录日志、系统日志、在线用户、服务监控、连接池监控、缓存监控等
- 产品管理： 产品、产品物模型、产品分类、产品固件等
- 设备管理： 控制、分组、定时、日志、统计、定位、OTA升级、影子模式、实时监测、加密认证等
- EMQ管理： Mqtt客户端、监听器、消息主题、消息订阅、插件管理
- 硬件 SDK： 支持WIFI和MQTT连接、物模型响应、实时监测、定时上报监测数据、AES加密、NTP时间等
- 物模型管理： 属性（设备状态和监测数据），功能（执行特定任务），事件（设备主动上报给云端）

### 三、开发中功能
- 设备分享、设备告警、场景联动（进度50%）
- 智能音箱、多租户、APP界面自定义（进度40%）
- 时序数据库、分布式集群部署、Granfa监控（进度30%）
- 视频流处理、桌面端模拟器/监控、安卓端模拟器/监控（进度0%）
- App和小程序（正在开发中......）

### 四、技术栈    
* 服务端
    - 相关技术：Spring boot、MyBatis、Spring Security、Jwt、Mysql、Redis、TDengine、EMQX、Mqtt等
    - 开发工具：IDEA    
* Web端
    - 相关技术：ES6、Vue、Vuex、Vue-router、Vue-cli、Axios、Element-ui等 
    - 开发工具：Visual Studio Code    
* 移动端（android / ios / 微信小程序）
    - 相关技术：uniapp、smartconfig
    - 开发工具：HBuilder
* 硬件端
    - 相关技术： ESP-IDF、Arduino、FreeRTOS等
    - 开发工具：Visual Studio Code 和 Arduino
* 安卓端模拟器/监控
    - 相关技术：android
    - 开发工具：Android Studio
* 电脑端模拟器/监控
    - 相关技术：WPF
    - 开发工具：Visual Studio

### 五、硬件接入
1. 设备认证
    * 加密认证（推荐）
    * 简单认证
    * EMQX支持的其他认证方式 
2. 设备交互
    * 发布物模型、设备信息、时钟同步相关Mqtt主题
    * 订阅物模型、设备升级、时钟同步相关Mqtt主题

###### 项目提供了示例SDK，使用ESP8266芯片，基于Arduino开发。设备烧录使用串口模块，例如Ch340，接线图如下：
![使用流程图](https://gitee.com/kerwincui/wumei-smart/raw/master/document/flash.png)


### 六、项目目录
&nbsp;&nbsp;&nbsp;&nbsp; spring-boot ---------------------------------------------------- 后端<br/>
&nbsp;&nbsp;&nbsp;&nbsp; vue ------------------------------------------------------------- 前端<br />
&nbsp;&nbsp;&nbsp;&nbsp; docker ---------------------------------------------------------- docker部署文件<br />
&nbsp;&nbsp;&nbsp;&nbsp; sdk -------------------------------------------------------------- 硬件SDK<br />
&nbsp;&nbsp;&nbsp;&nbsp; download ------------------------------------------------------- 工具下载<br />


### 七、相关文档
##### 权限管理基于ruoyi-vue系统，Mqtt消息服务器基于EMQX4.0开源版，SDK示例使用ESP8266 Core For Arduino开发
* [项目文档](http://wumei.live/kerwincui/document/wiki/)
* [物美智能官网](http://wumei.live/)
* [权限管理系统ruoyi-vue](https://gitee.com/y_project/RuoYi-Vue)
* [Mqtt消息服务器EMQX4.0](https://github.com/emqx/emqx)
* [ESP8266 Core For Arduino](https://github.com/esp8266/Arduino)
##### Docker快速安装
* Mysql中创建wumei-smart数据库，[导入Sql脚本](https://gitee.com/kerwincui/wumei-smart/tree/master/springboot/sql)
* 修改命令中的Mysql配置，并执行
```
docker run \
--name wumei-smart \
--env DB_HOST=localhost:3306 \
--env DB_NAME=wumei-smart \
--env DB_USER=root \
--env DB_PASSWORD=wumei-smart \
--publish 80:80 \
--publish 1883:1883 \
--publish 8083:8083 \
--volume /var/wumei-smart/java/uploadPath:/var/wumei-smart/java/uploadPath \
--restart unless-stopped \
--detach \
kerwincui/wumei-smart:1.1
```


### 八、其他
* 互助交流群：1073236354
* [演示地址>>](https://iot.wumei.live/)

##### 项目贡献者 (描述如果有误，请联系作者)
|                    用户                       |                   介绍                                       |
|  ---------------------------------------      | ----------------------------------------------------------   |
| [小驿物联](https://gitee.com/iot-xiaoyi)       | 专注做开源智能硬件，为用户提供完整的基于微信小程序的物联网解决方案 |
| [guanshubiao](https://gitee.com/guanshubiao)  | 熟悉Java和物联网开发                                           |
| [crazyDull](https://gitee.com/crazyDull)      | 熟悉Java后端开发                                              |
| [kami0314](https://github.com/kami0314)       | 熟悉Java后端开发                                              |


### 九、部分图片
<table>
    <tr>
        <td><img src="https://gitee.com/kerwincui/wumei-smart/raw/master/document/index.png"/></td>
        <td><img src="https://gitee.com/kerwincui/wumei-smart/raw/master/document/model.png"/></td>
    </tr>
    <tr>
        <td><img src="https://gitee.com/kerwincui/wumei-smart/raw/master/document/product.png"/></td>
        <td><img src="https://gitee.com/kerwincui/wumei-smart/raw/master/document/product-detail.png"/></td>
    </tr>
    <tr>
        <td><img src="https://gitee.com/kerwincui/wumei-smart/raw/master/document/device.png"/></td>
        <td><img src="https://gitee.com/kerwincui/wumei-smart/raw/master/document/monitor.png"/></td>
    </tr>
        <tr>
        <td><img src="https://gitee.com/kerwincui/wumei-smart/raw/master/document/device-detail.png"/></td>
        <td><img src="https://gitee.com/kerwincui/wumei-smart/raw/master/document/device-status.png"/></td>
    </tr>	 
    <tr>
        <td><img src="https://gitee.com/kerwincui/wumei-smart/raw/master/document/device-timer.png"/></td>
        <td><img src="https://gitee.com/kerwincui/wumei-smart/raw/master/document/device-log.png"/></td>
    </tr>
        <tr>
        <td><img src="https://gitee.com/kerwincui/wumei-smart/raw/master/document/device-statistic.png"/></td>
        <td><img src="https://gitee.com/kerwincui/wumei-smart/raw/master/document/group.png"/></td>
    </tr>
        <td><img src="https://gitee.com/kerwincui/wumei-smart/raw/master/document/emqx-client.png"/></td>
        <td><img src="https://gitee.com/kerwincui/wumei-smart/raw/master/document/emqx-plugin.png"/></td>
    </tr>
</table>



