package br.com.challenges.easy.strings;

/**
 * @leetcode https://leetcode.com/problems/roman-to-integer/ (Roman numbers to int)
 * @author jonathan
 * @Date August, 16th 2022
 */
public class RomanNumbers {

    public int romanToInt(String s) {
        int sum = 0;

        char letraAnterior = 'A';
        for(int i = 0; i <= s.length()-1; i++) {
            char letraAtual = s.charAt(i);
            if(letraAtual == 'I') {
                sum++;
                letraAnterior = letraAtual;
                continue;
            }
            if(letraAtual == 'V' ) {
                if(letraAnterior == 'I')
                    sum += 3;
                else sum +=5;
                letraAnterior = letraAtual;
                continue;
            }
            if(letraAtual == 'X' ) {
                if(letraAnterior == 'I')
                    sum += 8;
                else sum +=10;
                letraAnterior = letraAtual;
                continue;
            }
            if(letraAtual == 'L' ) {
                if(letraAnterior == 'X')
                    sum += 30;
                else sum +=50;
                letraAnterior = letraAtual;
                continue;
            }
            if(letraAtual == 'C' ) {
                if(letraAnterior == 'X')
                    sum += 80;
                else sum +=100;
                letraAnterior = letraAtual;
                continue;
            }
            if(letraAtual == 'D' ) {
                if(letraAnterior == 'C')
                    sum += 300;
                else sum +=500;
                letraAnterior = letraAtual;
                continue;
            }
            if(letraAtual == 'M' ) {
                if(letraAnterior == 'C')
                    sum += 800;
                else sum +=1000;
                letraAnterior = letraAtual;
                continue;
            }
        }

        return sum;
    }
}
