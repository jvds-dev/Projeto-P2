import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        boolean mainLoop = true;

        while(mainLoop){

            System.out.println("Você está em uma floresta desconhecida. Você vê uma entrada de caverna à esquerda, e um caminho que continua na floresta pra direita.");
            System.out.println("1. Seguir para a Caverna.\n" +
                               "2. Seguir pela floresta.");
            String choice = scanner.nextLine();

            if(choice.equals("1")){
                System.out.println("Escolha 1 - Seguir para a caverna:");
                System.out.println("Você entra na caverna e é atacado por um urso. Você morreu!");
                mainLoop = false;
            }
            else if(choice.equals("2")){
                while(true){
                    System.out.println("Você segue pela floresta e encontra um rio. Você pode atravessar nadando, ou seguir pela margem do rio.");
                    System.out.println("1. Atravessar nadando.\n" +
                                    "2. Seguir pela margem do rio.");
                    
                    String newChoice = scanner.nextLine();
                    if(newChoice.equals("1")){
                        System.out.println("Você tenta nadar pelo rio, mas é arrastado pela correnteza. Você morreu!");
                        mainLoop = false;
                        break;
                    }
                    else if(newChoice.equals("2")){
                        System.out.println("Você segue pelas margens do rio e encontra uma ponte que leva até uma pequena civilização. Fim.");
                        mainLoop = false;
                        break;
                    }
                    else{
                        System.out.println("Escolha uma das opções");
                    }
                }
            }
            else{
                System.out.println("Escolha uma das opções");
            }
        }
        scanner.close();
    }
}
