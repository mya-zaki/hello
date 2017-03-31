FROM mysql:5.7

COPY templates/my.cnf /etc/mysql/conf.d/
COPY scripts/init.sql /docker-entrypoint-initdb.d

EXPOSE 3306
