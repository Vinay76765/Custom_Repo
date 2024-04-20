@Admin_subs
Feature: Admin subscription accept

  Scenario Outline: Admin subscription
    Given goto admin
    When login to admin
    And Click on side menu Settings
    And Clicks on menu <menu> and submenu <submenu>
    Then accepts payment request of instructor <email>
    
    Examples:
    |menu              | submenu           | email                                         |  s_menu
    |User Management   | Registration      | vinaykumarap.16is@saividya.ac.in              | Settings