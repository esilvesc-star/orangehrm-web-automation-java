---
name: criar-automacao
description: Implementa uma automação seguindo a arquitetura e os padrões do framework
agent: QA Automation Engineer
argument-hint: Descreva a funcionalidade ou cenário que deve ser automatizado
---

# Objetivo

Implemente a automação solicitada seguindo as instruções permanentes do repositório e a arquitetura atual do framework.

Não comece alterando código.

# Processo obrigatório

## 1. Entendimento da demanda

Antes de implementar:

- identifique o objetivo funcional;
- identifique as regras de negócio;
- identifique os critérios de aceite;
- informe qualquer dúvida ou informação ausente;
- não invente requisitos.

## 2. Análise do projeto

Analise os arquivos diretamente relacionados:

- Features;
- Steps;
- Pages;
- Components;
- Utils;
- configurações de execução, somente quando necessário.

Procure código existente que possa ser reutilizado.

Não liste nem altere arquivos de infraestrutura sem necessidade direta.

## 3. Plano

Antes de editar, apresente um plano curto contendo:

- arquivos que serão alterados;
- arquivos que serão criados;
- métodos que serão reutilizados;
- métodos ou elementos que precisarão ser adicionados;
- testes que serão executados.

Aguarde a aprovação do usuário antes de alterar arquivos.

## 4. Implementação

Após a aprovação:

- faça somente a menor alteração necessária;
- preserve a arquitetura Feature → Steps → Page → Component;
- mantenha localizadores nos Components;
- mantenha ações de tela nas Pages;
- mantenha coordenação do fluxo nos Steps;
- use WaitUtils para sincronização;
- não utilize Thread.sleep;
- não instancie WebDriver diretamente;
- não duplique código existente;
- não altere arquivos não relacionados.

## 5. Validação

Depois da implementação:

1. verifique a compilação;
2. execute o cenário alterado isoladamente;
3. execute a suíte do módulo;
4. execute a suíte Smoke quando aplicável;
5. verifique evidências e resultado do Allure;
6. analise qualquer falha antes de modificar novamente.
7. valide se a estratégia de evidências segue o padrão do framework.

Não esconda falhas com esperas excessivas ou tratamento genérico de exceção.

## 6. Entrega

Informe:

- arquivos criados;
- arquivos alterados;
- métodos reutilizados;
- métodos criados;
- comandos executados;
- testes executados;
- resultados obtidos;
- falhas ou validações pendentes;
- riscos identificados.

Não declare sucesso quando algum teste não tiver sido executado.