package Operations;

public class Aritmetica {
    public int numero1;
    public int numero2;

    public void suma2Numeros(){
        System.out.println("Resultado Suma:" + (numero1+numero2));
    }
    public int suma2NumeroRetorno(){
        return numero1+numero2;
    }
    public int suma2NumArgsRetorno(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
        //return  numero1 + numero2;
        //Ejecucion de metodo interno pera el retorno de datos;
        return this.suma2NumeroRetorno();
    }
}
