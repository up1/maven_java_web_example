For APIs

*  How to run ?

```
$mvn clean package tomcat7:run
```

*  Run in browser http://localhost:8080/api/hello



## Step to create server

1. สร้าง MySQL Database
```
docker container run -d -p 3306:3306  \
-e MYSQL_ROOT_PASSWORD=password \
-e MYSQL_DATABASE=wallet \
-e MYSQL_USER=user01 \
-e MYSQL_PASSWORD=xitgmLwmp \
--name db2 mysql:5.7.21
```
