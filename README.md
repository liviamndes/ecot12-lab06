# ECOT12 - Lab06

Repositório do **Laboratório 06** da disciplina **LABORATÓRIO DE PROJETO DE SOFTWARE (UNIFEI)**.  
Contém os exercícios sobre padrões de projeto:

## Exercício 1 - Fringe (Padrão Ponte + Compositor)
- Modelagem UML das classes `Pessoa`, `Agente`, `Cientista`, `Universo`, `Alternativo`, `Real`.
- Implementação em Java com projeto **Maven** (`br.edu.unifei.ecot12.fringe`).
- Demonstração do cálculo de **vibração prejudicial harmônica** no `main`.

## Exercício 2 - Oráculo (Padrão Singleton)
- Implementação da classe `Oraculo` no pacote `br.edu.unifei.ecot12.adivinho`.
- Aplicação do padrão **Objeto Único (Singleton)**.
- Classe `App` para testar a instância única.

---

### Tecnologias
- Java 8
- Maven

---

### Execução
Para compilar e executar:
```bash
mvn compile
mvn exec:java -Dexec.mainClass="br.edu.unifei.ecot12.fringe.App"
mvn exec:java -Dexec.mainClass="br.edu.unifei.ecot12.adivinho.App"
