### 主页
https://github.com/0x4096/common-base

### 作用
基础请求、响应格式规范

```
└── com
    └── github
        └── Is0x4096
            └── common
                └── base
                    ├── context
                    │   └── CommonContext.java
                    ├── enums
                    │   └── StatusEnum.java
                    ├── extend
                    │   └── ToString.java
                    ├── interf
                    │   └── IEnum.java
                    ├── page
                    │   └── Pagination.java
                    ├── pojo
                    │   ├── dto
                    │   │   ├── ReqDTO.java
                    │   │   ├── ReqPageDTO.java
                    │   │   └── RespDTO.java
                    │   ├── package-info.java
                    │   └── vo
                    │       ├── ReqPageVO.java
                    │       ├── ReqVO.java
                    │       └── RespVO.java
                    └── result
                        └── R.java

```

### 引入依赖

```
<dependency>
    <groupId>com.github.0x4096</groupId>
    <artifactId>common-base</artifactId>
    <version>2.1.0</version>
</dependency>
```

做了一个非常糟糕的决定，就是删除了部分代码，没有做向下兼容...
