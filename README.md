# OrangeHRM Web Automation Framework

Framework de automação de testes Web desenvolvido com foco em boas práticas de automação, organização de código, manutenibilidade e escalabilidade.

O projeto utiliza Selenium WebDriver, Java, Cucumber BDD e Maven, seguindo os padrões Page Object Model (POM) e Component Object Model para promover reutilização, legibilidade e separação de responsabilidades.

---

## Objetivo

Este projeto foi desenvolvido com o objetivo de demonstrar uma estrutura profissional de automação de testes Web baseada em:

- Selenium WebDriver
- Java
- Cucumber BDD
- Maven
- Page Object Model (POM)
- Component Object Model
- Page Factory
- Gerenciamento de ambientes
- Esperas explícitas (Explicit Waits)

Além de servir como laboratório de estudos e evolução contínua em automação de testes.

---

## Tecnologias Utilizadas

| Tecnologia | Versão |
|------------|---------|
| Java | 11 |
| Selenium WebDriver | 4.x |
| Cucumber | 7.x |
| JUnit | 4 |
| Maven | 3.x |
| WebDriverManager | 5.x |

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

- Realizar Login
- Navegar entre páginas
- Validar informações
- Executar ações de negócio

### Steps

Camada responsável por conectar os cenários escritos em Gherkin com as ações implementadas nas Pages.

### Runner

Configuração da execução dos testes Cucumber.

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

## Boas Práticas Aplicadas

- Page Object Model (POM)
- Component Object Model
- Separação de responsabilidades
- Centralização de locators
- Configuração por ambiente
- Reutilização de componentes
- Explicit Waits
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

---

## Próximas Evoluções

- Login inválido
- Logout
- Menu lateral
- Relatórios Allure
- Integração com GitHub Actions
- Captura automática de evidências
- Execução paralela
- Estratégia de Tags para Smoke e Regressão

---

## Autor

### Elói Silvestre Coelho

QA Lead | QA Automation | Quality Engineering

Especialista em Qualidade de Software, Automação de Testes, Estratégia de Testes e Governança de QA.

**LinkedIn:** [(https://www.linkedin.com/in/eloi-silvestre)]

**GitHub:** [(https://github.com/esilvesc-star)]

---

## Observação

Este projeto possui finalidade educacional e demonstrativa, sendo utilizado para estudo, evolução técnica e demonstração de boas práticas de automação de testes.