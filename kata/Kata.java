public class Kata{

    public static void main(String[] args){
isEvenOdd(int number);
isPrimeNumber(int numberOne);
substract (int numberOne, int numberTwo);
sqaure (int numberOne);
factorial (int numberOne);
factorOf(int numberOne);
}

public static boolean isEvenOdd(int number){
int divider = 2;
//int result = 0;
if(number % 2 == 0)
return True;
else 
return False;
   
}

public static boolean isPrimeNumber(int numberOne){
int factor = 0;
int count = 1;
for(count = 1; count <= numberOne: count++){
if (numberOne % count == 0)
factor++; }

if(factor <= 2)
return True;
else
return False;
}

public static int substract (int numberOne, int numberTwo){
int count = 0;
while(numberOne < numberTwo){
numberOne++;
count++;}
return count;

while(numberOne > numberTwo){
numberOne--;
count++;}
return count;

if(numberOne == numberTwo)
return count;

}

public static long sqaure (int numberOne){
int count = numberOne;
int result = numberOne * count;
return result;

}

public static long factorial (int numberOne){
int result = 1;
for(count = numberOne; count >= 1; count--){
result = result * count;
}
return result;

}
public static int factorOf(int numberOne){
int factor = 0;
int count = 1;
for(count = 1; count <= numberOne: count++){
if (numberOne % count == 0)
factor++; }

return factor;

}


}
