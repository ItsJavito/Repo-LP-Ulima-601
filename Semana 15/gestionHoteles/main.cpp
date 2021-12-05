#include "hotel.h"

int main(){

	Hotel* hotel = new Hotel();
	hotel->agregarHabitacion(101);
	hotel->agregarHabitacion(105);
	hotel->agregarHabitacion(107);
	hotel->agregarHabitacion(108);

	hotel->checkinHuesped(105, "Diana");

	hotel->mostrarHabitaciones();

    cout << endl; 
    
	hotel->checkoutHuesped("Diana");

	hotel->mostrarHabitaciones();
  
}