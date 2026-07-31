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
Framework de automação de testes Web desenvolvido com
<strong>Java</strong>, <strong>Selenium WebDriver</strong>,
<strong>Cucumber BDD</strong>, <strong>JUnit</strong>,
<strong>Maven</strong>, <strong>Allure Report</strong> e
<strong>GitHub Actions</strong>.
</p>

<p align="center">
O projeto simula a construção e a evolução de um framework utilizado em ambientes corporativos, com foco em arquitetura, reutilização, rastreabilidade, integração contínua e facilidade de manutenção.
</p>

---

## 📌 Sobre o projeto

Este repositório foi criado como um laboratório de evolução contínua em **Quality Engineering**.

Além de automatizar cenários da aplicação OrangeHRM, o projeto demonstra como organizar um framework próximo da realidade encontrada em projetos profissionais, aplicando:

- Page Object Model;
- Component Object Model;
- separação de responsabilidades;
- organização em camadas;
- configuração por ambiente;
- esperas explícitas centralizadas;
- testes escritos em BDD;
- evidências automáticas;
- relatórios de execução;
- integração contínua;
- publicação automática dos resultados.

O projeto permanece em desenvolvimento e recebe novos cenários e melhorias de arquitetura de forma incremental.

---

## 🚀 Status atual

| Recurso | Status |
|---|:---:|
| Page Object Model | ✅ |
| Component Object Model | ✅ |
| Page Factory | ✅ |
| Configuração multiambiente | ✅ |
| Explicit Waits centralizados | ✅ |
| Execução por tags | ✅ |
| DataTable | ✅ |
| Evidências automáticas | ✅ |
| Allure Report | ✅ |
| GitHub Actions | ✅ |
| GitHub Pages | ✅ |
| Suíte Smoke | ✅ |
| Suíte de regressão | 🚧 |
| Execução paralela | 📋 |
| Docker e Selenium Grid | 📋 |

**Legenda:** ✅ concluído · 🚧 em evolução · 📋 planejado

---

## 🔗 Links do projeto

- 💻 **Repositório:**  
  https://github.com/esilvesc-star/orangehrm-web-automation-java

- 🚀 **Execuções no GitHub Actions:**  
  https://github.com/esilvesc-star/orangehrm-web-automation-java/actions

- 📊 **Relatório Allure publicado:**  
  https://esilvesc-star.github.io/orangehrm-web-automation-java/

- 🌐 **Aplicação utilizada nos testes:**  
  https://opensource-demo.orangehrmlive.com/

---

## 📑 Índice

- [Principais recursos](#-principais-recursos)
- [Tecnologias](#-tecnologias)
- [Arquitetura do framework](#-arquitetura-do-framework)
- [Estrutura do projeto](#-estrutura-do-projeto)
- [Responsabilidade das camadas](#-responsabilidade-das-camadas)
- [Gerenciamento de ambientes](#-gerenciamento-de-ambientes)
- [Cenários automatizados](#-cenários-automatizados)
- [Estratégia de execução](#-estratégia-de-execução)
- [Como executar localmente](#️-como-executar-localmente)
- [Allure Report e evidências](#-allure-report-e-evidências)
- [Integração contínua](#-integração-contínua)
- [Roadmap](#️-roadmap)
- [Autor](#-autor)
- [Inteligência Artificial aplicada ao Framework](#-inteligência-artificial-aplicada-ao-framework)

---

## ✨ Principais recursos

- Arquitetura baseada em **Page Object Model**;
- mapeamento de elementos com **Component Object Model** e Page Factory;
- separação entre Features, Steps, Pages, Components e Utilities;
- organização dos métodos por fluxo funcional;
- suporte aos ambientes QA, UAT e PROD;
- gerenciamento centralizado do WebDriver;
- configuração dinâmica de navegador e modo headless;
- Explicit Waits centralizados;
- escrita dos cenários em Gherkin;
- execução por tags do Cucumber;
- utilização de DataTable para validações em lote;
- screenshots dos principais pontos da execução;
- captura automática de evidência em caso de falha;
- geração de relatórios com Allure;
- execução automática da suíte Smoke;
- publicação do relatório no GitHub Pages;
- pipeline sinalizada como falha quando houver teste reprovado.
- utilização de agentes especializados com GitHub Copilot;
- prompts reutilizáveis para automação de testes;
- processo de desenvolvimento assistido por Inteligência Artificial;
- validação automática das implementações antes da conclusão.

---

# 🛠 Tecnologias

| Tecnologia | Utilização |
|------------|------------|
| Java 11 | Linguagem principal |
| Selenium WebDriver 4 | Automação Web |
| Cucumber BDD | Escrita dos cenários |
| JUnit 4 | Execução dos testes |
| Maven | Build e gerenciamento de dependências |
| WebDriverManager | Gerenciamento automático dos drivers |
| Allure Report | Relatórios e evidências |
| GitHub Actions | Integração Contínua |
| GitHub Pages | Publicação automática do relatório |

---

# 🏗 Arquitetura do Framework

O framework foi estruturado utilizando uma arquitetura em camadas para promover:

- baixo acoplamento;
- alta coesão;
- reutilização de componentes;
- facilidade de manutenção;
- escalabilidade.

Cada camada possui uma responsabilidade única.

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
(Driver • Wait • Config • Evidence)
      │
      ▼
WebDriver
      │
      ▼
Browser Factory
```

Essa arquitetura facilita a evolução do framework sem aumentar sua complexidade.

---

# 🤖 Inteligência Artificial aplicada ao Framework

Além da arquitetura tradicional de automação, este projeto incorpora Inteligência Artificial como apoio ao desenvolvimento e evolução do framework.

O objetivo não é substituir a tomada de decisão do engenheiro de qualidade, mas acelerar atividades repetitivas, aumentar a consistência das implementações e garantir aderência aos padrões definidos para o projeto.

Todo código sugerido pela IA passa por análise, revisão técnica, execução dos testes e validação das evidências antes de ser considerado concluído.

## Componentes de IA

| Recurso | Objetivo |
|---------|----------|
| **Repository Instructions** | Define as regras permanentes da arquitetura, boas práticas e padrões do framework. |
| **QA Automation Engineer Agent** | Atua como especialista no framework, propondo implementações alinhadas à arquitetura existente. |
| **Prompt de análise de requisitos** | Analisa requisitos, identifica impactos, oportunidades de reutilização e define um plano antes da implementação. |
| **Prompt de criação de automação** | Orienta a implementação, execução dos testes e validação dos resultados seguindo os padrões do framework. |

## Fluxo de desenvolvimento com IA

```text
Requisito
      │
      ▼
Análise do requisito
      │
      ▼
QA Automation Engineer Agent
      │
      ▼
Identificação de reutilização
      │
      ▼
Plano de implementação
      │
      ▼
Aprovação humana
      │
      ▼
Implementação
      │
      ▼
Execução dos testes
      │
      ▼
Validação do Allure
      │
      ▼
Revisão técnica
      │
      ▼
Commit e Push
```

> **Importante:** A Inteligência Artificial é utilizada como apoio ao desenvolvimento. Todas as sugestões são revisadas, validadas e aprovadas manualmente antes de integrarem o framework.

# 📁 Estrutura do Projeto

```text
src
└── test
    ├── java
    │
    ├── browser
    │     └── BrowserFactory.java
    │
    ├── components
    │     ├── LoginComponent.java
    │     ├── DashboardComponent.java
    │     └── MyInfoComponent.java
    │
    ├── pages
    │     ├── LoginPage.java
    │     ├── DashboardPage.java
    │     └── MyInfoPage.java
    │
    ├── steps
    │     ├── LoginSteps.java
    │     └── MyInfoSteps.java
    │
    ├── runner
    │     └── TestRunner.java
    │
    └── utils
          ├── ConfigReader.java
          ├── DriverManager.java
          ├── EvidenceUtils.java
          └── WaitUtils.java

└── resources
      ├── features
      │     ├── login
      │     └── myinfo
      │
      ├── application-qa.properties
      ├── application-uat.properties
      ├── application-prod.properties
      ├── cucumber.properties
      └── allure.properties
```

---

# 📚 Responsabilidade das Camadas

| Camada | Responsabilidade |
|---------|------------------|
| Browser | Inicialização dos navegadores |
| Components | Mapeamento dos elementos da interface |
| Pages | Regras de negócio e ações das telas |
| Steps | Implementação dos passos do Gherkin |
| Runner | Configuração da execução |
| Utils | Classes utilitárias compartilhadas |
| Features | Cenários escritos em BDD |

---

# 🌎 Gerenciamento de Ambientes

O framework suporta múltiplos ambientes de execução através de arquivos de configuração independentes.

```text
application-qa.properties
application-uat.properties
application-prod.properties
```

A seleção do ambiente é realizada via parâmetro Maven.

### QA

```bash
mvn clean test -Denv=qa
```

### UAT

```bash
mvn clean test -Denv=uat
```

### PROD

```bash
mvn clean test -Denv=prod
```

Essa abordagem permite reutilizar a mesma suíte de testes em diferentes ambientes sem qualquer alteração no código-fonte.

---

# 🧩 Princípios adotados

Durante o desenvolvimento do framework foram aplicados conceitos amplamente utilizados em projetos corporativos:

- Page Object Model (POM);
- Component Object Model;
- Single Responsibility Principle (SRP);
- reutilização de componentes;
- separação entre mapeamento e regras de negócio;
- centralização das configurações;
- reutilização de waits;
- organização por fluxo funcional;
- preparação para escalabilidade.

---

# 🧪 Cenários Automatizados

O framework está sendo desenvolvido de forma incremental, simulando a evolução de uma suíte de testes utilizada em projetos corporativos.

## 🔐 Login

### Smoke

- ✅ Login com credenciais válidas
- ✅ Validação da exibição da Dashboard

---

## 👤 My Info

### Smoke

- ✅ Acesso ao módulo My Info
- ✅ Validação da tela **Personal Details**
- ✅ Validação das seções utilizando **DataTable**
- ✅ Atualização do campo **Other Id**
- ✅ Salvamento das alterações
- ✅ Validação da mensagem de sucesso

### Em desenvolvimento

- 🚧 Atualização de First Name
- 🚧 Atualização de Last Name
- 🚧 Atualização de Employee Id
- 🚧 Atualização de Driver License
- 🚧 Validação da persistência das informações

---

# 📋 Cobertura Atual

| Módulo | Smoke | Regressão |
|---------|:------:|:---------:|
| Login | ✅ | 🚧 |
| Dashboard | ✅ | 🚧 |
| My Info | ✅ | 🚧 |
| Admin | 📋 | 📋 |
| PIM | 📋 | 📋 |
| Leave | 📋 | 📋 |
| Recruitment | 📋 | 📋 |
| Time | 📋 | 📋 |

**Legenda:**  
✅ Implementado • 🚧 Em desenvolvimento • 📋 Planejado

---

# 🚀 Estratégia de Execução

Os cenários são organizados utilizando **Tags do Cucumber**, permitindo diferentes estratégias de execução.

Exemplo:

```gherkin
@smoke
@login
```

```gherkin
@smoke
@myinfo
```

Executar toda a suíte Smoke:

```bash
mvn clean test -Denv=qa -Dcucumber.filter.tags="@smoke"
```

Executar apenas o módulo My Info:

```bash
mvn clean test -Denv=qa -Dcucumber.filter.tags="@smoke and @myinfo"
```

Essa abordagem permite selecionar rapidamente subconjuntos de testes, reduzindo o tempo de execução e facilitando a integração com pipelines CI/CD.

---

# ▶️ Como Executar Localmente

### 1️⃣ Limpar resultados anteriores

```bash
rm -rf allure-results allure-report
```

### 2️⃣ Executar a suíte Smoke

```bash
mvn clean test -Denv=qa -Dcucumber.filter.tags="@smoke"
```

### 3️⃣ Abrir o relatório Allure

```bash
allure serve allure-results
```

---

# 📊 Allure Report e Evidências

O framework utiliza o **Allure Report** para geração de relatórios completos da execução dos testes.

Cada execução apresenta:

- ✔ Status dos cenários
- ✔ Tempo de execução
- ✔ Steps executados
- ✔ Screenshots das principais etapas
- ✔ Evidências anexadas automaticamente
- ✔ Stack Trace em caso de falha

As evidências atualmente contemplam:

- 📸 Tela Personal Details
- 📸 Atualização do campo Other Id
- 📸 Validação das seções da tela
- 📸 Mensagem de sucesso após o salvamento
- 📸 Captura automática em caso de falha

Além da execução local, o relatório é publicado automaticamente no **GitHub Pages**.

---

# 🚀 Integração Contínua (CI/CD)

O projeto possui uma pipeline automatizada utilizando **GitHub Actions**.

Fluxo da pipeline:

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
Checkout
    │
    ▼
Build Maven
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

A pipeline executa automaticamente:

- ✔ Checkout do código
- ✔ Configuração do Java
- ✔ Cache das dependências Maven
- ✔ Execução da suíte Smoke
- ✔ Geração do Allure Report
- ✔ Publicação automática do relatório

Mesmo quando algum cenário falha, o relatório continua sendo publicado, permitindo analisar as evidências diretamente pelo GitHub Pages, enquanto a pipeline permanece com status **Failed**, refletindo corretamente a falha dos testes.

---

# 🗺 Roadmap

O desenvolvimento do framework segue uma evolução incremental, semelhante ao ciclo de crescimento de um projeto corporativo.

---

## ✅ Concluído

### Arquitetura

- [x] Page Object Model (POM)
- [x] Component Object Model (COM)
- [x] Browser Factory
- [x] Configuração Multiambiente
- [x] Gerenciamento por Properties
- [x] Explicit Waits centralizados
- [x] Organização das Pages por fluxo funcional

### Automação

- [x] Login com credenciais válidas
- [x] Navegação até o módulo My Info
- [x] Validação da tela Personal Details
- [x] Atualização do campo Other Id
- [x] Salvamento das alterações
- [x] Validação da mensagem de sucesso
- [x] Validação das seções utilizando DataTable

### Qualidade

- [x] Captura automática de evidências
- [x] Evidências durante a execução dos cenários
- [x] Integração com Allure Report
- [x] Publicação automática via GitHub Pages
- [x] Pipeline CI/CD com GitHub Actions

---

## 🚧 Em desenvolvimento

### My Info

- [ ] Atualização de First Name
- [ ] Atualização de Last Name
- [ ] Atualização de Employee Id
- [ ] Atualização de Driver License
- [ ] Validação da persistência das informações

### Login

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

### Integrações

- [ ] SonarQube
- [ ] Jira / Xray
- [ ] Histórico de execuções do Allure

### Novos módulos

- [ ] Admin
- [ ] PIM
- [ ] Leave
- [ ] Time
- [ ] Recruitment
- [ ] Performance

---

# 🎯 Objetivos do Projeto

Este projeto tem como propósito demonstrar a construção e evolução de um framework de automação seguindo práticas adotadas em projetos corporativos.

Além da implementação dos cenários automatizados, o framework busca evidenciar conhecimentos em:

- ✔ Arquitetura de Frameworks
- ✔ Quality Engineering
- ✔ Selenium WebDriver
- ✔ Java
- ✔ Cucumber BDD
- ✔ Design Patterns
- ✔ Integração Contínua (CI/CD)
- ✔ GitHub Actions
- ✔ GitHub Pages
- ✔ Allure Report
- ✔ Estratégia de Testes
- ✔ Organização de projetos
- ✔ Boas práticas de desenvolvimento

---

# 🚀 Próximos Passos

A evolução do projeto continuará acompanhando um fluxo semelhante ao encontrado em ambientes corporativos.

Os próximos incrementos contemplam:

- Ampliação da cobertura funcional do módulo **My Info**;
- Implementação dos módulos **Admin**, **PIM**, **Leave**, **Time** e **Recruitment**;
- Estruturação da suíte completa de regressão;
- Execução paralela dos testes;
- Integração com Selenium Grid;
- Execução em Docker;
- Integração com SonarQube;
- Integração com Jira / Xray;
- Evolução do dashboard de métricas;
- Melhoria contínua da arquitetura do framework.

---

# 👨‍💻 Autor

## Elói Silvestre Coelho

**QA Lead | Quality Engineering | Test Automation**

Profissional com mais de **15 anos de experiência em Qualidade de Software**, atuando em Estratégia de Testes, Automação, Liderança Técnica, Governança de QA e evolução de Frameworks de Automação.

### Principais competências

- Test Automation
- Quality Engineering
- Selenium WebDriver
- Java
- Cucumber BDD
- Playwright
- API Testing
- CI/CD
- GitHub Actions
- Allure Report
- Test Strategy
- Test Leadership

---

## 🌐 Conecte-se

**LinkedIn**

🔗 https://www.linkedin.com/in/eloi-silvestre

**GitHub**

🔗 https://github.com/esilvesc-star

---

# 🤝 Contribuições

Este projeto foi criado com finalidade **educacional**, **demonstrativa** e de **compartilhamento de conhecimento**.

Caso encontre alguma oportunidade de melhoria, tenha sugestões sobre arquitetura, automação ou boas práticas de Quality Engineering, fique à vontade para contribuir.

Você pode contribuir através de:

- ⭐ Star no repositório
- 🐞 Abertura de Issues
- 🔀 Pull Requests
- 💬 Discussões e sugestões

Toda contribuição será muito bem-vinda.

---

# 📄 Licença

Este projeto é disponibilizado para fins **educacionais**, **estudos**, **compartilhamento de conhecimento** e **demonstração técnica**, podendo servir como referência para profissionais que desejam estudar automação de testes e estruturação de frameworks.

---

# 💡 Sobre este projeto

A construção deste framework representa minha forma de estudar, compartilhar conhecimento e evoluir continuamente como profissional de Quality Engineering.

Meu objetivo não é apenas automatizar testes, mas demonstrar como estruturar um framework organizado, escalável e alinhado às práticas encontradas em projetos corporativos.

A cada nova funcionalidade implementada, pretendo evoluir este repositório e compartilhar essa jornada com a comunidade, para que ele também possa servir de referência para outros profissionais que estejam aprendendo ou aperfeiçoando suas habilidades em automação de testes.

Se este projeto contribuir de alguma forma para o seu aprendizado, ficarei muito feliz em saber.

---

<p align="center">

### ⭐ Gostou do projeto?

Se este repositório foi útil para você, considere deixar uma **Star**.

Além de incentivar a evolução contínua do projeto, isso ajuda outras pessoas da comunidade de QA a encontrarem esse conteúdo.

Muito obrigado pela visita! 🚀

</p>