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

##脚本     
`sql`    
CREATE  TABLE PUBLIC.USER(    
    ID INT AUTO_INCREMENT PRIMARY KEY NOT NULL ,
    ACCOUNT_ID VARCHAR(100),   
    NAME VARCHAR(50),   
    TOKEN CHAR(36),   
    GMT_CREATE BIGINT,   
    GMT_MODIFIED BIGINT  
)    
CREATE TABLE QUESTION
(   
	ID INTEGER DEFAULT AUTO_INCREMENT,    
	TITLE VARCHAR(50),    
	DESCRIPTION CLOB,    
	GMT_CREATE BIGINT,    
	GMT_MODIFIED BIGINT,    
	CREATOR INTEGER,    
	COMMENT_COUNT INTEGER DEFAULT 0,    
	VIEW_COUNT INTEGER DEFAULT 0,    
	LIKE_COUNT INTEGER DEFAULT 0,     
	TAG VARCHAR(256),      
	CONSTRAINT QUESTION_PK     
	PRIMARY KEY (ID)     
)    

