/*
 * Copyright 2019-2029 geekidea(https://github.com/geekidea)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * spring-boot-plus 项目启动入口
 *
 * @author geekidea
 * @since 2018-11-08
 */

//@EnableCaching
//@EnableAsync
//@EnableScheduling
//@EnableTransactionManagement
//@EnableConfigurationProperties
//@ServletComponentScan
////@MapperScan({"io.geekidea.springbootplus.**.mapper", "com.example.**.mapper","com.putaotec.**.mapper"})
////@SpringBootApplication(scanBasePackages = {"io.geekidea.springbootplus", "com.putaotec","com.example"})
//@MapperScan({"com.lq.**.mapper"})
@SpringBootApplication()
@EnableEurekaServer
//@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
public class SpringBootPlusApplication7001 {

    public static void main(String[] args) {
        // 启动spring-boot-plus
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootPlusApplication7001.class, args);
//        // 打印项目信息
//        PrintApplicationInfo.print(context);
//        // 打印项目提示
//        PrintApplicationInfo.printTip(context);
    }

}

