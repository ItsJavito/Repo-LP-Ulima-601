#include <iostream>

struct letra{
    int pos;
    char letra; 
};

int fib(int fib[], int n){
    if(fib[n] != 0) return fib[n];
    return fib[n] = fib[n-1] + fib[n-2];
}

void sort(letra* frase , int n){
    for(int i = 0; i < n; i++){
        for(int j = i+1; j < n; j++){
            if(frase[i].pos > frase[j].pos){
                letra aux = frase[j];
                frase[j] = frase[i];
                frase[i] = aux;
            }
        }
    }
}

int main(){
    int n;
    std::cin >> n;
    letra* frase = new letra[n];
    std::string ans;

    int fibo[int(1e2)] {}; fibo[0] = 1; fibo[1] = 1;

    for(int i = 0; i < n; i++){
        int num; std::cin >> num;
        frase[i].pos = num;
    }

    for(int i = 0; i < n; i++){
        char c; std::cin >> c;
        frase[i].letra = c;
    }

    sort(frase, n);
    std::cout << "La palabra decodificada es: "; 
    for(int i = 0 , j = 1; i < n ; i++, j++){
        if(frase[i].pos == fib(fibo, j)){
            std::cout << frase[i].letra;
        }else{
            i--;
            std::cout << " ";
        }
    }
    std::cout << ".";
}