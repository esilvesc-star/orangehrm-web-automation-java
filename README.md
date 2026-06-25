# OrangeHRM Web Automation Framework

![Java](https://img.shields.io/badge/Java-11-orange)
![Selenium](https://img.shields.io/badge/Selenium-4.x-brightgreen)
![Cucumber](https://img.shields.io/badge/Cucumber-BDD-23D96C)
![Maven](https://img.shields.io/badge/Maven-3.x-C71A36)
![Allure](https://img.shields.io/badge/Allure-Report-blueviolet)
![GitHub Actions](https://img.shields.io/badge/CI-GitHub_Actions-success)

> Framework de automação de testes Web desenvolvido para demonstrar uma arquitetura profissional utilizando **Selenium WebDriver**, **Java**, **Cucumber BDD**, **Maven**, **Allure Report** e **GitHub Actions**, seguindo boas práticas de organização, reutilização de código e escalabilidade.

---

# Objetivo

Este projeto foi desenvolvido como laboratório de estudos e portfólio profissional para demonstrar a implementação de um framework moderno de automação Web baseado em:

* Selenium WebDriver
* Java
* Cucumber BDD
* Maven
* Allure Report
* GitHub Actions (CI)
* GitHub Pages
* Page Object Model (POM)
* Component Object Model
* Page Factory
* Gerenciamento de ambientes
* Explicit Waits
* Captura automática de evidências em falha

---

# Tecnologias

| Tecnologia         | Versão |
| ------------------ | ------ |
| Java               | 11     |
| Selenium WebDriver | 4.x    |
| Cucumber           | 7.x    |
| JUnit              | 4      |
| Maven              | 3.x    |
| WebDriverManager   | 5.x    |
| Allure Report      | 2.x    |
| GitHub Actions     | CI/CD  |

---

# Arquitetura

```text
src
└── test
    ├── java
    │   ├── browser
    │   ├── components
    │   ├── pages
    │   ├── runner
    │   ├── steps
    │   └── utils
    │
    └── resources
        ├── features
        ├── application-qa.properties
        ├── application-uat.properties
        ├── application-prod.properties
        └── allure.properties
```

## Fluxo da Arquitetura

```text
Feature (BDD)

        ↓

Steps (Cucumber)

        ↓

Pages

        ↓

Components

        ↓

WebDriver

        ↓

Browser
```

---

# Organização do Framework

## Browser

Responsável pela criação e configuração dos navegadores suportados pelo framework.

---

## Components

Centraliza o mapeamento dos elementos da interface utilizando **Page Factory**, promovendo reutilização e reduzindo duplicação de código.

---

## Pages

Implementa as ações e comportamentos de cada tela da aplicação.

Exemplos:

* Login
* Navegação
* Validações
* Regras de negócio

---

## Steps

Responsável por conectar os cenários escritos em Gherkin às implementações das Pages.

---

## Hooks

Executa ações antes e depois de cada cenário.

Atualmente realiza:

* Inicialização do navegador
* Encerramento do navegador
* Captura automática de screenshot em falha
* Anexo da evidência ao relatório Allure

---

## Runner

Configuração da execução dos testes Cucumber.

---

## Utils

Centraliza componentes reutilizáveis do framework.

Atualmente:

* ConfigReader
* DriverManager
* WaitUtils

---

# Gerenciamento de Ambientes

O framework suporta múltiplos ambientes através dos arquivos:

```text
application-qa.properties
application-uat.properties
application-prod.properties
```

Execução:

```bash
mvn clean test -Denv=qa
```

```bash
mvn clean test -Denv=uat
```

```bash
mvn clean test -Denv=prod
```

---

# Relatórios

O framework gera automaticamente os resultados na pasta:

```text
allure-results
```

Visualização local:

```bash
allure serve allure-results
```

Além disso:

* Captura screenshot automaticamente em falhas
* Anexa evidências ao Allure Report
* Publica o relatório automaticamente via GitHub Pages

---

# Integração Contínua (CI)

O projeto possui pipeline automatizada utilizando **GitHub Actions**.

A cada Push:

* Checkout do código
* Configuração do Java
* Cache Maven
* Execução dos testes
* Geração do relatório Allure
* Publicação automática do relatório no GitHub Pages

---

# Boas Práticas Aplicadas

* Page Object Model (POM)
* Component Object Model
* Page Factory
* Separação de responsabilidades
* Configuração por ambiente
* Explicit Waits centralizados
* Reutilização de componentes
* Captura automática de evidências
* Integração com Allure
* Pipeline CI/CD
* Código orientado à manutenção
* Framework preparado para crescimento

---

# Cenários Automatizados

## Login

* ✔ Login com credenciais válidas
* ✔ Validação da exibição da tela inicial (Dashboard)

---

# Como Executar

Todos os testes:

```bash
mvn clean test
```

Ambiente específico:

```bash
mvn clean test -Denv=qa
```

```bash
mvn clean test -Denv=uat
```

```bash
mvn clean test -Denv=prod
```

Visualizar relatório:

```bash
allure serve allure-results
```

---

# Roadmap

Próximas evoluções do framework:

* Login inválido
* Logout
* Menu lateral
* Execução paralela
* Execução por Tags
* Smoke Tests
* Regressão
* Docker
* Selenium Grid
* Firefox
* Edge

---

# Autor

## Elói Silvestre Coelho

**QA Lead | QA Automation | Quality Engineering**

Especialista em Estratégia de Testes, Automação, Governança de QA e Arquitetura de Frameworks.

**LinkedIn**

https://www.linkedin.com/in/eloi-silvestre

**GitHub**

https://github.com/esilvesc-star

---

# Observação

Projeto desenvolvido para fins educacionais e demonstração de boas práticas de automação de testes Web, servindo como laboratório de evolução contínua em Quality Engineering.
