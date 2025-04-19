## PROJETO IPHONE

[Steve Jobs apresenta primeiro iPhone legendado (2007)](https://www.youtube.com/watch?v=9ou608QQRq8)

POO - Desafio
Modelagem e Diagramação de um Componente iPhone
Neste desafio, você será responsável por modelar e diagramar a representação UML do componente iPhone, abrangendo suas funcionalidades como Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

Contexto
Com base no vídeo de lançamento do iPhone de 2007 (link abaixo), você deve elaborar um diagramação das classes e interfaces utilizando uma ferramenta UML de sua preferência. Em seguida, implemente as classes e interfaces no formato de arquivos .java.

Lançamento iPhone 2007

Minutos relevantes: 00h15 até 00h55
Funcionalidades para Modelar
Reprodutor Musical
Métodos: tocar(), pausar(),selecionarMusica(String musica)
Aparelho Telefônico
Métodos: ligar(String numero), atender(),iniciarCorreioVoz()
Navegador na Internet
Métodos: exibirPagina(String url), adicionarNovaAba(),atualizarPagina()
Objetivo
Crie um diagrama UML que represente as funcionalidades descritas acima.
Implementar as classes e interfaces correspondentes em Java (Opcional).


    classDiagram
    direction TB
    class ReprodutorMusical {
	    -tocar()
	    -pausar()
	    -selecionarMusica(String musica)
    }

    class AparelhoTelefonico {
	    -ligar(String numero)
	    -atender()
	    -iniciarCorreioVoz()
    }

    class NavegadorInternet {
	    -exibirPaginas(String url)
	    -adicionarNovaAba()
	    -atualizarPagina()
    }

    class Iphone {
    }

	<<Interface>> ReprodutorMusical
	<<Interface>> AparelhoTelefonico
	<<Interface>> NavegadorInternet
    <<classe>> Iphone

    Iphone --|> ReprodutorMusical
    Iphone --|> AparelhoTelefonico
    Iphone --|> NavegadorInternet

<img src="./src/UML/Iphone-2025-04-19-152006.svg" alt="robot-teacher-font" border="0">


[Desafio-codigo-Base](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo)