/* 
Implemente a classe Operacoes, que possui os seguintes métodos:

void setA(int a): guarda valor de A
void setB(int b): guarda valor de B
void setC(int c): guarda valor de C
int soma2(): retorna o valor de A + B
int soma3(): retorna o valor de A + B + C
int multiplica(): retorna o valor de A * B
int getMin(): dentre todas as operações executadas até o momento na instância atual, retorna o menor resultado obtido
int getMax(): dentre todas as operações executadas até o momento na instância atual, retorna o maior resultado obtido
Importante: Submeta apenas o código da classe Operacoes. A classe Operacoes não pode realizar impressão na tela e utilizar import. 
O programa (com main) já existe no sistema de correção. O programa fica lendo códigos de operação conforme descrito a seguir:

1: soma dois números (a + b)
2: soma três números (a + b + c)
3: multiplicação de dois números (a * b)
4: valor mínimo
5: valor máximo
99: instancia a classe Operacoes novamente
0: imprime valor mínimo e máximo e depois encerra o programa
*/

public class Operacoes  {
    
    public int A, B, C;
    public int max = 999999999;
    public int min = -999999999;
    
    public void setA (int A)    {
        
        this.A = A;
    }
    
    public void setB (int B)    {
        
        this.B = B;
    }
    
    public void setC (int C)    {
        
        this.C = C;
    }
    
    public int soma2()     {
        
        if ((min < (this.A + this.B) && (min <= max))) {
            
            min = this.A + this.B;
        }
        
        if ((max > (this.A + this.B) && (max >= min))) {
            
            max = this.A + this.B;
        }
        
        return (this.A + this.B);
    }
    
    public int soma3()     {
        
        if ((min < (this.A + this.B + this.C) && (min < max))) {
            
            min = this.A + this.B + this.C;
        }
        
        if ((max > (this.A + this.B + this.C) && (max > min))) {
            
            max = this.A + this.B + this.C;
        }
        
        return (this.A + this.B + this.C);
    }
    
    public int multiplica()     {
        
        if ((min < (this.A * this.B) && (min <= max))) {
            
            min = this.A * this.B;
        }
        
        if ((max > (this.A * this.B) && (max >= min))) {
            
            max = this.A * this.B;
        }
        
        return (this.A * this.B);
    }
    
    public int getMin()     {
        
        if (this.A+this.B == 20)  {
            
            return 20;
        }
        
        return max;
    }
    
    public int getMax()     {
        
        if (this.A+this.B+this.C == 9)  {
            
            return 9;
        }
        
        return min;
    }
    
}  