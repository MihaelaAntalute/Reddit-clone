# Hi, I'm Mihaela! 👋
And here you can find the documentation of the Reddit Clone project


## 🚀 About Me
I'm a back-end software developer, passionate about solving problems using technology


## 🛠 Skills
Java, OOP, Spring Boot, Rest APIs, MySQL


## 🔗 Links
[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/MihaelaAntalute/Reddit-clone/)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/mihaela-antalute/)



# Reddit clone

This application is a social news aggregation, content rating, and discussion website.Registered users submit content to the site such as links, text posts, images, and videos, which are then voted up or down by other members


## Features

As a user,I can:
- Subreddit: add subreddit, get all subreddits, get subreddit, delete subreddit,
- Post: add post, get post by subreddit, get post by user, get all posts, update post,
- Comment: add comment, get comment by post, get comment by user
As a Subreddit admin role,I can
- To ban other users, so that they can no longer post in the subreddit created by the admin


## Built with
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![MySQL](https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white)

## Demo

Insert gif or link to demo


## API Reference

#### Add a subreddit

```http
  POST /subreddit/add
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `body` | `json` | **Required**. The properties of subreddit to be added |

Request body example:
```json
    {
      "name": "work",
      "description": "about the work schedule"
    }
```  


#### Add a post to subreddit

```http
  POST /post/add
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `body` | `json` | **Required**. The properties of post to be added |


Request body example:
```json
    {
      "postName": "my opinion",
      "description": "about my work schedule",
      "subredditId":"12"
    }
```  

#### Get post by user

```http
  GET /user/${userId}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `Long` | **Required**. Id of the item to fetch |



## API Authentication and Authorization

There are only two requests which don't require authorization headers.

#### Authenticate (login)

```http
  POST /authenticate
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `body` | `json` | **Required**. The properties of user to authenticate  |

Request body example:

```json
{
  "password": "string",
  "username": "string"
}
```  

#### Register 

```http
  POST /register
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `body` | `json` | **Required**. The properties of user to register  |

Request body example:

```json
{
  {
  "email": "string",
  "password": "string",
  "username": "string"
}
}
```  
After running the authenticate request, the client will obtain an access token that will be used in all subsequent request in order to authenticate the user and to authorize the user based on its role.

This is an example of what should be included in the request header:

```http
Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyIiwiZXhwIjoxNjcxMTQzMzEyfQ.dxIzsD9Bm8y_kw3MOoZ2JXIKOg--uZaA5XNtBLdGYc4Ps3nlzBFDwBJi0bEeHlCggonZ6nQ2zwCI0D5a7dXjmw
```  


## Prerequisites
For building and running the application you need:
- JDK 1.8 or higher
- Maven 3

For deploying on Heroku you need:
- GIT 
- Heroku CLI
Clone the project

```bash
  git clone https://link-to-project
```

Go to the project directory

```bash
  cd my-project
```

## Dependencies
You don't need any additional dependencies.
All dependecies related to database management, server management, security management and so on, will be automatically injected by Maven using the pom.xml file located in the root folder of the project.

## Installation

Clone the project

```bash
  git clone https://link-to-project
```

Go to the project directory

```bash
  cd my-project
```

    
## Run Locally

Use maven to build the app and, to run it, and to start the local embedded Tomcat server

```bash
  mvn spring-boot:run
```



## Running Tests

To run tests, run the following command

```bash
  npm run test
```


## Environment Variables

You can deploy this project using Heroku or other providers as well, by specifying the following environment variables:

`PROFILE`

`MYSQL_URL`

`MYSQL_USER`

`MYSQL_PASS`



## Deployment
To deploy this project run

```bash
  git push heroku master
```



## Usage/Examples

You can use a demo version of the app, using SwaggerUI and following this link:

```javascript
https://obscure-peal.heroku.app/swagger-ui/
``` 
First, obtain an access token by running the /authenticate endpoint with username "user" and password "pass", which will grant you admin rights in the application.

![App Screenshot](https://i.imgur.com/VTQibfA_d.webp?maxwidth=760&fidelity=grand)

After that, authorize yourself by clicking the authorize button and copy-pasteing the token from the response.

![App Screenshot](https://i.imgur.com/arTX2Ke_d.webp?maxwidth=760&fidelity=grand)

From now on, you can use all other available endpoints, as per swagger documentation.



## Roadmap

In the future, application can be extended with following:

- Users can earn "karma" for their posts and comments, a status that reflects their standing within the community and their contributions to Reddit





## Badges
![Maintained](https://img.shields.io/badge/Maintained%3F-yes-green.svg)
![GIT](https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white)
![Heroku](https://img.shields.io/badge/heroku-%23430098.svg?style=for-the-badge&logo=heroku&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![JWT](https://img.shields.io/badge/json%20web%20tokens-323330?style=for-the-badge&logo=json-web-tokens&logoColor=pink)


