    Feature : Login

        Scenario :  Login with valid data
            Given user is on login page
            When user input valid phone number/email
            And user input password
            And user click Login button
            Then user will be redirect to homepage


        Scenario :  Login with valid username and password
            Given user is on login page
            When user input email text box with "ridwan@gmail.com"
            And user input password pada text box with "dummyPassword"
            And user click Login button
            Then user will be redirect to homepage

        Scenario :  Login with invalidvalid username and password
            Given user is on login page
            When user input email text box with "ridwangmail.com"
            And user input password pada text box with "wrongPassword"
            And user click Login button
            Then user will be redirect to homepage