# Project Management API

## Descrição

A Project Management API é uma aplicação RESTful desenvolvida com Spring Boot para gerenciar clientes, projetos e atividades. Este sistema foi criado como parte de um teste para a empresa Grupo AG Capital, visando substituir um sistema legado desktop e atender às necessidades de acessibilidade via internet, especialmente em tempos de COVID-19, onde colaboradores e clientes precisam acessar a plataforma remotamente.

O sistema é projetado para gerenciar os projetos da empresa, facilitando o planejamento e acompanhamento dos times, projetos, clientes e tarefas.


## Inicializar Aplicação
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
![pgAdmin](https://github.com/Ernilson/Project-Management-API/assets/30840118/7133eafb-17d4-409e-aede-ca671e0259c5)

**Observação:** Caso não opte por inicializar a API via Docker, será necessário criar o banco de dados manualmente.

## Tecnologias Utilizadas
- Java 17
- Java Spring
- Maven
- Apache Tomcat
- Banco de Dados PostgreSQL
- Docker
- Swagger

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
  
## Diagrama de Classe
![Diagrama de Classe](https://github.com/Ernilson/Project-Management-API/assets/30840118/d162e957-8ab5-4d3d-a2e9-1a39e574b1fb)

## Diagrama Entidade-Relacionamento
![DER](https://github.com/Ernilson/Project-Management-API/assets/30840118/87ca383f-fe8f-4739-a00e-66e638dd53f7)

## Tratamento de Erro de Validação
![Erro](https://github.com/Ernilson/Project-Management-API/assets/30840118/d78bddad-3548-44a7-9845-6e2c86545bbf)

## Autor
Ernilson Daniel
