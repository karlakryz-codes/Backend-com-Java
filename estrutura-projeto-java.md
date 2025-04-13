# 🗂️ Organização de Arquivos em Projetos Java

Manter uma boa estrutura de pastas no seu projeto Java é essencial pra deixar tudo limpo, organizado e fácil de entender — tanto pra você quanto pra outras pessoas! 😄

---

## 📁 Estrutura Padrão de um Projeto Java

```text
meu-projeto/
├── src/                      --> Código-fonte Java
│   └── main/
│       └── java/
│           └── br/
│               └── com/
│                   └── minhapropriaempresa/
│                       └── MeuPrograma.java
├── resumos/                 --> Seus resumos em .md (como esse!)
├── lib/                     --> Bibliotecas externas (JARs)
├── test/                    --> Testes automatizados
├── README.md                --> Descrição do projeto
├── .gitignore               --> Arquivos/pastas que o Git deve ignorar
└── pom.xml / build.gradle  --> Arquivo de build (Maven/Gradle)
```

---

## 📦 Pacotes

Em Java, usamos **pacotes** para organizar as classes.  
Eles viram **pastas** dentro do `src/`.

Exemplo de pacote: `br.com.karla.minhapropriaempresa`

```java
package br.com.karla.minhapropriaempresa;
```

---

## ✍️ Nomeando Arquivos e Pastas

| Item             | Como Nomear                         |
|------------------|--------------------------------------|
| Classes Java     | PascalCase (ex: `MeuPrograma.java`)  |
| Pastas (pacotes) | minúsculas e separadas por pontos   |
| Resumos          | kebab-case (ex: `sintaxe-basica.md`) |
| Testes           | Igual à classe, com `Test` no fim    |

---

## 📝 Dicas de Organização

✅ Separe os arquivos por **função** (ex: `model`, `controller`, `service`)  
✅ Crie uma pasta `resumos/` para seus arquivos `.md`  
✅ Evite arquivos soltos na raiz do projeto  
✅ Use nomes que descrevem claramente o conteúdo 📌 


---

## 📁 Exemplo de Pasta "resumos/"

```text
Resumos/
├── sintaxe-basica.md
├── estrutura-projeto-java.md
├── poo.md
└── spring-boot.md
```

---

## 💡 Curiosidade

Usar uma boa organização não é só questão de estética...

➡️ Ajuda no trabalho em equipe  
➡️ Facilita a manutenção do código  
➡️ Mostra que você é uma dev profissional! 😎

---

## ✅ Desafio pra você!

Crie pastas para:

- `model`: para suas classes de dados  
- `controller`: onde vão as classes que controlam o fluxo  
- `resumos`: seus arquivos Markdown com conteúdo estudado

```text
src/
└── main/
    └── java/
        └── model/
        └── controller/
Resumos/
```
