*** Settings ***
Library   SeleniumLibrary
Test Teardown   Close Browser

*** Testcases ***
Get data from server
    Open hello page
    Check data

*** Keywords ***
Open hello page
    Open Browser   http://localhost:8080/api/hello.html  
    ...   browser=chrome

Check data
    Wait Until Element Contains  id:_id   1111
    Wait Until Element Contains  id:_name   Up1
