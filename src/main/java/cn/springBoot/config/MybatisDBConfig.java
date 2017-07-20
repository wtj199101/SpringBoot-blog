package cn.springBoot.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = {"cn.springBoot.**.mapper"})
public class MybatisDBConfig implements TransactionManagementConfigurer,EnvironmentAware {

    @Autowired
    private DataSource dataSource;
    

    @Bean(name = "txTransactionManager")
    public PlatformTransactionManager annotationDrivenTransactionManager() {

        return new DataSourceTransactionManager(this.dataSource);

    }
    private RelaxedPropertyResolver propertyResolver; 
    @Override
    public void setEnvironment(Environment environment) {
        this.propertyResolver = new RelaxedPropertyResolver(environment,"mybatis.");  

    }
    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean sf = new SqlSessionFactoryBean();
        sf.setDataSource(this.dataSource);
        // 分页插件
//         PageHelper pageHelper = new PageHelper();
//         Properties properties = new Properties();
//         properties.setProperty("reasonable", "true");
//         properties.setProperty("supportMethodsArguments", "true");
//         properties.setProperty("returnPageInfo", "check");
//         properties.setProperty("params", "count=countSql");
//         pageHelper.setProperties(properties);
        //
        // //添加插件
        // bean.setPlugins(new Interceptor[]{pageHelper});
        // 添加XML目录
        /**mybatis 是mybatis官方和springboot 整合。必须自己注入属性,直接写在application.properties中没用**/
         ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
         sf.setMapperLocations(resolver.getResources(propertyResolver.getProperty("mapperLocations")));
         sf.setTypeAliasesPackage(propertyResolver.getProperty("typeAliasesPackage"));
         sf.setConfigLocation(new DefaultResourceLoader().getResource(propertyResolver.getProperty("configLocation")));

        try {
            return sf.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

 

}
