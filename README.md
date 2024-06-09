# Project Management API

## Descrição

A Project Management API é uma aplicação RESTful desenvolvida com Spring Boot para gerenciar clientes, projetos e atividades. Este sistema foi criado como parte de um teste para a empresa Grupo AG Capital, visando substituir um sistema legado desktop e atender às necessidades de acessibilidade via internet, especialmente em tempos de COVID-19, onde colaboradores e clientes precisam acessar a plataforma remotamente.

A API é desenvolvida na arquitetura em camadas seguindo o padrão MVC (Model-View-Controller), facilitando a separação de responsabilidades e a manutenção do código.

O sistema é projetado para gerenciar os projetos da empresa, facilitando o planejamento e acompanhamento dos times, projetos, clientes e tarefas.


## Inicializar Postgresql e PgAdmin
Navegue até o diretório docker:
```bash
cd docker
```
Remova os containers, networks e volumes preexistentes no arquivo docker-compose.yaml:
```bash
docker-compose down
```
Inicie os serviços definidos no arquivo docker-compose.yaml:
```bash
docker-compose up
```

## Acesso aos Serviços 
API disponível no Swagger UI:
```bash
http://localhost:8080/swagger-ui/index.html
```
PgAdmin com login através de **admin@gmail.com** e senha **admin** acessível em:
```bash
http://localhost:16543/login?next=%2F
```
##### Adicione um Novo Servidor no PgAdmin:
![pgAdmin](https://github.com/Ernilson/Project-Management-API/assets/30840118/100ccf93-1508-4823-ba71-f119811581c9)



## Tecnologias Utilizadas
- Java 17
- Java Spring
- Maven
- Apache Tomcat
- Banco de Dados PostgreSQL
- Docker
- Swagger
- JUnit
- Mockito

## A API fornece os seguintes endpoints:
```bash
## Cliente
GET /api/clientes
GET /api/clientes/{id}
POST /api/clientes
PUT /api/clientes/{id}
DELETE /api/clientes/{id}

## Projeto
GET /api/projetos
GET /api/projetos/{id}
GET /api/projetos/em-aberto
POST /api/projetos
PUT /api/projetos/{id}
DELETE /api/projetos/{id}

## Atividade
POST /api/atividades
```

## Funcionalidades

- **Clientes**: Gerenciamento de clientes, incluindo criação, leitura, atualização e exclusão de registros.
- **Projetos**: Gerenciamento de projetos, incluindo criação, leitura, atualização e exclusão de registros. Os projetos são associados aos clientes.
- **Atividades**: Inclusão de atividades que são associadas aos projetos e, por consequência, aos clientes.
- **Listagem de Projetos em Aberto**: Endpoint que lista os projetos em aberto, mostrando a qual cliente pertence e permitindo visualizar a lista de atividades cadastradas para o projeto.

## Testes Unitários
A API possui testes unitários utilizando JUnit e Mockito para garantir a qualidade e a confiabilidade do código. Esses testes cobrem as funcionalidades principais dos serviços, verificando o comportamento esperado das operações de CRUD e outros serviços oferecidos pela aplicação.
  
## Diagrama de Classe
![Diagrama de Classe](https://github.com/Ernilson/Project-Management-API/assets/30840118/05ed2b82-225e-4dfc-a447-24f38b1ea557)

## Diagrama Entidade-Relacionamento
![DER](https://github.com/Ernilson/Project-Management-API/assets/30840118/4615d7e4-d12c-4fe8-ba1c-1960922988c8)

## Tratamento de Erro de Validação
![Erro](https://github.com/Ernilson/Project-Management-API/assets/30840118/587d5eb2-35bd-4202-8af7-94cbe00af468)

## Autor
Ernilson Daniel
