# Testes de Software - Aula 11

## Objetivo
Este repositório serve como base para os exercícios da Aula 11 sobre testes de software. Cada parte aborda diferentes aspectos de testes automatizados em projetos reais, boas práticas, estratégias de cobertura e integração contínua.

## Estrutura do Repositório

- `src/legacy/Service.java`: Código legado que precisa ser testado e refatorado.
- `src/utils/StringUtils.java`: Classe utilitária com métodos de manipulação de strings.
- `src/inventory/InventoryService.java`: Serviço de inventário para simulação de dependências.
- `tests/legacy/ServiceTest.java`: Testes para o código legado.
- `tests/utils/StringUtilsTest.java`: Testes seguindo boas práticas para `StringUtils`.
- `tests/inventory/InventoryServiceTest.java`: Testes utilizando mocks e simulações de dependências.
- `.github/workflows/ci.yml`: Configuração de pipeline CI/CD para rodar os testes automaticamente.
- `pom.xml` (ou `build.gradle`): Configuração do projeto para dependências e plugins de testes.

## Partes da Aula

### Parte 1: Aplicando Testes em Projetos Reais
Refatore o código legado `Service` para torná-lo mais testável e adicione testes de cobertura para validar sua funcionalidade. Foque em áreas críticas do código.

### Parte 2: Boas Práticas em Testes
Implemente testes na classe `StringUtils` seguindo boas práticas como o padrão AAA (Arrange, Act, Assert). Garanta clareza e organização nos métodos de teste.

### Parte 3: Estratégias de Testes
Utilize mocks para simular dependências no serviço `InventoryService` e configure o JaCoCo para medir a cobertura de código. Valide a cobertura dos testes e analise os resultados.

### Parte 4: Integração Contínua e Desafios Futuros
Configure um pipeline de CI/CD usando GitHub Actions para rodar automaticamente os testes em cada push no repositório. Experimente incluir melhorias como upload de artefatos, notificações, análise de qualidade, entre outras.

## Instruções para Configuração

### Passo 1: Clone ou faça um fork do repositório
```bash
git clone https://github.com/Quost/testes-software-mi75.git
