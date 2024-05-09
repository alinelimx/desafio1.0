public class Main {
    public static void main(String[] args) {
        String nomeHeroi = "Hero";
        int XP = 50;
        String nivel;

        for (int i = 0; i < 7; i++){
            if(XP < 1000){
                nivel = "Ferro";
                System.out.println("O Herói de nome " + nomeHeroi + " está no nível de " + nivel);
                XP += 1000;
            }
            else if(XP > 1001 && XP < 2000){
                nivel = "Bronze";
                System.out.println("O Herói de nome " + nomeHeroi + " está no nível de " + nivel);
                XP += 1000;
            }
            else if(XP > 2001 && XP < 5000){
                nivel = "Prata";
                System.out.println("O Herói de nome " + nomeHeroi + " está no nível de " + nivel);
                XP += 3000;
            }
            else if(XP > 5001 && XP < 7000){
                nivel = "Ouro";
                System.out.println("O Herói de nome " + nomeHeroi + " está no nível de " + nivel);
                XP += 2000;
            }
            else if(XP > 7001 && XP < 8000){
                nivel = "Platina";
                System.out.println("O Herói de nome " + nomeHeroi + " está no nível de " + nivel);
                XP += 1000;
            }
            else if(XP > 8001 && XP < 9000){
                nivel = "Ascendente";
                System.out.println("O Herói de nome " + nomeHeroi + " está no nível de " + nivel);
                XP += 1000;
            }
            else if(XP > 9001 && XP < 10000){
                nivel = "Imortal";
                System.out.println("O Herói de nome " + nomeHeroi + " está no nível de " + nivel);
                XP += 1000;
            }
            else if(XP >= 10001){
                nivel = "Radiante";
                System.out.println("O Herói de nome " + nomeHeroi + " está no nível de " + nivel);
            }  
        }
    }
}
