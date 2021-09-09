#include <iostream>
#include <string.h>

bool isPalindrome(std::string word){
    int i = 0 , cont = 0;
    for(; i < word.size()/2; i++){
        if(word[i] == word[word.size()-i-1])
            cont++;
    }
    return cont == i;
}

int main(){
    std::string i_palin, d_palin , word;
    std::cin >> word; 
    bool ip , dp, p;
    i_palin = word.substr(0, word.size()-1);
    d_palin = word.substr(1, word.size()-1);
    ip = isPalindrome(i_palin); dp = isPalindrome(d_palin); p = isPalindrome(word);
    if(p || ip || dp){
        std::cout << "La palabra ES \"distinguida\" porque es:" << std::endl;
        if(p) std::cout << "palindroma" << std::endl;
        if(ip) std::cout << "i-palindroma" << std::endl;
        if(dp) std::cout << "d-palindroma" << std::endl;
    }
    else{
        std::cout << "La palabra NO es \"distinguida\"." << std::endl;
    }
    return 0;
}