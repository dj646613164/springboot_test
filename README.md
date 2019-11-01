# springboot 练习项目

### 集成模块

web
        
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        
        @RequestMapping("/hello")
            @ResponseBody
            public String hello(){
                return "hello";
            }

log
* logback.xml

热部署
* devtools

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <optional>true</optional>
        </dependency>
        
thymeleaf

        <!-- 使用thymeleaf 模板 -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-thymeleaf</artifactId>
        </dependency>
        <!--thymeleaf标签不完整报错解决方案-->
        <dependency>
            <groupId>net.sourceforge.nekohtml</groupId>
            <artifactId>nekohtml</artifactId>
        </dependency>        
        
热部署

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <optional>true</optional>
        </dependency>
        
        如果不成功可以修改idea配置试试，操作指示如下
        https://blog.csdn.net/little_skeleton/article/details/80935794
        
mybatis

        <!-- 添加mybatis 依赖 -->
        <dependency>
            <groupId>org.mybatis.spring.boot</groupId>
            <artifactId>mybatis-spring-boot-starter</artifactId>
            <version>1.3.0</version>
        </dependency>

        <!-- 驱动 -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.15</version>
        </dependency>

        <!--连接池-->
        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>druid</artifactId>
            <version>1.0.29</version>
        </dependency>                
        
        注意在项目启动加注解
        @MapperScan("com.emotte.springboot_test.mapper")
        
        其他可查看项目resource下mybatis文件夹和com.emotte.springboot_test.mapper下的mapper
        配置文件中mybatis相关的配置
        
邮件
        
        <!--发送邮件-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-mail</artifactId>
        </dependency>        
        
        查看service下的MailService，配置文件，test下的MailServiceTest
        
redis
        
        <!--redis-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-redis</artifactId>
        </dependency>

        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-pool2</artifactId>
            <version>2.5.0</version>
        </dependency>

        <!-- 将作为Redis对象序列化器 -->
        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>fastjson</artifactId>
            <version>1.2.47</version>
        </dependency>
        
        查看com.emotte.springboot_test.config下redis的配置
        配置文件中redistribution
        test下的SpringbootRedisApplicationTests
                
                        
        
        