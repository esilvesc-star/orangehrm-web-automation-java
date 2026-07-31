# GitHub Copilot Instructions

## Princípios obrigatórios do framework

Antes de qualquer implementação, respeite as regras abaixo.

### 1. Respeitar a arquitetura do framework

Cada responsabilidade deve permanecer em sua camada correta:

- Localizadores ficam nos Components.
- Ações e comportamentos de tela ficam nas Pages.
- Steps coordenam o fluxo descrito no Gherkin.
- Utilidades técnicas reutilizáveis ficam nas classes Utils.
- O WebDriver deve ser gerenciado somente pela infraestrutura existente.

Não mova responsabilidades entre camadas sem uma justificativa técnica clara.

### 2. Priorizar reutilização antes de criar código novo

Antes de criar qualquer classe, método, localizador ou utilitário:

1. Analise a estrutura atual do projeto.
2. Procure implementações semelhantes.
3. Verifique se existe código reutilizável.
4. Evite duplicação.
5. Faça a menor alteração necessária.

### 3. Utilizar somente esperas explícitas padronizadas

- Não utilize `Thread.sleep()`.
- Não utilize esperas fixas.
- Todas as sincronizações devem utilizar `WaitUtils`.
- Escolha a condição correta para cada interação, como presença, visibilidade ou elemento clicável.
- Não aumente tempos de espera apenas para esconder instabilidades.

### 4. Manter o código limpo e padronizado

- Siga os padrões de nomenclatura já existentes.
- Preserve a organização atual das classes.
- Mantenha métodos pequenos e com responsabilidade única.
- Utilize comentários somente quando agregarem contexto técnico.
- Não deixe código temporário.
- Remova `System.out.println()` utilizados apenas para depuração.
- Não deixe código comentado sem necessidade.
- Preserve a identação e o estilo já adotados no projeto.

### 5. Validar a qualidade antes de concluir

Depois de implementar uma alteração:

1. Execute o novo cenário isoladamente.
2. Execute a suíte do módulo relacionado.
3. Execute a suíte Smoke.
4. Verifique as evidências.
5. Verifique o relatório Allure.
6. Confirme que os cenários existentes continuam estáveis.
7. Não considere a tarefa concluída se houver erro de compilação ou teste reprovado.
8. Informe quais arquivos foram alterados.
9. Informe quais comandos foram executados.
10. Informe claramente o resultado da validação.

# 6. Evidências

## Cenários aprovados

- Capture apenas uma evidência por cenário.
- A evidência deve ser anexada ao último passo (Then).
- A imagem deve comprovar o resultado esperado.
- Não capture screenshots durante Given ou When, salvo exceções justificadas.

## Cenários reprovados

- Em caso de falha, o Hooks deve capturar automaticamente a evidência.
- Não adicionar capturas extras no Step quando a falha já for tratada pelo Hooks.

Somente depois dessas validações a alteração deve ser considerada pronta para commit e push.