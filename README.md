# 🥷 Naruto - Batalha Ninja

![Naruto vs Sasuke](https://s.aficionados.com.br/imagens/frases-iconicas-dos-personagens-de-naruto_f.jpg)

Projeto desenvolvido para modelar e simular batalhas entre ninjas do universo **Naruto**, utilizando **Java** e conceitos de **Programação Orientada a Objetos** (POO).

## 📖 Descrição
O sistema simula uma batalha entre dois ninjas, levando em consideração:
- **Chakra** (energia do ninja)
- **Jutsu** (técnica especial com custo e dano)
- **Regras especiais** para o lendário *Uchiha Itachi*  
- Condições de vitória e empate

## 🛠 Tecnologias Utilizadas
- **Java 17+** (ou versão compatível)
- **JUnit** para testes unitários

## 📂 Estrutura do Projeto
O projeto é composto pelas seguintes classes:

### `Jutsu`
- Representa uma técnica ninja.
- Atributos:
  - `consumoChakra` *(int, máx. 5)*
  - `dano` *(int, máx. 10)*
- Definidos no construtor e **imutáveis** após criação.

### `Ninja`
- Representa o personagem na batalha.
- Atributos:
  - `nome` *(String)*
  - `chakra` *(int, inicia em 100)*
  - `jutsuPrincipal` *(Jutsu)*
- Métodos:
  - `atacar(Ninja oponente)`
  - `receberGolpe(int dano)`
  - `getChakra()`

### `Batalha`
- Responsável por executar a luta.
- Método:
  - `public Ninja lutar(Ninja primeiro, Ninja segundo)`
- Regras:
  - Cada ninja ataca 3 vezes.
  - Vence quem tiver mais chakra no final.
  - Em caso de empate, o primeiro ninja vence.
  - **Itachi vence sempre**, independentemente da situação.

## 🧪 Testes Obrigatórios
O projeto contém testes unitários que verificam o funcionamento correto das regras:

- `deveRetornarNinjaComJutsuMaisForteSeOsDoisGastamOMesmoChakra`
- `deveAtualizarOChakraDoOponenteDeAcordoComODanoDoJutsoQuandoAtacar`
- `deveRetornarPrimeiroNinjaComoVencedorQuandoONomeForItachi`
- `deveRetornarSegundoNinjaComoVencedorQuandoONomeForItachi`
- `deveRetornarPrimeiroNinjaComoVencedorQuandoEmpatar`
