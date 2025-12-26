package aplicacao;

public class WrapperClasses {
    public static void main(String[] args) {
        int x = 20;
        Object obj = x;

        System.out.println(obj);

        int y = (int) obj;

        System.out.println(y);

        Integer iObj = 20;

        int z = iObj * 2;

        System.out.println(z);
    }
}

/*
boxing: transformar de objeto tipo valor em objeto tipo referencia

unboxing: processo inverso ao boxing, transforma objeto tipo referencia em objeto tipo valor

Wrapper Classes: 
-classes equivalentes aos tipos primitivos
-podem ser NULL, diferente dos tipos primitivos 
exemplos:

Objetos: 
Boolean(classe) != boolean(tipo primitivo)
Character(classe) != char
Numeros: 
Byte != byte
Short != short
Integer != int
Long != long
Float != float
Double != double
*/