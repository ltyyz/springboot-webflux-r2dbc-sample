## 说明

SpringBoot + Webflux + R2DBC 演示

## 环境

OpenJDK 11
Maven 3.6.3
IntelliJ IDEA 2020.2.2 (Community Edition)

## 最后

基于 Webflux 的springboot 服务真轻，在我垃圾电脑上启动速度都能小于 3s，打包后 fatjar 只有 22m。

> 2020-09-19 12:17:10.424  INFO 2420 --- [           main] com.github.ltyyz.ReactiveApplication     : Started ReactiveApplication in 2.975 seconds (JVM running for 3.634)

目前 R2DBC 只能算是玩具，正式场景慎用，自己玩玩当然可以。