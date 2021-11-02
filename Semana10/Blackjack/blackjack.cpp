#include "blackjack.h"

//****************** CARTA **************************

Carta::Carta(int numero)
{
	this->numero = numero;
	this->siguienteCarta = nullptr;
}

void Carta::toString()
{
	cout << "<Carta numero=" << this->numero 
		 << "/>" << endl;
}

//****************** DECK ***************************

Deck::Deck(bool vacio)
{
	this->primeraCarta = nullptr;
	this->cantidad = 0;
	if (!vacio)
	{		
		Carta* pCartaAnterior = nullptr;

		for (int i = 0; i < 13 * 6; i++)
		{
			Carta* nuevaCarta = new Carta((i % 13) + 1);

			if (this->primeraCarta == nullptr)
			{
				this->primeraCarta = nuevaCarta;
			}
			else
			{
				pCartaAnterior->siguienteCarta = nuevaCarta;
			}
			this->cantidad++;
			pCartaAnterior = nuevaCarta;
		}
	}
}
Deck::~Deck()
{
    /**
     *  Implementacion de el destructor del deck 
     */
    Carta* carta = this->primeraCarta;
    while(carta != nullptr){
        Carta* cartaEliminar = carta;
        carta = carta->siguienteCarta;
        delete cartaEliminar;
    }
}

Deck* Deck::obtenerDesordenado()
{
	Deck* deckDesordenado = new Deck(true);

	while (this->cantidad > 0)
	{
		int posAleatoria = rand() % this->cantidad;
		Carta* carta = this->obtenerCarta(posAleatoria);
		deckDesordenado->agregarCarta(carta);
	}

	return deckDesordenado;
}
Carta* Deck::obtenerCarta()
{
	return obtenerCarta(0);
}
Carta* Deck::obtenerCarta(int pos)
{
	int cont = 0;

	Carta* pCarta = this->primeraCarta;
	Carta* pCartaAnterior = nullptr;

	while (pCarta != nullptr)
	{
		if (cont == pos)
		{
			if (pCartaAnterior == nullptr)
			{
				this->primeraCarta = pCarta->siguienteCarta;
			}
			else
			{
				pCartaAnterior->siguienteCarta = pCarta->siguienteCarta;
			}
			this->cantidad--;
			pCarta->siguienteCarta = nullptr;
			return pCarta;
		}
		cont++;
		pCartaAnterior = pCarta;
		pCarta = pCarta->siguienteCarta;
	}
	return nullptr;
}
void Deck::agregarCarta(Carta* carta)
{
	if (this->primeraCarta == nullptr)
	{
		this->primeraCarta = carta;
	}
	else {
		carta->siguienteCarta = this->primeraCarta;
		this->primeraCarta = carta;
	}
	this->cantidad++;
}
void Deck::toString()
{
	Carta* pCarta = this->primeraCarta;
	cout << "<Deck cantidad=" << this->cantidad
		<< ">" << endl;
	while (pCarta != nullptr)
	{
		pCarta->toString();
		pCarta = pCarta->siguienteCarta;
	}

	cout << "</Deck>" << endl;
}

/****************** JUGADOR *****************************/
Jugador::Jugador(string nombre)
{
	siguienteJugador = nullptr;
	this->nombre = nombre;
	cantidadPartidasGanadas = 0;
	sumaCartas = 0;
}
void Jugador::toString()
{
	cout << "<Jugador nombre=" << this->nombre << " cantidadPartidasGanadas="
		<< this->cantidadPartidasGanadas << "/>" << endl;
}
void Jugador::recibirCarta(Carta* carta)
{
	sumaCartas += carta->numero;
}
/****************** MESA *****************************/
Mesa::Mesa()
{
	cantidadJugadores = 0;
	primerJugador = nullptr;
	ultimoJugador = nullptr;
	sumaCartasCrupier = 0;

	Deck* deck = new Deck(false);
	deckDesordenado = deck->obtenerDesordenado();
}
Mesa::~Mesa()
{
	Jugador* pJugador = primerJugador;
	while (pJugador != nullptr)
	{
		Jugador* pJugAEliminar = pJugador;
		pJugador = pJugador->siguienteJugador;
		delete pJugAEliminar;
	}
}
void Mesa::agregarJugador()
{
	string nombreJugador;
	cout << "Ingrese nombre de jugador a agregar a mesa: " << endl;
	cin >> nombreJugador;

	Jugador* jugador = new Jugador(nombreJugador);

	if (primerJugador == nullptr)
	{
		// Caso que no hayan jugadores en mesa
		primerJugador = jugador;
		ultimoJugador = jugador;
	}else 
	{
		ultimoJugador->siguienteJugador = jugador;
		ultimoJugador = jugador;
	}
	cantidadJugadores++;
}
void Mesa::mostrarJugadorMayor()
{
    Jugador* jugador = this->primerJugador;
    int max = 0;
    while(jugador != nullptr){
        max = std::max(max, jugador->cantidadPartidasGanadas);
        jugador = jugador->siguienteJugador;
    }
    jugador = this->primerJugador;
    cout << "Jugadores con mayor cantidad de partidas ganadas" << endl; 
    while(jugador != nullptr){
        if(max == jugador->cantidadPartidasGanadas){
            jugador->toString();
        }
        jugador = jugador->siguienteJugador;
    }
}
void Mesa::eliminarJugador()
{
	string nombreJugadorAEliminar;
	cout << "Ingrese el nombre del jugador a eliminar: " << endl;
	cin >> nombreJugadorAEliminar;

	Jugador* pJugador = primerJugador;
	Jugador* pJugadorAnterior = nullptr;

	while (pJugador != nullptr)
	{
		if (pJugador->nombre == nombreJugadorAEliminar)
		{
			// Debo eliminar al jugador
			if (pJugadorAnterior == nullptr)
			{
				Jugador* pTemp = pJugador;
				primerJugador = pJugador->siguienteJugador;
				delete pTemp;
				pJugadorAnterior = nullptr;
				pJugador = primerJugador;
			}
			else
			{
				Jugador* pTemp = pJugador;
				pJugadorAnterior->siguienteJugador = pJugador->siguienteJugador;
				delete pTemp;
				
				pJugador = pJugadorAnterior->siguienteJugador;
			}
			cantidadJugadores--;
		}
		else
		{
			pJugadorAnterior = pJugador;
			pJugador = pJugador->siguienteJugador;
		}
	}
}
void Mesa::toString()
{
	cout << "<Mesa cantidad=" << this->cantidadJugadores << ">" << endl;
	Jugador* pJugador = primerJugador;
	while (pJugador != nullptr)
	{
		pJugador->toString();
		pJugador = pJugador->siguienteJugador;
	}
	cout << "</Mesa>" << endl;
}
void Mesa::jugar()
{
    //reiniciar cantidad de partidas ganadas por jugador 
    Jugador* jugador = this->primerJugador;
    while(jugador != nullptr){
        jugador->cantidadPartidasGanadas = 0;
        jugador = jugador->siguienteJugador;
    }

    /*
    * No se esta reponiendo las cartas del deck cada vez 
    * que el deck tiene menos o igual a 20 cartas
    * es por eso que ponemos el if reponiendo las
    * cartas en el deck 
    */
    if(deckDesordenado->cantidad <= 20){
        Deck* deck = new Deck(false);
        delete deckDesordenado;
        deckDesordenado = deck->obtenerDesordenado();
    }
	while (deckDesordenado->cantidad > 20)
	{
		iniciarRonda();
		jugarContraTodos();
		verificarGanadores();
		reiniciar();
	}
	toString();
}
void Mesa::iniciarRonda()
{
	Jugador* pJugador = primerJugador;
	while (pJugador != nullptr)
	{
		Carta* carta = deckDesordenado->obtenerCarta();
		pJugador->recibirCarta(carta);
		pJugador = pJugador->siguienteJugador;
		delete carta;
	}

	// Turno crupier
	Carta* carta = deckDesordenado->obtenerCarta();
	sumaCartasCrupier += carta->numero;
	delete carta;
}
void Mesa::jugarContraTodos()
{
	Jugador* pJugador = primerJugador;
	while (pJugador != nullptr)
	{
		while (true)
		{
			Carta* carta = deckDesordenado->obtenerCarta();
			pJugador->recibirCarta(carta);
			if (pJugador->sumaCartas >= 17) break;
		}
		pJugador = pJugador->siguienteJugador;
	}

	// Turno Crupier
	while (true)
	{
		Carta* carta = deckDesordenado->obtenerCarta();
		sumaCartasCrupier += carta->numero;
		if (sumaCartasCrupier >= 17) break;
	}
}
void Mesa::verificarGanadores()
{
	Jugador* pJugador = primerJugador;
	while (pJugador != nullptr)
	{
		if (sumaCartasCrupier > 21)
		{
			pJugador->cantidadPartidasGanadas++;
		}
		else
		{
			if (pJugador->sumaCartas <= 21 &&
				pJugador->sumaCartas > sumaCartasCrupier)
			{
				pJugador->cantidadPartidasGanadas++;
			}
		}
		pJugador = pJugador->siguienteJugador;
	}
}
void Mesa::reiniciar()
{
	Jugador* pJugador = primerJugador;
	while (pJugador != nullptr)
	{
        // reestablecemos la cantidad de partidas ganadas en la mesa
		pJugador->sumaCartas = 0;
		pJugador = pJugador->siguienteJugador;
	}
	sumaCartasCrupier = 0;
}
void Mesa::mostrarMenu()
{
	string opcion;
	while (true)
	{
		cout << "****** BLACKJACK ULIMA ******" << endl;
		cout << "(1): Agregar jugador" << endl;
		cout << "(2): Eliminar jugador" << endl;
		cout << "(3): Iniciar juego" << endl;
		cout << "(4): Mostrar JugadorMayor" << endl;
		cout << "(0): Salir" << endl;
		cin >> opcion;

		if (opcion == "1") agregarJugador();
		if (opcion == "2") eliminarJugador();
		if (opcion == "3") jugar();
        if (opcion == "4") mostrarJugadorMayor();
		if (opcion == "0") break;
	}
}