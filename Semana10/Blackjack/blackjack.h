#include<iostream>

using namespace std;

class Carta
{
public:
	int numero;
	Carta* siguienteCarta;
	Carta(int numero);
	void toString();
};

class Deck
{
	Carta* primeraCarta;
public:
	int cantidad;
	Deck(bool vacio);
	~Deck();
	Deck* obtenerDesordenado();
	Carta* obtenerCarta();
	Carta* obtenerCarta(int pos);
	void agregarCarta(Carta* carta);
	void toString();
};

class Jugador
{
public:
	Jugador* siguienteJugador;
	string nombre;
	int cantidadPartidasGanadas;
	int sumaCartas;
	Jugador(string nombre);
	void recibirCarta(Carta* carta);
	void toString();
};

class Mesa
{
	int cantidadJugadores;
	Jugador* primerJugador;
	Jugador* ultimoJugador;
	int sumaCartasCrupier;
	Deck* deckDesordenado;
	void iniciarRonda();
	void jugarContraTodos();
	void verificarGanadores();
	void reiniciar();

public:
	Mesa();
	~Mesa();
	void agregarJugador();
	void mostrarJugadorMayor();
	void eliminarJugador();
	void toString();
	void jugar();
	void mostrarMenu();
};