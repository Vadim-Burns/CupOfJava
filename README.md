# CupOfJava Project
This spring boot project created for BestHack 2022 by CupOfJava.

## Description
Empty now

## How to start
Empty now

## Tests
Empty now

## Swagger
**Dev profile only**
Swagger url of this system is `host:port/swagger-ui/`

## Requirements
Java version is `>=17`

Postgresql is `>=13.5`

Easy start via docker: `docker run -d --name postgres -e POSTGRES_PASSWORD=password -e POSTGRES_USER=user -d -p 127.0.0.1:5432:5432 -v $HOME/docker/volumes/postgres:/var/lib/postgresql/data postgres`

Redis is `>=6.2.0`

Easy start via docker: `docker run -d --name redis redis`

## Dependencies
Project based on Spring Boot `2.6.6`

List of dependencies:
1. Spring boot
2. Spring Redis
3. Spring Security
4. Spring Cache
5. Spring Postgresql

## Environment variables
You can find all config variables in `src/main/resources/application.properties`

### Server
1. `HOST` - ip or domain server address(`default: '127.0.0.1'`)
2. `PORT` - server port(`default: '8080'`)
3. `DEBUG` - true/false value(`default: 'false'`)

### Postgresql
1. `DB_HOST` - ip or domain address of database(`default: '127.0.0.1'`)
2. `DB_PORT` - port of database(`default: '5432'`)
3. `DB_NAME` - database name(`default: 'cup'`)
4. `DB_USER` - database user
5. `DB_PASSWORD` - database password
6. `DB_SCHEME` - database scheme(`default: 'public'`)

### Redis
1. `REDIS_HOST` - ip or domain address of redis(`default: '127.0.0.1'`)
2. `REDIS_PORT` - redis port(`default: '6379'`)
3. `REDIS_INDEX` - redis index(`default: '0'`)
