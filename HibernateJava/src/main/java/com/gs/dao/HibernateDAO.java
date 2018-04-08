package com.gs.dao;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

/**
 * Created by Master on 2017/7/19.
 */
public class HibernateDAO {

    protected SessionFactory sessionFactory;

    /**
     * // 1. 解析我们在hibernate.cfg.xml中的配置
     //      Configuration configuration = new Configuration().configure();
     //2. 创建服务注册类,进一步注册初始化我们配置文件中的属性
     //      ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
     //3. 创建我们的数据库访问会话工厂
     //      SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
     */
    public void getSessionFacotry() {
        // 创建Hibernate标准服务注册器，此注册器用于读取src根目录下的hibernate.cfg.xml配置文件
        // .configure()读取配置文件
        // .build()方法生成注册器
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        try {
            // 创建Session工厂
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        }
        catch (Exception e) {
            StandardServiceRegistryBuilder.destroy( registry );
        }
    }
}
