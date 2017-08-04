@Regression
Feature: login

@loginAndCreatRecord
Scenario: login to BillingCenter
Given User_login to BillingCenter
When User click on product tab
Then User clicks on Creat task order
When User clicks on creats new record
Then New record page appers
When User fill datas to creat new Record and put submit
Then New record will be created with same name


@loginandEditRecord
Scenario: login to BillingCenter
Given User_login to BillingCenter
When User click on product tab
Then User clicks on Creat task order
When User click on Filtericon
Then User clicks on first appearing record
When User clicks on edit record and made some changes and save the chages
Then User validates wheather the changes are reflected on the record 



@loginandDeleteRecord
Scenario: login to BillingCenter
Given User_login to BillingCenter
When User click on product tab
Then User clicks on Creat task order
When User click on Filtericon
Then User clicks on the row to delete
When User clicks on Remove Record Button
Then User validates if that record is deleted


@loginandCopyRecord
Scenario: login to BillingCenter
Given User_login to BillingCenter
When User click on product tab
Then User clicks on Creat task order
When User Chooses the record tobe copied
And User Copies the record 
And User made some changes and save the changes
Then User validates wheather it is copied

@MakeyMyTrp
Scenario: Book the movie ticket
Given User is at home page "%URL" of book my trip.
#Given User is at home page of book my trip.
#And I select the city as Bangalore
#Then I verify the city appear on book my trip as bangalore
#And I select the top three movie from list
#Then I click on Sunil grover Show

@Appium
Scenario: Demo of Andriod Testing
Given click on coming Soon Icon On Book my home page

 @bigbasket
Scenario: Book the movie ticket
Given User is at home page "bigbasket" of book my trip.


 