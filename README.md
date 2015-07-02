# RWSBP
Boilerplate for Restful WebServices

这是一个模版工程，采用Jersey＋Spring+LogBack搭建的一个RESTFul WebService的项目。
JAVA开发环境JDK1.7，打包工具为Maven。


######################
####  项 目 结 构  ####
######################


#### pom.xml ####
Maven的配置文件，配置了项目所依赖的jar包和打包过程。


#### src/main ####
项目的源目录（source），包含程序代码、配置文件以及资源文件。

	#### java ####
	包含了所有的程序代码。

	common.aspect : 目录包含了一个简单的AOP切片

	controller : Jersey的对外restful web service的api的定义和实现。
	             ControllerConfiguration.java : 配置了启动Jersey时需要加载的所有Resource、Filter等。
	             AccountController : 提供了2个对外的api访问（分别为GET和POST）方式，项目中采用了Jackson作为JSON的支持工具。
	                                 在POST的方式中接受和输出的都是JSON格式。

	dao : 定义了数据库访问层以及实现，mongo包下的是基于mongodb的实现（采用了MongoTemplate的方式）

	model : 项目中使用到的数据模型，其中EntityResponse作为通用的web service对外输出的接口

	service : Service层，由Spring容器管理

	test :测试文件，其中ControllerTest使用Jersey Client测试了AccountController中的GET和POST方法。


    #### resources ####
    logback.xml : Logback的配置文件

    mongodb.properties : mongodb的配置参数，会被dbConfiguration.xml引用

    aopConfiguration.xml : Spring的AOP的配置文件

    controllerConfiguration.xml : Spring对于Jersey的Controller的配置

    dbConfiguration.xml : Spring的数据库配置文件，本例中配置了mongodb

    serviceConfiguration.xml : Spring中Bean的配置文件


     #### webapp ####
     标准的Web项目的结构


Web Service的访问地址：
http://hostname:port/services/account/{name} : 根据传入的name获取Account
http://hostname:port/services/account : POST方式、传入JSON对象，完成添加Account的操作。


