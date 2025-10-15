# ♟️ Chess System Java

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-red?style=for-the-badge&logo=openjdk" />
  <img src="https://img.shields.io/badge/Maven-Build-blue?style=for-the-badge&logo=apachemaven" />
  <img src="https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow?style=for-the-badge" />
  <img src="https://img.shields.io/badge/License-MIT-green?style=for-the-badge" />
</p>

---

## 🧩 Sobre o Projeto

O **Chess System Java** é um projeto desenvolvido com o objetivo de simular um **jogo de xadrez completo** em Java, rodando diretamente no **console (terminal)**.

O sistema foi construído com base em uma arquitetura limpa e orientada a objetos, separando responsabilidades entre classes e pacotes, garantindo **organização, reuso e legibilidade do código**.

---

## 🚀 Funcionalidades Principais

✅ Representação completa do tabuleiro de xadrez  
✅ Movimentação das peças com regras oficiais  
✅ Validação de jogadas (checagem de movimentos válidos)  
✅ Captura de peças  
✅ Exibição do tabuleiro no console  
✅ Alternância entre jogadores (brancas e pretas)  
✅ Tratamento de exceções e erros de jogadas  

> ⚙️ O projeto segue princípios da programação orientada a objetos, com uso de **herança, polimorfismo, encapsulamento e composição**.

---

## 🧠 Estrutura do Projeto

chess-system-java/
├── src/
│ ├── application/
│ │ └── Program.java # Classe principal do jogo
│ ├── board/
│ │ ├── Board.java # Representa o tabuleiro
│ │ ├── Piece.java # Classe base das peças
│ │ └── Position.java # Coordenadas do tabuleiro
│ ├── chess/
│ │ ├── ChessMatch.java # Lógica principal do jogo
│ │ ├── ChessPiece.java # Classe das peças de xadrez
│ │ ├── Color.java # Enum de cores (BRANCA, PRETA)
│ │ └── pieces/ # Pacote com as peças específicas
│ │ ├── King.java
│ │ ├── Queen.java
│ │ ├── Rook.java
│ │ ├── Bishop.java
│ │ ├── Knight.java
│ │ └── Pawn.java
│ └── exceptions/
│ └── ChessException.java # Tratamento de erros personalizados
└── pom.xml


---

## ⚙️ Tecnologias Utilizadas

- ☕ **Java 17+**
- 🧱 **Maven** (gerenciador de dependências)
- 🧪 **JUnit** (opcional, para testes)
- 💻 **IntelliJ IDEA / Eclipse / VS Code** (IDE recomendada)

---

## 🏁 Como Executar o Projeto

### 1️⃣ Clonar o repositório
```bash
git clone https://github.com/JeffersonTeodoro/chess-system-java.git

cd chess-system-java

mvn clean install

mvn exec:java -Dexec.mainClass="application.Program"


  a b c d e f g h
8 ♜ ♞ ♝ ♛ ♚ ♝ ♞ ♜ 8
7 ♟ ♟ ♟ ♟ ♟ ♟ ♟ ♟ 7
6 . . . . . . . . 6
5 . . . . . . . . 5
4 . . . . . . . . 4
3 . . . . . . . . 3
2 ♙ ♙ ♙ ♙ ♙ ♙ ♙ ♙ 2
1 ♖ ♘ ♗ ♕ ♔ ♗ ♘ ♖ 1
  a b c d e f g h

Digite a posição de origem: e2  
Digite a posição de destino: e4

````
🔮 Melhorias Futuras

Implementação de movimentos especiais:

- Roque ♔♖
- En passant ♙
- Promoção de peão ♕
- Sistema de cheque e xeque-mate
- Adição de interface gráfica (JavaFX ou Swing)
- Modo de jogo contra IA

# Como Contribuir
  git checkout -b minha-feature
  git commit -m "Adiciona nova funcionalidade"
  git push origin minha-feature

  # 🧾 Licença
- Distribuído sob a licença MIT License.
- Consulte o arquivo LICENSE
- para mais informações

# 👨‍💻 Autor
- Jefferson França Teodoro
- 📧 jeffersontfranca@gmail.com
- 🔗 GitHub - JeffersonTeodoro

# ⭐ Dê uma estrela no repositório se este projeto te ajudou!
