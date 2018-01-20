 **使用JFinal极速开发框架开发的一款麻将游戏后台管理系统（兼容移动端）** 

本系统功能主要有:会员管理，代理管理，权限管理。

 **使用说明** 

1、将sql文件导入数据库

==== 公告表tbl_notice在原有的表中，加入了两个字段，一个是agentID(发布公告者ID)，另一个是state(公告类型)

==== 注意:function表和property表中数据不可清空！

2、配置config.txt文件的数据库配置信息          

3、使用tomcat启动(最佳环境：jdk1.8,tomcat 8.5)

4、浏览器地址栏访问：localhost:8080/AgentManage

5、登陆管理员登陆账号：12345678910 密码：123456

===项目结构===

 **总包头：com.matete.agentmanage** 

------commom------相当于配置文件

---------utils------工具类

------controller------web层

------interceptor------拦截器

------model------数据库表的模型对象

---------base------jfinal对于数据库表对象的属性的get/set方法特有包

------realm------权限控制主类

------runnable------定时器

------service------逻辑层

------shiro------jfinal提供的shiro支持类包

------validator------类似于拦截器
	


 **注:本项目为maven项目，修改源码请自行准备eclipse中maven插件** 

 **[访问地址](http://mj.lemaomao.com)** 