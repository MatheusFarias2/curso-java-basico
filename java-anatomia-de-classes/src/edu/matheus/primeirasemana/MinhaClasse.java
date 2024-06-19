package edu.matheus.primeirasemana;

public class MinhaClasse {
public static void main (String []args) {
String calcaPijama = "Azul";
String camisaAlgodao = "Verde";
String touca ="Amarelo";

String corRoupasDormir = corRoupasDormir(calcaPijama, camisaAlgodao, touca);

System.out.println(corRoupasDormir);
}
public static String corRoupasDormir (String calcaPijama, String camisaAlgodao, String touca ) {
return "Cor das roupas de dormir:" + calcaPijama.concat("").concat(camisaAlgodao).concat(touca);
}

}