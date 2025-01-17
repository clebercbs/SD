# Sistemas Distribuídos - Primeira Aula Prática

![Badge de Status](http://img.shields.io/static/v1?label=STATUS&message=Concluído&color=GREEN&style=for-the-badge)

## Índice

- [Descrição](#descrição)
- [Objetivo](#objetivo)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Instruções de Instalação](#instruções-de-instalação)
- [Como Usar](#como-usar)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Contribuição](#contribuição)
- [Licença](#licença)

---

## Descrição

Este repositório contém o material relacionado à primeira aula prática do curso de **Sistemas Distribuídos**, com foco na introdução de conceitos básicos e experimentos iniciais em ambientes distribuídos.

---

## Objetivo

A aula busca introduzir os alunos aos conceitos fundamentais de sistemas distribuídos, incluindo:

- Configuração de ambientes distribuídos.
- Execução de aplicações distribuídas.
- Análise de comunicação entre processos distribuídos.

---

## Estrutura do Projeto

```plaintext
/
├── src/                  # Códigos-fonte
├── docs/                 # Documentação
├── examples/             # Exemplos de aplicações
└── README.md             # Informações sobre o projeto
```

- **src/**: Contém os arquivos de código necessários para os experimentos.
- **docs/**: Inclui guias e documentação adicional.
- **examples/**: Aplicações práticas para entendimento dos conceitos.

---

## Instruções de Instalação

1. Clone o repositório:

   ```bash
   git clone https://github.com/clebercbs/SD.git
   ```

2. Acesse o diretório do projeto:

   ```bash
   cd SD
   ```

3. Compile os arquivos Java:

   ```bash
   javac -d bin src/**/*.java
   ```

4. Execute os arquivos conforme as instruções na seção [Como Usar](#como-usar).

---

## Como Usar

1. Execute os exemplos disponíveis no diretório `examples`.

   ```bash
   java -cp bin examples.Exemplo1
   ```

2. Consulte a documentação no diretório `docs` para instruções específicas sobre cada experiência.

---

## Tecnologias Utilizadas

- Linguagem de Programação: Java
- Ferramentas de distribuição: RMI, Sockets

---

## Contribuição

Contribuições são bem-vindas! Para isso:

1. Faça um fork do repositório.
2. Crie um branch para a sua feature ou correção:

   ```bash
   git checkout -b minha-feature
   ```

3. Faça um pull request para o branch principal.

---

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
