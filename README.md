# kubeops-intern

## QUESTIONS
### Normal
* 1.	Describe Git branching strategies (Git-flow, single branch, feature branch etc.) which you have used and what purpose does it serves.
```bash
branch Master ใช้ตอนโค้ดสมบูรณ์ หากโค้ดยังไม่คงที่จะอยู่ branch dev
feature branch ที่ผ่านมาใช้สำหรับการแยกขั้นลำดับการทำงาน แยก feature ของ App
```
* 2.	How do you revert a commit that has already been pushed and made public? 
```bash
  git reset --hard HEAD : reset local repo  
```
* 3.	How do you normally solve conflicts in a feature branch before merge?
```bash
  git fetch จากนั้น git pull แล้วจึง git push
```
* 4.	“200 OK” what does it mean and show use case this HTTP Status?
```bash
  ตอบกลับสำเร็จ server and  client สามารถคุยกันได้ สำเร็จ
```
* 5.	“201 Created” what does it mean and show use case this HTTP Status?
```bash
  response เมื่อมีการสร้างข้อมูล

```
* 6.	“301 Moved Permanently” what does it mean and show use case this HTTP Status?
```bash
  การย้าย URL ไปอยู่ที่ URL ใหม่ อย่างถาวร
```
* 7.	“400 Bad Request” what does it mean and how to identify the problem?
```bash
  client ส่งข้อมูลแต่ server ไม่สามารถประมวลผลได้
```
* 8.	“401 Unauthorized” what does it mean and how to identify the problem?
```bash
  client ที่ไม่มีสิทธิ์ส่งและรับข้อมูลจาก server (authentication)
```
* 9.	“403 Forbidden” what does it mean and how to identify the problem?
```bash
   client ที่ไม่มีสิทธิ์ส่งและรับข้อมูลจาก server  (No authentication)
```
* 10.	“404 Not Found” what does it mean and how to identify the problem?
```bash
  หา URL ไม่เจอ or ไม่มีข้อมูล
```
* 11.	“500 Internal Server Error” what does it mean and how to identify the problem?
```bash
  server เกิด Error ภายใน server
```
* 12.	“502 Bad Gateway” what does it mean and how to identify the problem?
```bash
  Gatewayไม่สามารถใช้งานได้ poxxy ไม่สามารถใช้งานได้
```
* 13.	“503 Service Unavailable” what does it mean and how to identify the problem?
```bash
    ไม่พร้อมให้บริการ session ไม่ได้เปิดให้บริการ
```
* 14.	“504 Gateway Timeout” what does it mean and how to identify the problem?
```bash
  Gateway ตอบช้าเกินกว่ากหนด
```
* 15.	What are Linux network tools do you use for troubleshooting network problems as well as usage scenarios for each tool?
```bash
  curl และ ping 
```
### Intermediate
* How do you keep the docker image smallest as possible?
```bash
  ติดตั้งเฉพาะที่ใช้งานเข้าไปใน image
```

## HANDS-ON
### Please build and deploy your application of choice using Kubernetes. It should support multiple environments (e.g. beta, prod). The solution must include the following

* Dockerfile or Buildpacks supports the following languages
```bash
  FROM maven:3.6.1-jdk-11-slim AS build
  COPY src /workspace/src
  COPY pom.xml /workspace
  WORKDIR /workspace
  RUN mvn clean install

  FROM openjdk:11.0-slim
  COPY --from=build /workspace/target/*.jar app.jar
  ENTRYPOINT ["java","-jar","app.jar"]
```
* CI/CD pipeline file:
```bash
Git Action
on branch master
```
