*** Settings ***
Library   SeleniumLibrary

*** Testcases ***
ทดสอบการแสดงผลข้อมูลที่ถูกต้อง
    เปิดหน้า web ด้วย chrome
    แสดงค่า id เป็น 1111
    แสดงค่า name เป็น Up1
    ปิดหน้า web

*** Keywords ***
ปิดหน้า web
    Close Browser

แสดงค่า name เป็น Up1
    Wait Until Element Contains   id:_name    Up1

แสดงค่า id เป็น 1111
    Wait Until Element Contains   id:_id    1111


เปิดหน้า web ด้วย chrome
    Open Browser   http://localhost:8080/api/hello.html
    ...   browser=chrome