# OrangeHRM Web Automation Framework

Framework de automação de testes Web desenvolvido com foco em boas práticas de automação, organização de código, manutenibilidade e escalabilidade.

O projeto utiliza Selenium WebDriver, Java, Cucumber BDD, Maven e Allure Report, seguindo os padrões Page Object Model (POM) e Component Object Model para promover reutilização, legibilidade e separação de responsabilidades.

---

## Objetivo

Este projeto foi desenvolvido com o objetivo de demonstrar uma estrutura profissional de automação de testes Web baseada em:

- Selenium WebDriver
- Java
- Cucumber BDD
- Maven
- Allure Report
- Page Object Model (POM)
- Component Object Model
- Page Factory
- Gerenciamento de ambientes
- Esperas explícitas (Explicit Waits)
- Captura de evidências em falha

Além de servir como laboratório de estudos e evolução contínua em automação de testes.

---

## Tecnologias Utilizadas

| Tecnologia | Versão |
|------------|--------|
| Java | 11 |
| Selenium WebDriver | 4.x |
| Cucumber | 7.x |
| JUnit | 4 |
| Maven | 3.x |
| WebDriverManager | 5.x |
| Allure Report | 2.x |

---

## Arquitetura do Projeto

O framework foi estruturado seguindo princípios de separação de responsabilidades.

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

### Browser

Responsável pela criação e configuração dos navegadores suportados pela automação.

### Components

Centraliza o mapeamento dos elementos da interface utilizando Page Factory.

Exemplo:

- Campos
- Botões
- Tabelas
- Menus
- Componentes reutilizáveis

### Pages

Responsável pelas ações e comportamentos das telas.

Exemplos:

- Realizar login
- Navegar entre páginas
- Consultar informações exibidas na tela
- Executar ações de negócio

### Steps

Camada responsável por conectar os cenários escritos em Gherkin com as ações implementadas nas Pages.

### Hooks

Responsável pela preparação e finalização da execução dos cenários.

Atualmente:

- Inicialização do navegador antes de cada cenário
- Encerramento do navegador após cada cenário
- Captura de screenshot em caso de falha
- Anexo automático da evidência no relatório Allure

### Runner

Configuração da execução dos testes Cucumber, incluindo features, steps, tags e plugins de relatório.

### Utils

Classes utilitárias reutilizáveis por todo o framework.

Atualmente:

#### ConfigReader

Responsável pela leitura das configurações dos ambientes.

#### DriverManager

Responsável pelo gerenciamento do ciclo de vida do WebDriver.

#### WaitUtils

Centraliza estratégias de sincronização utilizando Explicit Wait.

### Features

Contém os cenários BDD escritos em Gherkin.

---

## Gerenciamento de Ambientes

O framework suporta múltiplos ambientes através de arquivos de propriedades específicos.

```text
application-qa.properties
application-uat.properties
application-prod.properties
```

A seleção do ambiente é realizada através da propriedade:

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

## Relatórios e Evidências

O projeto possui integração com Allure Report.

Durante a execução dos testes, os resultados são gerados na pasta:

```text
allure-results
```

Para visualizar o relatório localmente:

```bash
allure serve allure-results
```

O framework também realiza captura de screenshot automaticamente em caso de falha e anexa a evidência ao relatório Allure.

---

## Boas Práticas Aplicadas

- Page Object Model (POM)
- Component Object Model
- Separação de responsabilidades
- Centralização de locators
- Configuração por ambiente
- Reutilização de componentes
- Explicit Waits centralizados
- Evidência automática em falha
- Relatório Allure integrado
- Estrutura preparada para escalabilidade
- Código orientado à manutenção

---

## Cenários Automatizados

### Login

- Autenticação com credenciais válidas
- Validação da exibição da tela inicial com título "Dashboard"

---

## Como Executar

### Executar todos os testes

```bash
mvn clean test
```

### Executar utilizando ambiente específico

```bash
mvn clean test -Denv=qa
```

```bash
mvn clean test -Denv=uat
```

```bash
mvn clean test -Denv=prod
```

### Gerar e visualizar relatório Allure local

```bash
allure serve allure-results
```

---

## Próximas Evoluções

- Login inválido
- Logout
- Menu lateral
- Integração com GitHub Actions
- Publicação de relatório Allure via pipeline
- Execução paralela
- Estratégia de Tags para Smoke e Regressão

---

## Autor

### Elói Silvestre Coelho

QA Lead | QA Automation | Quality Engineering

Especialista em Qualidade de Software, Automação de Testes, Estratégia de Testes e Governança de QA.

**LinkedIn:** https://www.linkedin.com/in/eloi-silvestre

**GitHub:** https://github.com/esilvesc-star

---

## Observação

Este projeto possui finalidade educacional e demonstrativa, sendo utilizado para estudo, evolução técnica e demonstração de boas práticas de automação de testes.