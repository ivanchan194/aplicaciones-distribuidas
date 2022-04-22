# Backend for Aplicaciones Distribuidas

## Application is deployed to:

| Environment | URL                              |
|-------------|----------------------------------|
| Local       | http://localhost:8080            |
| Heroku      | https://ad-backend.herokuapp.com |

## Access to swagger with endpoints:

| Environment | URL                                              |
|-------------|--------------------------------------------------|
| Local       | http://localhost:8080/swagger-ui.html            |
| Heroku      | https://ad-backend.herokuapp.com/swagger-ui.html |

## Access to in memory H2 database:

**Change only the values specified in the table**

| Environment | URL                                 | JDBC URL       | Username |
|-------------|-------------------------------------|----------------|----------|
| Local       | http://localhost:8080/h2            | jdbc:h2:mem:db | sa       |
| Heroku      | https://ad-backend.herokuapp.com/h2 | jdbc:h2:mem:db | sa       |

## Deploying the application to Heroku

You need to have a created and account on Heroku and have git installed

| Command                           | Description                                                                       |
|-----------------------------------|-----------------------------------------------------------------------------------|
| `heroku login`                    | Log in to Heroku using your credentials                                           |
| `git push heroku main`            | Pushes the master branch to Heroku                                                |
| `heroku git:clone -a ad-backend`  | OPTIONAL: Use Git to clone ad-backend's source code to your local machine         |
| `heroku git:remote -a ad-backend` | OPTIONAL: Add Heroku remote to your local git remotes to enable deployment        |
| `git push heroku testbranch:main` | OPTIONAL: Push a non-master branch (testbranch) to heroku to remote's main branch |