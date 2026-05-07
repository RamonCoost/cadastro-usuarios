# 🚀 API de Cadastro de Usuários

API REST desenvolvida com Spring Boot para cadastro de usuários, aplicando boas práticas de arquitetura em camadas, DTOs, testes e automação com CI/CD.

---

## 🧠 Objetivo

Este projeto tem como objetivo praticar o desenvolvimento de uma API REST completa utilizando Spring Boot, com foco em organização de código, separação de responsabilidades, boas práticas de backend e fluxo de desenvolvimento profissional.

---

## 🛠️ Tecnologias Utilizadas

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- MapStruct
- Gradle

---

## 🧱 Arquitetura do Projeto

O projeto segue uma arquitetura em camadas:

- **Controller** → Exposição dos endpoints REST
- **Service** → Regras de negócio
- **Repository** → Persistência com Spring Data JPA
- **DTOs (Request / Response)** → Separação entre entrada e saída de dados
- **Entity** → Representação das tabelas no banco
- **Mapper (MapStruct)** → Conversão entre Entity e DTO

---

## 📌 Boas Práticas Aplicadas

- Separação de responsabilidades (Controller / Service / Repository)
- Arquitetura em camadas (Clean Architecture básica)
- Uso de DTOs para desacoplamento da Entity
- API REST seguindo padrões HTTP
- Uso de MapStruct para mapeamento limpo e performático
- Código organizado e padronizado
- Estrutura pensada para escalabilidade

---

## 🧪 Testes

O projeto já conta com testes unitários na camada de mapeamento utilizando MapStruct.

Também foram utilizados **DTO Fixtures** para facilitar a criação de dados de teste e manter os testes mais organizados e reutilizáveis.

---

## 📡 Endpoints


GET /usuario
GET /usuario/{email}
POST /usuario
PUT /usuario/{id}
DELETE /usuario/{id}


---

## ▶️ Como rodar o projeto localmente

### 📌 Pré-requisitos

- Java 21
- PostgreSQL
- Git

---

### 📥 Clonar o repositório

git clone https://github.com/seu-usuario/seu-repositorio.git

📂 Acessar o projeto
cd cadastro-usuarios
⚙️ Configurar o banco de dados

Criar o banco no PostgreSQL:

CREATE DATABASE cadastro_usuarios;

Configurar o application.properties:

spring.datasource.url=jdbc:postgresql://localhost:5432/cadastro_usuarios
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
🚀 Executar a aplicação
./gradlew bootRun

No Windows:

gradlew.bat bootRun
🔁 Git Workflow

Este projeto segue um fluxo de versionamento baseado em branches:

📌 Estrutura
main → versão estável
develop → integração de features
feature/* → novas funcionalidades
📌 Exemplo de fluxo
git checkout -b feature/nova-funcionalidade
git add .
git commit -m "feat: adiciona nova funcionalidade"
git push origin feature/nova-funcionalidade

--- 

## 🚀 Melhorias Futuras

- Testes unitários na Service layer
- Testes de integração com Spring Boot Test
- Tratamento global de exceções (@ControllerAdvice)
- Documentação com Swagger/OpenAPI
- Autenticação e autorização com Spring Security
- Containerização com Docker

--- 

# 👨‍💻 Autor
Desenvolvido por **Ramon Costa**

Projeto focado em evolução backend com Java e Spring Boot.