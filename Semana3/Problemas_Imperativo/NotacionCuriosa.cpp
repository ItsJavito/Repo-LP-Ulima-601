#include <iostream>

int toDecimal(int num){
    int fact = 1, nfact = 2 , ans = 0;
    while(num != 0){
        ans += (num%10)*fact;
        num /= 10;
        fact = fact*(nfact++);
    }
    return ans;
}

int main(){
    int LNC;
    std::cout << "Ingrese la cadena con el numero en notacion LNC: ";
    std::cin >> LNC;
    int ans = toDecimal(LNC);
    std::cout << "Numero en notacion decimal: " << ans; 
    return 0;
}