# OrangeHRM Web Automation Framework

<p align="center">

[![Selenium Tests](https://github.com/esilvesc-star/orangehrm-web-automation-java/actions/workflows/maven-tests.yml/badge.svg)](https://github.com/esilvesc-star/orangehrm-web-automation-java/actions/workflows/maven-tests.yml)
[![Allure Report](https://img.shields.io/badge/Allure_Report-GitHub_Pages-blueviolet)](https://esilvesc-star.github.io/orangehrm-web-automation-java/)
![Java](https://img.shields.io/badge/Java-11-orange)
![Selenium](https://img.shields.io/badge/Selenium-WebDriver-brightgreen)
![Cucumber](https://img.shields.io/badge/Cucumber-BDD-23D96C)
![Maven](https://img.shields.io/badge/Maven-Build-C71A36)

</p>

<p align="center">

Framework profissional de automação de testes Web desenvolvido utilizando <strong>Java</strong>, <strong>Selenium WebDriver</strong>, <strong>Cucumber BDD</strong>, <strong>Maven</strong>, <strong>Allure Report</strong> e <strong>GitHub Actions</strong>, aplicando boas práticas de arquitetura, reutilização de código, organização em camadas e integração contínua.

</p>

---

## 📑 Índice

- [🔗 Links Úteis](#-links-úteis)
- [✨ Principais Recursos](#-principais-recursos)
- [🎯 Objetivo](#-objetivo)
- [🛠 Tecnologias](#-tecnologias)
- [🏗 Arquitetura](#-arquitetura)
- [📁 Organização do Framework](#-organização-do-framework)
- [🌎 Gerenciamento de Ambientes](#-gerenciamento-de-ambientes)
- [📊 Relatórios](#-relatórios)
- [🚀 Integração Contínua (CI)](#-integração-contínua-ci)
- [✅ Boas Práticas Aplicadas](#-boas-práticas-aplicadas)
- [🧪 Cenários Automatizados](#-cenários-automatizados)
- [▶️ Como Executar](#️-como-executar)
- [🔮 Roadmap](#-roadmap)
- [👨‍💻 Autor](#-autor)

---

## 🔗 Links Úteis

- 🚀 **Pipeline GitHub Actions**  
  https://github.com/esilvesc-star/orangehrm-web-automation-java/actions

- 📊 **Relatório Allure (GitHub Pages)**  
  https://esilvesc-star.github.io/orangehrm-web-automation-java/

---

## ✨ Principais Recursos

- ✔ Arquitetura baseada em **Page Object Model (POM)**
- ✔ Component Object Model
- ✔ Page Factory
- ✔ Estrutura organizada em camadas
- ✔ Gerenciamento de ambientes (QA, UAT e PROD)
- ✔ Explicit Waits centralizados
- ✔ Captura automática de evidências em falhas
- ✔ Relatórios integrados com Allure Report
- ✔ Pipeline CI utilizando GitHub Actions
- ✔ Publicação automática do relatório via GitHub Pages
- ✔ Framework preparado para crescimento e manutenção

---

## 🎯 Objetivo

Este projeto foi desenvolvido como laboratório de estudos e portfólio profissional para demonstrar a construção de um framework moderno de automação Web baseado em:

- Selenium WebDriver
- Java
- Cucumber BDD
- Maven
- Allure Report
- GitHub Actions
- GitHub Pages
- Page Object Model (POM)
- Component Object Model
- Page Factory
- Gerenciamento de Ambientes
- Explicit Waits
- Captura automática de evidências

---

## 🛠 Tecnologias

| Tecnologia | Finalidade | Versão |
|------------|------------|---------|
| Java | Linguagem principal | 11 |
| Selenium WebDriver | Automação Web | 4.x |
| Cucumber | BDD | 7.x |
| JUnit | Execução dos testes | 4 |
| Maven | Build e dependências | 3.x |
| WebDriverManager | Gerenciamento dos Drivers | 5.x |
| Allure Report | Relatórios | 2.x |
| GitHub Actions | Integração Contínua | CI/CD |

---

## 🏗 Arquitetura

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

### Fluxo da Arquitetura

```text
Feature (BDD)
        │
        ▼
Steps (Cucumber)
        │
        ▼
Pages
        │
        ▼
Components
        │
        ▼
WebDriver
        │
        ▼
Browser
```

---

## 📁 Organização do Framework

| Camada | Responsabilidade |
|---------|------------------|
| Browser | Inicialização e configuração do navegador |
| Components | Centralização dos elementos utilizando Page Factory |
| Pages | Implementação das ações e regras de negócio |
| Steps | Integração entre Gherkin e Pages |
| Hooks | Before e After dos cenários |
| Runner | Configuração da execução do Cucumber |
| Utils | Classes reutilizáveis do framework |
| Features | Cenários BDD escritos em Gherkin |

---

## 🌎 Gerenciamento de Ambientes

O framework suporta múltiplos ambientes utilizando arquivos de propriedades.

```text
application-qa.properties
application-uat.properties
application-prod.properties
```

Execução:

```bash
# QA
mvn clean test -Denv=qa

# UAT
mvn clean test -Denv=uat

# PROD
mvn clean test -Denv=prod
```

---

## 📊 Relatórios

Os resultados da execução são gerados automaticamente na pasta:

```text
allure-results
```

Visualização local:

```bash
allure serve allure-results
```

O framework também:

- Captura screenshot automaticamente em caso de falha
- Anexa a evidência ao Allure Report
- Publica automaticamente o relatório utilizando GitHub Pages

---

## 🚀 Integração Contínua (CI)

A pipeline automatizada executa as seguintes etapas a cada **Push**:

- ✔ Checkout do código
- ✔ Configuração do Java
- ✔ Cache Maven
- ✔ Execução dos testes
- ✔ Geração do relatório Allure
- ✔ Publicação automática do relatório no GitHub Pages

---

## ✅ Boas Práticas Aplicadas

- Page Object Model (POM)
- Component Object Model
- Page Factory
- Separação de responsabilidades
- Gerenciamento por ambiente
- Explicit Waits centralizados
- Reutilização de componentes
- Captura automática de evidências
- Relatórios Allure
- Pipeline CI/CD
- Código preparado para manutenção
- Framework escalável

---

## 🧪 Cenários Automatizados

### Login

- ✅ Login com credenciais válidas
- ✅ Validação da exibição da tela inicial (Dashboard)

---

## ▶️ Como Executar

```bash
# Todos os testes
mvn clean test

# Ambiente QA
mvn clean test -Denv=qa

# Ambiente UAT
mvn clean test -Denv=uat

# Ambiente PROD
mvn clean test -Denv=prod

# Abrir relatório Allure
allure serve allure-results
```

---

## 🔮 Roadmap

### Concluído

- [x] Login válido
- [x] Estrutura POM
- [x] Component Object Model
- [x] Multiambiente
- [x] Allure Report
- [x] Evidências automáticas
- [x] GitHub Actions
- [x] GitHub Pages

### Próximas Evoluções

- [ ] Login inválido
- [ ] Logout
- [ ] Menu lateral
- [ ] Execução paralela
- [ ] Execução por Tags
- [ ] Smoke Tests
- [ ] Regressão
- [ ] Docker
- [ ] Selenium Grid
- [ ] Firefox
- [ ] Edge

---

## 👨‍💻 Autor

### Elói Silvestre Coelho

**QA Lead | QA Automation | Quality Engineering**

Especialista em Estratégia de Testes, Automação, Governança de QA e Arquitetura de Frameworks.

- 🔗 **LinkedIn:** https://www.linkedin.com/in/eloi-silvestre
- 💻 **GitHub:** https://github.com/esilvesc-star

---

## 📄 Licença

Este projeto possui finalidade **educacional e demonstrativa**, sendo utilizado como laboratório de estudos e evolução contínua em **Quality Engineering** e **Automação de Testes**.

---

⭐ Se este projeto foi útil para você, considere deixar uma **Star** no repositório.