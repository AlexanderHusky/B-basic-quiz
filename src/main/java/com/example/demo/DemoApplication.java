package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//TODO GTB-综合: * 整体完成度较低。
//TODO GTB-综合: * 不要只管在 IDE 里能构建就行了，要熟练和习惯在没有 IDE 时也能进行构建。不行的话，写完后，找个同学来 clone 你的代码，然后试着在命令行进行构建，然后再看看能否用 IDEA 正常打开、构建、运行。


//TODO GTB-完成度: * 整体完成度太低了！

//TODO GTB-完成度: - 创建 user 后无法查询到 user。需求里创建 user 时是不提供 userId 的，userId 是由系统生成的。
//TODO GTB-完成度: - 没有进行任何校验。
//TODO GTB-完成度: - 用户 id 不存在时，查询 educations 应该返回 404 而不是空数组。
//TODO GTB-完成度: - 用户 id 不存在时，查询 educations 还会报 500。
//TODO GTB-完成度: - 无法为 user 创建 education。

//TODO GTB-测试: * 没有任何测试。

//TODO GTB-知识点: * 很多基础知识点的使用都不正确。
//TODO GTB-知识点: * 对 Optional API 的使用不熟练。
//TODO GTB-知识点: * 注入方式不是最佳实践。

//TODO GTB-工程实践: * clean code 方面还存在特别基础的问题，详见 details。
//TODO GTB-工程实践: * 构建相关的知识还未掌握。

//TODO GTB-工程实践: - 没有提交 gradle/ 文件夹，导致无法在命令行进行构建
//TODO GTB-工程实践: - 没有 .gitignore 文件，通过 Gradle 或 IDEA 进行构建后会造成大量无谓的变更

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
