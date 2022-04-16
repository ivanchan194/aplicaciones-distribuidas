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

| Command                           | Description                                                                       |
|-----------------------------------|-----------------------------------------------------------------------------------|
| `heroku login`                    | Log in to Heroku using your credentials                                           |
| `heroku git:remote -a ad-backend` | OPTIONAL: adds Heroku remote to your local git remotes                            |
| `git push heroku master`          | Pushes the master branch to Heroku                                                |
| `git push heroku testbranch:main` | OPTIONAL: Push a non-master branch (testbranch) to heroku to remote's main branch |