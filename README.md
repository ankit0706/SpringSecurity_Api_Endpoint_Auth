# This is a continuation of Sring_Security_Basics

## The purpose of this project is to demonstrate the features available in Spring Security Configuration

Let's say we have a company website that hosts lots of web pages related to the company data.
Now, only the employees should be able to see the internal data pages and that they do once they're authenticated.

However there is a main page too with some public information and a login page through employees login.
These 2 pages don't need to be protected with authentication and we can allow anyone to access them.

So, how do we make an exception for some pages while enforcing authentication on the rest?

The answer lies inside Spring security configuration.

> requestMatchers("/home").permitAll()
> 
> anyRequest().authenticated()

Explore the code for more details.    
