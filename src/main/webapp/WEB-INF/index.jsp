<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
1	Spring boot helloworld
1.1 介绍
       自从structs2出现上次的漏洞以后，对spring的关注度开始越来越浓。
       以前spring开发需要配置一大堆的xml,后台spring加入了annotaion，使得xml配置简化了很多，当然还是有些配置需要使用xml,比如申明component scan等。
       Spring开了一个新的model spring boot,主要思想是降低spring的入门，使得新手可以以最快的速度让程序在spring框架下跑起来。
       那么如何写Hello world呢？
Hello之步骤:
 (1)新建一个Maven Java 工程
 (2)在pom.xml文件中添加Spring Boot Maven依赖
 (3)编写启动类
 (4)运行程序
1.2 Hello之New
       这个步骤很简单，相比大家都会，小编在此为了文档的完整性，稍作简单说明：
首先使用IDE（Eclipse,MyEclipse）工具新建一个Maven工程，可以是Maven Java Project,也可以是Maven Web Project,随便取一个工程名称。我使用的是STS，工程名是spring-boot-hello1。
1.3 Hello之Maven
       第二步，在pom.xml中引入spring-boot-start-parent,spring官方的解释叫什么stater poms,它可以提供dependency management,也就是说依赖管理，引入以后在申明其它dependency的时候就不需要version了，后面可以看到。
  
    org.springframework.boot
    spring-boot-starter-parent
    1.3.3.RELEASE
  
1.4 Hello之maven web
       第三步，因为我们开发的是web工程，所以需要在pom.xml中引入spring-boot-starter-web,spring官方解释说spring-boot-start-web包含了spring webmvc和tomcat等web开发的特性。
	org.springframework.boot
    spring-boot-starter-web
1.5 Hello之Maven Run Application
       如果我们要直接Main启动spring，那么以下plugin必须要添加，否则是无法启动的。如果使用maven 的spring-boot:run的话是不需要此配置的。（我在测试的时候，如果不配置下面的plugin也是直接在Main中运行的。）
		org.springframework.boot
		spring-boot-maven-plugin</artifactId>
1.6 Hello之coding
       第四步，真正的程序开始啦，我们需要一个启动类，然后在启动类申明让spring boot自动给我们配置spring需要的配置，比如：@SpringBootApplication,为了可以尽快让程序跑起来，我们简单写一个通过浏览器访问hello world字样的例子：(注：启动类一定要放在最外面的包中，确保扫描注解时能扫到所有的类)
@RestController
@SpringBootApplication
public class App {
    @RequestMapping("/")
  public String hello(){
    return "Hello world!";
  }
    public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }
}
其中@SpringBootApplication申明让spring boot自动给程序进行必要的配置，等价于以默认属性使用@Configuration，@EnableAutoConfiguration和@ComponentScan
@RestController返回json字符串的数据，直接可以编写RESTFul的接口；
 1.7 Hello之Run
       第五步，就是运行我们的Application了，我们先介绍第一种运行方式。第一种方式特别简单：右键Run As -> Java Application。之后打开浏览器输入地址：http://127.0.0.1:8080/ 就可以看到Hello world!了。第二种方式右键project – Run as – Maven build – 在Goals里输入spring-boot:run ,然后Apply,最后点击Run。
 1.8 Hello之Error
       顺利的情况下当然是皆大欢喜了，但是程序吧往往会给你开个小玩笑。那么我们要注意什么呢？主要是jdk的版本之类的，请看官方说明：

</body>
</html>