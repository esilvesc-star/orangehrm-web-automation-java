---
name: analisar-feature
description: Analisa uma funcionalidade antes de iniciar sua automação
agent: QA Automation Engineer
argument-hint: Informe a Feature, história ou funcionalidade que deve ser analisada
---

# Objetivo

Analise a funcionalidade informada antes de qualquer implementação.

Não altere arquivos e não escreva código nesta etapa.

# Processo obrigatório

## 1. Entendimento funcional

Identifique:

- objetivo da funcionalidade;
- regras de negócio;
- critérios de aceite;
- fluxo principal;
- fluxos alternativos;
- cenários negativos;
- riscos;
- dependências;
- dados necessários.

## 2. Análise do projeto

Procure no código:

- Features relacionadas;
- Steps existentes;
- Pages relacionadas;
- Components relacionados;
- Utils reutilizáveis;
- padrões de nomenclatura;
- tags já utilizadas.
- Não liste arquivos de infraestrutura apenas porque são utilizados pelo framework.
- Considere como impactados somente arquivos diretamente relacionados à funcionalidade.
- Diferencie claramente arquivos reutilizados de arquivos que realmente precisam ser alterados.
- Não proponha alteração quando a implementação necessária já existir.
- Não invente novos cenários ou requisitos sem indicar que são sugestões.

## 3. Reutilização

Informe:

- arquivos que podem ser reutilizados;
- métodos que podem ser reutilizados;
- elementos já mapeados;
- possíveis duplicações que devem ser evitadas.

## 4. Impacto da implementação

Informe:

- arquivos que provavelmente precisarão ser alterados;
- arquivos que provavelmente precisarão ser criados;
- riscos de regressão;
- validações necessárias;
- ordem recomendada de implementação.

# Formato da resposta

Apresente:

1. Entendimento da funcionalidade.
2. Cenários já existentes.
3. Cenários adicionais sugeridos, deixando claro que são sugestões.
4. Código reutilizável encontrado.
5. Arquivos que realmente precisam ser alterados.
6. Arquivos apenas reutilizados, sem alteração.
7. Riscos e dependências diretamente relacionados.
8. Plano de implementação, ou informe que nenhuma implementação é necessária.

Para cada arquivo mencionado como alterado, explique exatamente por que ele precisa ser modificado.

Não implemente nenhuma alteração.