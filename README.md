# my-spring-boot-mybatis
my-spring-boot-mybatis使用mybatis 的一个小的demo

### 注意事项

1. 使用mapper 一定哟啊放到resource文件夹来
2. 使用时候一定要在mapper.java 加上@mapper注解/ 在service加上service / 在controller 加上controller
3. 使用时候,命名空间一定要正确;否者会报
mybatis错误：Invalid bound statement (not found)
一般是Mapepr.xml文件中文nameapce没有和mapper接口发生映射，导致mybatis绑定失败

4. 使用mybatis-generator插件时候,一定要在类哪里(domainObjectName)写大写的;

```xml

	<table tableName="account" domainObjectName="Account"
		enableCountByExample="false" enableUpdateByExample="false"
		enableDeleteByExample="false" enableSelectByExample="false"
		selectByExampleQueryId="false">
	</table>
 
```

