import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        String cap1_texto = "Você está em uma floresta desconhecida. Você vê uma entrada de caverna à esquerda, e um caminho que continua na floresta pra direita.";
        String cap1_escolha1 = "seguir para a caverna";
        String cap1_escolha2 = "seguir pela floresta";

        String cap2_texto = "Você segue pela floresta e encontra um rio. Você pode atravessar nadando, ou seguir pela margem do rio.";
        String cap2_escolha1 = "nadar";
        String cap2_escolha2 = "seguir pela margem";
        
        Scanner scanner = new Scanner(System.in);

        boolean mainLoop = true;

        while(mainLoop){

            System.out.println(cap1_texto);
            System.out.println(cap1_escolha1);
            System.out.println(cap1_escolha2);

            String choice = scanner.nextLine();

            if(choice.equals(cap1_escolha1)){
                System.out.println("Escolha 1 - Seguir para a caverna:");
                System.out.println("Você entra na caverna e é atacado por um urso. Você morreu!");
                mainLoop = false;
            }
            else if(choice.equals(cap1_escolha2)){
                while(true){
                   System.out.println(cap2_texto);
                   System.out.println(cap2_escolha1);
                   System.out.println(cap2_escolha2);
                    
                    choice = scanner.nextLine();
                    if(choice.equals(cap2_escolha1)){
                        System.out.println("Você tenta nadar pelo rio, mas é arrastado pela correnteza. Você morreu!");
                        mainLoop = false;
                        break;
                    }
                    else if(choice.equals(cap2_escolha2)){
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
