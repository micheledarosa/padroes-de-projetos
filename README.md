# Padrões de projetos 🛠️

Estudo na prática com padrões de projetos em Java, utilizando os padrões _Singleton_, _Strategy_ e _Facade_.

Este estudo foi realizado durante o Bootcamp **Java AI Powered** da [DIO](https://www.dio.me/).

## Singleton 🔒

O padrão Singleton é um padrão de criação que garante que uma classe tenha apenas uma instância e forneça um ponto global de acesso a essa instância. Neste repositório, foram implementadas três variações do Singleton:

- **Eager Initialization (Inicialização Ansiosa)**: A instância é criada no momento da inicialização da classe.
- **Initialization (Inicialização Preguiçosa)**: A instância é criada apenas quando solicitada pela primeira vez.
- **Lazy Initialization with Holder (Inicialização Preguiçosa com Holder)**: A instância é criada quando solicitada pela primeira vez, mas usando uma classe interna para garantir a atomicidade da criação.

## Strategy 🎯
O padrão Strategy é um padrão comportamental que permite definir uma família de algoritmos, encapsular cada um deles e torná-los intercambiáveis. Ele permite que o algoritmo varie independentemente dos clientes que o utilizam. Neste repositório, há um exemplo de implementação do padrão Strategy com um robô capaz de se mover de diferentes maneiras:

- **ComportamentoAgressivo**: Define um comportamento agressivo para o robô.

- **ComportamentoDefensivo**: Define um comportamento defensivo para o robô.

- **ComportamentoNormal**: Define um comportamento normal para o robô.

- **Robo**: Classe que utiliza um comportamento estratégico para se mover.

## Facade 🏰
O padrão Facade é um padrão estrutural que fornece uma interface unificada para um conjunto de interfaces em um subsistema. Ele define uma interface de nível mais alto que facilita o uso do subsistema. Neste repositório, há um exemplo de implementação do padrão Facade para facilitar a migração de clientes:

- **Facade**: Fornece um método simples para migrar clientes, encapsulando a lógica necessária para recuperar informações de endereço usando a API de CEP e gravar os detalhes do cliente usando o serviço CRM.

## Executando os testes 🧪

Para executar os testes e verificar o comportamento dos diferentes padrões implementados, você pode simplesmente executar a classe _Test_ fornecida neste repositório. Certifique-se de ter todas as dependências configuradas corretamente antes de executar os testes.

## Resultado dos testes ✅

![Imgur](https://i.imgur.com/GaRNOBv.png)