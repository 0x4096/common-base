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
                        ├── ResultWrapper.java
                        └── ResultWrapperUtils.java

```

### 引入依赖

```
<dependency>
    <groupId>com.github.0x4096</groupId>
    <artifactId>common-base</artifactId>
    <version>2.0.2</version>
</dependency>
```