##  社区

##资源            
[`Spring 文档`](https://spring.io/guides)      
[`Spring web文档`](https://spring.io/guides/gs/serving-web-content/)        
[`es文档`](https://elasticsearch.cn/explore)   
[`Github deploy key文档`](https://developer.github.com/v3/guides/managing-deploy-keys/#deploy-keys   )    
[`Bootstrap文档`](https://v3.bootcss.com/getting-started/)     
[`Github OAuth文档`](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)   
[`Spring`](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/#boot-features-embedded-database)      
[`thymeleaf`](https://thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#setting-attribute-value)
  
##工具                 
[`Git`](https://git-scm.com/download)       
[`Visual Paradigm`](https://www.visual-paradigm.com)      
[`lombok`](https://www.projectlombok.org)    
[`Postman`](https://chrome.google.com/webstore/detail/coohjcphdfgbiolnekdpbcijmhambjff)    

##脚本                  
`sql`       
create table COMMENT  
(      
    ID           BIGINT default auto_increment,       
    PARENT_ID    BIGINT  not null,       
    TYPE         INTEGER not null,      
    COMMENTATOR  BIGINT  not null,      
    GMT_CREATE   BIGINT  not null,      
    GMT_MODIFIED BIGINT  not null,       
    LIKE_COUNT   BIGINT default 0,        
    CONTENT      VARCHAR(1024),           
        primary key (ID)     
)      
create table QUESTION   
(     
    ID            BIGINT  default auto_increment,       
    TITLE         VARCHAR(50),     
    DESCRIPTION   CLOB,       
    GMT_CREATE    BIGINT,           
    GMT_MODIFIED  BIGINT,        
    CREATOR       BIGINT,        
    COMMENT_COUNT INTEGER default 0,      
    VIEW_COUNT    INTEGER default 0,          
    LIKE_COUNT    INTEGER default 0,        
    TAG           VARCHAR(256),      
        primary key (ID)        
);            
create table USER                
(            
    ID           BIGINT default auto_increment,       
    ACCOUNT_ID   VARCHAR(100),           
    NAME         VARCHAR(50) not null,                    
    TOKEN        CHAR(36),                       
    GMT_CREATE   BIGINT,                             
    GMT_MODIFIED BIGINT,                          
    BIO          VARCHAR(256),                            
    AVATAR_URL   VARCHAR(100),                            
        primary key (ID)                     
);                   



[`mvn`]     
mvn -Dmybatis.generator.overwrite=ture mybatis-generator:generate                             
[`mvn自动建表`]                       
mvn flyway:init （初始化Flyway metadata ）                               
mvn flyway:migrate （执行Flyway 升级操作）                             
mvn flyway:validate （校验Flyway 数据正确性）                                        
mvn flyway:repair（修复脚本的checksum值）                                  





