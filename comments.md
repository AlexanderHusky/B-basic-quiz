### 完成度：
* 整体完成度太低了！

__Details:__

- \- 创建 user 后无法查询到 user。需求里创建 user 时是不提供 userId 的，userId 是由系统生成的。
- \- 没有进行任何校验。
- \- 用户 id 不存在时，查询 educations 应该返回 404 而不是空数组。
- \- 用户 id 不存在时，查询 educations 还会报 500。
- \- 无法为 user 创建 education。

### 测试：
* 没有任何测试。

__Details:__



### 知识点：
* 很多基础知识点的使用都不正确。
* 对 Optional API 的使用不熟练。
* 注入方式不是最佳实践。

__Details:__

- \- UserController.java:20 推荐是要用 构造函数注入
- \- 如果多个方法的 path 有一样的前缀，可以提到 class level 去统一设置
- \- 如果多个方法的 path 一样，可以提到 class level 去统一设置
- \- 可以简化为 @ResponseStatus
- \- 这里的写法表明你对 Optional API 不熟悉

### 工程实践：
* clean code 方面还存在特别基础的问题，详见 details。
* 构建相关的知识还未掌握。

__Details:__

- \- Dataprovider.java:11 命名的大小不合理
- \- UserController.java:26 这里直接 return 就好了，不用定义 result。
- \- User.java:5 未删除的无用代码
- \- Education.java:3 未删除的无用代码
- \- 尽量使用 equals()
- \- EducationService.java:19 未被调用的方法
- \- 没有提交 gradle/ 文件夹，导致无法在命令行进行构建
- \- 没有 .gitignore 文件，通过 Gradle 或 IDEA 进行构建后会造成大量无谓的变更

### 综合：
* 整体完成度较低。
* 不要只管在 IDE 里能构建就行了，要熟练和习惯在没有 IDE 时也能进行构建。不行的话，写完后，找个同学来 clone 你的代码，然后试着在命令行进行构建，然后再看看能否用 IDEA 正常打开、构建、运行。

__Details:__



