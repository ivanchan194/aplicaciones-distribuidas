# Backend for Aplicaciones Distribuidas

Application is deployed to:

| URL                              |
|----------------------------------|
| https://ad-backend.herokuapp.com |

Access to in memory H2 database:

| URL                                 | JDBC URL       | Username |
|-------------------------------------|----------------|----------|
| https://ad-backend.herokuapp.com/h2 | jdbc:h2:mem:db | sa       |

Access to swagger with endpoints:

| URL                                              |
|--------------------------------------------------|
| https://ad-backend.herokuapp.com/swagger-ui.html |

Deploying the application to Heroku

You need to have a created and account on Heroku and have git installed

| Command                             | Description                                                                       |
|-------------------------------------|-----------------------------------------------------------------------------------|
| `heroku login`                      | Log in to Heroku using your credentials                                           |
| `git push heroku master`            | Pushes the master branch to Heroku                                                |
| `heroku git:clone -a ad-backend`    | OPTIONAL: Use Git to clone ad-backend's source code to your local machine         |
| `heroku git:remote -a ad-backend`   | OPTIONAL: adds Heroku remote to your local git remotes                            |
| `git push heroku testbranch:master` | OPTIONAL: Push a non-master branch (testbranch) to heroku to remote's main branch |