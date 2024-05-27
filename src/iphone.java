import interfacesIphone.safari;
import interfacesIphone.phone;
import interfacesIphone.ipod;

public class iphone implements safari, phone, ipod {

    public static void main(String[] args) {
        
        //menu inicial
        System.out.println("Olá, digite uma opção:");
        System.out.println("1 - Navegador");
        System.out.println("2 - Telefone");
        System.out.println("3 - Ipod");
        System.out.println("4 - sair");
        System.out.println();
        
        int opcao = 0;


        while (opcao != 4) {
            opcao = new java.util.Scanner(System.in).nextInt();

            switch (opcao) {    
                
                //navegador
                case 1:
                System.out.println("digite uma opção:");
                System.out.println("1 - exibir pagina");
                System.out.println("2 - adicionar nova aba");
                System.out.println("3 - atualizar pagina");
                System.out.println("4 - sair");
                System.out.println();
                opcao = new java.util.Scanner(System.in).nextInt();

                if (opcao == 1) {
                    safari s = new iphone();
                    s.exibirPagina("https://www.google.com");
                }else if (opcao == 2) {
                    safari s = new iphone();   
                    s.adicionarNovaAba();
                }else if (opcao == 3) {
                    safari s = new iphone();
                    s.atualizarPagina();
                }else if (opcao == 4) {
                    break;
                }else {
                    System.out.println("opção inválida");
                }
                
                break;

                //telefone
                case 2:
                    System.out.println("digite uma opção:");
                    System.out.println("1 - ligar");
                    System.out.println("2 - atender");
                    System.out.println("3 - iniciar correio de voz");
                    System.out.println("4 - sair");
                    System.out.println();
                    opcao = new java.util.Scanner(System.in).nextInt();

                    if (opcao == 1) {
                        phone p = new iphone();
                        p.ligar();
                    }else if (opcao == 2) {
                        phone p = new iphone();
                        p.atender();
                    }else if (opcao == 3) {
                        phone p = new iphone();
                        p.iniciarCorreioVoz();
                    }else if (opcao == 4) {
                        break;
                    }else {
                        System.out.println("opção inválida");
                    }
                    break;

                //ipod
                case 3:
                    System.out.println("digite uma opção:");
                    System.out.println("1 - tocar");
                    System.out.println("2 - pausar");
                    System.out.println("3 - selecionar Musica");
                    System.out.println("4 - sair");
                    System.out.println();
                    opcao = new java.util.Scanner(System.in).nextInt(); 

                    if (opcao == 1) {
                        ipod i = new iphone();
                        i.tocar();
                    }else if (opcao == 2) {
                        ipod i = new iphone();
                        i.pausar();
                    }else if (opcao == 3) {
                        ipod i = new iphone();
                        i.selecionarMusica();
                    }else if (opcao == 4) {
                        break;
                    }else {
                        System.out.println("opção inválida");
                    }
                    break;
                
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        
    }

    //ipod
    public void tocar() {
        System.err.println("tocando musica");
    }

    public void pausar() {
        System.err.println("pausando musica");
    }

    public void selecionarMusica() {
        System.err.println("selecionando Musica");
    }


    //phone
    public void ligar() {
        System.err.println("ligando");
    }

    public void atender() {     
        System.err.println("atendendo");
    }

    public void iniciarCorreioVoz() {
        System.err.println("iniciando correio de voz");
    }

    //safari
    public void exibirPagina(String url) {
        System.err.println("exibindo pagina");
    }       

    public void adicionarNovaAba() {    
        System.err.println("adicionando nova aba");
    }   

    public void atualizarPagina() {     
        System.err.println("atualizando pagina");
    }
    
}