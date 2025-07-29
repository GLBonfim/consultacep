# ConsultaCEP

Este é um projeto simples em Java que permite consultar informações de endereço a partir de um CEP utilizando a API ViaCEP.

## 📌 Funcionalidades

- Entrada de CEP pelo usuário
- Requisição HTTP para a API ViaCEP
- Conversão da resposta JSON em objeto Java
- Exibição das informações do endereço no terminal

## 🛠️ Tecnologias utilizadas

- Java 17+
- `java.net.http.HttpClient` para requisições HTTP
- Biblioteca **Gson** (Google) para parsing do JSON

## ▶️ Como executar

1. Clone o repositório:

```bash
git clone https://github.com/GLBonfim/consultacep.git
cd consultacep
```

2. Compile e execute:

```bash
javac Principal.java
java Principal
```

> Certifique-se de que a biblioteca `gson.jar` está no classpath se não estiver usando Maven/Gradle.

## 💡 Exemplo de uso

```
Digite um CEP: 01001-000
Logradouro: Praça da Sé
Bairro: Sé
Localidade: São Paulo - SP
```

## 🔗 API Utilizada

- [ViaCEP](https://viacep.com.br)

## 👨‍💻 Autor

[GLBonfim](https://www.linkedin.com/in/glbonfim)

---

Este projeto foi criado para fins de aprendizado e prática com consumo de APIs em Java.
