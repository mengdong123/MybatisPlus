package com.atguigu.mp.test;

import org.junit.Test;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class TestMP {

	/**
	 * 代码生成器生成示例代码
	 */
	@Test
	public void testGenerator() {
		//1.全局配置
		GlobalConfig config = new GlobalConfig();
		config.setActiveRecord(true)//设置启用活动记录为true
			  .setAuthor("atguigu")//设置作者名字
			  .setBaseResultMap(true)//设置返回结果集映射
			  .setBaseColumnList(true)//设置sql片段
			  .setFileOverride(true)//设置文件
			  .setIdType(IdType.AUTO)//主键策略
			  .setOutputDir("E:\\Users\\51019\\workspace-spring-tool-suite-4-4.4.2.RELEASE\\mp03\\src\\main\\java")//生成实体代码位置
			  .setServiceName("%sService");//service层名称，默认IxxxService
		//2.数据源配置
		DataSourceConfig dataSourceConfig = new DataSourceConfig();
		dataSourceConfig.setDbType(DbType.MYSQL)
		                .setDriverName("com.mysql.jdbc.Driver")
		                .setUrl("jdbc:mysql://localhost:3306/mp")
		                .setUsername("root")
		                .setPassword("root");
		//3.策略配置
		StrategyConfig strategyConfig = new StrategyConfig();
		strategyConfig.setCapitalMode(true)//开启大写命名
		              .setDbColumnUnderline(true)//忽视数据库中名字含有下划线
		              .setNaming(NamingStrategy.underline_to_camel)//数据库表中命名到java代码中的命名策略
		              .setTablePrefix("tbl_")//表前缀
		              .setInclude("tbl_employee");//生成哪个表
		//4.包名策略配置
		PackageConfig packageConfig = new PackageConfig();
		packageConfig.setParent("com.atguigu.mp")
		             .setController("controller")
		             .setEntity("beans")
		             .setMapper("mapper")
		             .setXml("mapper");
		//5.整合配置
		AutoGenerator ag = new AutoGenerator();
		ag.setGlobalConfig(config)
		  .setDataSource(dataSourceConfig)
		  .setStrategy(strategyConfig)
		  .setPackageInfo(packageConfig);
		//6.执行
		ag.execute();
		
	}
}
