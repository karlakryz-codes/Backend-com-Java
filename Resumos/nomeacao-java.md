````
# 📘 Guia de Nomeações em Java

🧠 Entender e aplicar as **convenções de nomeação em Java** é essencial para manter um código limpo, organizado e profissional. Essa prática facilita a leitura, manutenção e colaboração com outros desenvolvedores!

---

## ✨ 1. Nomeação de Classes e Interfaces

- Começam com **letra maiúscula**
- Usam o estilo **CamelCase**
- Devem representar **substantivos**

```java
public class ClienteFinanceiro { }

public interface Calculavel { }
````

📌 **Boas práticas**:

- Nomes devem ser **claros e descritivos**
- Evite **abreviações sem necessidade**

---

## 🔧 2. Nomeação de Métodos

- Começam com **letra minúscula**
- Também usam **CamelCase**
- Devem representar **ações** (verbo + complemento)

```java
public void calcularJuros() { }

public String obterNomeCompleto() { }
```

📌 **Boas práticas**:

- Use **verbos no início** do nome: `get`, `set`, `calcular`, `listar`, etc.
- Métodos booleanos devem indicar uma **pergunta**:

```java
public boolean isAtivo() { }
public boolean temSaldo() { }
```

---

## 📦 3. Nomeação de Variáveis

- Começam com **letra minúscula**
- Usam **CamelCase** se o nome for composto
- Devem ser **descritivas**

```java
int idade;
String nomeCompleto;
BigDecimal valorParcela;
```

📌 **Boas práticas**:

- Evite nomes genéricos como `x`, `data1`, `temp`, etc.
- Prefira `quantidadeDeParcelas` ao invés de `qtd`.

---

## 🔒 4. Nomeação de Constantes

- Todas as letras em **maiúsculas**
- Palavras separadas por **underline (\_)**
- Declaradas como `static final`

```java
public static final double TAXA_JUROS = 0.05;
public static final String NOME_EMPRESA = "Líder Cobranças";
```

📌 **Boas práticas**:

- Constantes são usadas para **valores fixos**, como taxas, limites, URLs etc.

---

## 🧱 5. Nomeação de Pacotes

- Tudo em **minúsculo**
- Usam **pontos (.)** para separar hierarquias
- Nome geralmente segue o padrão do **domínio invertido**

```java
package br.com.karladev.projetos.financeiro;
```

---

## 🚫 O que evitar?

| ❌ Errado           | ✅ Correto                 |
| ------------------- | -------------------------- |
| `int x;`            | `int idade;`               |
| `String a1b2;`      | `String nomeCompleto;`     |
| `public class calc` | `public class Calculadora` |
| `boolean ativo();`  | `boolean isAtivo();`       |

---

## 🏁 Conclusão

Seguir boas práticas de nomeação:

✅ Deixa o código mais **legível**  
✅ Facilita o **trabalho em equipe**  
✅ Mostra **profissionalismo**

---

Feito com 💙 por **Karla Cristina**  
🚀 _Em constante evolução como desenvolvedora Java!_

```

```
