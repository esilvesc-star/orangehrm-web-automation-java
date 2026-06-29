# OrangeHRM Web Automation Framework

<p align="center">

[![Selenium Tests](https://github.com/esilvesc-star/orangehrm-web-automation-java/actions/workflows/maven-tests.yml/badge.svg)](https://github.com/esilvesc-star/orangehrm-web-automation-java/actions/workflows/maven-tests.yml)
[![Allure Report](https://img.shields.io/badge/Allure-Report-blueviolet)](https://esilvesc-star.github.io/orangehrm-web-automation-java/)
![Java](https://img.shields.io/badge/Java-11-orange)
![Selenium](https://img.shields.io/badge/Selenium-WebDriver-brightgreen)
![Cucumber](https://img.shields.io/badge/Cucumber-BDD-23D96C)
![JUnit](https://img.shields.io/badge/JUnit-4-red)
![Maven](https://img.shields.io/badge/Maven-3.x-C71A36)
![GitHub Actions](https://img.shields.io/badge/GitHub-Actions-blue)

</p>

<p align="center">

Framework profissional de automação de testes Web desenvolvido utilizando <strong>Java</strong>, <strong>Selenium WebDriver</strong>, <strong>Cucumber BDD</strong>, <strong>JUnit</strong>, <strong>Maven</strong>, <strong>Allure Report</strong> e <strong>GitHub Actions</strong>, seguindo boas práticas de arquitetura, organização em camadas, reutilização de código, integração contínua e escalabilidade.

</p>

---

# 📌 Sobre o Projeto

Este projeto foi criado como um laboratório de evolução contínua em **Quality Engineering**, simulando a construção de um framework utilizado em ambientes corporativos.

O objetivo é demonstrar, na prática, como estruturar uma solução de automação Web utilizando princípios de arquitetura de software, boas práticas de desenvolvimento e integração contínua (CI/CD).

Todo o framework foi desenvolvido pensando em:

- Arquitetura limpa
- Facilidade de manutenção
- Reutilização de componentes
- Escalabilidade
- Separação de responsabilidades
- Legibilidade
- Evolução contínua

---

# 🚀 Status do Projeto

## Framework

| Recurso | Status |
|---------|:------:|
| Arquitetura POM | ✅ |
| Component Object Model | ✅ |
| Multiambiente | ✅ |
| Allure Report | ✅ |
| GitHub Actions | ✅ |
| GitHub Pages | ✅ |
| Captura de Evidências | ✅ |
| Smoke Tests | ✅ |
| CI/CD | ✅ |

---

# 📊 Cobertura Atual

| Módulo | Smoke | Regressão |
|---------|:------:|:---------:|
| Login | ✅ | ⏳ |
| My Info | ✅ | ⏳ |
| Admin | ⏳ | ⏳ |
| PIM | ⏳ | ⏳ |
| Leave | ⏳ | ⏳ |
| Recruitment | ⏳ | ⏳ |

---

# 📑 Índice

- [🔗 Links Úteis](#-links-úteis)
- [✨ Principais Recursos](#-principais-recursos)
- [🎯 Objetivo](#-objetivo)
- [🛠 Tecnologias](#-tecnologias)
- [🏗 Arquitetura](#-arquitetura)
- [📁 Estrutura do Projeto](#-estrutura-do-projeto)
- [🌎 Gerenciamento de Ambientes](#-gerenciamento-de-ambientes)
- [📊 Relatórios](#-relatórios)
- [🚀 Integração Contínua](#-integração-contínua)
- [🧪 Cenários Automatizados](#-cenários-automatizados)
- [▶️ Como Executar](#️-como-executar)
- [🗺 Roadmap](#-roadmap)
- [👨‍💻 Autor](#-autor)

---

# 🔗 Links Úteis

- 🚀 **Pipeline GitHub Actions**  
  https://github.com/esilvesc-star/orangehrm-web-automation-java/actions

- 📊 **Relatório Allure (GitHub Pages)**  
  https://esilvesc-star.github.io/orangehrm-web-automation-java/

---

# ✨ Principais Recursos

- ✔ Arquitetura baseada em **Page Object Model (POM)**
- ✔ Component Object Model
- ✔ Separação de responsabilidades
- ✔ Organização por módulos funcionais
- ✔ Estrutura preparada para escalabilidade
- ✔ Multiambiente (QA, UAT e PROD)
- ✔ Gerenciamento de configurações por ambiente
- ✔ Explicit Waits centralizados
- ✔ Captura automática de evidências em falhas
- ✔ Relatórios Allure
- ✔ Pipeline CI/CD com GitHub Actions
- ✔ Publicação automática do Allure no GitHub Pages
- ✔ Smoke Tests executados automaticamente
- ✔ Framework preparado para evolução contínua

---

# 🎯 Objetivo

Construir um framework de automação Web que represente uma estrutura encontrada em projetos corporativos, aplicando boas práticas de Engenharia de Software e Engenharia de Qualidade.

Além da automação dos testes, o projeto demonstra conhecimentos em:

- Arquitetura de Frameworks
- Organização em Camadas
- Test Automation Design Patterns
- CI/CD
- Versionamento com Git
- Relatórios de Execução
- Evidências Automáticas
- Escalabilidade
- Manutenibilidade

---

# 🛠 Tecnologias

| Tecnologia | Finalidade | Versão |
|------------|------------|:------:|
| Java | Linguagem principal | 11 |
| Selenium WebDriver | Automação Web | 4.x |
| Cucumber | BDD | 7.x |
| JUnit | Execução dos testes | 4 |
| Maven | Gerenciamento do Build | 3.x |
| WebDriverManager | Gerenciamento dos Drivers | 5.x |
| Allure Report | Relatórios | 2.x |
| GitHub Actions | CI/CD | ✔ |
| GitHub Pages | Publicação dos relatórios | ✔ |

---

# 🏗 Arquitetura do Framework

O projeto foi desenvolvido utilizando uma arquitetura em camadas, promovendo reutilização, desacoplamento e facilidade de manutenção.

```text
Feature (BDD)
        │
        ▼
Step Definitions
        │
        ▼
Page Objects
        │
        ▼
Components
(Element Mapping)
        │
        ▼
Utilities
(Waits • Driver • Config)
        │
        ▼
WebDriver
        │
        ▼
Browser Factory
```

Cada camada possui uma responsabilidade bem definida, tornando o framework preparado para crescer sem aumentar sua complexidade.

---

# 📁 Estrutura do Projeto

```text
src
└── test
    ├── java
    │   ├── browser
    │   │   └── BrowserFactory.java
    │   │
    │   ├── components
    │   │   ├── DashboardComponent.java
    │   │   ├── LoginComponent.java
    │   │   └── MyInfoComponent.java
    │   │
    │   ├── pages
    │   │   ├── DashboardPage.java
    │   │   ├── LoginPage.java
    │   │   └── MyInfoPage.java
    │   │
    │   ├── runner
    │   │   └── TestRunner.java
    │   │
    │   ├── steps
    │   │   ├── LoginSteps.java
    │   │   └── MyInfoSteps.java
    │   │
    │   └── utils
    │       ├── ConfigReader.java
    │       ├── DriverManager.java
    │       └── WaitUtils.java
    │
    └── resources
        ├── features
        │   ├── login
        │   └── myinfo
        │
        ├── application-qa.properties
        ├── application-uat.properties
        ├── application-prod.properties
        ├── cucumber.properties
        └── allure.properties
```

---

# 🧩 Organização das Camadas

| Camada | Responsabilidade |
|---------|------------------|
| **Browser** | Inicialização e configuração dos navegadores |
| **Components** | Mapeamento dos elementos utilizando Page Factory |
| **Pages** | Implementação das regras de negócio e ações das telas |
| **Steps** | Implementação das etapas descritas no Gherkin |
| **Runner** | Configuração da execução dos testes Cucumber |
| **Utils** | Classes utilitárias compartilhadas por todo o framework |
| **Features** | Cenários BDD escritos em Gherkin |

---

# 🌎 Gerenciamento de Ambientes

O framework suporta a execução em diferentes ambientes através de arquivos de configuração específicos.

```text
application-qa.properties
application-uat.properties
application-prod.properties
```

A seleção do ambiente é realizada via parâmetro Maven:

```bash
# QA
mvn clean test -Denv=qa
```

```bash
# UAT
mvn clean test -Denv=uat
```

```bash
# PROD
mvn clean test -Denv=prod
```

Essa abordagem permite que a mesma suíte de testes seja executada em diferentes ambientes sem necessidade de alteração no código-fonte.

---

# 📊 Relatórios de Execução

O framework utiliza **Allure Report** para geração de relatórios ricos em detalhes sobre cada execução.

Durante os testes são disponibilizados:

- ✔ Status de cada cenário
- ✔ Tempo de execução
- ✔ Steps executados
- ✔ Evidências automáticas em caso de falha
- ✔ Stack Trace
- ✔ Histórico de execução (quando disponível)

Os resultados são gerados automaticamente em:

```text
allure-results/
```

Para visualizar o relatório localmente:

```bash
allure serve allure-results
```

Além da execução local, o relatório também é publicado automaticamente no **GitHub Pages** após cada execução da pipeline.

---

# 🚀 Integração Contínua (CI/CD)

O projeto possui uma pipeline automatizada utilizando **GitHub Actions**, responsável por validar a qualidade do framework a cada alteração enviada ao repositório.

## Fluxo da Pipeline

```text
Developer
    │
    ▼
Git Push
    │
    ▼
GitHub Actions
    │
    ▼
Checkout do Código
    │
    ▼
Configuração do Java
    │
    ▼
Cache Maven
    │
    ▼
Execução dos Smoke Tests
    │
    ▼
Geração do Allure Report
    │
    ▼
Publicação no GitHub Pages
```

### Etapas executadas

- ✔ Checkout do código
- ✔ Configuração do Java 11
- ✔ Cache das dependências Maven
- ✔ Execução automática da suíte Smoke
- ✔ Geração do Allure Report
- ✔ Publicação automática no GitHub Pages

> **Importante:** mesmo quando um teste falha, o relatório Allure é gerado e publicado, permitindo a análise das evidências diretamente pelo GitHub Pages. Ao final da execução, a pipeline permanece com status **Failed**, refletindo corretamente a falha dos testes.

---

# 🧪 Estratégia de Execução

Atualmente o framework utiliza **Tags do Cucumber** para organizar as suítes de testes.

Exemplo:

```gherkin
@smoke
@login
```

```gherkin
@smoke
@myinfo
```

Execução da suíte Smoke:

```bash
mvn clean test -Dcucumber.filter.tags="@smoke"
```

Execução de um módulo específico:

```bash
mvn clean test -Dcucumber.filter.tags="@smoke and @myinfo"
```

Essa estratégia facilita a integração com pipelines CI/CD e permite selecionar rapidamente subconjuntos de testes conforme a necessidade.

---

# ▶️ Como Executar

## Executar todos os testes

```bash
mvn clean test
```

---

## Executar suíte Smoke

```bash
mvn clean test -Dcucumber.filter.tags="@smoke"
```

---

## Executar Smoke do módulo My Info

```bash
mvn clean test -Dcucumber.filter.tags="@smoke and @myinfo"
```

---

## Executar em ambiente específico

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

## Abrir o relatório Allure

```bash
allure serve allure-results
```

---

# 📋 Cobertura Funcional

O framework está sendo desenvolvido de forma incremental, simulando a evolução de uma suíte de testes corporativa.

Cada funcionalidade é organizada em módulos independentes, permitindo crescimento contínuo e facilitando a manutenção da automação.

## Módulos

| Módulo | Smoke | Regressão | Status |
|---------|:------:|:---------:|:------:|
| Login | ✅ | ⏳ | Em evolução |
| Dashboard | ✅ | ⏳ | Em evolução |
| My Info | ✅ | ⏳ | Em evolução |
| Admin | ⏳ | ⏳ | Planejado |
| PIM | ⏳ | ⏳ | Planejado |
| Leave | ⏳ | ⏳ | Planejado |
| Time | ⏳ | ⏳ | Planejado |
| Recruitment | ⏳ | ⏳ | Planejado |
| Performance | ⏳ | ⏳ | Planejado |

---

# 🧪 Cenários Automatizados

## 🔐 Login

### Smoke

- ✅ Login com credenciais válidas
- ✅ Validação da exibição da Dashboard

---

## 👤 My Info

### Smoke

- ✅ Acesso ao módulo My Info
- ✅ Validação da exibição da tela Personal Details

### Próximos cenários

- ⏳ Atualização de First Name
- ⏳ Atualização de Last Name
- ⏳ Atualização de Employee Id
- ⏳ Atualização de Other Id
- ⏳ Atualização de Driver License
- ⏳ Salvamento das informações
- ⏳ Validação da persistência dos dados
- ⏳ Validação da mensagem de sucesso

---

# 🧩 Estratégia de Automação

Os cenários são classificados por finalidade, permitindo diferentes estratégias de execução durante a pipeline.

| Tipo | Objetivo |
|-------|----------|
| Smoke | Validar rapidamente os principais fluxos da aplicação após um deploy |
| Regressão | Garantir que funcionalidades existentes continuam funcionando |
| Funcional | Validar regras de negócio específicas |
| Integração | Validar interação entre módulos |
| End-to-End | Validar o fluxo completo do usuário |

Atualmente, a pipeline executa automaticamente a suíte **Smoke**, garantindo feedback rápido sobre a estabilidade da aplicação.

---

# 🗺 Roadmap

## ✅ Concluído

- [x] Arquitetura baseada em POM
- [x] Component Object Model
- [x] Multiambiente
- [x] Configuração via Properties
- [x] Browser Factory
- [x] Explicit Waits
- [x] Login válido
- [x] Dashboard
- [x] Primeiro cenário Smoke
- [x] Módulo My Info
- [x] Captura automática de evidências
- [x] Integração com Allure Report
- [x] Publicação do Allure via GitHub Pages
- [x] Pipeline CI/CD com GitHub Actions

---

## 🚧 Em desenvolvimento

- [ ] Atualização dos dados pessoais (My Info)
- [ ] Validação da persistência das informações
- [ ] Validação da mensagem de sucesso
- [ ] Login inválido
- [ ] Logout

---

## 🔮 Próximas Evoluções

### Framework

- [ ] Execução paralela
- [ ] Selenium Grid
- [ ] Docker
- [ ] Firefox
- [ ] Microsoft Edge
- [ ] Retry automático
- [ ] Dashboard de métricas

### Qualidade

- [ ] Regressão automatizada
- [ ] Integração com SonarQube
- [ ] Integração com Jira/Xray
- [ ] Relatórios históricos Allure

### Funcionalidades

- [ ] Admin
- [ ] PIM
- [ ] Leave
- [ ] Time
- [ ] Recruitment
- [ ] Performance

---

# 👨‍💻 Autor

## Elói Silvestre Coelho

**QA Lead | QA Automation Engineer | Quality Engineering**

Profissional com mais de **15 anos de experiência em Qualidade de Software**, atuando em Estratégia de Testes, Automação Web, Governança de QA e evolução de Frameworks de Automação.

### Especialidades

- Test Automation
- Selenium WebDriver
- Java
- Cucumber BDD
- Playwright
- CI/CD
- GitHub Actions
- Allure Report
- Test Strategy
- Quality Engineering

---

## 🌐 Conecte-se

🔗 **LinkedIn**

https://www.linkedin.com/in/eloi-silvestre

💻 **GitHub**

https://github.com/esilvesc-star

---

# 🤝 Contribuições

Este projeto possui finalidade educacional e demonstração de boas práticas de Engenharia de Qualidade.

Sugestões, melhorias e discussões sobre arquitetura de automação são sempre bem-vindas.

Caso tenha alguma sugestão, fique à vontade para abrir uma **Issue** ou enviar um **Pull Request**.

---

# 📄 Licença

Este projeto é disponibilizado para fins **educacionais**, **estudos** e **demonstração de conhecimentos técnicos**, servindo como laboratório de evolução contínua em Automação de Testes.

---

# 🎯 Objetivos do Projeto

Este repositório foi criado com o objetivo de demonstrar conhecimentos em:

- ✔ Arquitetura de Frameworks de Automação
- ✔ Engenharia de Qualidade
- ✔ Selenium WebDriver
- ✔ Java
- ✔ Cucumber BDD
- ✔ Design Patterns para Automação
- ✔ Integração Contínua (CI/CD)
- ✔ GitHub Actions
- ✔ Allure Report
- ✔ Boas práticas de desenvolvimento
- ✔ Organização de projetos corporativos

---

# 🚀 Próximos Passos

A evolução do framework continuará acompanhando um cenário próximo ao encontrado em projetos reais.

Os próximos incrementos contemplam:

- Ampliação da cobertura funcional do módulo **My Info**
- Implementação de novos módulos do OrangeHRM
- Evolução da suíte de regressão
- Execução paralela
- Docker
- Selenium Grid
- Integração com SonarQube
- Integração com Jira/Xray
- Dashboard de métricas

---

<p align="center">

### ⭐ Se este projeto foi útil para você, considere deixar uma Star no repositório.

Isso incentiva a evolução contínua do framework e ajuda outras pessoas interessadas em Engenharia de Qualidade e Automação de Testes.

</p>
